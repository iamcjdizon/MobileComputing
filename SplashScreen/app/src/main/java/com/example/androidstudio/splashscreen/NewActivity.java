package com.example.androidstudio.splashscreen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class NewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        ImageView bokuto = (ImageView) findViewById(R.id.img2);

        bokuto.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {

                switch (motionEvent.getAction())
                {
                    case(MotionEvent.ACTION_DOWN):
                    {
                        Toast.makeText(NewActivity.this, "PRESSED DOWN", Toast.LENGTH_SHORT).show();
                        return true;
                    }
                    case(MotionEvent.ACTION_UP):
                    {
                        Toast.makeText(NewActivity.this, "Pressed UP", Toast.LENGTH_SHORT).show();
                        return true;
                    }
                }


                return false;
            }
        });
    }
}
