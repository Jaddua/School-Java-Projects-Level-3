/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutoring.DTO;

/**
 *
 * @author jaddu
 */
public class CourseDTO {
    private String courseCode;
    private String courseName;
    private String courseDescription;
    
    
    /**
     * Getter method for course code.
     * @return The course code.
     */
    public String getCourseCode() {
        return courseCode;
    }
    
    /**
     * Setter method for course code.
     * @param courseCode The course code.
     */
    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
    /**
     * Getter method for course name.
     * @return The course name.
     */
    public String getCourseName(){
    	return courseName;
    }
    /**
     * Setter method for course name.
     * @param courseName The course name.
     */
    public void setcourseName(String courseName){
    	this.courseName = courseName;
    }
    /**
     * Getter method for course description.
     * @return The course description.
     */
    public String getCourseDescription(){
    	return courseDescription;
    }
    /**
     * Setter method for course description.
     * @param courseDescription The course description.
     */
    public void setCourseDescription(String courseDescription){
    	this.courseDescription = courseDescription;
    }
    
}

