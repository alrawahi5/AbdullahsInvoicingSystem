package com.TRA.tra24Springboot.Service;

import com.slack.api.Slack;
import com.slack.api.methods.request.chat.ChatPostMessageRequest;
import com.slack.api.methods.response.chat.ChatPostMessageResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.security.PublicKey;

@Service
public class SlackService {



        @Value("${slack.token}")
        private String slackToken;

        @Scheduled(cron = "0 5 * * * *")
        public void cronSchudualing(){
            String channel= ""; //#abdullah_channel
            String message = "every 5 minute cron test";

            sendMessage(channel, message);
        }

        public void sendMessage(String channel, String message) {
            Slack slack = Slack.getInstance();
            String token = slackToken; // Your Slack API token

            //channel = "#abdullah_channel";
            //message = "Hi boss!!";
            ChatPostMessageRequest request = ChatPostMessageRequest.builder()
                    .channel(channel)
                    .text(message)
                    .build();

            try {
                ChatPostMessageResponse response = slack.methods(token).chatPostMessage(request);
                if (response.isOk()) {
                    System.out.println("Message sent successfully to Slack!");
                } else {
                    System.out.println("Failed to send message to Slack: " + response.getError());
                }
            } catch (Exception e) {
                System.out.println("Error sending message to Slack: " + e.getMessage());
            }
        }

}
