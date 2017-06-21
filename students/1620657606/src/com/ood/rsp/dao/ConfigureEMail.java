package com.ood.rsp.dao;

import java.io.IOException;
import java.util.HashMap;

import com.ood.rsp.dto.MessageInfo;
import com.ood.rsp.dto.ProductInfo;

public class ConfigureEMail {
	public MessageInfo configureEMail(HashMap userInfo,String NAME_KEY,String EMAIL_KEY,ProductInfo productInfo) throws IOException 
	{
		MessageInfo messageInfo=new MessageInfo();
		String toAddress = (String) userInfo.get(EMAIL_KEY); 
		if (toAddress.length() > 0){
			SetMessage setMessage=new SetMessage();
			messageInfo=setMessage.setMessage(userInfo,NAME_KEY,productInfo);
		}
		messageInfo.setToAddress(toAddress);
			 
		return messageInfo;
	}
}
