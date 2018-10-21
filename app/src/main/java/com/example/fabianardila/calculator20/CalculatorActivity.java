package com.example.fabianardila.calculator20;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CalculatorActivity extends AppCompatActivity {

    public TextView display;
    double num1, num2, res;
    int operation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        display = (TextView) findViewById(R.id.textResult);
    }

    public void actionBt1 (View v) {
        String textDisplayed = display.getText().toString();
        textDisplayed += "1";
        display.setText(textDisplayed);
    }

    public void actionBt2 (View v) {
        String textDisplayed = display.getText().toString();
        textDisplayed += "2";
        display.setText(textDisplayed);
    }

    public void actionBt3 (View v) {
        String textDisplayed = display.getText().toString();
        textDisplayed += "3";
        display.setText(textDisplayed);
    }

    public void actionBt4 (View v) {
        String textDisplayed = display.getText().toString();
        textDisplayed += "4";
        display.setText(textDisplayed);
    }

    public void actionBt5 (View v) {
        String textDisplayed = display.getText().toString();
        textDisplayed += "5";
        display.setText(textDisplayed);
    }

    public void actionBt6 (View v) {
        String textDisplayed = display.getText().toString();
        textDisplayed += "6";
        display.setText(textDisplayed);
    }

    public void actionBt7 (View v) {
        String textDisplayed = display.getText().toString();
        textDisplayed += "7";
        display.setText(textDisplayed);
    }

    public void actionBt8 (View v) {
        String textDisplayed = display.getText().toString();
        textDisplayed += "8";
        display.setText(textDisplayed);
    }

    public void actionBt9 (View v) {
        String textDisplayed = display.getText().toString();
        textDisplayed += "9";
        display.setText(textDisplayed);
    }

    public void actionBt0 (View v) {
        String textDisplayed = display.getText().toString();
        textDisplayed += "0";
        display.setText(textDisplayed);
    }

    public void actionBtDot (View v) {
        String textDisplayed = display.getText().toString();
        textDisplayed += ".";
        display.setText(textDisplayed);
    }

    public void actionBtSum (View v) {
        try {
            String numOnScreen = display.getText().toString();
            num1 = Double.parseDouble(numOnScreen);
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e);
        }
        display.setText("");
        operation = 1;
    }

    public void actionBtRest (View v) {
        try {
            String numOnScreen = display.getText().toString();
            num1 = Double.parseDouble(numOnScreen);
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e);
        }
        display.setText("");
        operation = 2;
    }

    public void actionBtMult (View v) {
        try {
            String numOnScreen = display.getText().toString();
            num1 = Double.parseDouble(numOnScreen);
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e);
        }
        display.setText("");
        operation = 3;
    }

    public void actionBtDiv (View v) {
        try {
            String numOnScreen = display.getText().toString();
            num1 = Double.parseDouble(numOnScreen);
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e);
        }
        display.setText("");
        operation = 4;
    }

    public void  actionBtSin (View v) {
        try {
            String numOnScreen = display.getText().toString();
            num1 = Double.parseDouble(numOnScreen);
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e);
        }
        display.setText("Sin(" + num1 + ")");
        operation = 5;
    }

    public void  actionBtCos (View v) {
        try {
            String numOnScreen = display.getText().toString();
            num1 = Double.parseDouble(numOnScreen);
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e);
        }
        display.setText("Cos(" + num1 + ")");
        operation = 6;
    }

    public void  actionBtTan (View v) {
        try {
            String numOnScreen = display.getText().toString();
            num1 = Double.parseDouble(numOnScreen);
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e);
        }
        display.setText("Tan(" + num1 + ")");
        operation = 7;
    }

    public void actionBtAc (View v) {
        display.setText("");
        num1 = 0.0;
        num2 = 0.0;
        res = 0.0;
    }

    public void actionBtDel (View v) {
        if (!display.getText().toString().equals("")) {
            display.setText(display.getText().subSequence(0, display.getText().length() - 1));
        }
    }

    public void actionBtEqual (View v) {
        try {
            String numOnScreen2 = display.getText().toString();
            num2 = Double.parseDouble(numOnScreen2);
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e);
        }
        display.setText("");

        if (operation == 1) {
            res = num1 + num2;
        } else if (operation == 2) {
            res = num1 - num2;
        } else if (operation == 3) {
            res = num1 * num2;
        } else if (operation == 4) {
            if (num2 == 0) {
                display.setText("Error");
            } else {
                res = num1/num2;
            }
        } else if (operation == 5) {
            double radians = Math.toRadians(num1);
            res = Math.sin(radians);
        } else if (operation == 6) {
            double radians = Math.toRadians(num1);
            res = Math.cos(radians);
        } else if (operation == 7) {
            double radians = Math.toRadians(num1);
            res = Math.tan(radians);
        }
        display.setText("" + res);
        num1 = res;
    }
}
