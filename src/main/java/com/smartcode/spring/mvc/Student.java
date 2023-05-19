package com.smartcode.spring.mvc;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.web.bind.annotation.InitBinder;

import com.smartcode.spring.mvc.customvalidator.CPostalMexico;

public class Student {

	@NotNull
	@Size(min = 3, message = "Error, required")
	private String name;
	
	private String lastName;
	
	@Min(value = 10, message = "Ages under 10 years are not allowed")
	@Max(value = 100, message = "Ages over 100 years are not allowed")
	private int age;
	
	@Email(message = "Email not valid")
	private String email;
	
	//@Pattern(regexp = "[0-9]{5}", message = "Only 5 numeric values ​​are allowed")
	@CPostalMexico
	private String postalCode;
	
	private String optative;
	
	private String cityStudent;
	
	private String languagesStudent;

	public String getLanguagesStudent() {
		return languagesStudent;
	}

	public void setLanguagesStudent(String languagesStudent) {
		this.languagesStudent = languagesStudent;
	}

	public String getOptative() {
		return optative;
	}

	public String getCityStudent() {
		return cityStudent;
	}

	public void setCityStudent(String cityStudent) {
		this.cityStudent = cityStudent;
	}

	public void setOptative(String optative) {
		this.optative = optative;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
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

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	
}
