package com.ood.rsp.dao;

import com.ood.rsp.dto.Configuration;
import com.ood.rsp.dto.ConfigurationKeys;
import com.ood.rsp.interfaces.IHost;

public class SetFromAddress implements IHost{
	@Override
	public String setHost(Configuration config) {
		// TODO Auto-generated method stub
		String fromAddress = config.getProperty(ConfigurationKeys.EMAIL_ADMIN); 
		return fromAddress;
	}
}
