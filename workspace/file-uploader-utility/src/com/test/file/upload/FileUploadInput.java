package com.test.file.upload;

public class FileUploadInput {
	
	private String cpCode;
	private String keyPath;
	private String inputFilePath;
	private String eGressFilePath;
	public String getCpCode() {
		return cpCode;
	}
	public void setCpCode(String cpCode) {
		this.cpCode = cpCode;
	}
	public String getKeyPath() {
		return keyPath;
	}
	public void setKeyPath(String keyPath) {
		this.keyPath = keyPath;
	}
	public String getInputFilePath() {
		return inputFilePath;
	}
	public void setInputFilePath(String inputFilePath) {
		this.inputFilePath = inputFilePath;
	}
	public String geteGressFilePath() {
		return eGressFilePath;
	}
	public void seteGressFilePath(String eGressFilePath) {
		this.eGressFilePath = eGressFilePath;
	}
	public String getAkamaiFilePathToAppend() {
		return akamaiFilePathToAppend;
	}
	public void setAkamaiFilePathToAppend(String akamaiFilePathToAppend) {
		this.akamaiFilePathToAppend = akamaiFilePathToAppend;
	}
	public String getCookie() {
		return cookie;
	}
	public void setCookie(String cookie) {
		this.cookie = cookie;
	}
	private String akamaiFilePathToAppend;
	private String cookie;

}
