package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button button_first=(Button) findViewById(R.id.button_first);
        final TextView textView_show = (TextView) findViewById(R.id.showtextview);
        final Button button_second = findViewById(R.id.button_second);
        final Button button_third = findViewById(R.id.button_third);
        button_first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView_show.setText(button_first.getText());
            }
        });

        button_second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView_show.append(button_second.getText());
            }
        });

        button_third.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                textView_show.append("\n");
            }
        });
    }
}

class deal{

}