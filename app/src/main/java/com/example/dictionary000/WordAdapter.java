package com.example.dictionary000;


import android.app.Dialog;
import android.content.Context;
import android.speech.tts.TextToSpeech;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dictionary000.Class.Word;
import com.example.dictionary000.Dao.DictionaryDao;

import java.util.List;
import java.util.Locale;

public  class WordAdapter extends  RecyclerView.Adapter<WordAdapter.WordViewHolder> {
    private TextToSpeech textToSpeech;
    private List<Word> words;
    private DictionaryDao dao;

    public void updateList(List<Word> newList){
        this.words=newList;
        notifyDataSetChanged();
    }

    public WordAdapter(List<Word> words, DictionaryDao dao){
        this.words=words;
        this.dao=dao;
    }
    @NonNull
    @Override

    public WordViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view =LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        return new WordViewHolder(view);
    }

    @Override

    public void onBindViewHolder(@NonNull WordAdapter.WordViewHolder holder, int position) {
        Word w=words.get(position);
        holder.txtword.setText(w.getWord());
        holder.txtmeaning.setText(w.getMeaning());
        holder.itemView.setOnClickListener(v->{
            Context context= v.getContext();
            Dialog dialog=new Dialog(context);

            dialog.setContentView(R.layout.detail);
            TextView word,meaning,type;
            word=dialog.findViewById(R.id.word);
            meaning=dialog.findViewById(R.id.meaning);
            type=dialog.findViewById(R.id.type);
            word.setText(w.getWord());
            type.setText(w.getWord_type());
            meaning.setText(w.getMeaning());
            ImageButton btnsound=dialog.findViewById(R.id.btnSound);
            // khởi tạo đọc
            textToSpeech = new TextToSpeech(context, status -> {
                if (status == TextToSpeech.SUCCESS) {
                    int result = textToSpeech.setLanguage(Locale.ENGLISH);
                    if (result == TextToSpeech.LANG_MISSING_DATA || result == TextToSpeech.LANG_NOT_SUPPORTED) {
                        Toast.makeText(context, "Language not supported!", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(context, "TTS Ready", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(context, "TTS initialization failed!", Toast.LENGTH_SHORT).show();
                }
            });

            btnsound.setOnClickListener(view -> {
                if (textToSpeech != null) {
                    textToSpeech.speak(w.getWord(), TextToSpeech.QUEUE_FLUSH, null, null);
                }
            });




            dialog.getWindow().setLayout(
                    ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.WRAP_CONTENT
            );
            dialog.show();




        });





    }



    @Override
    public int getItemCount() {
        return words.size();

    }

    public static class WordViewHolder extends RecyclerView.ViewHolder {
        TextView txtword,txtmeaning;
        public WordViewHolder(View view) {
            super(view);
            txtword=view.findViewById(R.id.txtword);
            txtmeaning=view.findViewById(R.id.txtmeaning);

        }
    }

}
