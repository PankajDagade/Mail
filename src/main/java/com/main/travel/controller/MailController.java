package com.main.travel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.main.travel.service.MailService;

@RestController
public class MailController {
	
	@Autowired MailService mailService;
	
	@GetMapping("/send-mail/{toEmail}")
	public String onSendMail(@PathVariable String toEmail)
	{
		mailService.sendBookMail(toEmail);
		
		return "Email Sended";
	}

}
