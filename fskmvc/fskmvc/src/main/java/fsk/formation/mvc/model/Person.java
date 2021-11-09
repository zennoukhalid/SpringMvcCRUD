package fsk.formation.mvc.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;


@Entity
public class Person {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column
	@NotBlank
	@Size(max=20,min=3)
	private String firstname;
	
	@Column
	@NotBlank
	@Size(max=20,min=3)
	private String lasttname;
	
	@Column
	@Positive
	private int age;
	
	@Column
	@Email
	private String email;
	
	@OneToOne(mappedBy = "person", cascade = CascadeType.ALL)
	@Valid
	private Address address;

	public Person(String firstname, String lasttname, int age, String email, Address address) {
		super();
		this.firstname = firstname;
		this.lasttname = lasttname;
		this.age = age;
		this.email = email;
		this.address = address;
	}

	public Person() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLasttname() {
		return lasttname;
	}

	public void setLasttname(String lasttname) {
		this.lasttname = lasttname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", firstname=" + firstname + ", lasttname=" + lasttname + ", age=" + age
				+ ", email=" + email + ", address=" + address + "]";
	}


	
	

	

	
	
}
