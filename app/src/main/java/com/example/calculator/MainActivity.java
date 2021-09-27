package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToActivity2(String result) {
        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("result", result);
        startActivity(intent);
    }

    public void addFunction (View view) {

        EditText firstNumber = (EditText) findViewById(R.id.firstNumber);
        EditText secondNumber = (EditText) findViewById(R.id.secondNumber);

        int firstNum = Integer.valueOf(firstNumber.getText().toString());
        int secondNum = Integer.valueOf(secondNumber.getText().toString());

        int result = firstNum + secondNum;

        Log.i("Info", Integer.toString(result));

        goToActivity2(Integer.toString(result));

    }

    public void subtractFunction (View view) {

        EditText firstNumber = (EditText) findViewById(R.id.firstNumber);
        EditText secondNumber = (EditText) findViewById(R.id.secondNumber);

        int firstNum = Integer.valueOf(firstNumber.getText().toString());
        int secondNum = Integer.valueOf(secondNumber.getText().toString());

        int result = firstNum - secondNum;

        Log.i("Info", Integer.toString(result));

        goToActivity2(Integer.toString(result));

    }

    public void multiplyFunction (View view) {

        EditText firstNumber = (EditText) findViewById(R.id.firstNumber);
        EditText secondNumber = (EditText) findViewById(R.id.secondNumber);

        int firstNum = Integer.valueOf(firstNumber.getText().toString());
        int secondNum = Integer.valueOf(secondNumber.getText().toString());

        int result = firstNum * secondNum;

        Log.i("Info", Integer.toString(result));

        goToActivity2(Integer.toString(result));

    }

    public void divideFunction (View view) {

        EditText firstNumber = (EditText) findViewById(R.id.firstNumber);
        EditText secondNumber = (EditText) findViewById(R.id.secondNumber);

        int firstNum = Integer.valueOf(firstNumber.getText().toString());
        int secondNum = Integer.valueOf(secondNumber.getText().toString());

        int result = firstNum / secondNum;

        Log.i("Info", Integer.toString(result));

        goToActivity2(Integer.toString(result));

    }
}