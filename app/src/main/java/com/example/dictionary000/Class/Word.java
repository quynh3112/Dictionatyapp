package com.example.dictionary000.Class;

public class Word {
    private int id;
    private String word;
    private String meaning;
    private String word_type;

    private int topic_id;


    public Word(int id,String word,String meaning,String word_type,int topic_id){
        this.id=id;
        this.word=word;
        this.meaning=meaning;
        this.word_type=word_type;
        this.topic_id=topic_id;
    }


    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getWord() {
        return word;
    }

    public int getTopic_id() {
        return topic_id;
    }

    public String getWord_type() {
        return word_type;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }
    public String getMeaning()
    {
        return this.meaning;
    }

}
