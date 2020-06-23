package com.HectorMartinez.DependencyInjection.injector;

import com.HectorMartinez.DependencyInjection.consumer.Consumer;
import com.HectorMartinez.DependencyInjection.consumer.MyDIApplication;
import com.HectorMartinez.DependencyInjection.service.EmailServiceImpl;

public class EmailServiceInjector implements MessageServiceInjector {

    public Consumer getConsumer() {
        return new MyDIApplication(new EmailServiceImpl());
    }

}