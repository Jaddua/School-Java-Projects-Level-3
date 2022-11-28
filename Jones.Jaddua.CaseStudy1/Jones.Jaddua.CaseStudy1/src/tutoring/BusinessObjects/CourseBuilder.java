/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutoring.BusinessObjects;

/**
 * Class for the course builder, to create course classes.
 * @author Jaddua 040898457
 */
public class CourseBuilder {
    public String courseCode;
    public String courseName;
    public String courseDescription;

    /**
     * Add a course code
     * @param courseCode The course code
     * @return New instance of CourseBuilder with course code added
     */
    public CourseBuilder courseCode(String courseCode) {
    this.courseCode = courseCode;
    return this;
    }
    
    /**
     * Add a course name
     * @param courseName The course name
     * @return New instance of CourseBuilder with course name added
     */
    public CourseBuilder courseName(String courseName) {
    this.courseName = courseName;
    return this;
    }
    
    /**
     * Add a course description
     * @param courseDescription The course description
     * @return New instance of CourseBuilder with course description added
     */
    public CourseBuilder courseDescription(String courseDescription) {
    this.courseDescription = courseDescription;
    return this;
    }
    
    /**
     * Method to create a course , to build a course object.
     * @return A course with all the fields set via the methods used above.
     */
    public Course createCourse() {
        return new Course(this);
    }
}
