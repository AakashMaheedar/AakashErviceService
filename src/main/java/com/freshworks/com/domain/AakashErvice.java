package com.freshworks.com.domain;

public class AakashErvice
{

    private final long id;
    private final String content;

    public AakashErvice(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

}
