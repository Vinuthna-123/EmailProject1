package com.example.emailportal;

public class EmailEntry {
    private String sender;
    private String recipient;
    private String subject;
    private String message;
    private String timeSent;

    public EmailEntry(String sender, String recipient, String subject, String message, String timeSent) {
        this.sender = sender;
        this.recipient = recipient;
        this.subject = subject;
        this.message = message;
        this.timeSent = timeSent;
    }

    public String getSender() {
        return sender;
    }

    public String getRecipient() {
        return recipient;
    }

    public String getSubject() {
        return subject;
    }

    public String getMessage() {
        return message;
    }

    public String getTimeSent() {
        return timeSent;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setTimeSent(String timeSent) {
        this.timeSent = timeSent;
    }
}
