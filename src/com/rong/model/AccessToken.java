package com.rong.model;

public class AccessToken {
	/**
	 * ��ȡ����ƾ֤
	 */
	private String access_token;
	/**
	 * ƾ֤��Чʱ�䣬��λ����
	 */
	private int expires_in;

	public String getAccess_token() {
		return access_token;
	}

	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}

	public int getExpires_in() {
		return expires_in;
	}

	public void setExpires_in(int expires_in) {
		this.expires_in = expires_in;
	}

}