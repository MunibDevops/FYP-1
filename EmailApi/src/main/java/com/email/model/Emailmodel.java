package com.email.model;

public class Emailmodel {

	private String to;

	private String Subject;

	private String message;

	public Emailmodel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Emailmodel(String to, String subject, String message) {
		super();
		this.to = to;
		Subject = subject;
		this.message = message;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getSubject() {
		return Subject;
	}

	public void setSubject(String subject) {
		Subject = subject;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	

	@Override
	public String toString() {
		return "Emailmodel [to=" + to + ", Subject=" + Subject + ", message=" + message + "]";
	}
	
	

	


	

	




	

	

	

	

	

	

	

	

	

	

	

	

	

	
	

	
	
	
}
