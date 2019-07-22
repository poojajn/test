package com.excelit.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import com.excelit.constants.DBconstants;

@Entity
@Table(name = "student_information", schema = DBconstants.STUDENT_ENROLLMENT)
public class StudentInformation {
	@Id
    @Column(name = "student_first_name")
	private String studentFirstName;
	
	@Column(name = "student_middle_name")
	private String studentMiddleName;
	
	
	@Column(name = "student_last_name")
	private String studentLastName;
	
	@Column(name = "address_line1")
	private String address1;
	
	@Column(name = "address_line2")
	private String address2;
	
	@Column(name = "town/city_name")
	private String townOrCityName;
	
	@Column(name = "district/county_name")
	private String districtOrCountryName;
	
	@Column(name = "state")
	private String state;
	
	@Column(name = "zipcode/postal_code")
	private Integer zipCodeOrPostalCode;

	public String getStudentFirstName() {
		return studentFirstName;
	}

	public void setStudentFirstName(String studentFirstName) {
		this.studentFirstName = studentFirstName;
	}

	public String getStudentMiddleName() {
		return studentMiddleName;
	}

	public void setStudentMiddleName(String studentMiddleName) {
		this.studentMiddleName = studentMiddleName;
	}

	public String getStudentLastName() {
		return studentLastName;
	}

	public void setStudentLastName(String studentLastName) {
		this.studentLastName = studentLastName;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getTownOrCityName() {
		return townOrCityName;
	}

	public void setTownOrCityName(String townOrCityName) {
		this.townOrCityName = townOrCityName;
	}

	public String getDistrictOrCountryName() {
		return districtOrCountryName;
	}

	public void setDistrictOrCountryName(String districtOrCountryName) {
		this.districtOrCountryName = districtOrCountryName;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Integer getZipCodeOrPostalCode() {
		return zipCodeOrPostalCode;
	}

	public void setZipCodeOrPostalCode(Integer zipCodeOrPostalCode) {
		this.zipCodeOrPostalCode = zipCodeOrPostalCode;
	}
	
	
	
	
}
