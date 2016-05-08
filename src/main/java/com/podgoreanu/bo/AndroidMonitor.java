package com.podgoreanu.bo;

public class AndroidMonitor {
	private boolean shutDownApp;
	private boolean registerCalls;
	private boolean mailCalls;
	private boolean registerSMS;
	private boolean mailSMS;
	private boolean registerPosition;
	private boolean mailPosition;
	
	public AndroidMonitor() {}
	
	public boolean isShutDownApp() {
		return shutDownApp;
	}
	public void setShutDownApp(boolean shutDownApp) {
		this.shutDownApp = shutDownApp;
	}
	public boolean isRegisterCalls() {
		return registerCalls;
	}
	public void setRegisterCalls(boolean registerCalls) {
		this.registerCalls = registerCalls;
	}
	public boolean isMailCalls() {
		return mailCalls;
	}
	public void setMailCalls(boolean mailCalls) {
		this.mailCalls = mailCalls;
	}
	public boolean isRegisterSMS() {
		return registerSMS;
	}
	public void setRegisterSMS(boolean registerSMS) {
		this.registerSMS = registerSMS;
	}
	public boolean isMailSMS() {
		return mailSMS;
	}
	public void setMailSMS(boolean mailSMS) {
		this.mailSMS = mailSMS;
	}
	public boolean isRegisterPosition() {
		return registerPosition;
	}
	public void setRegisterPosition(boolean registerPosition) {
		this.registerPosition = registerPosition;
	}
	public boolean isMailPosition() {
		return mailPosition;
	}
	public void setMailPosition(boolean mailPosition) {
		this.mailPosition = mailPosition;
	}
	
   
}
