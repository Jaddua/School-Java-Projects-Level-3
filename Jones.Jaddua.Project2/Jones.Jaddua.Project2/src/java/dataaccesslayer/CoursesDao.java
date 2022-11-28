/* File: CoursesDao.java
 * Author: Jaddua Jones    040898457    
 */
package dataaccesslayer;

import java.util.List;

import transferobjects.CourseDTO;

public interface CoursesDao {

    List<CourseDTO> getAllCourses();

    CourseDTO getCourseByCourseCode(String courseCode);

    void printAllCourses();

    void addCourse(CourseDTO course);

    void updateCourse(CourseDTO course);

    void deleteCourse(CourseDTO course);
}
