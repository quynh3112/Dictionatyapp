package com.example.dictionary000;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.PopupMenu;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.dictionary000.Class.Topic;

import java.util.List;

public class Utils {
    public static void showDialog(Context context, String word, String type, String meaning, TextToSpeech textToSpeech){
        Dialog dialog=new Dialog(context);
        dialog.setContentView(R.layout.detail);
        TextView txtword=dialog.findViewById(R.id.txtword);
        TextView txttype=dialog.findViewById(R.id.type);
        TextView txtmeaning=dialog.findViewById(R.id.txtmeaning);
        txtword.setText(word);
        txtmeaning.setText(meaning);
        txttype.setText(type);
        ImageButton btn=dialog.findViewById(R.id.btnSound);
        btn.setOnClickListener(v -> {
            textToSpeech.speak(word,TextToSpeech.QUEUE_FLUSH,null,null);
        });
        dialog.getWindow().setLayout(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT

        );
        dialog.show();
    }
    public static void setTopic(Context context,Spinner sp,List<String> topics){
        ArrayAdapter adapter=new ArrayAdapter<>(context, android.R.layout.simple_spinner_item,topics);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp.setAdapter(adapter);


    }
    public static void setDropdown(Context context, View view){
        PopupMenu popupMenu=new PopupMenu(context,view);
        popupMenu.getMenuInflater().inflate(R.menu.dropdown_menu, popupMenu.getMenu());
        popupMenu.setOnMenuItemClickListener(item -> {
            if(item.getItemId()==R.id.studyword){
                Intent intent =new Intent(context, QltvActivity.class);
                context.startActivity(intent);

                return true;
            }
            if(item.getItemId()==R.id.search){
                Intent intent =new Intent(context, SearchActivity.class);
                context.startActivity(intent);

                return true;

            }
            if(item.getItemId()==R.id.exit){
                SharedPreferences preferences= context.getSharedPreferences("user_session",context.MODE_PRIVATE);
                SharedPreferences.Editor editor= preferences.edit();
                editor.clear();
                editor.apply();

                Intent intent =new Intent(context, Login.class);
                context.startActivity(intent);

                return true;

            }

            return false;
        });
        popupMenu.show();
    }
}
