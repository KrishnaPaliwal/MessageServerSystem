package com.messageserver.entity;

import java.util.Date;

public class Parent {
	private int parentId;
	private String fatherName;
	private String motheName;
	private String sex;
	private String mobile;
	private String email;
	private Date marriageAnniversaery;

	/**
	 * @return the parentId
	 */
	public int getParentId() {
		return parentId;
	}

	/**
	 * @param parentId
	 *            the parentId to set
	 */
	public void setParentId(int parentId) {
		this.parentId = parentId;
	}

	/**
	 * @return the fatherName
	 */
	public String getFatherName() {
		return fatherName;
	}

	/**
	 * @param fatherName
	 *            the fatherName to set
	 */
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	/**
	 * @return the motheName
	 */
	public String getMotheName() {
		return motheName;
	}

	/**
	 * @param motheName
	 *            the motheName to set
	 */
	public void setMotheName(String motheName) {
		this.motheName = motheName;
	}

	/**
	 * @return the sex
	 */
	public String getSex() {
		return sex;
	}

	/**
	 * @param sex
	 *            the sex to set
	 */
	public void setSex(String sex) {
		this.sex = sex;
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
	 * @return the marriageAnniversaery
	 */
	public Date getMarriageAnniversaery() {
		return marriageAnniversaery;
	}

	/**
	 * @param marriageAnniversaery
	 *            the marriageAnniversaery to set
	 */
	public void setMarriageAnniversaery(Date marriageAnniversaery) {
		this.marriageAnniversaery = marriageAnniversaery;
	}

}
