package com.example.dictionary000;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


import com.example.dictionary000.Dao.DictionaryDao;
import com.google.android.material.textfield.TextInputEditText;

public class Login extends AppCompatActivity {
    private DictionaryDao dao;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.login);
        dao=new DictionaryDao(this);
        Button btnLogin;
        btnLogin=findViewById(R.id.btnLogin);
        TextInputEditText edtEmail;
        TextInputEditText edtPassword;
        edtEmail=findViewById(R.id.edtEmail);
        edtPassword=findViewById(R.id.edtPassword);
        TextView txtSignup;
        txtSignup=findViewById(R.id.txtSignup);
        btnLogin.setOnClickListener(v->{
            String email=edtEmail.getText().toString().trim();
            String password=edtPassword.getText().toString().trim();
            if(email.isEmpty()){
                edtPassword.setError("Vui lòng nhập email");
            }
            else if(password.isEmpty()){
                edtPassword.setError("Vui lòng nhập mật khẩu");
            }
            else{
                if(dao.checkLogin(email,password)){
                    Intent intent=new Intent(Login.this,MainActivity.class);
                    startActivity(intent);

                }
                else {
                    Toast.makeText(Login.this,"Email hoặc mật khẩu không đúng",Toast.LENGTH_SHORT).show();
                }
            }

        });
        txtSignup.setOnClickListener(v->{
            Intent intent=new Intent(Login.this,Register.class);
            startActivity(intent);
        });






    }
}
