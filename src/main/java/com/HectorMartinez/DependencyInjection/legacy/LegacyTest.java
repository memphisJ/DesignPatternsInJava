package com.HectorMartinez.DependencyInjection.legacy;

public class LegacyTest {
    public static void main(String...args) {
        MyApplication myApplication = new MyApplication();
        myApplication.processMessage("This is the message.", "myEmail@gmil.com");
    }
    
}