/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutoring.BusinessObjects;

/**
 * Class representing a course students can take.
 * @author Jaddua Jones 040898457
 */
public class Course {
    private String courseCode;
    private String courseName;
    private String courseDescription;
    
    /**
     * The constructor for the Course class.
     * @param courseBuilder The CourseBuilder object that is used to create the Course object.
     */
    public Course(CourseBuilder courseBuilder) {
        this.courseCode = courseBuilder.courseCode;
        this.courseName = courseBuilder.courseName;
        this.courseDescription = courseBuilder.courseDescription;
}

    /**
     * Getter method for the course code.
     * @return The course code.
     */
    public String getCourseCode() {
        return courseCode;
    }

    /**
     * Getter method for the course name.
     * @return The course name.
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * Getter method for the course description.
     * @return The course description.
     */
    public String getCourseDescription() {
        return courseDescription;
    }
    
    
}
