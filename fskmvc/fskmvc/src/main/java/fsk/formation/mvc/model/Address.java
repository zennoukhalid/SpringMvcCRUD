package fsk.formation.mvc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;

@Entity
public class Address {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column 
	@NotBlank
	private String address;
	

	@Column
	@NotBlank
	private String city;
	

	@Column 
	@NotBlank
	private String zipcode;
	
	@Column 
	@Positive
	private int country;
	
	@OneToOne
	private Person person;

	public Address(String address, String city, String zipcode, int country, Person person) {
		super();
		this.address = address;
		this.city = city;
		this.zipcode = zipcode;
		this.country = country;
		this.person = person;
	}

	public Address() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String string) {
		this.zipcode = string;
	}

	public int getCountry() {
		return country;
	}

	public void setCountry(int country) {
		this.country = country;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", address=" + address + ", city=" + city + ", zipcode=" + zipcode + ", country="
				+ country + "]";
	}

	
	
	
	
}
