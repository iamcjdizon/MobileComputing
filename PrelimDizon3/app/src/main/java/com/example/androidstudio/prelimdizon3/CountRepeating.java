package com.example.androidstudio.prelimdizon3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CountRepeating extends AppCompatActivity {

    EditText input;
    Button pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_count_repeating);

        input = (EditText)findViewById(R.id.textInput);
        pass = (Button) findViewById(R.id.btnPass);

        input.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if ((input.getText().toString().matches("^[a-zA-Z]+$")))
                {

                }
                else
                {
                    Toast.makeText(CountRepeating.this, "Invalid", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if ((input.getText().toString().matches("^[a-zA-Z]+$")))
                {

                }
                else
                {
                    Toast.makeText(CountRepeating.this, "Invalid", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {
                if ((input.getText().toString().matches("^[a-zA-Z]+$")))
                {

                }
                else
                {
                    Toast.makeText(CountRepeating.this, "Invalid", Toast.LENGTH_SHORT).show();
                }
            }


        });

    }

    public void nexActivity(View view)
    {
        Intent intent = new Intent(this, NextAcitivity.class);
        intent.putExtra("input", input.getText().toString());
        startActivity(intent);
    }

}
