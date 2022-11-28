/* File: CoursesBusinessLogic.java
 * Author: Jaddua Jones    040898457    
 */
package businesslayer;

import java.util.List;
import dataaccesslayer.CoursesDaoImpl;
import transferobjects.CourseDTO;
import dataaccesslayer.CoursesDao;
import transferobjects.CredentialsDTO;

/**
 * This class provides the business logic for the Course Data Access Object.
 *
 * @author Jaddua Jones
 */
public class CoursesBusinessLogic {

    private CoursesDao coursesDao = null;
    private CredentialsDTO creds;

    
    	
	public CoursesBusinessLogic(CredentialsDTO creds){
		coursesDao = new CoursesDaoImpl(creds);
	}
	

    /**
     * This method will print all of the courses in the DAO.
     */
    public void printAllCourses() {
        coursesDao.printAllCourses();
    }

    /**
     * This method will create a list of all the courses in the DAO.
     *
     * @return A list containing all the recipients in the DAO.
     */
    public List<CourseDTO> getAllCourses() {
        return coursesDao.getAllCourses();
    }

    /**
     * This method will retrieve a course whose course code matches the
     * argument.
     *
     * @param courseCode The course code of the course to fetch.
     * @return A course whose course code matches the argument.
     */
    public CourseDTO getCourse(String courseCode) {
        return coursesDao.getCourseByCourseCode(courseCode);
    }

    /**
     * This method will add a course to the database.
     *
     * @param course The course to add.
     */
    public void addCourse(CourseDTO course) {
        coursesDao.addCourse(course);
    }

    /**
     * This method will update a course in the database.
     *
     * @param course The course to update.
     */
    public void updateRecipient(CourseDTO course) {
        coursesDao.updateCourse(course);
    }

    /**
     * This method will delete a course from the database.
     *
     * @param course The course to delete.
     */
    public void deleteCourse(CourseDTO course) {
        coursesDao.deleteCourse(course);
    }
}
