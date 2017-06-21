package com.ood.rsp.dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import com.ood.rsp.dto.ProductInfo;

public class ReadFile {
	public void readFile(File file) throws IOException // @02C
	{
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(file));
			String temp = br.readLine();
			String[] data = temp.split(" ");
			ProductInfo productInfo=new  ProductInfo();
			productInfo.setProductID(data[0]); 
			productInfo.setProductDesc(data[1]); 
			
			System.out.println("产品ID = " + productInfo.getProductDesc() + "\n");
			System.out.println("产品描述 = " + productInfo.getProductDesc() + "\n");

		} catch (IOException e) {
			throw new IOException(e.getMessage());
		} finally {
			br.close();
		}
	}
}
