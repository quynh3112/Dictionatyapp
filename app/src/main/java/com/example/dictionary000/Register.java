package com.example.dictionary000;
import android.os.Bundle;

import androidx.annotation.Nullable;
import  androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.dictionary000.Dao.DictionaryDao;
import com.google.android.material.textfield.TextInputEditText;

public class Register extends  AppCompatActivity {
    private DictionaryDao dao;

    @Override

    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);
        dao=new DictionaryDao(this);
        TextInputEditText edtemail;
        TextInputEditText edtpassword;
        TextInputEditText edtName;
        Button btnregister ;
        btnregister=findViewById(R.id.btnregister);
        edtemail=findViewById(R.id.edtEmail);
        edtpassword=findViewById(R.id.edtPassword);
        edtName=findViewById(R.id.edtName);
        TextView txtSingin=findViewById(R.id.tvSignin);
        btnregister.setOnClickListener(v->{
            String email=edtemail.getText().toString().trim();
            String password=edtpassword.getText().toString().trim();
            String name=edtName.getText().toString().trim();
            if (name.isEmpty()){
                edtName.setError("Chưa nhập tên ");
            }
            else if(email.isEmpty()){
                edtemail.setError("Chưa nhập email");
            } else if (password.isEmpty()) {
                edtpassword.setError("Chưa nhập mật khẩu ");

            }
            else {
                if(password.length()<8){
                    edtpassword.setError("Mật khẩu phải lớn hơn 8 kí tự!");
                }
                else{
                   try{
                       dao.addClient(name,email,password);
                       Toast.makeText(Register.this,"Tạo tài khoản thành Công",Toast.LENGTH_SHORT).show();
                       Intent intent=new Intent(Register.this,Login.class);
                       startActivity(intent);
                   }
                   catch (Exception exception){
                       System.err.println("Đã xảy ra lỗi:"+ exception.getMessage());
                       exception.printStackTrace();
                   }
                }

            }


        });
        txtSingin.setOnClickListener(v->{
            onBackPressed();
        });



    }
}
