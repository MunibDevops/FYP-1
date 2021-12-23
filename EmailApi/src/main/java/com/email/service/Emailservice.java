package com.email.service;


import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.stereotype.Service;

@Service
public class Emailservice {
public void sendemail(String Subject,String message,String to)
{
	
	String from="hj8401408@gmail.com";
	

	String host="smtp.gmail.com";
	
	//get system properties
	Properties properties = System.getProperties();
	System.out.println(properties);
	
	//setting important info
	
	
	properties.put("mail.smtp.host",host);
	
	properties.put("mail.smtp.port",465);

	properties.put("mail.smtp.ssl.enable","true");
	properties.put("mail.smtp.auth","true");
	
	
	
	
	//step1
	//session obj
	

	Session session=Session.getInstance(properties, new Authenticator() {
		@Override
		protected PasswordAuthentication getPasswordAuthentication() {				
			return new PasswordAuthentication("hj8401408@gmail.com","hamza.butt99");
		}
		
		
		
	});
	
	
 




	

	


		
		
			
	
	
			
			


session.setDebug(true);

//step 2 message


MimeMessage m=new MimeMessage(session);
try {
	m.setFrom(from);
	
	
	m.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
	
	m.setSubject(Subject);
	
	
	m.setText(message);
	
	
	//step 3 send
	
	Transport.send(m);
	System.out.println("send success");
	
	
} catch (MessagingException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

	
}


}

