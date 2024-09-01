package Phonebook;

import java.io.Serializable;



public class SLNode implements Serializable {

	private String name;
	private String email;
	private String phoneNumber;
	private SLNode next;
	public SLNode() {
		//data = -1;
		next = null;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public SLNode getNext() {
		return next;
	}
	public void setNext(SLNode next) {
		this.next = next;
	}
	@Override
	public String toString() {
		return "Name = " + name + ", Email = " + email + ", Phone Number = "
				+ phoneNumber;
	}
}
