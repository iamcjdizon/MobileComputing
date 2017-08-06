package com.example.androidstudio.prelimdizon3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class NextAcitivity extends AppCompatActivity {

    TextView answer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next_acitivity);

        answer = (TextView) findViewById(R.id.txtLetters);
        Intent intent = getIntent();
        String passedString = intent.getStringExtra("input");
        repeat(passedString);
    }

    public void repeat(String salita)
    {
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        for (int i = 0; i < salita.length(); i++)
        {
            char c = salita.charAt(i);
            if (map.containsKey(c)) {
                int cnt = map.get(c);
                map.put(c, ++cnt);
            } else {
                map.put(c, 1);
            }

        }

        Set<Character> keys = map.keySet();
        for(Character ch:keys){
            if(map.get(ch) > 1){
                answer.append("\n"+ch+"--->" + String.valueOf(map.get(ch)));
            }
        }
    }

}
