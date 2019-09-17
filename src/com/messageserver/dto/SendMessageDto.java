package com.messageserver.dto;

public class SendMessageDto {

	private String message;
	private String[] pageIDS;
	private String template;
	private String templateID;

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message
	 *            the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @return the pageIDS
	 */
	public String[] getPageIDS() {
		return pageIDS;
	}

	/**
	 * @param pageIDS
	 *            the pageIDS to set
	 */
	public void setPageIDS(String[] pageIDS) {
		this.pageIDS = pageIDS;
	}

	/**
	 * @return the template
	 */
	public String getTemplate() {
		return template;
	}

	/**
	 * @param template
	 *            the template to set
	 */
	public void setTemplate(String template) {
		this.template = template;
	}

	/**
	 * @return the templateID
	 */
	public String getTemplateID() {
		return templateID;
	}

	/**
	 * @param templateID
	 *            the templateID to set
	 */
	public void setTemplateID(String templateID) {
		this.templateID = templateID;
	}

}
