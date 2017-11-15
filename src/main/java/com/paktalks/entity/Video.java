package com.paktalks.entity;

public class Video {
    private String id;
    private String title;
    private String type; // TalkShow, UserVideo, ShortNews, NewsBulletin
    private String hostSource; // youTube, DailyMotion
    private String url;

    public Video() {
    }

    public Video(String id, String title, String type, String hostSource, String url) {
        this.id = id;
        this.title = title;
        this.type = type;
        this.hostSource = hostSource;
        this.url = url;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getHostSource() {
        return hostSource;
    }

    public void setHostSource(String hostSource) {
        this.hostSource = hostSource;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
