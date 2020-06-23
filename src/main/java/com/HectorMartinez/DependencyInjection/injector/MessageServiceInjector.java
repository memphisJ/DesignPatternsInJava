package com.HectorMartinez.DependencyInjection.injector;

import com.HectorMartinez.DependencyInjection.consumer.Consumer;

public interface MessageServiceInjector {
    public Consumer getConsumer();
}