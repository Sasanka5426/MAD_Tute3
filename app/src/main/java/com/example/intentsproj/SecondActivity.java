package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private EditText No1;
    private EditText No2;
    private Button add;
    private Button sub;
    private Button mul;
    private Button div;
    private TextView result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        int number1 = Integer.parseInt(intent.getStringExtra(FirstActivity.EXTRA_NUMBER1));
        int number2 = Integer.parseInt(intent.getStringExtra(FirstActivity.EXTRA_NUMBER2));

        TextView textView1 = (TextView)findViewById(R.id.Ac2no1);
        TextView textView2 = (TextView)findViewById(R.id.Ac2no2);

        textView1.setText(String.valueOf(number1));
        textView2.setText(String.valueOf(number2));

        No1 = (EditText)findViewById(R.id.Ac2no1);
        No2 = (EditText)findViewById(R.id.Ac2no2);
        add = (Button)findViewById(R.id.addBtn);
        sub = (Button)findViewById(R.id.subBtn);
        mul = (Button)findViewById(R.id.mulBtn);
        div = (Button)findViewById(R.id.divBtn);
        result = (TextView)findViewById(R.id.finalAns);

        div.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                int number1 = Integer.parseInt(No1.getText().toString());
                int number2 = Integer.parseInt(No2.getText().toString());
                double sum = number1 / number2;
                result.setText(String.valueOf(number1) + "/" + String.valueOf(number2) + "=" + String.valueOf(sum));
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number1 = Integer.parseInt(No1.getText().toString());
                int number2 = Integer.parseInt(No2.getText().toString());
                int sum = number1 - number2;
                result.setText(String.valueOf(number1) + "-" + String.valueOf(number2) + "=" + String.valueOf(sum));
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number1 = Integer.parseInt(No1.getText().toString());
                int number2 = Integer.parseInt(No2.getText().toString());
                int sum = number1 * number2;
                result.setText(String.valueOf(number1) + "*" + String.valueOf(number2) + "=" + String.valueOf(sum));
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number1 = Integer.parseInt(No1.getText().toString());
                int number2 = Integer.parseInt(No2.getText().toString());
                int sum = number1 + number2;
                result.setText(String.valueOf(number1) + "+" + String.valueOf(number2) + "=" + String.valueOf(sum));
            }
        });

        }





    }

