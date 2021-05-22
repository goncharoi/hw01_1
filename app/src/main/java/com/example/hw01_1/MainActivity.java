package com.example.hw01_1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        //setContentView(R.layout.activity_main2);
        setContentView(R.layout.activity_main3);

        Button buttonPls = findViewById(R.id.buttonPls);
        Button buttonMns = findViewById(R.id.buttonMns);
        Button buttonMlt = findViewById(R.id.buttonMlt);
        Button buttonDvd = findViewById(R.id.buttonDvd);
        final EditText editText1 = findViewById(R.id.editTextNumber1);
        final EditText editText2 = findViewById(R.id.editTextNumber2);
        final TextView textView = findViewById(R.id.textViewAns);

        buttonPls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer arg1 = Integer.valueOf(editText1.getText().toString());
                Integer arg2 = Integer.valueOf(editText2.getText().toString());
                Integer ans = arg1 + arg2;
                textView.setText(arg1 + " + " + arg2 + " = " + ans);
            }
        });

        buttonMns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer arg1 = Integer.valueOf(editText1.getText().toString());
                Integer arg2 = Integer.valueOf(editText2.getText().toString());
                Integer ans = arg1 - arg2;
                textView.setText(arg1 + " - " + arg2 + " = " + ans);
            }
        });

        buttonMlt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer arg1 = Integer.valueOf(editText1.getText().toString());
                Integer arg2 = Integer.valueOf(editText2.getText().toString());
                Integer ans = arg1 * arg2;
                textView.setText(arg1 + " * " + arg2 + " = " + ans);
            }
        });

        buttonDvd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer arg1 = Integer.valueOf(editText1.getText().toString());
                Integer arg2 = Integer.valueOf(editText2.getText().toString());
                if (arg2!=0) {
                    Integer ans = arg1 / arg2;
                    textView.setText(arg1 + " / " + arg2 + " = " + ans);
                } else textView.setText("На ноль делить нельзя");
            }
        });
    }
}
