package com.HectorMartinez.DependencyInjection;

import com.HectorMartinez.DependencyInjection.consumer.Consumer;
import com.HectorMartinez.DependencyInjection.injector.EmailServiceInjector;
import com.HectorMartinez.DependencyInjection.injector.MessageServiceInjector;
import com.HectorMartinez.DependencyInjection.injector.SMSServiceInjector;

public class MyMessageDITest {

    public static void main(String...args) {
        String message = "Hola este es el mensaje";
        String email = "myEmail@gnail.com";
        String phoneNumber = "55523145";

        MessageServiceInjector injector = null;
        Consumer app = null;

        // Send Email
        injector = new EmailServiceInjector();
        app = injector.getConsumer();
        app.processMessage(message, email);

        // Send SMS
        injector = new SMSServiceInjector();
        app = injector.getConsumer();
        app.processMessage(message, phoneNumber);
        
    }
    
}