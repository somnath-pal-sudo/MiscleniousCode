package serializationDeserialization;

import java.util.List;

public class Student {
	
	
	public Integer id;
	public String firstName;
	public String lastname;
	public String email;
	public String programme;
	
	
	List<String> courses;


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getProgramme() {
		return programme;
	}


	public void setProgramme(String programme) {
		this.programme = programme;
	}


	public List<String> getCourses() {
		return courses;
	}


	public void setCourses(List<String> courses) {
		this.courses = courses;
	}
	
	public String getstudentrecords() {
		return (this.id+"" + this.firstName+"" + this.lastname+""+ this.programme+""+ this.courses);
	}
}
