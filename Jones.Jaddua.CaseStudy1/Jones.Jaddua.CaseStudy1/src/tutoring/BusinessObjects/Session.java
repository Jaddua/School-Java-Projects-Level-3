/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutoring.BusinessObjects;

/**
 *
 * @author jaddu
 */
public class Session {
    private String time;
    private String date;
    private String studentLastName;
    private int sessionStatus;
    private String sessionTopic;
    private int tutorID;
    private String courseCode;
    private int studentID;
    
    public Session(SessionBuilder sessionBuilder) {
        this.time = sessionBuilder.time;
        this.date = sessionBuilder.date;
        this.studentLastName = sessionBuilder.studentLastName;
        this.sessionStatus = sessionBuilder.sessionStatus;
        this.sessionTopic = sessionBuilder.sessionTopic;
        this.tutorID = sessionBuilder.tutorID;
        this.courseCode = sessionBuilder.courseCode;
        this.studentID = sessionBuilder.studentID;
    }

    public String getStudentLastName() {
        return studentLastName;
    }

    public int getSessionStatus() {
        return sessionStatus;
    }

    public String getSessionTopic() {
        return sessionTopic;
    }

    public int getTutorID() {
        return tutorID;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public int getStudentID() {
        return studentID;
    }

    public String getTime() {
        return time;
    }

    public String getDate() {
        return date;
    }
}
