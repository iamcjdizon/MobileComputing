package com.example.androidstudio.prelimdizon1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class GuessingActivity extends AppCompatActivity {

    EditText input;
    Button btnTry, btnReveal;
    TextView textNumber;
    int rdmNumber;

    int duration = Toast.LENGTH_SHORT;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guessing);
        input = (EditText) findViewById(R.id.textInput);
        btnReveal = (Button) findViewById(R.id.btnReveal);
        btnTry = (Button) findViewById(R.id.btnTry);
        textNumber = (TextView) findViewById(R.id.textReveal);

        Random r = new Random();
        rdmNumber = r.nextInt(10);

        btnTry.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (Integer.parseInt(input.getText().toString()) == rdmNumber)
                {
                    Toast toast = Toast.makeText(getApplicationContext(), "Congratulations!!", duration);
                    toast.show();
                }

                else if(Integer.parseInt(input.getText().toString()) > rdmNumber)
                {
                    Toast toast = Toast.makeText(getApplicationContext(), "Lower!!", duration);
                    toast.show();
                }

                else if(Integer.parseInt(input.getText().toString()) < rdmNumber)
                {
                    Toast toast = Toast.makeText(getApplicationContext(), "Higher!!", duration);
                    toast.show();
                }
            }
        });

        btnReveal.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textNumber.setText(String.valueOf(rdmNumber));
            }
        });

    }


}
