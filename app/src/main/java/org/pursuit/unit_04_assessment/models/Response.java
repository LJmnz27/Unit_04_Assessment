package org.pursuit.unit_04_assessment.models;

import java.util.List;

public class Response{
	private List<MessageItem> message;
	private String status;

	public void setMessage(List<MessageItem> message){
		this.message = message;
	}

	public List<MessageItem> getMessage(){
		return message;
	}

	public void setStatus(String status){
		this.status = status;
	}

	public String getStatus(){
		return status;
	}


}