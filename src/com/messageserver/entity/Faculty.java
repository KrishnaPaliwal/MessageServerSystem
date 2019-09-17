package com.messageserver.entity;

import java.util.Date;

public class Faculty {

	private int fid;
	private String firstName;
	private String lastName;
	private String mobile;
	private String email;
	private String classTeacherFor;
	private Date dob;
	private Login login;

	/**
	 * @return the dob
	 */
	public Date getDob() {
		return dob;
	}

	/**
	 * @param dob
	 *            the dob to set
	 */
	public void setDob(Date dob) {
		this.dob = dob;
	}

	/**
	 * @return the login
	 */
	public Login getLogin() {
		return login;
	}

	/**
	 * @param login
	 *            the login to set
	 */
	public void setLogin(Login login) {
		this.login = login;
	}

	/**
	 * @return the fid
	 */
	public int getFid() {
		return fid;
	}

	/**
	 * @param fid
	 *            the fid to set
	 */
	public void setFid(int fid) {
		this.fid = fid;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName
	 *            the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName
	 *            the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the mobile
	 */
	public String getMobile() {
		return mobile;
	}

	/**
	 * @param mobile
	 *            the mobile to set
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the classTeacherFor
	 */
	public String getClassTeacherFor() {
		return classTeacherFor;
	}

	/**
	 * @param classTeacherFor
	 *            the classTeacherFor to set
	 */
	public void setClassTeacherFor(String classTeacherFor) {
		this.classTeacherFor = classTeacherFor;
	}

}
