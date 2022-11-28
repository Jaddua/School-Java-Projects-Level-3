/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutoring.BusinessObjects;

/**
 *
 * @author jaddu
 */

public class Student {

	private int StudentID;
        private int TutorID;
        private String LastName;
        private String FirstName;
        private String Email;
        private String PhoneNumber;
        private String Status;
        private int ExperienceID;
        private StudentBehaviour studentBehaviour;

        
          /**
     * no-arg constructor initializes account behaviour/strategy to that of a
     * savings account
     */
    public Student(){
		this.studentBehaviour = new Student_Behaviour();
	}
        
        
    public int getStudentID() {
        return StudentID;
    }

    public void setStudentID(int StudentID) {
        this.StudentID = StudentID;
    }

    public int getTutorID() {
        return TutorID;
    }

    public void setTutorID(int TutorID) {
        this.TutorID = TutorID;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public int getExperienceID() {
        return ExperienceID;
    }

    public void setExperienceID(int ExperienceID) {
        this.ExperienceID = ExperienceID;
    }

    public StudentBehaviour getStudentBehaviour() {
        return studentBehaviour;
    }

    public void setStudentBehaviour(StudentBehaviour studentBehaviour) {
        this.studentBehaviour = studentBehaviour;
    }
	

    /**
     *
     * @param studentBehaviour
     */
    public void changeBehaviourTo(StudentBehaviour studentBehaviour){
		// ToDo: Detect and prevent nulls
		this.studentBehaviour = studentBehaviour;
	}
	
}

