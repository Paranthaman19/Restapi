package com.Parama.in;

public class Helloworldbean {
    private String message;
	@Override
	public String toString() {
		return "Helloworldbean [message=" + message + "]";
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Helloworldbean(String message) {
		// TODO Auto-generated constructor stub
		this.message =message;
	}

}
