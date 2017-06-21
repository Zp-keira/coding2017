package com.ood.rsp.dao;

import com.ood.rsp.dto.Configuration;
import com.ood.rsp.dto.ConfigurationKeys;
import com.ood.rsp.interfaces.IHost;

public class SetSMTPHost implements IHost{
	public String setHost(Configuration config) 
	{
		String smtpHost = config.getProperty(ConfigurationKeys.SMTP_SERVER);
		return smtpHost;
	}

	
}
