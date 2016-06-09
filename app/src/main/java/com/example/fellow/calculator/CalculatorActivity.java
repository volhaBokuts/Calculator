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
    int operand1, operand2, operationNum;
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
        operationNum = 0;

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.one:
                onNumberClick(1);
                break;
            case R.id.two:
                onNumberClick(2);
                break;
            case R.id.three:
                onNumberClick(3);;
                break;
            case R.id.four:
                onNumberClick(4);;
                break;
            case R.id.five:
                onNumberClick(5);;
                break;
            case R.id.six:
                onNumberClick(6);;
                break;
            case R.id.seven:
                onNumberClick(7);;
                break;
            case R.id.eight:
                onNumberClick(8);;
                break;
            case R.id.nine:
                onNumberClick(9);;
                break;
            case R.id.zero:
                onNumberClick(0);;
                break;
            case R.id.add:
                if(operationNum == 0) operationNum = 1;
               break;
            case R.id.subtract:
                if(operationNum == 0) operationNum = 2;
                break;
            case R.id.multiply:
                if(operationNum == 0) operationNum = 3;
                break;
            case R.id.divide:
                if(operationNum == 0) operationNum = 4;
                break;
            case R.id.equal:
                switch(operationNum) {
                    case 1:
                        result = operand1 + operand2;
                        inputField.setText(Double.toString(result));
                        break;
                    case 2:
                        result = operand1 - operand2;
                        inputField.setText(Double.toString(result));
                        break;
                    case 3:
                        result = operand1 * operand2;
                        inputField.setText(Double.toString(result));
                        break;
                    case 4:
                        result = (double) operand1 / (double) operand2;
                        inputField.setText(Double.toString(result));
                        break;
                }
        }
    }

    private void onNumberClick(int num){
        if(operationNum == 0){
            operand1 = num;
            inputField.setText(Integer.toString(operand1));
        } else {
            operand2 = num;
            inputField.setText(Integer.toString(operand2));
        }
    }

    public void onClickClear(View v) {
        inputField.setText("0");
        operand1 = 0;
        operand2 = 0;
        result = 0;
        operationNum = 0;
    }
}
