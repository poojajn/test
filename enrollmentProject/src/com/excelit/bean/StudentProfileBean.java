package com.excelit.bean;
/**
 * @author        : POOJA J
 * @created on    : 24/6/2017   
 * this bean class used for studentProfle information
 */
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import com.excelit.constants.DBconstants;

@Entity
@Table(name = "esh_spd", schema = DBconstants.STUDENT_ENROLLMENT)
public class StudentProfileBean {

	@Id
	@Column(name = "spd_registrationid", length = 11)
	private String studentRegistrationId;

	@Column(name = "spd_firstname", length = 20)
	private String studentFirstName;

	@Column(name = "spd_middlename", length = 20)
	private String studentMiddleName;

	@Column(name = "spd_lastname", length = 20)
	private String studentLastName;

	@Column(name = "spd_preferredname", length = 30)
	private String studentPreferredName;

	@Column(name = "spd_gender", length = 1)
	private String gender;

	@Column(name = "spd_dob")
	private Date studentDateOfBirth;

	@Column(name = "spd_placeofbirth", length = 70)
	private String studentPlaceOfBirth;

	@Column(name = "spd_studentrace", length = 1)
	private String studentRace;

	@Column(name = "spd_studentlivewith", length = 30)
	private String studentLiveWith;

	@Column(name = "spd_aadharcard", length = 15)
	private String studentAadharCard;

	@Column(name = "spd_religion", length = 40)
	private String studentReligion;

	@Column(name = "spd_caste", length = 20)
	private String studentCaste;

	@Column(name = "spd_category", length = 20)
	private String studentCategory;

	@Column(name = "spd_rtecandidate", length = 1)
	private String studentRTECandidate;

	@Column(name = "spd_addressline1", length = 50)
	private String studentAddressLine1;

	@Column(name = "spd_addressline2", length = 50)
	private String studentAddressLine2;

	@Column(name = "spd_addressline3", length = 50)
	private String studentAddressLine3;

	@Column(name = "spd_city", length = 50)
	private String studentCityOrTown;

	@Column(name = "spd_district", length = 60)
	private String studentDistrict;

	@Column(name = "spd_state", length = 50)
	private String studentState;

	@Column(name = "spd_country", length = 50)
	private String studentCountry;

	@Column(name = "spd_postal_code", length = 15)
	private Integer studentPostalOrZipCode;

	@Column(name = "spd_home_phone_number", length = 20)
	private Integer studentHomePhoneNumber;

	@Column(name = "spd_mob", length = 20)
	private Integer studentMobileNumber;

	/**
	 * @return the studentRegistrationId
	 */
	public String getStudentRegistrationId() {
		return studentRegistrationId;
	}

	/**
	 * @param studentRegistrationId
	 *            the studentRegistrationId to set
	 */
	public void setStudentRegistrationId(String studentRegistrationId) {
		this.studentRegistrationId = studentRegistrationId;
	}

	/**
	 * @return the studentFirstName
	 */
	public String getStudentFirstName() {
		return studentFirstName;
	}

	/**
	 * @param studentFirstName
	 *            the studentFirstName to set
	 */
	public void setStudentFirstName(String studentFirstName) {
		this.studentFirstName = studentFirstName;
	}

	/**
	 * @return the studentMiddleName
	 */
	public String getStudentMiddleName() {
		return studentMiddleName;
	}

	/**
	 * @param studentMiddleName
	 *            the studentMiddleName to set
	 */
	public void setStudentMiddleName(String studentMiddleName) {
		this.studentMiddleName = studentMiddleName;
	}

	/**
	 * @return the studentLastName
	 */
	public String getStudentLastName() {
		return studentLastName;
	}

	/**
	 * @param studentLastName
	 *            the studentLastName to set
	 */
	public void setStudentLastName(String studentLastName) {
		this.studentLastName = studentLastName;
	}

	/**
	 * @return the studentPreferredName
	 */
	public String getStudentPreferredName() {
		return studentPreferredName;
	}

	/**
	 * @param studentPreferredName
	 *            the studentPreferredName to set
	 */
	public void setStudentPreferredName(String studentPreferredName) {
		this.studentPreferredName = studentPreferredName;
	}

	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender
	 *            the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * @return the studentDateOfBirth
	 */
	public Date getStudentDateOfBirth() {
		return studentDateOfBirth;
	}

	/**
	 * @param studentDateOfBirth
	 *            the studentDateOfBirth to set
	 */
	public void setStudentDateOfBirth(Date studentDateOfBirth) {
		this.studentDateOfBirth = studentDateOfBirth;
	}

	/**
	 * @return the studentPlaceOfBirth
	 */
	public String getStudentPlaceOfBirth() {
		return studentPlaceOfBirth;
	}

	/**
	 * @param studentPlaceOfBirth
	 *            the studentPlaceOfBirth to set
	 */
	public void setStudentPlaceOfBirth(String studentPlaceOfBirth) {
		this.studentPlaceOfBirth = studentPlaceOfBirth;
	}

	/**
	 * @return the studentRace
	 */
	public String getStudentRace() {
		return studentRace;
	}

	/**
	 * @param studentRace
	 *            the studentRace to set
	 */
	public void setStudentRace(String studentRace) {
		this.studentRace = studentRace;
	}

	/**
	 * @return the studentLiveWith
	 */
	public String getStudentLiveWith() {
		return studentLiveWith;
	}

