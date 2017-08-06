package com.example.androidstudio.everboy;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


public class WelcomeActivity extends AppCompatActivity {

    TextView username;
    TextView password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        username = (TextView) findViewById(R.id.textUsername);
        password = (TextView) findViewById(R.id.textPass);

        Intent intent = getIntent();
        String uname = intent.getStringExtra("username");
        String pword = intent.getStringExtra("password");
        username.setText(uname);
        password.setText(pword);
    }


}
