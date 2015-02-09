package com.sgc.Model;

public class NavigationRoot 
{	
    private long id;
    private String text;
    private NavigationChild[] children;
    private String icon;
	
    public NavigationRoot(long id, String text) 
    {
    	this.id = id;
    	this.text = text;
    	this.icon = "glyphicon glyphicon-folder-open";
    	
    	children = new NavigationChild[3];
    	children[0] = new NavigationChild(id + 1,"Business Object 1");
    	children[1] = new NavigationChild(id + 2,"Business Object 2");
    	children[2] = new NavigationChild(id + 3,"Business Object 3");
    }
    
    public long getId() {
        return id;
    }

    public String getText() {
        return text;
    }
    
    public NavigationChild[] getChildren() {
        return children;
    }
    
    public String getIcon() {
        return icon;
    }
}
