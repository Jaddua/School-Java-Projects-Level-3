/* File: CoursesDaoImpl.java
 * Author: Jaddua Jones    040898457    
 */
package dataaccesslayer;

import java.util.List;

import transferobjects.CourseDTO;

import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import transferobjects.CredentialsDTO;

public class CoursesDaoImpl implements CoursesDao {

      private CredentialsDTO creds;

    public CoursesDaoImpl(CredentialsDTO creds) {
        this.creds = creds;
    }
    
    @Override
    public void printAllCourses() {
        Connection con = null;
        try {
            DataSource ds = new DataSource();
            con = ds.createConnection();
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery("Select * from Recipients;");
            ResultSetMetaData metaData = resultSet.getMetaData();
            int numberOfColumns = metaData.getColumnCount();

            //columns start at 1 NOT zero !! - GJK     
            for (int i = 1; i <= numberOfColumns; i++) {
                System.out.printf("%-8s\t", metaData.getColumnName(i));
            }
            System.out.println();

            while (resultSet.next()) {
                for (int i = 1; i <= numberOfColumns; i++) {
                    System.out.printf("%-8s\t", resultSet.getObject(i));
                }
                System.out.println();
            } // end while
            System.out.println("\nRecipients Table - Column Attributes:");

            for (int i = 1; i <= numberOfColumns; i++) {
                System.out.printf("%-8s\t", metaData.getColumnName(i));
                System.out.printf("%-8s\t", metaData.getColumnTypeName(i));
                System.out.printf("%-8s\t", metaData.getColumnClassName(i));
                System.out.printf("\n");
            }

            System.out.println();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<CourseDTO> getAllCourses() {
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        ArrayList<CourseDTO> courses = null;
        try {
            DataSource ds = new DataSource();
            con = ds.createConnection();
            pstmt = con.prepareStatement(
                    "SELECT CourseCode, CourseName, CourseDescription FROM course ORDER BY CourseCode");
            rs = pstmt.executeQuery();
            courses = new ArrayList<CourseDTO>();
            while (rs.next()) {
                CourseDTO course = new CourseDTO();
                course.setCourseCode(rs.getString("CourseCode"));
                course.setCourseName(rs.getString("CourseName"));
                course.setCourseDescription(rs.getString("CourseDescription"));
                courses.add(course);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
        return courses;
    }

    @Override
    public CourseDTO getCourseByCourseCode(String courseCode) {
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        CourseDTO course = null;
        try {
            DataSource ds = new DataSource();
            con = ds.createConnection();
            pstmt = con.prepareStatement(
                    "SELECT CourseCode, CourseName, CourseDescription FROM course WHERE CourseCode = ?");
            pstmt.setString(1, courseCode);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                course = new CourseDTO();
                course.setCourseCode(rs.getString("CourseCode"));
                course.setCourseName(rs.getString("CourseName"));
                course.setCourseDescription(rs.getString("CourseDescription"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
        return course;
    }

    @Override
    public void addCourse(CourseDTO course) {
        Connection con = null;
        PreparedStatement pstmt = null;
        try {
            DataSource ds = new DataSource();
            con = ds.createConnection();

            pstmt = con.prepareStatement(
                    "INSERT INTO course (CourseCode, CourseName, CourseDescription) "
                    + "VALUES(?, ?, ?)");
            pstmt.setString(1, course.getCourseCode());
            pstmt.setString(2, course.getCourseName());
            pstmt.setString(3, course.getCourseDescription());

            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    @Override
    public void updateCourse(CourseDTO course) {
        Connection con = null;
        PreparedStatement pstmt = null;
        try {
            DataSource ds = new DataSource();
            con = ds.createConnection();
            pstmt = con.prepareStatement(
                    "UPDATE course SET CourseName = ?, CourseDescription = ? WHERE CourseCode = ?");
            pstmt.setString(1, course.getCourseName());
            pstmt.setString(2, course.getCourseDescription());
            pstmt.setString(3, course.getCourseCode());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    @Override
    public void deleteCourse(CourseDTO course) {
        Connection con = null;
        PreparedStatement pstmt = null;
        try {
            DataSource ds = new DataSource();
            con = ds.createConnection();
            pstmt = con.prepareStatement(
                    "DELETE FROM course WHERE CourseCode = ?");
            pstmt.setString(1, course.getCourseCode());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
