package com.ood.rsp.dao;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import com.ood.rsp.dto.MessageInfo;
import com.ood.rsp.dto.ProductInfo;
import com.ood.rsp.util.MailUtil;

public class SendEMails {
	public void sendEMails(boolean debug, List mailingList,String NAME_KEY,String EMAIL_KEY,ProductInfo productInfo) throws IOException 
	{

		System.out.println("开始发送邮件");
	

		if (mailingList != null) {
			Iterator iter = mailingList.iterator();
			while (iter.hasNext()) {
				ConfigureEMail configureEMail=new ConfigureEMail();
				MessageInfo messageInfo=new MessageInfo();
				messageInfo=configureEMail.configureEMail((HashMap) iter.next(),NAME_KEY,EMAIL_KEY,productInfo);  
				try 
				{
					if (messageInfo.getToAddress().length() > 0)
						MailUtil.sendEmail(messageInfo.getToAddress(), messageInfo.getFromAddress(), messageInfo.getSubject(), messageInfo.getMessage(), messageInfo.getSmtpHost(), debug);
				} 
				catch (Exception e) 
				{
					
					try {
						MailUtil.sendEmail(messageInfo.getToAddress(), messageInfo.getFromAddress(), messageInfo.getSubject(), messageInfo.getMessage(),messageInfo.getAltSmtpHost(), debug); 
						
					} catch (Exception e2) 
					{
						System.out.println("通过备用 SMTP服务器发送邮件失败: " + e2.getMessage()); 
					}
				}
			}
			

		}

		else {
			System.out.println("没有邮件发送");
			
		}

	}
}
