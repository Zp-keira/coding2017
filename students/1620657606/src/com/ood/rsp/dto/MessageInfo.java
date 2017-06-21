package com.ood.rsp.dto;

public class MessageInfo {
	private String subject;
	private String message;
	private String toAddress;
	private String fromAddress;
	private String smtpHost;
	private String altSmtpHost;
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getToAddress() {
		return toAddress;
	}
	public void setToAddress(String toAddress) {
		this.toAddress = toAddress;
	}
	public String getFromAddress() {
		return fromAddress;
	}
	public void setFromAddress(String fromAddress) {
		this.fromAddress = fromAddress;
	}
	public String getSmtpHost() {
		return smtpHost;
	}
	public void setSmtpHost(String smtpHost) {
		this.smtpHost = smtpHost;
	}
	public String getAltSmtpHost() {
		return altSmtpHost;
	}
	public void setAltSmtpHost(String altSmtpHost) {
		this.altSmtpHost = altSmtpHost;
	}
	
	
}
