package com.example.androidstudio.animateimage;

import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Boolean toCheck = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ImageView secondImage = (ImageView) findViewById(R.id.img2);
        final ImageView firstImage = (ImageView) findViewById(R.id.img1);
        secondImage.animate().alpha(0f).translationXBy(-2000f).setDuration(0);

        firstImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (toCheck){
                    firstImage.animate()
                            .rotationBy(3600f)
                            .alpha(0f)
                            .translationXBy(2000f)
                            .setDuration(2000);
                    secondImage.animate()
                            .rotationBy(3600f)
                            .translationXBy(2000f)
                            .alpha(1f)
                            .setDuration(2000);
                    toCheck = false;
                }
            }
        });

        secondImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toCheck==false){
                    firstImage.animate()
                            .rotationBy(-3600f)
                            .alpha(1f)
                            .translationXBy(-2000f)
                            .setDuration(2000);
                    secondImage.animate()
                            .rotationBy(-3600f)
                            .translationXBy(-2000f)
                            .alpha(0f)
                            .setDuration(2000);
                    toCheck = true;
                };
            }
        });

    }

}
