package com.sgc.Model;

public class Entity {

    private final long id;
    private final String content;

    public Entity(long id, String content, String[] myParams) {
        this.id = id;        
        
        if(myParams.length > 1)
        {
        	this.content = myParams[1];
        }
        else
        {
        	this.content = content;
        }
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}