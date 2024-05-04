package com.chenqr.InspirationalBot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Value;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.api.methods.updates.SetWebhook;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.meta.generics.Webhook;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;
import org.telegram.telegrambots.updatesreceivers.DefaultWebhook;

@SpringBootApplication
public class App {

    public static void main(String[] args) {

        // 创建Telegram机器人
        try {
            String botToken = System.getProperty("botToken");
            assert null != botToken && !botToken.isEmpty();
            String botUserName = System.getProperty("botUserName");
            assert null != botUserName && !botUserName.isEmpty();

            TelegramBotsApi telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);
            telegramBotsApi.registerBot(new MyBot(botToken, botUserName));
        } catch (TelegramApiException e) {
            e.printStackTrace();
        } 

        SpringApplication.run(App.class, args);
    }
}