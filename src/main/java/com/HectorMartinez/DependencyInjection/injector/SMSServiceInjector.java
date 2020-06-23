package com.HectorMartinez.DependencyInjection.injector;
import com.HectorMartinez.DependencyInjection.consumer.Consumer;
import com.HectorMartinez.DependencyInjection.consumer.MyDIApplication;
import com.HectorMartinez.DependencyInjection.service.SMSServiceImpl;

public class SMSServiceInjector implements MessageServiceInjector {

    public Consumer getConsumer() {
        return new MyDIApplication(new SMSServiceImpl());
    }
}