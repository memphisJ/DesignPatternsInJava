package com.HectorMartinez.DependencyInjection.service;

public class EmailServiceImpl implements MessageService{

    public void sendMessage(String message, String receiver) {
         // Logic to send email
         System.out.println("Email sent to " + receiver + " with the message: " + message);
    }    
}