package com.HectorMartinez.DependencyInjection.consumer;

import com.HectorMartinez.DependencyInjection.service.MessageService;

public class MyDIApplication implements Consumer{
    private MessageService messageService;

    public MyDIApplication(MessageService messageService) {
        this.messageService = messageService;
    }
    
    public void processMessage(String message, String receiver) {
        this.messageService.sendMessage(message, receiver);
    }
}