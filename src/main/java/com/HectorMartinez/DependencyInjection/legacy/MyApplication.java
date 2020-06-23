package com.HectorMartinez.DependencyInjection.legacy;
/*
     This class is responsible to initialize the email service and then use it. This leads to hard-coded dependency. 
     If we want to switch to some other advanced email service in the future, it will require code changes in 
     MyApplication class. This makes our application hard to extend and if email service is used in multiple classes 
     then that would be even harder.
*/
public class MyApplication {
    private EmailService emailService = new EmailService();
    
    public void processMessage(String message, String receiver) {
        this.emailService.sendEmail(message, receiver);
    }
    
}