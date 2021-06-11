package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Cria as variaveis
    EditText num1;
    EditText num2;
    TextView resultado;
    Button somar, sub, multi, div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Configura as variaveis
        num1 = findViewById(R.id.txtNum1);
        num2 = findViewById(R.id.txtNum2);
        resultado = findViewById(R.id.lblResultado);
        somar = findViewById(R.id.btnSoma);
        sub = findViewById(R.id.btnSub);
        multi = findViewById(R.id.btnMulti);
        div = findViewById(R.id.btnDiv);

        //Configura os eventos dos botoes
        somar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(num1.getText().toString().equals("")||num2.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this, "Preencha todos os campos", Toast.LENGTH_SHORT).show();
                }
                else {
                    double x, y, r;
                    x = Double.parseDouble(num1.getText().toString());
                    y = Double.parseDouble(num2.getText().toString());
                    r = x + y;
                    resultado.setText(num1.getText().toString() + " + " + num2.getText().toString() + " = " + r);
                }
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(num1.getText().toString().equals("")||num2.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this, "Preencha todos os campos", Toast.LENGTH_SHORT).show();
                }
                else {
                    double x, y, r;
                    x = Double.parseDouble(num1.getText().toString());
                    y = Double.parseDouble(num2.getText().toString());
                    r = x - y;
                    resultado.setText(num1.getText().toString() + " - " + num2.getText().toString() + " = " + r);
                }
            }
        });

        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(num1.getText().toString().equals("")||num2.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this, "Preencha todos os campos", Toast.LENGTH_SHORT).show();
                }
                else {
                    double x, y, r;
                    x = Double.parseDouble(num1.getText().toString());
                    y = Double.parseDouble(num2.getText().toString());
                    r = x * y;
                    resultado.setText(num1.getText().toString() + " X " + num2.getText().toString() + " = " + r);
                }
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(num1.getText().toString().equals("")||num2.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this, "Preencha todos os campos", Toast.LENGTH_SHORT).show();
                }
                else {
                    double x, y, r;
                    x = Double.parseDouble(num1.getText().toString());
                    y = Double.parseDouble(num2.getText().toString());
                    r = x / y;
                    resultado.setText(num1.getText().toString() + " ÷ " + num2.getText().toString() + " = " + r);
                }
            }
        });
    }
}
