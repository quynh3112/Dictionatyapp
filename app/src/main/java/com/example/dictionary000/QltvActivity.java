package com.example.dictionary000;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import  android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.*;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dictionary000.Class.Topic;
import com.example.dictionary000.Class.Word;
import com.example.dictionary000.Dao.DictionaryDao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class QltvActivity extends  AppCompatActivity{

    Spinner cbtopic;
    RecyclerView recyclerView;
    DictionaryDao dao;
    List<Word> words;
    List<Topic> topics;
    WordAdapter wordAdapter;
    ImageView btnback;





    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.qltv_layout);
        dao=new DictionaryDao(this);
        ImageView dropdown=findViewById(R.id.dropdown);
        words=dao.getAllWords();
        btnback=findViewById(R.id.back);


        cbtopic=findViewById(R.id.topic);


        recyclerView=findViewById(R.id.recyclerview);
        topics=dao.getAllTopics();

        List <String> nametopic=new ArrayList<>();
        for (Topic t: topics){
            nametopic.add(t.getName());

        }
        Utils.setTopic(this,cbtopic,nametopic);

        wordAdapter=new WordAdapter(words,dao);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(wordAdapter);



        cbtopic.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, android.view.View view, int position, long id) {

               int pos=topics.get(position).getId();
               loadWords(pos);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {}
        });
        btnback.setOnClickListener(v->{
            onBackPressed();
        });
        dropdown.setOnClickListener(v->{
            Utils.setDropdown(this,v);
        });



    }






    private void loadWords(int topicId) {
        words.clear();
        words.addAll(dao.getWordsByTopic(topicId));
        wordAdapter=new WordAdapter(words,dao);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        wordAdapter.notifyDataSetChanged();

    }







}
