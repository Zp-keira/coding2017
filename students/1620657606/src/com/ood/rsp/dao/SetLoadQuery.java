package com.ood.rsp.dao;

import com.ood.rsp.dto.ProductInfo;

public class SetLoadQuery {
public String  setLoadQuery(ProductInfo productInfo) throws Exception {
		String productID=productInfo.getProductID();
		String sendMailQuery = "Select name from subscriptions "
				+ "where product_id= '" + productID +"' "
				+ "and send_mail=1 ";
		
		
		System.out.println("loadQuery set");
		return sendMailQuery;
	}
}
