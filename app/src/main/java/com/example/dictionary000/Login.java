package com.example.dictionary000;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.dictionary000.Dao.DictionaryDao;
import com.google.android.material.textfield.TextInputEditText;

public class Login extends AppCompatActivity {
    private DictionaryDao dao;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        SharedPreferences preferences = getSharedPreferences("user_session", MODE_PRIVATE);
        boolean isLoggedIn = preferences.getBoolean("isLoggedIn", false);

        if (isLoggedIn) {
            Intent intent = new Intent(Login.this, QltvActivity.class);
            startActivity(intent);
            finish();
            return;
        }




        setContentView(R.layout.register);
        dao = new DictionaryDao(this);

        TextView title = findViewById(R.id.txttitle);
        title.setText("Login");

        TextInputEditText edName = findViewById(R.id.edtName);
        edName.setVisibility(View.GONE);

        Button btnLogin = findViewById(R.id.btnregister);
        btnLogin.setText("Login");

        TextInputEditText edtEmail = findViewById(R.id.edtEmail);
        TextInputEditText edtPassword = findViewById(R.id.edtPassword);
        TextView txtSignup = findViewById(R.id.tvSignin);

        btnLogin.setOnClickListener(v -> {
            String email = edtEmail.getText().toString().trim();
            String password = edtPassword.getText().toString().trim();

            if (email.isEmpty()) {
                edtEmail.setError("Vui lòng nhập email");
                return;
            }

            if (password.isEmpty()) {
                edtPassword.setError("Vui lòng nhập mật khẩu");
                return;
            }

            if (dao.checkLogin(email, password)) {

                SharedPreferences.Editor editor = preferences.edit();
                editor.putBoolean("isLoggedIn", true);
                editor.putString("email", email);
                editor.apply();




                Intent intent = new Intent(Login.this, QltvActivity.class);
                startActivity(intent);
                finish();
            } else {
                Toast.makeText(this, "Sai mật khẩu hoặc email", Toast.LENGTH_SHORT).show();
            }
        });

        txtSignup.setOnClickListener(v -> {
            Intent intent = new Intent(Login.this, Register.class);
            startActivity(intent);
        });
    }
}