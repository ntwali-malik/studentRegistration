package model;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "academic_unit")
public class AcademicUnit {
	

	@Id
    @Column(name = "code")
    private String code;
	
	@Column(name = "name", nullable = false)
    private String name;

    @OneToMany(mappedBy = "academicUnit", cascade = CascadeType.ALL)
    private List<Course> courses;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
    
    
}
