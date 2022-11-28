/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutoring.BusinessObjects;

/**
 *
 * @author jaddu
 */
public class SessionBuilder {
    public String time;
    public String date;
    public String studentLastName;
    public int sessionStatus;
    public String sessionTopic;
    public int tutorID;
    public String courseCode;
    public int studentID;
    
    public SessionBuilder() {   
    
    }    
    public SessionBuilder time(String time) {
        this.time = time;
        return this;
    }
    
    public SessionBuilder date(String date) {
        this.date = date;
        return this;
    }
    
    public SessionBuilder studentLastName(String studentLastName) {
        this.studentLastName = studentLastName;
        return this;
    }
    
    public SessionBuilder sessionStatus(int sessionStatus) {
        this.sessionStatus = sessionStatus;
        return this;
    }
    
    public SessionBuilder sessionTopic(String sessionTopic) {
        this.sessionTopic = sessionTopic;
        return this;
    }
    
    public SessionBuilder tutorID(int tutorID) {
        this.tutorID = tutorID;
        return this;
    }
    
    public SessionBuilder courseCode(String courseCode) {
        this.courseCode = courseCode;
        return this;
    }
    
    public SessionBuilder studentID(int studentID) {
        this.studentID = studentID;
        return this;
    }
    
    public Session createSession() {
        return new Session(this);
    }
}