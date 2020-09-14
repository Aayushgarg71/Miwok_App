package com.example.miwok;

public class Word {
    private String miwork;
    private String English;
    public Word(String miwork,String English){
        this.miwork=miwork;
        this.English=English;
    }
    public String defaulttr(){
        return miwork;
    }
    public String miworktr(){
        return English;
    }
}
