package com.messageserver.exception;

public class MessageDaoException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MessageDaoException() {
		super();
	}

	public MessageDaoException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public MessageDaoException(String message, Throwable cause) {
		super(message, cause);
	}

	public MessageDaoException(String message) {
		super(message);
	}

	public MessageDaoException(Throwable cause) {
		super(cause);
	}


	
	
}
