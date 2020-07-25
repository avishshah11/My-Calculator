package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText opr1;
    private EditText opr2;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private TextView txtresult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        opr1 = (EditText) findViewById(R.id.editTextTextPersonName);
        opr2 = (EditText) findViewById(R.id.editTextTextPersonName2);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        txtresult = (TextView) findViewById(R.id.textView3);
// Addition
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((opr1.getText().length() > 0) && (opr2.getText().length() > 0)) {
                    double oper1 = Double.parseDouble(opr1.getText().toString());
                    double oper2 = Double.parseDouble(opr2.getText().toString());
                    double result = oper1 + oper2;
                    txtresult.setText(Double.toString(result));
                } else {
                    Toast toast = Toast.makeText(MainActivity.this, "Please Enter The Numbers", Toast.LENGTH_LONG);
                    toast.show();

                }
            }

        });
// Subtraction
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((opr1.getText().length() > 0) && (opr2.getText().length() > 0)) {
                    double oper1 = Double.parseDouble(opr1.getText().toString());
                    double oper2 = Double.parseDouble(opr2.getText().toString());
                    double result = oper1 - oper2;
                    txtresult.setText(Double.toString(result));
                } else {
                    Toast toast = Toast.makeText(MainActivity.this, "Please Enter The Numbers", Toast.LENGTH_LONG);
                    toast.show();
                }

            }
        });
// Multiplication
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((opr1.getText().length() > 0) && (opr2.getText().length() > 0)){
                    double oper1 = Double.parseDouble(opr1.getText().toString());
                    double oper2 = Double.parseDouble(opr2.getText().toString());
                    double result = oper1 * oper2;
                    txtresult.setText(Double.toString(result));
                } else {
                    Toast toast = Toast.makeText(MainActivity.this, "Please Enter The Numbers", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });
// Reminder
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((opr1.getText().length() > 0) && (opr2.getText().length() > 0)){
                    double oper1 = Double.parseDouble(opr1.getText().toString());
                    double oper2 = Double.parseDouble(opr2.getText().toString());
                    double result = oper1 % oper2;
                    txtresult.setText(Double.toString(result));
                } else {
                    Toast toast = Toast.makeText(MainActivity.this, "Please Enter The Numbers", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });
// Reset
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opr1.setText("");
                opr2.setText("");
                txtresult.setText("0.00");
                opr1.requestFocus();
            }
        });
    }

}