package model;

import jakarta.persistence.*;

@Entity
@Table(name = "teacher")
public class Teacher {

	 	@Id
	    @Column(name = "code")
	    private String code;

	    @Column(name = "names", nullable = false)
	    private String names;

	    @Column(name = "qualification", nullable = false)
	    private String qualification;

		public String getCode() {
			return code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getNames() {
			return names;
		}

		public void setNames(String names) {
			this.names = names;
		}

		public String getQualification() {
			return qualification;
		}

		public void setQualification(String qualification) {
			this.qualification = qualification;
		}
	    
	    
}
