package com.ood.rsp.main;

import java.io.File;

import com.ood.rsp.dao.LoadMailingList;
import com.ood.rsp.dao.ReadFile;
import com.ood.rsp.dao.SendEMails;
import com.ood.rsp.dao.SetAltSMTPHost;
import com.ood.rsp.dao.SetFromAddress;
import com.ood.rsp.dao.SetLoadQuery;
import com.ood.rsp.dao.SetSMTPHost;
import com.ood.rsp.dto.Configuration;
import com.ood.rsp.dto.MessageInfo;
import com.ood.rsp.dto.ProductInfo;

public class PromotionMail {
	private static Configuration config;
	private static final String NAME_KEY = "NAME";
	private static final String EMAIL_KEY = "EMAIL";
	public PromotionMail(File file, boolean mailDebug) throws Exception {
		
		//读取配置文件， 文件中只有一行用空格隔开， 例如 P8756 iPhone8
		ReadFile readFile=new ReadFile();
		readFile.readFile(file);

		
		config = new Configuration();
		MessageInfo messageInfo=new MessageInfo();
		ProductInfo productInfo=new ProductInfo();
		SetSMTPHost setSMTPHost=new SetSMTPHost();
		messageInfo.setSmtpHost(setSMTPHost.setHost(config));
		SetAltSMTPHost setAltSMTPHost=new SetAltSMTPHost();
		messageInfo.setAltSmtpHost(setAltSMTPHost.setHost(config));
		SetFromAddress setFromAddress=new SetFromAddress();
		messageInfo.setFromAddress(setFromAddress.setHost(config));
		SetLoadQuery setLoadQuery=new SetLoadQuery();
		String sendMailQuery=setLoadQuery.setLoadQuery(productInfo);
		LoadMailingList loadMailingList=new LoadMailingList();
		SendEMails sendEmails=new SendEMails();
		sendEmails.sendEMails(mailDebug, loadMailingList.loadMailingList(sendMailQuery),NAME_KEY,EMAIL_KEY,productInfo); 
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("C:\\coderising\\workspace_ds\\ood-example\\src\\product_promotion.txt");
		boolean emailDebug = false;

		try {
			PromotionMail pe = new PromotionMail(f, emailDebug);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
