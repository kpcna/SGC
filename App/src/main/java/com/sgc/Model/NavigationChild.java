package com.sgc.Model;

public class NavigationChild 
{
    private long id;
    private String text;
    private String icon;
	
    public NavigationChild(long id, String text) 
    {
    	this.id = id;
    	this.text = text;
    	this.icon = "glyphicon glyphicon-arrow-right";
    }
    
    public long getId() {
        return id;
    }

    public String getText() {
        return text;
    }
    
    public String getIcon() {
        return icon;
    }
}
