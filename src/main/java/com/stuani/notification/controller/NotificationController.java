package com.stuani.notification.controller;

import com.stuani.notification.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.mail.MessagingException;

@Controller
@RequestMapping(path = "/v1/notification")
public class NotificationController {

    @Autowired
    private NotificationService notificationService;

    @RequestMapping(value = "/testSendEmail" , method = RequestMethod.GET)
    public void sendEmail(){
        try {
            //notificationService.sendMail("bruno_floriano@hotmail.com", "Test Send Email", "Testing notification email.");
            notificationService.sendEmail();
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}
