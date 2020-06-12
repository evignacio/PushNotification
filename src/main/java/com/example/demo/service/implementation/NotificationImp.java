package com.example.demo.service.implementation;

import com.example.demo.service.NotificationService;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingException;
import com.google.firebase.messaging.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotificationImp implements NotificationService {

    @Autowired
    private FirebaseMessaging firebaseMessaging;

    public void notifyEvent() {
        Message message = Message.builder()
                .putData("teste", "teste").build();
        try {
            firebaseMessaging.send(message);
        } catch (FirebaseMessagingException e) {
            e.printStackTrace();
        }
    }


}
