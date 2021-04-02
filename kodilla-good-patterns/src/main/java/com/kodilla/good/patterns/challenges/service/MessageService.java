package com.kodilla.good.patterns.challenges.service;

public class MessageService implements InformationService {

    @Override
    public void inform(User user) {
        System.out.println("SMS message sent to: " + user.getPhoneNumber());
    }
}
