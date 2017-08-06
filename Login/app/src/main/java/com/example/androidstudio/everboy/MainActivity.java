package com.example.androidstudio.everboy;

import android.content.Intent;
import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText username;
    EditText password;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = (EditText) findViewById(R.id.textUsername);
        password = (EditText) findViewById(R.id.textPass);
        login = (Button) findViewById(R.id.btnLogin);
    };

    public void nextActivity (View view)
    {
        String uname = username.getText().toString();
        String pword = password.getText().toString();
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(getApplicationContext(), "Logging in", duration);
        toast.show();

        Intent intent = new Intent(this, WelcomeActivity.class);
        intent.putExtra("username", uname);
        intent.putExtra("password", pword);
        startActivity(intent);
    }

}
