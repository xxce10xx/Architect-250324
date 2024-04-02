package com.architect.fitnessFunctions.utils;

import com.architect.fitnessFunctions.entities.Document;

public class SendEmail {

	private Document document;
	private String email;
	
	public SendEmail(Document document, String email) {
		this.document = document;
		this.email = email;
	}

	public void send_email_document() {
		String xml = document.convert_document_XML();
		//to do
	}
}

//text
//XML