package com.springboot.Jenkins_Practice_Project.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "customer_id")
	Integer cid;
	@Column(name = "customer_name")
	String name;
	@Column(name = "pet_name")
	String petName;
	@Column(name = "phone_number")
	String phone;
	@Column(name = "customer_email")
	String email;
	@Column(name = "animal_type")
	String animalType;
	@Column(name = "appointment_detail")
	String concern;

	public Customer() {

	}

	public Customer(Integer cid, String name, String petName, String phone, String email, String animalType,
			String concern) {
		this.cid = cid;
		this.name = name;
		this.petName = petName;
		this.phone = phone;
		this.email = email;
		this.animalType = animalType;
		this.concern = concern;
	}

	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPetName() {
		return petName;
	}

	public void setPetName(String petName) {
		this.petName = petName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAnimalType() {
		return animalType;
	}

	public void setAnimalType(String animalType) {
		this.animalType = animalType;
	}

	public String getConcern() {
		return concern;
	}

	public void setConcern(String concern) {
		this.concern = concern;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", name=" + name + ", petName=" + petName + ", phone=" + phone + ", email="
				+ email + ", animalType=" + animalType + ", concern=" + concern + "]";
	}

}
