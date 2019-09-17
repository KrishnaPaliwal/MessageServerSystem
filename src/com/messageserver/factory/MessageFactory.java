package com.messageserver.factory;

import com.messageserver.messageimpl.DeliverMessageImpl;
import com.messageserver.messageimpl.MessageBalanceCheckImpl;
import com.messageserver.messageimpl.SendMessageImpl;
import com.messageserver.service.MessageService;

public class MessageFactory {

	public static MessageService getFactory(String action) {

		if (null != action) {

			if ("sendMessage".equals(action)) {
				return new SendMessageImpl();
			} else if ("deliveryMessage".equals(action)) {
				return new DeliverMessageImpl();
			} else if ("checkBalance".equals(action)) {
				return new MessageBalanceCheckImpl();
			}
		}
		return null;

	}

}
