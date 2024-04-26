package com.chenqr.InspirationalBot;

import org.telegram.telegrambots.bots.TelegramWebhookBot;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;

public class TelegramBot extends TelegramWebhookBot{

    private String token = "";
    private String botUsername = "";

    @Override
    public String getBotToken() {
        return this.token;
    }

    @Override
    public String getBotUsername() {
        return this.botUsername;
    }

    public BotApiMethod<?> onWebhookUpdateReceived(Update update) {  
        return SendMessage.builder().chatId(update.getMessage().getChatId()).text("Halo!").build();  
    }

    @Override  
    public String getBotPath() {  
        return this.botUsername;  
    }  
}
