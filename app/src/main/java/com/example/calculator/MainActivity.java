package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.FormatFlagsConversionMismatchException;
import java.util.Stack;

import static android.widget.Toast.*;

public class MainActivity extends AppCompatActivity {
    private boolean first_input_tag=true;//是否第一次输入
    private boolean input_number=false;//前一位是否有数字
    private boolean finish_reslut=false;
    private boolean first_result=false;//前面是否存在乘除法
    private boolean dec = false;//小数
    private boolean sta_dec = false;//全局小数
    private int tag=0;//精度计数
    private String a = "";
    Float b = 0f;
    Stack<Float> stack_float = new Stack<Float>();
    Stack<String> stack_number = new Stack<String>();
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
        final Button button_util_chu = findViewById(R.id.button_fireig);
        final Button button_util_dian=findViewById(R.id.button_thifor);
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
                }else{
                    textview_show.append(button_number_0.getText());

                }
                if(dec){
                    a=a+Float.valueOf((float)Math.pow(0,0));
                    tag=tag+1;
                }else{
                    a=a+"0";
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
                    a=a+"1";
                }else{
                    textview_show.append(button_number_1.getText());
                    a=a+"1";
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
                    a=a+"2";
                }else{
                    textview_show.append(button_number_2.getText());
                    a=a+"2";
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
                    a=a+"3";
                }else{
                    textview_show.append(button_number_3.getText());
                    a=a+"3";
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
                    a=a+"4";
                }else{
                    textview_show.append(button_number_4.getText());
                    a=a+"4";
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
                    a=a+"5";
                }else{
                    textview_show.append(button_number_5.getText());
                    a=a+"5";
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
                    a=a+"6";
                }else{
                    textview_show.append(button_number_6.getText());
                    a=a+"6";
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
                    a=a+"7";
                }else{
                    textview_show.append(button_number_7.getText());
                    a=a+"7";
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
                    a=a+"8";
                }else{
                    textview_show.append(button_number_8.getText());
                    a=a+"8";
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
                    a=a+"9";
                }else{
                    textview_show.append(button_number_9.getText());
                    a=a+"9";
                }
            }
        });
        button_util_ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                first_input_tag=true;
                textview_show.setText("0");
                input_number=false;
                a="";
                tag=0;
                dec=false;
                sta_dec=false;
            }
        });
        button_util_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(input_number){
                    if(first_result){
                        switch (stack_tag.pop()){
                            case "X":a=String.valueOf(Integer.valueOf(a)*Integer.valueOf(stack_number.pop()));break;
                        }
                        first_result=false;
                    }
                    stack_number.push(a);
                    a="";
                    stack_tag.push("+");
                    input_number=false;
                    textview_show.append("+");
                }else{
                    System.out.println("err!");
                    Toast.makeText(getApplicationContext(),"err!", LENGTH_SHORT).show();
                }
                input_number=false;
                dec=false;
            }
        });
        button_util_result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(input_number){

                }else {
                    Toast.makeText(getApplicationContext(),"input number", LENGTH_SHORT).show();
                    return;
                }
                if(first_result){
                    switch (stack_tag.pop()){
                        case "X":
                            if(sta_dec){
                                a=String.valueOf(Float.valueOf(a)*Float.valueOf(stack_number.pop()));
                            }else{
                            a=String.valueOf(Integer.valueOf(a)*Integer.valueOf(stack_number.pop()));}
                            first_result=false;
                            break;
                        case "÷":
                            if(sta_dec){
                                a=String.valueOf(Float.valueOf(stack_number.pop())/Float.valueOf(a));
                            }else{
                            a=String.valueOf(Integer.valueOf(stack_number.pop())/Integer.valueOf(a));}
                            first_result=false;
                            break;
                    }
                }
                while (!stack_number.isEmpty()){
                switch (stack_tag.pop()){
                case "+":if(!stack_tag.isEmpty()){
                    final String temp = stack_tag.pop();
                    stack_tag.push(temp);
                    if(temp=="+"){
                        a=String.valueOf(Integer.valueOf(a)+Integer.valueOf(stack_number.pop()));
                    }else {
                        a=String.valueOf(Integer.valueOf(stack_number.pop())-Integer.valueOf(a));
                    }
                }else{
                    if(sta_dec){
                        float temp1= Float.valueOf(a);
                        float temp2=Float.valueOf(stack_number.pop());
                        temp1=temp2+temp1;
                        a=String.valueOf(temp1);
                    }else{
                    a=String.valueOf(Integer.valueOf(a)+Integer.valueOf(stack_number.pop()));}
                }
                break;
                case "-":if(!stack_tag.isEmpty()){
                    String temp = stack_tag.pop();
                    stack_tag.push(temp);
                    if(temp=="-"){
                        if(sta_dec){
                            a=String.valueOf(Float.valueOf(a)+Float.valueOf(stack_number.pop()));
                        }else{
                        a=String.valueOf(Integer.valueOf(a)+Integer.valueOf(stack_number.pop()));}
                    }else{
                        if(sta_dec){
                            a=String.valueOf(Float.valueOf(stack_number.pop())-Float.valueOf(a));
                        }else{
                        a=String.valueOf(Integer.valueOf(stack_number.pop())-Integer.valueOf(a));}
                    }
                }else{
                    if(sta_dec){
                        a=String.valueOf(Float.valueOf(stack_number.pop())-Float.valueOf(a));
                    }else{
                    a=String.valueOf(Integer.valueOf(stack_number.pop())-Integer.valueOf(a));}
                }break;
                }

            }
                if(sta_dec){
                    textview_show.append("\n"+String.valueOf(Float.valueOf(a).toString()));
                }else{
                textview_show.append("\n"+String.valueOf(a));}
                a="";
                finish_reslut=true;
                input_number=false;
                dec=false;
                sta_dec=false;
            }
        });
        button_util_cheng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(input_number){
                    if(first_result){
                        switch (stack_tag.pop()){
                            case "X":a=String.valueOf(Integer.valueOf(a)*Integer.valueOf(stack_number.pop()));break;
                        }
                        first_result=false;
                    }
                    stack_number.push(a);
                    a="";
                    stack_tag.push("X");
                    input_number=false;
                    textview_show.append("X");
                    first_result=true;
                }else{
                    System.out.println("err!");
                    Toast.makeText(getApplicationContext(),"err!", LENGTH_SHORT).show();
                }
                input_number=false;
                dec=false;
            }
        });
        button_util_jian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(input_number){
                    if(first_result){
                        switch (stack_tag.pop()){
                            case "X":a=String.valueOf(Integer.valueOf(a)*Integer.valueOf(stack_number.pop()));break;
                        }
                        first_result=false;
                    }
                    stack_number.push(a);
                    a="";
                    stack_tag.push("-");
                    input_number=false;
                    textview_show.append("-");
                }else{
                    System.out.println("err!");
                    Toast.makeText(getApplicationContext(),"err!", LENGTH_SHORT).show();
                }
                input_number=false;
                dec=false;
            }
        });
        button_util_chu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(input_number){
                    if(first_result){
                        switch (stack_tag.pop()){
                            case "X":a=String.valueOf(Integer.valueOf(a)*Integer.valueOf(stack_number.pop()));break;
                            case "÷":a=String.valueOf(Integer.valueOf(stack_number.pop())/Integer.valueOf(a));break;
                        }
                        first_result=false;
                    }
                    stack_number.push(a);
                    a="";
                    stack_tag.push("÷");
                    input_number=false;
                    textview_show.append("÷");
                    first_result=true;
                }else{
                    System.out.println("err!");
                    Toast.makeText(getApplicationContext(),"err!", LENGTH_SHORT).show();
                }
                input_number=false;
            }
        });
        button_util_dian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sta_dec=true;
                first_input_tag=false;
                if(dec){
                    Toast.makeText(getApplicationContext(),"已经有点了", LENGTH_SHORT).show();
                    return;
                }else{
                    dec=true;
                    textview_show.append(".");
                    a=a+".";
                    tag=tag+1;
                }
            }
        });
     }
}

