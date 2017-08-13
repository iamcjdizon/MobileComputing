package com.example.androidstudio.splashscreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        ImageView nishinoya = (ImageView) findViewById(R.id.img1);
        nishinoya.animate().rotationBy(-3600f).setDuration(4000);

        Thread timerThread = new Thread() {
            public void run() {
                try{
                    sleep(5000);
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }
                finally {
                    Intent intent = new  Intent(SplashScreenActivity.this, MainActivity.class);
                    startActivity(intent);
                    //finish();
                }
            }
        };
        timerThread.start();
    }

    //Method to close the app when back button is pressed in login.
    @Override
    protected void onPause(){
        super.onPause();
        finish();
    }
}
