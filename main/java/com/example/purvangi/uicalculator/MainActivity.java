package com.example.purvangi.uicalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText input1,input2 = null; //user input
    TextView result = null; //result
    Button btnAdd,btnSub,btnMult,btnDiv,btnClear = null; //functions

    Calculator c = new Calculator();    //object

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init()
    {
        input1 = findViewById(R.id.input1);
        input2 = findViewById(R.id.input2);

        btnAdd = findViewById(R.id.btnAdd);
        btnSub = findViewById(R.id.btnSub);
        btnMult = findViewById(R.id.btnMult);
        btnDiv = findViewById(R.id.btnDiv);
        btnClear = findViewById(R.id.btnClear);
        result = findViewById(R.id.result);

        btnAdd.setOnClickListener(this);
        btnSub.setOnClickListener(this);
        btnMult.setOnClickListener(this);
        btnDiv.setOnClickListener(this);
        btnClear.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        double n1 = Double.parseDouble(input1.getText().toString());
        double n2 = Double.parseDouble(input2.getText().toString());

        switch(view.getId()){
            case R.id.btnAdd:
                double addition = c.addition(n1,n2);
               // double addition = Double.parseDouble(num1) + Double.parseDouble(num2);
                result.setText(String.valueOf(addition));
                break;
            case R.id.btnSub:
                double subtraction = c.subtraction(n1,n2);
                result.setText(String.valueOf(subtraction));
                break;
            case R.id.btnDiv:
                try{
                    double division = c.division(n1,n2);
                    result.setText(String.valueOf(division));
                }
                catch(Exception e){
                    result.setText("cannot divide");
                }
                break;
            case R.id.btnMult:
                double multiplication = c.multiplication(n1,n2);
                result.setText(String.valueOf(multiplication));
                break;
            case R.id.btnClear:
                input1.setText("0");
                input2.setText("0");
                result.setText(" ");
        }
    }
}
