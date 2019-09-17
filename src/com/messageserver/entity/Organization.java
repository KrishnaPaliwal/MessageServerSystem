package com.messageserver.entity;

public class Organization {
	private int orgId;
	private String orgName;
	private Address orgAddress;
	private String telphone;
	private String motto;
	private String description;
	/*private String logo;*/
	/**
	 * @return the orgId
	 */
	public int getOrgId() {
		return orgId;
	}

	/**
	 * @param orgId
	 *            the orgId to set
	 */
	public void setOrgId(int orgId) {
		this.orgId = orgId;
	}

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
	 * @return the orgAddress
	 */
	public Address getOrgAddress() {
		return orgAddress;
	}

	/**
	 * @param orgAddress
	 *            the orgAddress to set
	 */
	public void setOrgAddress(Address orgAddress) {
		this.orgAddress = orgAddress;
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

}
