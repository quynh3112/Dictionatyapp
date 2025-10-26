package com.example.dictionary000;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dictionary000.Class.Word;
import com.example.dictionary000.Dao.DictionaryDao;

import java.util.ArrayList;
import java.util.List;

public class SearchActivity extends AppCompatActivity {
    private DictionaryDao dao;
    List<Word>wordList;
    TextView txtSearch;
    RecyclerView recyclerView;
    WordAdapter wordAdapter;
    ImageView dropdown,back;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        dao=new DictionaryDao(this);
        wordList=new ArrayList<>();
        txtSearch=findViewById(R.id.txtSearch);
        recyclerView=findViewById(R.id.recyclerview);
        dropdown=findViewById(R.id.dropdown);
        wordAdapter=new WordAdapter(wordList,dao);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(wordAdapter);
        back=findViewById(R.id.back);
        txtSearch.addTextChangedListener(new TextWatcher() {
            @Override
            public void afterTextChanged(Editable s) {

            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                List<Word> words=dao.Search(s.toString());
                wordAdapter.updateList(words);



            }
        });
        dropdown.setOnClickListener(v->{
            Utils.setDropdown(this,v);
        });
        back.setOnClickListener(v->{
            onBackPressed();
        });



    }
}