	/**
	 * @param studentLiveWith
	 *            the studentLiveWith to set
	 */
	public void setStudentLiveWith(String studentLiveWith) {
		this.studentLiveWith = studentLiveWith;
	}

	/**
	 * @return the studentAadharCard
	 */
	public String getStudentAadharCard() {
		return studentAadharCard;
	}

	/**
	 * @param studentAadharCard
	 *            the studentAadharCard to set
	 */
	public void setStudentAadharCard(String studentAadharCard) {
		this.studentAadharCard = studentAadharCard;
	}

	/**
	 * @return the studentReligion
	 */
	public String getStudentReligion() {
		return studentReligion;
	}

	/**
	 * @param studentReligion
	 *            the studentReligion to set
	 */
	public void setStudentReligion(String studentReligion) {
		this.studentReligion = studentReligion;
	}

	/**
	 * @return the studentCaste
	 */
	public String getStudentCaste() {
		return studentCaste;
	}

	/**
	 * @param studentCaste
	 *            the studentCaste to set
	 */
	public void setStudentCaste(String studentCaste) {
		this.studentCaste = studentCaste;
	}

	/**
	 * @return the studentCategory
	 */
	public String getStudentCategory() {
		return studentCategory;
	}

	/**
	 * @param studentCategory
	 *            the studentCategory to set
	 */
	public void setStudentCategory(String studentCategory) {
		this.studentCategory = studentCategory;
	}

	/**
	 * @return the studentRTECandidate
	 */
	public String getStudentRTECandidate() {
		return studentRTECandidate;
	}

	/**
	 * @param studentRTECandidate
	 *            the studentRTECandidate to set
	 */
	public void setStudentRTECandidate(String studentRTECandidate) {
		this.studentRTECandidate = studentRTECandidate;
	}

	/**
	 * @return the studentAddressLine1
	 */
	public String getStudentAddressLine1() {
		return studentAddressLine1;
	}

	/**
	 * @param studentAddressLine1
	 *            the studentAddressLine1 to set
	 */
	public void setStudentAddressLine1(String studentAddressLine1) {
		this.studentAddressLine1 = studentAddressLine1;
	}

	/**
	 * @return the studentAddressLine2
	 */
	public String getStudentAddressLine2() {
		return studentAddressLine2;
	}

	/**
	 * @param studentAddressLine2
	 *            the studentAddressLine2 to set
	 */
	public void setStudentAddressLine2(String studentAddressLine2) {
		this.studentAddressLine2 = studentAddressLine2;
	}

	/**
	 * @return the studentAddressLine3
	 */
	public String getStudentAddressLine3() {
		return studentAddressLine3;
	}

	/**
	 * @param studentAddressLine3
	 *            the studentAddressLine3 to set
	 */
	public void setStudentAddressLine3(String studentAddressLine3) {
		this.studentAddressLine3 = studentAddressLine3;
	}

	/**
	 * @return the studentCityOrTown
	 */
	public String getStudentCityOrTown() {
		return studentCityOrTown;
	}

	/**
	 * @param studentCityOrTown
	 *            the studentCityOrTown to set
	 */
	public void setStudentCityOrTown(String studentCityOrTown) {
		this.studentCityOrTown = studentCityOrTown;
	}

	/**
	 * @return the studentDistrict
	 */
	public String getStudentDistrict() {
		return studentDistrict;
	}

	/**
	 * @param studentDistrict
	 *            the studentDistrict to set
	 */
	public void setStudentDistrict(String studentDistrict) {
		this.studentDistrict = studentDistrict;
	}

	/**
	 * @return the studentState
	 */
	public String getStudentState() {
		return studentState;
	}

	/**
	 * @param studentState
	 *            the studentState to set
	 */
	public void setStudentState(String studentState) {
		this.studentState = studentState;
	}

	/**
	 * @return the studentCountry
	 */
	public String getStudentCountry() {
		return studentCountry;
	}

	/**
	 * @param studentCountry
	 *            the studentCountry to set
	 */
	public void setStudentCountry(String studentCountry) {
		this.studentCountry = studentCountry;
	}

	/**
	 * @return the studentPostalOrZipCode
	 */
	public Integer getStudentPostalOrZipCode() {
		return studentPostalOrZipCode;
	}

	/**
	 * @param studentPostalOrZipCode
	 *            the studentPostalOrZipCode to set
	 */
	public void setStudentPostalOrZipCode(Integer studentPostalOrZipCode) {
		this.studentPostalOrZipCode = studentPostalOrZipCode;
	}

	/**
	 * @return the studentHomePhoneNumber
	 */
	public Integer getStudentHomePhoneNumber() {
		return studentHomePhoneNumber;
	}

	/**
	 * @param studentHomePhoneNumber
	 *            the studentHomePhoneNumber to set
	 */
	public void setStudentHomePhoneNumber(Integer studentHomePhoneNumber) {
		this.studentHomePhoneNumber = studentHomePhoneNumber;
	}

	/**
	 * @return the studentMobileNumber
	 */
	public Integer getStudentMobileNumber() {
		return studentMobileNumber;
	}

	/**
	 * @param studentMobileNumber
	 *            the studentMobileNumber to set
	 */
	public void setStudentMobileNumber(Integer studentMobileNumber) {
		this.studentMobileNumber = studentMobileNumber;
	}

}
