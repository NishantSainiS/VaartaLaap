package com.me.nss.vaartalaap.Models;

public class MessageModel {
    String uid;
    String message;

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    String messageId;
    Long timestamp;


    public MessageModel(String uid, String message, Long timestamp,String messageId) {
        this.uid = uid;
        this.message = message;
        this.timestamp = timestamp;
        this.messageId = messageId;
    }

    public MessageModel(String uid, String message) {
        this.uid = uid;
        this.message = message;
    }
    public MessageModel(){}

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
