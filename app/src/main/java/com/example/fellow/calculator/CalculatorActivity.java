package com.example.fellow.calculator;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalculatorActivity extends AppCompatActivity implements View.OnClickListener{

    // Объявление текстового поля, кнопок
    EditText inputField;
    Button btClear, btDivide, btMultiply, btSubtract, btAdd, btEqual;
    Button btOne, btTwo, btThree, btFour, btFive, btSix, btSeven, btEight, btNine, btZero;

    /// Объявление переменных, хранящих значения операндов и результат
    int operand1, operand2;
    double result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        // Связывание текстовое поле и кнопки с макетом
        inputField = (EditText) findViewById(R.id.result);

        btClear = (Button) findViewById(R.id.clear);
        btDivide = (Button) findViewById(R.id.divide);
        btMultiply = (Button) findViewById(R.id.multiply);
        btSubtract = (Button) findViewById(R.id.subtract);
        btAdd = (Button) findViewById(R.id.add);
        btEqual = (Button) findViewById(R.id.equal);

        btOne = (Button) findViewById(R.id.one);
        btTwo = (Button) findViewById(R.id.two);
        btThree = (Button) findViewById(R.id.three);
        btFour = (Button) findViewById(R.id.four);
        btFive = (Button) findViewById(R.id.five);
        btSix = (Button) findViewById(R.id.six);
        btSeven = (Button) findViewById(R.id.seven);
        btEight = (Button) findViewById(R.id.eight);
        btNine = (Button) findViewById(R.id.nine);
        btZero = (Button) findViewById(R.id.zero);

        // Назначение кнопкам слушателя
        btDivide.setOnClickListener(this);
        btMultiply.setOnClickListener(this);
        btAdd.setOnClickListener(this);
        btSubtract.setOnClickListener(this);
        btEqual.setOnClickListener(this);

        btOne.setOnClickListener(this);
        btTwo.setOnClickListener(this);
        btThree.setOnClickListener(this);
        btFour.setOnClickListener(this);
        btSix.setOnClickListener(this);
        btSeven.setOnClickListener(this);
        btEight.setOnClickListener(this);
        btNine.setOnClickListener(this);
        btZero.setOnClickListener(this);

        // Инициализация переменных для вычислеения
        operand1 = 0;
        operand2 = 0;
        result = 0;

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
