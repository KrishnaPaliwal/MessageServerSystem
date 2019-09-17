package com.messageserver.factory;

import com.messageserver.service.EmailService;
import com.messageserver.service.MessageService;

import antlr.StringUtils;

public class EmailFactory {
	
	
	public static EmailService getFactory(String action){
		
		
		if(null!=action){
			
			if("sendMessage".equals(action)){
				
			}
		}
		return null;
		
	}

}
