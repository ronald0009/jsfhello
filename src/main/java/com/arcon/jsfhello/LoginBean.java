package com.arcon.jsfhello;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class LoginBean implements Serializable {

	/**
	 * auto-generated
	 */
	private static final long serialVersionUID = 1L;

	private String user;

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

}