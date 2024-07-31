package com.example.decorator;

public class DecoratorPatternTest {

    public static void main(String[] args) {
        // Create an email notifier
        Notifier emailNotifier = new EmailNotifier();

        // Decorate the email notifier with SMS notification
        Notifier smsNotifier = new SMSNotifierDecorator(emailNotifier);

        // Decorate the SMS notifier with Slack notification
        Notifier slackNotifier = new SlackNotifierDecorator(smsNotifier);

        // Send notification via all channels
        slackNotifier.send("This is a test message.");
    }
}
