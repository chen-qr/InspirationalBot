package com.chenqr.InspirationalBot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
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
            Webhook webhook = new DefaultWebhook();
            webhook.setInternalUrl("http://0.0.0.0:8443"); // 端口8443
            TelegramBotsApi telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class, webhook);
            MyBot myBot = new MyBot();
            String url = ""; // https
            SetWebhook setWebhook = SetWebhook.builder().url(url).build();
            telegramBotsApi.registerBot(myBot, setWebhook);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        } 

        SpringApplication.run(App.class, args);
    }
}