package com.xiaofeng.easyword.beans;

import java.util.List;

public class AssoBean {
    private int status;
    private List<Message> message;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public List<Message> getMessage() {
        return message;
    }

    public void setMessage(List<Message> message) {
        this.message = message;
    }
}
