package com.xiaofeng.easyword.beans;

import java.util.List;

public class Message {
    private String key;
    private List<Means> means;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public List<Means> getMeans() {
        return means;
    }

    public void setMeans(List<Means> means) {
        this.means = means;
    }
}
