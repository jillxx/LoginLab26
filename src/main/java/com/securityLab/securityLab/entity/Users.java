package com.securityLab.securityLab.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class Users {

	@Column(name="firstname")
	private String firstName;
	@Column(name="lastname")
	private String lastName;
	@Id
	@GeneratedValue
	private String email;
	@Column(name="phonenum")
	private long phoneNum;
	private String password;
	private String gender;
	private int zipcode;
	private String favorite;
		
		

		public Users(String email) {
			super();
			this.email = email;
		}




		public Users(String email, String password) {
			super();
			this.email = email;
			this.password = password;
		}




		public String getEmail() {
			return email;
		}
		
		


		public void setEmail(String email) {
			this.email = email;
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


		public long getPhoneNum() {
			return phoneNum;
		}


		public void setPhoneNum(long phoneNum) {
			this.phoneNum = phoneNum;
		}


		public String getPassword() {
			return password;
		}


		public void setPassword(String password) {
			this.password = password;
		}


		public String getGender() {
			return gender;
		}


		public void setGender(String gender) {
			this.gender = gender;
		}


		public int getZipcode() {
			return zipcode;
		}


		public void setZipcode(int zipcode) {
			this.zipcode = zipcode;
		}


		public String getFavorite() {
			return favorite;
		}


		public void setFavorite(String favorite) {
			this.favorite = favorite;
		}

		
	
		public Users() {
			
		}


		@Override
		public String toString() {
			return "Users [email=" + email + ", firstName=" + firstName + ", lastName=" + lastName + ", phoneNum="
					+ phoneNum + ", password=" + password + ", gender=" + gender + ", zipcode=" + zipcode
					+ ", favorite=" + favorite + "]";
		}
		
		
}
