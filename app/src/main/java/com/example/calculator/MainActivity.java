package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;
import org.xml.sax.helpers.ParserAdapter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public String Val1 = "";
    public String Val2 = "";
    public String Sign = "";
    public Double Result;

    public void miClick(View V) {
        TextView m = findViewById(R.id.output);
        switch (V.getId()) {
            case R.id.num0:
                if (Sign == "" || Sign == null) {
                    if (Val1 == "") {
                        Toast.makeText(this, "Cero a la izq", Toast.LENGTH_SHORT).show();
                    } else {
                        Val1 += "0";
                        m.setText(Val1);
                    }
                } else {
                    if (Val2 == "") {
                        Toast.makeText(this, "Cero a la izq", Toast.LENGTH_SHORT).show();
                    } else {
                        Val2 += "0";
                        m.setText(Val2);
                    }
                }
                break;
            case R.id.num1:
                if (Sign == "" || Sign == null) {
                    Val1 += "1";
                    m.setText(Val1);
                } else {
                    Val2 += "1";
                    m.setText(Val2);
                }
                break;
            case R.id.num2:
                if (Sign == "" || Sign == null) {
                    Val1 += "2";
                    m.setText(Val1);
                } else {
                    Val2 += "2";
                    m.setText(Val2);
                }
                break;
            case R.id.num3:
                if (Sign == "" || Sign == null) {
                    Val1 += "3";
                    m.setText(Val1);
                } else {
                    Val2 += "3";
                    m.setText(Val2);
                }
                break;
            case R.id.num4:
                if (Sign == "" || Sign == null) {
                    Val1 += "4";
                    m.setText(Val1);
                } else {
                    Val2 += "4";
                    m.setText(Val2);
                }
                break;
            case R.id.num5:
                if (Sign == "" || Sign == null) {
                    Val1 += "5";
                    m.setText(Val1);
                } else {
                    Val2 += "5";
                    m.setText(Val2);
                }
                break;
            case R.id.num6:
                if (Sign == "" || Sign == null) {
                    Val1 += "6";
                    m.setText(Val1);
                } else {
                    Val2 += "6";
                    m.setText(Val2);
                }
                break;
            case R.id.num7:
                if (Sign == "" || Sign == null) {
                    Val1 += "7";
                    m.setText(Val1);
                } else {
                    Val2 += "7";
                    m.setText(Val2);
                }
                break;
            case R.id.num8:
                if (Sign == "" || Sign == null) {
                    Val1 += "8";
                    m.setText(Val1);
                } else {
                    Val2 += "8";
                    m.setText(Val2);
                }
                break;
            case R.id.num9:
                if (Sign == "" || Sign == null) {
                    Val1 += "9";
                    m.setText(Val1);
                } else {
                    Val2 += "9";
                    m.setText(Val2);
                }
                break;
            case R.id.less:
                if (Val1 == "" || Val1 == null) {
                    Toast.makeText(this, "Que vas a restar crack?", Toast.LENGTH_SHORT).show();
                } else {
                    Sign = "-";
                    m.setText(Sign);
                }
                break;
            case R.id.plus:
                if (Val1 == "" || Val1 == null) {
                    Toast.makeText(this, "Que vas a sumar crack?", Toast.LENGTH_SHORT).show();
                } else {
                    Sign = "+";
                    m.setText(Sign);
                }
                break;
            case R.id.divide:
                if (Val1 == "" || Val1 == null) {
                    Toast.makeText(this, "Que vas a dividir crack?", Toast.LENGTH_SHORT).show();
                } else {
                    Sign = "/";
                    m.setText(Sign);
                }
                break;
            case R.id.times:
                if (Val1 == "" || Val1 == null) {
                    Toast.makeText(this, "Que vas a multiplicar crack?", Toast.LENGTH_SHORT).show();
                } else {
                    Sign = "*";
                    m.setText(Sign);
                }
                break;
            case R.id.equals:
                if (Val2 == "" || Val2 == null) {
                    Toast.makeText(this, "?", Toast.LENGTH_SHORT).show();
                } else {
                    double Num1 = Double.parseDouble(Val1);
                    double Num2 = Double.parseDouble(Val2);
                    switch (Sign){
                        case "+":
                            Result = Num1 + Num2;
                            break;
                        case "-":
                            Result = Num1 - Num2;
                            break;
                        case "*":
                            Result = Num1 * Num2;
                            break;
                        case "/":
                            Result = Num1 / Num2;
                    }
                    String Resultado = Result.toString();
                    m.setText(Resultado);
                }
                break;
            case R.id.dot:
                if (Sign == "" || Sign == null) {
                    if (Val1 == "") {
                        Val1 = "0.";
                    } else {
                        Val1 += ".";
                    }
                    m.setText(Val1);
                } else {
                    if (Val2 == "") {
                        Val2 = "0.";
                    } else {
                        Val2 += "0";
                    }
                    m.setText(Val2);
                }
                break;
            case R.id.reset:
                Val1 = "";
                Val2 = "";
                Result = null;
                Sign = "";
                m.setText("Cleared");
                break;
            case R.id.erase:
                if (Val1 == m.getText()){
                    Val1 = "";
                    m.setText("Erased");
                }
                else if(Sign == m.getText()){
                    Sign = "";
                    m.setText(Val1);
                }
                else if(Val2 == m.getText()){
                    Val2 = "";
                    m.setText(Val1+Sign);
                }
                else{
                    Toast.makeText(this,"Borrar que?",Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }
}