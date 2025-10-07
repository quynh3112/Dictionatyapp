package com.example.dictionary000;
import  android.os.Bundle;

import androidx.annotation.Nullable;
import  androidx.appcompat.app.AppCompatActivity;
import  android.widget.Button;
import  android.content.Intent;
import androidx.activity.EdgeToEdge;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class MainActivity extends AppCompatActivity{



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainactivity);
        EdgeToEdge.enable(this);
        Button btn;
        btn=findViewById(R.id.btn);
        btn.setOnClickListener(v->{
            Intent intent=new Intent(MainActivity.this,Login.class);
            startActivity(intent);
        });
    }


}
