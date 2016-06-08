package com.example.fellow.calculator;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalculatorActivity extends AppCompatActivity implements View.OnClickListener{

    EditText calcField, inputField;
    Button clear, negative, percent, divide, multiply, minus, plus, equal, point;
    Button one, two, three, four, five, six, seven, eight, nine, zero;

    enum Operation {DIVIDE, MULTIPLY, PLUS, MINUS, EQUALS};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        inputField = (EditText) findViewById(R.id.result);
        clear = (Button) findViewById(R.id.clear);
        divide = (Button) findViewById(R.id.divide);
        divide.setOnClickListener(this);
        multiply = (Button) findViewById(R.id.multiply);
        multiply.setOnClickListener(this);
        minus = (Button) findViewById(R.id.minus);
        minus.setOnClickListener(this);
        plus = (Button) findViewById(R.id.plus);
        plus.setOnClickListener(this);
        equal = (Button) findViewById(R.id.equal);
        equal.setOnClickListener(this);
        one = (Button) findViewById(R.id.one);
        one.setOnClickListener(this);
        two = (Button) findViewById(R.id.two);
        two.setOnClickListener(this);
        three = (Button) findViewById(R.id.three);
        three.setOnClickListener(this);
        four = (Button) findViewById(R.id.four);
        four.setOnClickListener(this);
        five = (Button) findViewById(R.id.five);
        five.setOnClickListener(this);
        six = (Button) findViewById(R.id.six);
        six.setOnClickListener(this);
        seven = (Button) findViewById(R.id.seven);
        seven.setOnClickListener(this);
        eight = (Button) findViewById(R.id.eight);
        eight.setOnClickListener(this);
        nine = (Button) findViewById(R.id.nine);
        nine.setOnClickListener(this);
        zero = (Button) findViewById(R.id.zero);
        zero.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.one:
                inputField.setText("1");
                break;
            case R.id.two:
                inputField.setText("2");
                break;
            case R.id.three:
                inputField.setText("3");
                break;
            case R.id.four:
                inputField.setText("4");
                break;
            case R.id.five:
                inputField.setText("5");
                break;
            case R.id.six:
                inputField.setText("6");
                break;
            case R.id.seven:
                inputField.setText("7");
                break;
            case R.id.eight:
                inputField.setText("8");
                break;
            case R.id.nine:
                inputField.setText("9");
                break;
            case R.id.zero:
                inputField.setText("0");
                break;
        }
    }

    public void onClickClear(View v) {
        inputField.setText("0");
    }
}
