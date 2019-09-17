package com.messageserver.dto;

import com.messageserver.entity.Address;

public class OrganizationDto {

	private String orgName;
	private String telphone;
	private String motto;
	private String description;
	private String addressLine1;
	private String addressLine2;
	private String city;
	private String postcode;

	/**
	 * @return the orgName
	 */
	public String getOrgName() {
		return orgName;
	}

	/**
	 * @param orgName
	 *            the orgName to set
	 */
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	/**
	 * @return the telphone
	 */
	public String getTelphone() {
		return telphone;
	}

	/**
	 * @param telphone
	 *            the telphone to set
	 */
	public void setTelphone(String telphone) {
		this.telphone = telphone;
	}

	/**
	 * @return the motto
	 */
	public String getMotto() {
		return motto;
	}

	/**
	 * @param motto
	 *            the motto to set
	 */
	public void setMotto(String motto) {
		this.motto = motto;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the addressLine1
	 */
	public String getAddressLine1() {
		return addressLine1;
	}

	/**
	 * @param addressLine1
	 *            the addressLine1 to set
	 */
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	/**
	 * @return the addressLine2
	 */
	public String getAddressLine2() {
		return addressLine2;
	}

	/**
	 * @param addressLine2
	 *            the addressLine2 to set
	 */
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city
	 *            the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the postcode
	 */
	public String getPostcode() {
		return postcode;
	}

	/**
	 * @param postcode
	 *            the postcode to set
	 */
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

}
