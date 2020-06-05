package com.bikashghadai.springboot.curddemo.entity;


	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.Table;

	@Entity
	@Table(name="customer")
	public class Customer {

		// define fields
		
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name="id")
		private int id;
		
		@Column(name="first_name")
		private String firstName;
		
		@Column(name="last_name")
		private String lastName;
		@Column(name="password")
		private String password;
		@Column(name="email")
		private String email;
		@Column(name="dob")
		private int dob;

		// define constructors
		
		public Customer() {
			
		}

		public Customer(String firstName, String lastName, String password, String email, int dob) {
			this.firstName = firstName;
			this.lastName = lastName;
			this.password = password;
			this.email = email;
			this.dob = dob;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public int getDob() {
			return dob;
		}

		public void setDob(int dob) {
			this.dob = dob;
		}

		@Override
		public String toString() {
			return "Customer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", password="
					+ password + ", email=" + email + ", dob=" + dob + "]";
		}

}
