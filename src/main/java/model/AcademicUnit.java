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

	@Column(name = "academic_unit_type")
    @Enumerated(EnumType.STRING)
    private EAcademicUnit academicUnitType;
	
	 @ManyToOne
	    @JoinColumn(name = "parent_id")
	    private AcademicUnit parentId;

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

	public EAcademicUnit getAcademicUnitType() {
		return academicUnitType;
	}

	public void setAcademicUnitType(EAcademicUnit academicUnitType) {
		this.academicUnitType = academicUnitType;
	}

	public AcademicUnit getParentId() {
		return parentId;
	}

	public void setParentId(AcademicUnit parentId) {
		this.parentId = parentId;
	}
	
	
    
    
}
