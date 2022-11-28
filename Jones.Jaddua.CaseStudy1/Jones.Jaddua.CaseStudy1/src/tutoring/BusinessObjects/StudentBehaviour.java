/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package tutoring.BusinessObjects;

/**
 *
 * @author jaddu
 */

public interface StudentBehaviour {
	// all interface methods are public abstract by default

    public int getStudentID();

    public void setStudentID(int StudentID);

    public int getTutorID();

    public void setTutorID(int TutorID);

    public String getLastName();

    public void setLastName(String LastName);

    public String getFirstName();

    public void setFirstName(String FirstName);

    public String getEmail();

    public void setEmail(String Email);

    public String getPhoneNumber();

    public void setPhoneNumber(String PhoneNumber);

    public String getStatus();
    
    public void setStatus(String Status);

    public int getExperienceID();
    public void setExperienceID(int ExperienceID);

    public StudentBehaviour getStudentBehaviour();

    public void setStudentBehaviour(StudentBehaviour studentBehaviour);
    

    /**
     *
     * @return
     */
    public String studentBehaviourType();
}

