package ru.eltex.helloworld;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button zero;
    Button one;
    Button two;
    Button three;
    Button four;
    Button five;
    Button six;
    Button seven;
    Button eight;
    Button nine;

    Button add;
    Button sub;
    Button mult;
    Button div;
    Button res;

    Button clear;

    Button equals;

    Integer a = 0;
    Integer b = 0;
    Integer result = 0;
    Double divisionalRes = 0.0;
    Operations operation = Operations.unknown;

    enum Operations {
        unknown,
        addition,
        subtraction,
        multiplication,
        division
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        zero = (Button) findViewById(R.id.zero);

        zero.setOnClickListener((view) -> {
            ((TextView) findViewById(R.id.output)).append("0");

            if (operation == Operations.unknown) {
                a = Integer.parseInt(((TextView) findViewById(R.id.output)).getText().toString());
            } else {
                b = Integer.parseInt(((TextView) findViewById(R.id.output)).getText().toString());
            }
        });

        one = (Button) findViewById(R.id.one);

        one.setOnClickListener((view) -> {
            ((TextView) findViewById(R.id.output)).append("1");

            if (operation == Operations.unknown) {
                a = Integer.parseInt(((TextView) findViewById(R.id.output)).getText().toString());
            } else {
                b = Integer.parseInt(((TextView) findViewById(R.id.output)).getText().toString());
            }
        });

        two = (Button) findViewById(R.id.two);

        two.setOnClickListener((view) -> {
            ((TextView) findViewById(R.id.output)).append("2");

            if (operation == Operations.unknown) {
                a = Integer.parseInt(((TextView) findViewById(R.id.output)).getText().toString());
            } else {
                b = Integer.parseInt(((TextView) findViewById(R.id.output)).getText().toString());
            }
        });

        three = (Button) findViewById(R.id.three);

        three.setOnClickListener((view) -> {
            ((TextView) findViewById(R.id.output)).append("3");

            if (operation == Operations.unknown) {
                a = Integer.parseInt(((TextView) findViewById(R.id.output)).getText().toString());
            } else {
                b = Integer.parseInt(((TextView) findViewById(R.id.output)).getText().toString());
            }
        });

        four = (Button) findViewById(R.id.four);

        four.setOnClickListener((view) -> {
            ((TextView) findViewById(R.id.output)).append("4");

            if (operation == Operations.unknown) {
                a = Integer.parseInt(((TextView) findViewById(R.id.output)).getText().toString());
            } else {
                b = Integer.parseInt(((TextView) findViewById(R.id.output)).getText().toString());
            }
        });

        five = (Button) findViewById(R.id.five);

        five.setOnClickListener((view) -> {
            ((TextView) findViewById(R.id.output)).append("5");

            if (operation == Operations.unknown) {
                a = Integer.parseInt(((TextView) findViewById(R.id.output)).getText().toString());
            } else {
                b = Integer.parseInt(((TextView) findViewById(R.id.output)).getText().toString());
            }
        });

        six = (Button) findViewById(R.id.six);

        six.setOnClickListener((view) -> {
            ((TextView) findViewById(R.id.output)).append("6");

            if (operation == Operations.unknown) {
                a = Integer.parseInt(((TextView) findViewById(R.id.output)).getText().toString());
            } else {
                b = Integer.parseInt(((TextView) findViewById(R.id.output)).getText().toString());
            }
        });

        seven = (Button) findViewById(R.id.seven);

        seven.setOnClickListener((view) -> {
            ((TextView) findViewById(R.id.output)).append("7");

            if (operation == Operations.unknown) {
                a = Integer.parseInt(((TextView) findViewById(R.id.output)).getText().toString());
            } else {
                b = Integer.parseInt(((TextView) findViewById(R.id.output)).getText().toString());
            }
        });

        eight = (Button) findViewById(R.id.eight);

        eight.setOnClickListener((view) -> {
            ((TextView) findViewById(R.id.output)).append("8");

            if (operation == Operations.unknown) {
                a = Integer.parseInt(((TextView) findViewById(R.id.output)).getText().toString());
            } else {
                b = Integer.parseInt(((TextView) findViewById(R.id.output)).getText().toString());
            }
        });

        nine = (Button) findViewById(R.id.nine);

        nine.setOnClickListener((view) -> {
            ((TextView) findViewById(R.id.output)).append("9");

            if (operation == Operations.unknown) {
                a = Integer.parseInt(((TextView) findViewById(R.id.output)).getText().toString());
            } else {
                b = Integer.parseInt(((TextView) findViewById(R.id.output)).getText().toString());
            }
        });

        add = (Button) findViewById(R.id.addition);

        add.setOnClickListener((view) -> {
            operation = Operations.addition;
            ((TextView) findViewById(R.id.output)).setText("");
        });

        sub = (Button) findViewById(R.id.subtraction);

        sub.setOnClickListener((view) -> {
            operation = Operations.subtraction;
            ((TextView) findViewById(R.id.output)).setText("");
        });

        mult = (Button) findViewById(R.id.multiplication);

        mult.setOnClickListener((view) -> {
            operation = Operations.multiplication;
            ((TextView) findViewById(R.id.output)).setText("");
        });

        div = (Button) findViewById(R.id.division);

        div.setOnClickListener((view) -> {
            operation = Operations.division;
            ((TextView) findViewById(R.id.output)).setText("");
        });

        res = (Button) findViewById(R.id.result);

        res.setOnClickListener((view) -> {
            switch (operation) {
                case addition:
                    result = a + b;
                    ((TextView) findViewById(R.id.output)).setText("" + result);
                    break;
                case subtraction:
                    result = a - b;
                    ((TextView) findViewById(R.id.output)).setText("" + result);
                    break;
                case multiplication:
                    result = a * b;
                    ((TextView) findViewById(R.id.output)).setText("" + result);
                    break;
                case division:
                    divisionalRes = (double)a / (double)b;
                    ((TextView) findViewById(R.id.output)).setText("" + divisionalRes);
                    break;
                default:
                    break;
            }

            operation = Operations.unknown;
            a = result;
        });

        clear = (Button) findViewById(R.id.clear);

        clear.setOnClickListener((view) -> {
            ((TextView) findViewById(R.id.output)).setText("");
            a = 0;
            b = 0;
            operation = Operations.unknown;
        });
    }

}