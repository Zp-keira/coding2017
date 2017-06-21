package com.ood.rsp.dao;

import com.ood.rsp.dto.Configuration;
import com.ood.rsp.dto.ConfigurationKeys;
import com.ood.rsp.interfaces.IHost;

public class SetAltSMTPHost implements IHost {
	@Override
	public String setHost(Configuration config) {
		// TODO Auto-generated method stub
		String altSmtpHost = config.getProperty(ConfigurationKeys.ALT_SMTP_SERVER); 
		return altSmtpHost;
	}
}
