package com.example.cj.tempconversion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button btnConvert = (Button)findViewById(R.id.btnConvert);
        final RadioButton rCelsius = (RadioButton) findViewById(R.id.radioCelsius);
        final RadioButton rFahrenheit = (RadioButton) findViewById(R.id.radioFahrenheit);
        final TextView textTemp = (TextView) findViewById(R.id.convertedTemp);
        final EditText textInput = (EditText) findViewById(R.id.textInput);

        btnConvert.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                try
                {
                    if (rCelsius.isChecked())
                    {
                        textTemp.setText(String.valueOf(String.format("%.2f", toFahrenhiet(Double.parseDouble(textInput.getText().toString())))+ " °F"));
                    }

                    else if (rFahrenheit.isChecked())
                    {

                        textTemp.setText(String.valueOf(String.format("%.2f", toCelsius(Double.parseDouble(textInput.getText().toString())))+ " °C"));
                    }

                }
                catch (NumberFormatException editText)
                {
                    textTemp.setText("Please Input Temperature");
                }

            }
        });

    }


    public double toFahrenhiet (double temp)
    {
        return temp * 1.8 + 32;
    }

    public double toCelsius (double temp)
    {
        return (temp - 32) / 1.8;
    }

}
