package com.example.calculator;

import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import java.util.Stack;

import static android.widget.Toast.LENGTH_SHORT;

public class first_fragment extends Fragment {
    private boolean first_input_tag=true;//是否第一次输入
    private boolean input_number=false;//前一位是否有数字
    private boolean finish_reslut=false;
    private boolean first_result=false;//前面是否存在乘除法
    private boolean dec = false;//小数
    private boolean sta_dec = false;//全局小数
    private int tag=0;//精度计数
    private boolean kuohao_first_reslut=false;
    private boolean kuohao=false;
    private String a = "";
    Float b = 0f;
    Stack<Float> stack_float = new Stack<Float>();
    Stack<String> stack_number = new Stack<String>();
    Stack<String> stack_tag = new Stack<String>();
    @Override
    public void onActivityCreated(Bundle save){
        super.onActivityCreated(save);
        final Button button_number_7 = getActivity().findViewById(R.id.button_firnin);
        final Button button_util_add = getActivity().findViewById(R.id.button_secsix);
        final Button button_number_8 = getActivity().findViewById(R.id.buttonsecze);
        final TextView textview_show = getActivity().findViewById(R.id.showtextview);
        final Button button_util_ac = getActivity().findViewById(R.id.button_firfif);
        final Button button_util_result=getActivity().findViewById(R.id.button_thifif);
        final Button button_util_cheng = getActivity().findViewById(R.id.button_secsec);
        final Button button_number_0 = getActivity().findViewById(R.id.button_thithi);
        final Button button_number_1 = getActivity().findViewById(R.id.button_secsev);
        final Button button_number_2 = getActivity().findViewById(R.id.button_seceig);
        final Button button_number_3 = getActivity().findViewById(R.id.button_secnin);
        final Button button_number_4 = getActivity().findViewById(R.id.button_secthi);
        final Button button_number_5 = getActivity().findViewById(R.id.button_secfor);
        final Button button_number_6 = getActivity().findViewById(R.id.button_secfif);
        final Button button_number_9 = getActivity().findViewById(R.id.button_secfir);
        final Button button_util_jian = getActivity().findViewById(R.id.button_thize);
        final Button button_util_chu = getActivity().findViewById(R.id.button_fireig);
        final Button button_util_dian=getActivity().findViewById(R.id.button_thifor);
        final Button button_util_zuokuohao = getActivity().findViewById(R.id.button_fif);
        final Button button_util_youkuohoa = getActivity().findViewById(R.id.button_six);
        final Button button_util_sin = getActivity().findViewById(R.id.button_first);
        final Button button_util_cos = getActivity().findViewById(R.id.button_second);
        final Button button_util_tan = getActivity().findViewById(R.id.button_third);
        final Button button_util_X = getActivity().findViewById(R.id.button_for);
        final Button button_util_sqrt = getActivity().findViewById(R.id.button_firsix);
        final Button button_util_percent = getActivity().findViewById(R.id.button_firsev);
        final Button button_util_change = getActivity().findViewById(R.id.button_thisec);
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
                a=a+"0";
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
                    if(!kuohao&&first_result){
                        switch (stack_tag.pop()){
                            case "X":a=String.valueOf(Integer.valueOf(a)*Integer.valueOf(stack_number.pop()));break;
                        }
                        first_result=false;
                    }
                    if(kuohao&&kuohao_first_reslut){
                        switch (stack_tag.pop()){
                            case "X":a=String.valueOf(Integer.valueOf(a)*Integer.valueOf(stack_number.pop()));break;
                        }
                        kuohao_first_reslut=false;
                    }
                    stack_number.push(a);
                    a="";
                    stack_tag.push("+");
                    input_number=false;
                    textview_show.append("+");
                }else{
                    System.out.println("err!");
                    Toast.makeText(getActivity().getApplicationContext(),"err!", LENGTH_SHORT).show();
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
                    Toast.makeText(getActivity().getApplicationContext(),"input number", LENGTH_SHORT).show();
                    return;
                }
                if(first_result){
                    switch (stack_tag.pop()){
                        case "X":
                            if(sta_dec){
                                a=String.valueOf(Double.valueOf(a)*Double.valueOf(stack_number.pop()));
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
                kuohao=false;
                kuohao_first_reslut=false;
            }
        });
        button_util_cheng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(input_number){
                    if(!kuohao&&first_result){
                        switch (stack_tag.pop()){
                            case "X":
                                if(sta_dec){
                                    a=String.valueOf(Double.valueOf(a)*Double.valueOf(stack_number.pop()));
                                }else{
                                a=String.valueOf(Integer.valueOf(a)*Integer.valueOf(stack_number.pop()));}
                                break;
                        }
                        first_result=false;
                    }
                    if(kuohao&&kuohao_first_reslut){
                        switch (stack_tag.pop()){
                            case "X":a=String.valueOf(Integer.valueOf(a)*Integer.valueOf(stack_number.pop()));break;
                        }
                        kuohao_first_reslut=false;
                    }
                    stack_number.push(a);
                    a="";
                    stack_tag.push("X");
                    input_number=false;
                    textview_show.append("X");
                    if(kuohao){
                        kuohao_first_reslut=true;
                    }else{
                        first_result=true;
                    }
                }else{
                    System.out.println("err!");
                    Toast.makeText(getActivity().getApplicationContext(),"err!", LENGTH_SHORT).show();
                }
                input_number=false;
                dec=false;
            }
        });
        button_util_jian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(input_number){
                    if(!kuohao&&first_result){
                        switch (stack_tag.pop()){
                            case "X":
                                if(sta_dec){
                                    a=String.valueOf(Double.valueOf(a)*Double.valueOf(stack_number.pop()));
                                }else {
                                a=String.valueOf(Integer.valueOf(a)*Integer.valueOf(stack_number.pop()));}
                            break;
                            case "÷":
                                if(sta_dec){
                                    a=String.valueOf(Double.valueOf(Double.valueOf(stack_number.pop())/Double.valueOf(a)));
                                }else {
                                    a=String.valueOf(Integer.valueOf(stack_number.pop())/Integer.valueOf(a));}
                                break;
                        }
                        first_result=false;
                    }
                    if(kuohao&&kuohao_first_reslut){
                        switch (stack_tag.pop()){
                            case "X":
                                if(sta_dec){
                                    a=String.valueOf(Double.valueOf(a)*Double.valueOf(stack_number.pop()));
                                }else {
                                a=String.valueOf(Integer.valueOf(a)*Integer.valueOf(stack_number.pop()));}
                            break;
                            case "÷":
                                if(sta_dec){
                                    a=String.valueOf(Double.valueOf(Double.valueOf(stack_number.pop())/Double.valueOf(a)));
                                }else {
                                    a=String.valueOf(Integer.valueOf(stack_number.pop())/Integer.valueOf(a));}
                                break;
                        }
                        kuohao_first_reslut=false;
                    }
                    stack_number.push(a);
                    a="";
                    stack_tag.push("-");
                    input_number=false;
                    textview_show.append("-");
                }else{
                    System.out.println("err!");
                    Toast.makeText(getActivity().getApplicationContext(),"err!", LENGTH_SHORT).show();
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
                            case "X":
                                if(sta_dec){
                                    a=String.valueOf(Double.valueOf(a)*Double.valueOf(stack_number.pop()));
                                }else {
                                a=String.valueOf(Integer.valueOf(a)*Integer.valueOf(stack_number.pop()));}
                            break;
                            case "÷":
                                if(sta_dec){
                                    a=String.valueOf(Double.valueOf(stack_number.pop())/Double.valueOf(a));
                                }else{
                                a=String.valueOf(Integer.valueOf(stack_number.pop())/Integer.valueOf(a));}
                                break;
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
                    Toast.makeText(getActivity().getApplicationContext(),"err!", LENGTH_SHORT).show();
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
                    Toast.makeText(getActivity().getApplicationContext(),"已经有点了", LENGTH_SHORT).show();
                    return;
                }else{
                    dec=true;
                    textview_show.append(".");
                    a=a+".";
                    tag=tag+1;
                }
            }
        });
        button_util_zuokuohao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(first_input_tag){
                textview_show.setText("(");}else{
                    textview_show.append("(");
                }
                stack_tag.push("(");
                kuohao=true;
                first_input_tag=false;
            }
        });
        button_util_youkuohoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (input_number) {

                } else {
                    Toast.makeText(getActivity().getApplicationContext(), "input number", LENGTH_SHORT).show();
                    return;
                }
                textview_show.append(")");
                if (kuohao_first_reslut) {
                    switch (stack_tag.pop()) {
                        case "X":
                            if (sta_dec) {
                                a = String.valueOf(Float.valueOf(a) * Float.valueOf(stack_number.pop()));
                            } else {
                                a = String.valueOf(Integer.valueOf(a) * Integer.valueOf(stack_number.pop()));
                            }
                            kuohao_first_reslut = false;
                            break;
                        case "÷":
                            if (sta_dec) {
                                a = String.valueOf(Float.valueOf(stack_number.pop()) / Float.valueOf(a));
                            } else {
                                a = String.valueOf(Integer.valueOf(stack_number.pop()) / Integer.valueOf(a));
                            }
                            kuohao_first_reslut = false;
                            break;
                    }
                }
                while (true) {
                    if(stack_tag.peek()=="("){
                        stack_tag.pop();
                        break;
                    }
                    switch (stack_tag.pop()) {
                        case "+":
                            final String temp = stack_tag.pop();
                            stack_tag.push(temp);
                            if (temp == "+"||temp=="(") {
                                a = String.valueOf(Integer.valueOf(a) + Integer.valueOf(stack_number.pop()));
                            } else {
                                a = String.valueOf(Integer.valueOf(stack_number.pop()) - Integer.valueOf(a));
                            }

                            break;
                        case "-":
                            if (stack_tag.peek() == "-") {
                                if (sta_dec) {
                                    a = String.valueOf(Float.valueOf(a) + Float.valueOf(stack_number.pop()));
                                } else {
                                    a = String.valueOf(Integer.valueOf(a) + Integer.valueOf(stack_number.pop()));
                                }
                            } else {
                                if (sta_dec) {
                                    a = String.valueOf(Float.valueOf(stack_number.pop()) - Float.valueOf(a));
                                } else {
                                    a = String.valueOf(Integer.valueOf(stack_number.pop()) - Integer.valueOf(a));
                                }
                            }
                            break;
                    }

                }
                if (first_result) {
                    switch (stack_tag.pop()) {
                        case "X":
                            if (sta_dec) {
                                a = String.valueOf(Float.valueOf(a) * Float.valueOf(stack_number.pop()));
                            } else {
                                a = String.valueOf(Integer.valueOf(a) * Integer.valueOf(stack_number.pop()));
                            }
                            first_result = false;
                            break;
                        case "÷":
                            if (sta_dec) {
                                a = String.valueOf(Float.valueOf(stack_number.pop()) / Float.valueOf(a));
                            } else {
                                a = String.valueOf(Integer.valueOf(stack_number.pop()) / Integer.valueOf(a));
                            }
                            first_result = false;
                            break;
                    }
                }
                dec = false;
                kuohao=false;
                kuohao_first_reslut=false;
            }
        });
        button_util_sin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if(input_number){}else{
                    Toast.makeText(getActivity().getApplicationContext(),"输入一个数字", LENGTH_SHORT).show();
                    return;
                }
                textview_show.append("\n"+String.valueOf(Math.sin(Double.valueOf(a))));
                a="";
                finish_reslut=true;
                input_number=false;
                dec=false;
                sta_dec=false;
                kuohao=false;
                kuohao_first_reslut=false;
            }
        });
        button_util_cos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(input_number){}else{
                    Toast.makeText(getActivity().getApplicationContext(),"输入一个数字", LENGTH_SHORT).show();
                    return;
                }
                textview_show.append("\n"+String.valueOf(Math.cos(Double.valueOf(a))));
                a="";
                finish_reslut=true;
                input_number=false;
                dec=false;
                sta_dec=false;
                kuohao=false;
                kuohao_first_reslut=false;
            }
        });
        button_util_tan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(input_number){}else{
                    Toast.makeText(getActivity().getApplicationContext(),"输入一个数字", LENGTH_SHORT).show();
                    return;
                }
                textview_show.append("\n"+String.valueOf(Math.tan(Double.valueOf(a))));
                a="";
                finish_reslut=true;
                input_number=false;
                dec=false;
                sta_dec=false;
                kuohao=false;
                kuohao_first_reslut=false;
            }
        });
        button_util_X.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(input_number){}else{
                    Toast.makeText(getActivity().getApplicationContext(),"输入一个数字", LENGTH_SHORT).show();
                    return;
                }
                if(sta_dec){
                    Toast.makeText(getActivity().getApplicationContext(),"请输入整数", LENGTH_SHORT);
                    return;
                }else{

                }
                int temp = Integer.valueOf(a);
                int temp1 = temp-1;
                while (temp1>0){
                    temp=temp*temp1;
                    temp1=temp1-1;
                }
                textview_show.append("\n"+String.valueOf(temp));
                a="";
                finish_reslut=true;
                input_number=false;
                dec=false;
                sta_dec=false;
                kuohao=false;
                kuohao_first_reslut=false;
            }
        });
        button_util_sqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(input_number){}else{
                    Toast.makeText(getActivity().getApplicationContext(),"输入一个数字", LENGTH_SHORT).show();
                    return;
                }
                textview_show.append("\n"+String.valueOf(Math.sqrt(Double.valueOf(a))));
                a="";
                finish_reslut=true;
                input_number=false;
                dec=false;
                sta_dec=false;
                kuohao=false;
                kuohao_first_reslut=false;
            }
        });
        button_util_percent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp = textview_show.getText().toString();
                int temp_index = temp.lastIndexOf(a);
                temp = temp.substring(0,temp_index);
                a=String.valueOf(Double.valueOf(a)/100);
                textview_show.setText(temp+a);
                dec=true;
                sta_dec=true;
            }
        });
        button_util_change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container_first,new Activity_fragment()).commit();


            }
        });
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle saveInstanceState){
        return inflater.inflate(R.layout.first_fragment,container,false);
    }
}
