/* File: CourseDTO.java
 * Author: Jaddua Jones    040898457    
 */
package transferobjects;

public class CourseDTO {

    private String courseCode;
    private String courseName;
    private String courseDescription;

    /**
     * Getter method for the course code.
     *
     * @return The course code.
     */
    public String getCourseCode() {
        return courseCode;
    }

    /**
     * Setter method for the course code.
     *
     * @param courseCode The course code.
     */
    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    /**
     * Getter method for the course name.
     *
     * @return The course name.
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * Setter method for the course name.
     *
     * @param courseName The course name.
     */
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    /**
     * Getter method for the course description.
     *
     * @return The course description.
     */
    public String getCourseDescription() {
        return courseDescription;
    }

    /**
     * Setter method for the course description.
     *
     * @param courseDescription The course description.
     */
    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }

}
