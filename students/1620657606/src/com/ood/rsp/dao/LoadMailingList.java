package com.ood.rsp.dao;

import java.util.List;

import com.ood.rsp.util.DBUtil;

public class LoadMailingList {
	public List loadMailingList(String sendMailQuery) throws Exception {
		return DBUtil.query(sendMailQuery);
	}
}
