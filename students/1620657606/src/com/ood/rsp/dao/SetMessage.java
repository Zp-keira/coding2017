package com.ood.rsp.dao;

import java.io.IOException;
import java.util.HashMap;

import com.ood.rsp.dto.MessageInfo;
import com.ood.rsp.dto.ProductInfo;

public class SetMessage {
	public MessageInfo setMessage(HashMap userInfo,String NAME_KEY,ProductInfo productInfo) throws IOException 
	{
		
		String name = (String) userInfo.get(NAME_KEY);
		MessageInfo messageInfo=new MessageInfo();
		messageInfo.setSubject("您关注的产品降价了");
		messageInfo.setMessage("尊敬的 "+name+", 您关注的产品 " + productInfo.getProductDesc() + " 降价了，欢迎购买!");		
				
		return messageInfo;

	}
}
