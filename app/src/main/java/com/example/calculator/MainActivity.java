package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private boolean first_input_tag=true;
    private int a = 0;
    private int b = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button button_number_7 = findViewById(R.id.button_firnin);
        final Button button_util_add = findViewById(R.id.button_secsix);
        final Button button_number_8 = findViewById(R.id.buttonsecze);
        final TextView textview_show = findViewById(R.id.showtextview);
        final Button button_util_ac = findViewById(R.id.button_firfif);
        button_number_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(first_input_tag){
                    first_input_tag=false;
                    textview_show.setText(button_number_7.getText());
                }else{
                    textview_show.append(button_number_7.getText());
                }
            }
        }
        );
        button_number_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(first_input_tag){
                    first_input_tag=false;
                    textview_show.setText(button_number_8.getText());
                }else{
                    textview_show.append(button_number_8.getText());
                }
            }
        }
        );
        button_util_ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                first_input_tag=true;
                textview_show.setText("0");
            }
        });
     }
}

