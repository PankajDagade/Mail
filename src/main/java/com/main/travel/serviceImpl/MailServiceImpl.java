package com.main.travel.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.main.travel.service.MailService;

@Service
public class MailServiceImpl implements MailService{
	
	@Autowired private JavaMailSender sender;
	
	@Value("${spring.mail.username}")
	private String fromMail;

	@Override
	public void sendBookMail(String toEmail) {
		
		System.out.println(fromMail);
		SimpleMailMessage mail = new SimpleMailMessage();
		mail.setFrom(fromMail);
		mail.setTo(toEmail);
		mail.setSubject("Redbus");
		mail.setText("Your seat is conformid");
		
		sender.send(mail);
		
	}

}
