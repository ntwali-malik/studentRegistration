package model;

import java.util.List;
import java.util.UUID;

import jakarta.persistence.*;

@Entity
public class StudentRegistration {

	@Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
	
	@ManyToOne
    @JoinColumn(name = "student_id", nullable = false)
    private Student student;

    @ManyToMany
    @JoinTable(name = "student_course", joinColumns = @JoinColumn(name = "student_registration_id"), inverseJoinColumns = @JoinColumn(name = "course_id"))
    private List<Course> courses;

    @ManyToOne
    @JoinColumn(name = "semester_id", nullable = false)
    private Semester semester;

    @Column(nullable = false, name = "registration_date")
    private String registrationData;

    @Column(nullable = false, name = "registration_number")
    private int registrationNumber;

    @Column(nullable = false, name = "registration_status")
    private String registrationStatus;

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	public Semester getSemester() {
		return semester;
	}

	public void setSemester(Semester semester) {
		this.semester = semester;
	}

	public String getRegistrationData() {
		return registrationData;
	}

	public void setRegistrationData(String registrationData) {
		this.registrationData = registrationData;
	}

	public int getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(int registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public String getRegistrationStatus() {
		return registrationStatus;
	}

	public void setRegistrationStatus(String registrationStatus) {
		this.registrationStatus = registrationStatus;
	}
    
    
}
