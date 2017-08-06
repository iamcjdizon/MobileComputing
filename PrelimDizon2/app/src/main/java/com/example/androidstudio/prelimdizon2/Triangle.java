package com.example.androidstudio.prelimdizon2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Triangle extends AppCompatActivity {


    Button go;
    TextView answer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangle);
        go = (Button)findViewById(R.id.btnCompile);
        answer = (TextView) findViewById(R.id.textAnswer);

        go.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int sum = 0;
                for (int x=1; x<=10; x++)
                {
                    sum = sum + x;
                    answer.append("\nThe Triangualar of "+ String.valueOf(x) + " is "+ String.valueOf(sum));
                }
            }
        });
    }
}
