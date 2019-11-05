package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Stack;

public class MainActivity extends AppCompatActivity {
    private boolean first_input_tag=true;//是否第一次输入
    private boolean input_number=false;//前一位是否有数字
    private boolean finish_reslut=false;
    private boolean first_result=false;//前面是否存在乘除法
    private int a = 0;
    private int b = 0;
    Stack<Integer> stack_number = new Stack<Integer>();
    Stack<String> stack_tag = new Stack<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button button_number_7 = findViewById(R.id.button_firnin);
        final Button button_util_add = findViewById(R.id.button_secsix);
        final Button button_number_8 = findViewById(R.id.buttonsecze);
        final TextView textview_show = findViewById(R.id.showtextview);
        final Button button_util_ac = findViewById(R.id.button_firfif);
        final Button button_util_result=findViewById(R.id.button_thifif);
        final Button button_util_cheng = findViewById(R.id.button_secsec);
        final Button button_number_0 = findViewById(R.id.button_thithi);
        final Button button_number_1 = findViewById(R.id.button_secsev);
        final Button button_number_2 = findViewById(R.id.button_seceig);
        final Button button_number_3 = findViewById(R.id.button_secnin);
        final Button button_number_4 = findViewById(R.id.button_secthi);
        final Button button_number_5 = findViewById(R.id.button_secfor);
        final Button button_number_6 = findViewById(R.id.button_secfif);
        final Button button_number_9 = findViewById(R.id.button_secfir);
        final Button button_util_jian = findViewById(R.id.button_thize);
        button_number_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input_number=true;
                if(finish_reslut){
                    textview_show.setText("");
                    finish_reslut=false;
                }
                if(first_input_tag){
                    first_input_tag=false;
                    textview_show.setText(button_number_0.getText());
                    a=a*10+0;
                }else{
                    textview_show.append(button_number_0.getText());
                    a=a*10+0;
                }
            }
        });
        button_number_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input_number=true;
                if(finish_reslut){
                    textview_show.setText("");
                    finish_reslut=false;
                }
                if(first_input_tag){
                    first_input_tag=false;
                    textview_show.setText(button_number_1.getText());
                    a=a*10+1;
                }else{
                    textview_show.append(button_number_1.getText());
                    a=a*10+1;
                }
            }
        });
        button_number_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input_number=true;
                if(finish_reslut){
                    textview_show.setText("");
                    finish_reslut=false;
                }
                if(first_input_tag){
                    first_input_tag=false;
                    textview_show.setText(button_number_2.getText());
                    a=a*10+2;
                }else{
                    textview_show.append(button_number_2.getText());
                    a=a*10+2;
                }
            }
        });
        button_number_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input_number=true;
                if(finish_reslut){
                    textview_show.setText("");
                    finish_reslut=false;
                }
                if(first_input_tag){
                    first_input_tag=false;
                    textview_show.setText(button_number_3.getText());
                    a=a*10+3;
                }else{
                    textview_show.append(button_number_3.getText());
                    a=a*10+3;
                }
            }
        });
        button_number_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input_number=true;
                if(finish_reslut){
                    textview_show.setText("");
                    finish_reslut=false;
                }
                if(first_input_tag){
                    first_input_tag=false;
                    textview_show.setText(button_number_4.getText());
                    a=a*10+4;
                }else{
                    textview_show.append(button_number_4.getText());
                    a=a*10+4;
                }
            }
        });
        button_number_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input_number=true;
                if(finish_reslut){
                    textview_show.setText("");
                    finish_reslut=false;
                }
                if(first_input_tag){
                    first_input_tag=false;
                    textview_show.setText(button_number_5.getText());
                    a=a*10+5;
                }else{
                    textview_show.append(button_number_5.getText());
                    a=a*10+5;
                }
            }
        });
        button_number_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input_number=true;
                if(finish_reslut){
                    textview_show.setText("");
                    finish_reslut=false;
                }
                if(first_input_tag){
                    first_input_tag=false;
                    textview_show.setText(button_number_6.getText());
                    a=a*10+6;
                }else{
                    textview_show.append(button_number_6.getText());
                    a=a*10+6;
                }
            }
        });
        button_number_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input_number=true;
                if(finish_reslut){
                    textview_show.setText("");
                    finish_reslut=false;
                }
                if(first_input_tag){
                    first_input_tag=false;
                    textview_show.setText(button_number_7.getText());
                    a=a*10+7;
                }else{
                    textview_show.append(button_number_7.getText());
                    a=a*10+7;
                }
            }
        }
        );
        button_number_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input_number=true;
                if(finish_reslut){
                    textview_show.setText("");
                    finish_reslut=false;
                }
                if(first_input_tag){
                    first_input_tag=false;
                    textview_show.setText(button_number_8.getText());
                    a=a*10+8;
                }else{
                    textview_show.append(button_number_8.getText());
                    a=a*10+8;
                }
            }
        }
        );
        button_number_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input_number=true;
                if(finish_reslut){
                    textview_show.setText("");
                    finish_reslut=false;
                }
                if(first_input_tag){
                    first_input_tag=false;
                    textview_show.setText(button_number_9.getText());
                    a=a*10+9;
                }else{
                    textview_show.append(button_number_9.getText());
                    a=a*10+9;
                }
            }
        });
        button_util_ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                first_input_tag=true;
                textview_show.setText("0");
                input_number=false;
                a=0;
            }
        });
        button_util_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(input_number){
                    if(first_result){
                        switch (stack_tag.pop()){
                            case "X":a=a*stack_number.pop();break;
                        }
                        first_result=false;
                    }
                    stack_number.push(a);
                    a=0;
                    stack_tag.push("+");
                    input_number=false;
                    textview_show.append("+");
                }else{
                    System.out.println("err!");
                }
                input_number=false;
            }
        });
        button_util_result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(first_result){
                    switch (stack_tag.pop()){
                        case "X":a=a*stack_number.pop();first_result=false;break;
                    }
                }
                while (!stack_number.isEmpty()){
                switch (stack_tag.pop()){
                case "+":if(!stack_tag.isEmpty()){
                    final String temp = stack_tag.pop();
                    stack_tag.push(temp);
                    if(temp=="+"){
                        a=a+stack_number.pop();
                    }else {
                        a=stack_number.pop()-a;
                    }
                }else{
                    a=a+stack_number.pop();
                }
                break;
                case "-":if(!stack_tag.isEmpty()){
                    String temp = stack_tag.pop();
                    stack_tag.push(temp);
                    if(temp=="-"){
                        a=a+stack_number.pop();
                    }else{
                        a=stack_number.pop()-a;
                    }
                }else{
                    a=stack_number.pop()-a;
                }break;
                }

            }
                textview_show.append("\n"+String.valueOf(a));
                a=0;
                finish_reslut=true;
                input_number=false;
            }
        });
        button_util_cheng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(input_number){
                    if(first_result){
                        switch (stack_tag.pop()){
                            case "X":a=a*stack_number.pop();break;
                        }
                        first_result=false;
                    }
                    stack_number.push(a);
                    a=0;
                    stack_tag.push("X");
                    input_number=false;
                    textview_show.append("X");
                    first_result=true;
                }else{
                    System.out.println("err!");
                }
                input_number=false;
            }
        });
        button_util_jian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(input_number){
                    if(first_result){
                        switch (stack_tag.pop()){
                            case "X":a=a*stack_number.pop();break;
                        }
                        first_result=false;
                    }
                    stack_number.push(a);
                    a=0;
                    stack_tag.push("-");
                    input_number=false;
                    textview_show.append("-");
                }else{
                    System.out.println("err!");
                }
                input_number=false;
            }
        });
     }
}

