package com.example.calculator;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

public class Activity_fragment extends Fragment {
    @Override
    public void onActivityCreated(Bundle save){
        super.onActivityCreated(save);
        final Button button_return = getActivity().findViewById(R.id.button_second_return);
        final TextView textView_first = getActivity().findViewById(R.id.textshow_first);
        final Spinner spinner_second = getActivity().findViewById(R.id.spinner_second);
        final Spinner spinner_first = getActivity().findViewById(R.id.spinner_first);
        final TextView textView_show_first = getActivity().findViewById(R.id.fragment_first_textview);
        final EditText editText_first = getActivity().findViewById(R.id.fragment_first_edit);
        final TextView text_show_second = getActivity().findViewById(R.id.text_show_second);
        final TextView textView_second =getActivity().findViewById(R.id.textview_second);
        final Spinner spinner_secfir = getActivity().findViewById(R.id.spinner_secfir);
        final Spinner spinner_secsec = getActivity().findViewById(R.id.spinner_secsec);
        final TextView textshow_secsec = getActivity().findViewById(R.id.textshow_secsec);
        final TextView fragment_sec_textview = getActivity().findViewById(R.id.fragment_sec_textview);
        final EditText fragment_sec_edit = getActivity().findViewById(R.id.fragment_sec_edit);
        button_return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container_first,new first_fragment()).commit();
            }
        });

        spinner_first.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                textView_first.setText((String) spinner_first.getItemAtPosition(i));
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        spinner_second.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                text_show_second.setText((String)spinner_second.getItemAtPosition(i));
                switch ((String)spinner_second.getItemAtPosition(i)){
                    case "m":
                        switch (textView_first.getText().toString()){
                            case "m":textView_show_first.setText(String.valueOf(Double.valueOf(editText_first.getText().toString())));break;
                            case "dm":textView_show_first.setText(String.valueOf(Double.valueOf(editText_first.getText().toString())/10));break;
                            case "cm":textView_show_first.setText(String.valueOf(Double.valueOf(editText_first.getText().toString())/100));break;
                        }
                        break;
                    case "dm":
                        switch (textView_first.getText().toString()){
                            case "m":textView_show_first.setText(String.valueOf(Double.valueOf(editText_first.getText().toString())*10));break;
                            case "dm":textView_show_first.setText(String.valueOf(Double.valueOf(editText_first.getText().toString())));break;
                            case "cm":textView_show_first.setText(String.valueOf(Double.valueOf(editText_first.getText().toString())/10));break;
                        }
                        break;
                    case "cm":
                        switch (textView_first.getText().toString()){
                            case "m":textView_show_first.setText(String.valueOf(Double.valueOf(editText_first.getText().toString())*100));break;
                            case "dm":textView_show_first.setText(String.valueOf(Double.valueOf(editText_first.getText().toString())*10));break;
                            case "cm":textView_show_first.setText(String.valueOf(Double.valueOf(editText_first.getText().toString())));break;
                        }
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        spinner_secfir.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                textView_second.setText((String) spinner_secfir.getItemAtPosition(i));
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        spinner_secsec.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                textshow_secsec.setText((String) spinner_secsec.getItemAtPosition(i));
                switch (textView_second.getText().toString()){
                    case "立方米":
                        switch((String) spinner_secsec.getItemAtPosition(i)){
                            case "立方米": fragment_sec_textview.setText(String.valueOf(Double.valueOf(fragment_sec_edit.getText().toString())));break;
                            case "立方分米": fragment_sec_textview.setText(String.valueOf(Double.valueOf(fragment_sec_edit.getText().toString())*1000));break;
                            case "立方厘米": fragment_sec_textview.setText(String.valueOf(Double.valueOf(fragment_sec_edit.getText().toString())*1000000));break;
                        }
                        break;
                    case "立方分米":
                        switch((String) spinner_secsec.getItemAtPosition(i)){
                            case "立方米": fragment_sec_textview.setText(String.valueOf(Double.valueOf(fragment_sec_edit.getText().toString())/1000));break;
                            case "立方分米": fragment_sec_textview.setText(String.valueOf(Double.valueOf(fragment_sec_edit.getText().toString())));break;
                            case "立方厘米": fragment_sec_textview.setText(String.valueOf(Double.valueOf(fragment_sec_edit.getText().toString())*1000));break;
                        }
                        break;
                    case "立方厘米":
                        switch((String) spinner_secsec.getItemAtPosition(i)){
                            case "立方米": fragment_sec_textview.setText(String.valueOf(Double.valueOf(fragment_sec_edit.getText().toString())/1000000));break;
                            case "立方分米": fragment_sec_textview.setText(String.valueOf(Double.valueOf(fragment_sec_edit.getText().toString())/1000));break;
                            case "立方厘米": fragment_sec_textview.setText(String.valueOf(Double.valueOf(fragment_sec_edit.getText().toString())));break;
                        }
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        final TextView textView_thifir = getActivity().findViewById(R.id.textview_thifir);
        final Spinner spinner_thifir = getActivity().findViewById(R.id.spinner_thifir);
        final TextView textView_thisec = getActivity().findViewById(R.id.textview_thisec);
        final Spinner spinner_thisec= getActivity().findViewById(R.id.spinner_thisec);
        final EditText edittext_thi = getActivity().findViewById(R.id.fragment_thr_edit);
        final TextView textview_thi = getActivity().findViewById(R.id.textshow_thi);

        spinner_thifir.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                textView_thifir.setText((String) spinner_thifir.getItemAtPosition(i));
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        spinner_thisec.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                textView_thisec.setText((String) spinner_thisec.getItemAtPosition(i));
                switch (textView_thifir.getText().toString()){
                    case "二":
                        switch ((String)spinner_thisec.getItemAtPosition(i)){
                            case "二":
                                textview_thi.setText(edittext_thi.getText().toString());
                            break;
                            case "八":
                                int temp = Integer.valueOf(edittext_thi.getText().toString(),2);
                                textview_thi.setText(Integer.toOctalString(temp));
                                break;
                            case "十":
                                int temp1 = Integer.valueOf(edittext_thi.getText().toString(),2);
                                textview_thi.setText(String.valueOf(temp1));
                                break;
                            case "十六":
                                int temp2 = Integer.valueOf(edittext_thi.getText().toString(),2);
                                textview_thi.setText(Integer.toHexString(temp2));
                                break;
                        }
                        break;
                    case "八":
                        switch ((String)spinner_thisec.getItemAtPosition(i)){
                            case "二":
                                int temp = Integer.valueOf(edittext_thi.getText().toString(),8);
                                textview_thi.setText(Integer.toBinaryString(temp));
                                break;
                            case "八":
                                textview_thi.setText(edittext_thi.getText().toString());
                                break;
                            case "十":
                                int temp1 = Integer.valueOf(edittext_thi.getText().toString(),8);
                                textview_thi.setText(String.valueOf(temp1));
                                break;
                            case "十六":
                                int temp2 = Integer.valueOf(edittext_thi.getText().toString(),8);
                                textview_thi.setText(Integer.toHexString(temp2));
                                break;
                        }
                        break;
                    case "十":
                        switch ((String)spinner_thisec.getItemAtPosition(i)){
                            case "二":
                                int temp = Integer.valueOf(edittext_thi.getText().toString());
                                textview_thi.setText(Integer.toBinaryString(temp));
                                break;
                            case "八":
                                int temp1 = Integer.valueOf(edittext_thi.getText().toString());
                                textview_thi.setText(Integer.toOctalString(temp1));
                                break;
                            case "十":
                                textview_thi.setText(edittext_thi.getText().toString());
                                break;
                            case "十六":
                                int temp2 = Integer.valueOf(edittext_thi.getText().toString());
                                textview_thi.setText(Integer.toHexString(temp2));
                                break;
                        }
                        break;
                    case "十六":
                        switch ((String)spinner_thisec.getItemAtPosition(i)){
                            case "二":
                                int temp = Integer.valueOf(edittext_thi.getText().toString(),16);
                                textview_thi.setText(Integer.toBinaryString(temp));
                                break;
                            case "八":
                                int temp1 = Integer.valueOf(edittext_thi.getText().toString(),16);
                                textview_thi.setText(Integer.toOctalString(temp1));
                                break;
                            case "十":
                                int temp2 = Integer.valueOf(edittext_thi.getText().toString(),16);
                                textview_thi.setText(String.valueOf(temp2));
                                break;
                            case "十六":

                                textview_thi.setText(edittext_thi.getText().toString());
                                break;
                        }
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        return inflater.inflate(R.layout.activity_fragment,container,false);
    }
}
