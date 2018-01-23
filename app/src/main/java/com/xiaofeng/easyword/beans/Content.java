package com.xiaofeng.easyword.beans;

import java.util.List;

public class Content {
    private List<String> word_mean;
    private String out;
    private String ph_en;
    private String ph_am;
    private String ph_en_mp3;
    private String ph_am_mp3;
    private String ph_tts_mp3;

    public String getOut() {
        return out;
    }

    public void setOut(String out) {
        this.out = out;
    }

    public List<String> getWord_mean() {
        return word_mean;
    }

    public void setWord_mean(List<String> word_mean) {
        this.word_mean = word_mean;
    }

    public String getPh_en() {
        return ph_en;
    }

    public void setPh_en(String ph_en) {
        this.ph_en = ph_en;
    }

    public String getPh_am() {
        return ph_am;
    }

    public void setPh_am(String ph_am) {
        this.ph_am = ph_am;
    }

    public String getPh_en_mp3() {
        return ph_en_mp3;
    }

    public void setPh_en_mp3(String ph_en_mp3) {
        this.ph_en_mp3 = ph_en_mp3;
    }

    public String getPh_am_mp3() {
        return ph_am_mp3;
    }

    public void setPh_am_mp3(String ph_am_mp3) {
        this.ph_am_mp3 = ph_am_mp3;
    }

    public String getPh_tts_mp3() {
        return ph_tts_mp3;
    }

    public void setPh_tts_mp3(String ph_tts_mp3) {
        this.ph_tts_mp3 = ph_tts_mp3;
    }
}
