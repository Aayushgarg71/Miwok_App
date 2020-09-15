package com.example.miwok;

public class Word {
    private String miwork;
    private String English;
    private int resourceid;
    public Word(String miwork,String English){
        this.miwork=miwork;
        this.English=English;
    }
    public Word(String miwork,String English,int resourceid){
        this.miwork=miwork;
        this.English=English;
        this.resourceid=resourceid;
    }
    public String defaulttr(){
        return miwork;
    }
    public String miworktr(){
        return English;
    }
    public int getResourceid(){
        return resourceid;
    }
}
