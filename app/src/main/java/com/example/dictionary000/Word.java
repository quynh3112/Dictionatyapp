package com.example.dictionary000;

public class Word {
    private int id;
    private String word;
    private String meaning;
    private String word_type;
    private String example;
    private int topic_id;


    public Word(){}
    public Word(int id,String word,String meaning,String word_type, String example,int topic_id){
        this.id=id;
        this.word=word;
        this.meaning=meaning;
        this.word_type=word_type;
        this.example=example;
        this.topic_id=topic_id;
    }
}
