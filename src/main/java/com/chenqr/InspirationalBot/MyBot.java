package com.chenqr.InspirationalBot;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;

public class MyBot extends TelegramLongPollingBot{

    private String botUsername;
    private String botToken;

    public MyBot(String token, String userName) {
        this.botUsername = userName;
        this.botToken = token;
    }

    @Override
    public String getBotUsername() {
        return this.botUsername;
    }

    @Override
    public void onUpdateReceived(Update update) {
        System.out.println(update);
    }

    @Override  
    public String getBotToken() {  
        return this.botToken;  
    }  
}
