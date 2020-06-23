package com.HectorMartinez.DependencyInjection.service;

public class SMSServiceImpl implements MessageService{

    public void sendMessage(String message, String receiver) {
         // Logic to send SMS
         System.out.println("SMS sent to " + receiver + " with the message: " + message);
    }    
}