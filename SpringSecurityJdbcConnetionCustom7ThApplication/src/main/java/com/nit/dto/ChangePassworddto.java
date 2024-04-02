package com.nit.dto;

public class ChangePassworddto {
	
	private String oldPassword;
	private String newpassword;
	private String confirmpassword;
	
	public String getOldPassword() {
		return oldPassword;
	}
	public void setOldPassword(String oldPassword) {
		this.oldPassword = oldPassword;
	}
	public String getNewpassword() {
		return newpassword;
	}
	public void setNewpassword(String newpassword) {
		this.newpassword = newpassword;
	}
	public String getConfirmpassword() {
		return confirmpassword;
	}
	public void setConfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
	}
	@Override
	public String toString() {
		return "ChangePassworddto [oldPassword=" + oldPassword + ", newpassword=" + newpassword + ", confirmpassword="
				+ confirmpassword + "]";
	}
	
	

}
