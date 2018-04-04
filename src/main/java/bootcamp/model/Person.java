package bootcamp.model;

public class Person {

	private int personid;
	private String lastname;
	private String firstname;
	private String address;
	private String city;
	
	public Person() {}
	
	public Person (int personid, String lastname, String firstname, String address, String city) {
		this.personid = personid;
		this.lastname = lastname;
		this.firstname = firstname;
		this.address = address;
		this.city = city;
	}
	
	public int getPersonId() {
		return personid;
	}
	
	public String getLastName() {
		return lastname;
	}
	
	public String getfirstname() {
		return firstname;
	}
	
	public String getaddress() {
		return address;
	}
	
	public String getcity() {
		return city;
	}
	
	public void setPersonId(int personId) {
		this.personid = personId;
	}
	
	public void setlastname(String lastname) {
		this.lastname = lastname;
	}
	
	public void setfirstname(String firstname) {
		this.firstname = firstname;
	}
	
	public void setAddress (String address) {
		this.address = address;
	}
	
	public void setCity (String city) {
		this.city = city;
	}
}
