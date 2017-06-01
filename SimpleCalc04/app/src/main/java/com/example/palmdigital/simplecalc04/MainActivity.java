package com.example.palmdigital.simplecalc04;

import android.graphics.Color;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.view.ViewDebug;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    TextView textViewDisplayTop;
    TextView textViewDisplayMiddle;
    TextView textViewDisplayBottom;

    double num1, num2, answer;
    String operation;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageView row1Num0 = (ImageView) findViewById(R.id.imageView);
        ImageView row1Num1 = (ImageView) findViewById(R.id.imageView1);
        ImageView row1Num2 = (ImageView) findViewById(R.id.imageView2);
        ImageView row1Num3 = (ImageView) findViewById(R.id.imageView3);
        ImageView row1Num4 = (ImageView) findViewById(R.id.imageView4);
        ImageView row1Num5 = (ImageView) findViewById(R.id.imageView5);
        ImageView row1Num6 = (ImageView) findViewById(R.id.imageView6);
        ImageView row1Num7 = (ImageView) findViewById(R.id.imageView7);
        ImageView row1Num8 = (ImageView) findViewById(R.id.imageView8);
        ImageView row1Num9 = (ImageView) findViewById(R.id.imageView9);
        ImageView row2Num0 = (ImageView) findViewById(R.id.imageView0_0);
        ImageView row2Num1 = (ImageView) findViewById(R.id.imageView1_0);
        ImageView row2Num2 = (ImageView) findViewById(R.id.imageView2_0);
        ImageView row2Num3 = (ImageView) findViewById(R.id.imageView3_0);
        ImageView row2Num4 = (ImageView) findViewById(R.id.imageView4_0);
        ImageView row2Num5 = (ImageView) findViewById(R.id.imageView5_0);
        ImageView row2Num6 = (ImageView) findViewById(R.id.imageView6_0);
        ImageView row2Num7 = (ImageView) findViewById(R.id.imageView7_0);
        ImageView row2Num8 = (ImageView) findViewById(R.id.imageView8_0);
        ImageView row2Num9 = (ImageView) findViewById(R.id.imageView9_0);

        row1Num0.setOnClickListener(this);
        row1Num1.setOnClickListener(this);
        row1Num2.setOnClickListener(this);
        row1Num3.setOnClickListener(this);
        row1Num4.setOnClickListener(this);
        row1Num5.setOnClickListener(this);
        row1Num6.setOnClickListener(this);
        row1Num7.setOnClickListener(this);
        row1Num8.setOnClickListener(this);
        row1Num9.setOnClickListener(this);
        //row2
        row2Num0.setOnClickListener(this);
        row2Num1.setOnClickListener(this);
        row2Num2.setOnClickListener(this);
        row2Num3.setOnClickListener(this);
        row2Num4.setOnClickListener(this);
        row2Num5.setOnClickListener(this);
        row2Num6.setOnClickListener(this);
        row2Num7.setOnClickListener(this);
        row2Num8.setOnClickListener(this);
        row2Num9.setOnClickListener(this);

        textViewDisplayTop = (TextView) findViewById(R.id.textView);
        textViewDisplayMiddle = (TextView) findViewById(R.id.textView2);
        textViewDisplayBottom = (TextView) findViewById(R.id.textView3);
    }

    public void onClick(View view)
    {
        ImageView plus = (ImageView) findViewById(R.id.imageView10);
        ImageView minus = (ImageView) findViewById(R.id.imageView11);
        ImageView multiply = (ImageView) findViewById(R.id.imageView12);
        ImageView divide = (ImageView) findViewById(R.id.imageView13);
        ImageView equals = (ImageView) findViewById(R.id.imageView22);
        ImageView clear = (ImageView) findViewById(R.id.imageView14);
        clear.setOnClickListener(this);
        multiply.setOnClickListener(this);
        divide.setOnClickListener(this);
        plus.setOnClickListener(this);
        minus.setOnClickListener(this);
        equals.setOnClickListener(this);
        //first row numbers
        if (view.getId() == R.id.imageView14)
        {
            textViewDisplayTop.setText("");
            num1 = 0;
        }
        if (view.getId() == R.id.imageView14)
        {
            textViewDisplayMiddle.setText("");
            textViewDisplayBottom.setText("0");
            num2 = 0;
        }

        //first row numbers
        if (view.getId() == R.id.imageView)
        {
            String str = textViewDisplayTop.getText().toString();
            if (str != "")
            {
                str = str + "0";
                textViewDisplayTop.setText(str);
            }
            num1 = 0;
        }
        if (view.getId() == R.id.imageView1)
        {
            String str = textViewDisplayTop.getText().toString();
            str = str + "1";
            textViewDisplayTop.setText(str);
            num1 = 1;
        }
        if (view.getId() == R.id.imageView2)
        {
            String str = textViewDisplayTop.getText().toString();
            str = str + "2";
            textViewDisplayTop.setText(str);
            num1 = 2;
        }
        if (view.getId() == R.id.imageView3)
        {
            String str = textViewDisplayTop.getText().toString();
            str = str + "3";
            textViewDisplayTop.setText(str);
            num1 = 3;
        }
        if (view.getId() == R.id.imageView4)
        {
            String str = textViewDisplayTop.getText().toString();
            str = str + "4";
            textViewDisplayTop.setText(str);
            num1 = 4;
        }
        if (view.getId() == R.id.imageView5)
        {
            String str = textViewDisplayTop.getText().toString();
            str = str + "5";
            textViewDisplayTop.setText(str);
            num1 = 5;
        }
        if (view.getId() == R.id.imageView6)
        {
            String str = textViewDisplayTop.getText().toString();
            str = str + "6";
            textViewDisplayTop.setText(str);
            num1 = 6;
        }
        if (view.getId() == R.id.imageView7)
        {
            String str = textViewDisplayTop.getText().toString();
            str = str + "7";
            textViewDisplayTop.setText(str);
            num1 = 7;
        }
        if (view.getId() == R.id.imageView8)
        {
            String str = textViewDisplayTop.getText().toString();
            str = str + "8";
            textViewDisplayTop.setText(str);
            num1 = 8;
        }
        if (view.getId() == R.id.imageView9)
        {
            String str = textViewDisplayTop.getText().toString();
            str = str + "9";
            textViewDisplayTop.setText(str);
            num1 = 9;
        }
        //second row numbers
        if (view.getId() == R.id.imageView0_0)
        {
            String str = textViewDisplayMiddle.getText().toString();
            if (str != "")
            {
                str = str + "0";
                textViewDisplayMiddle.setText(str);
            }
            num2 = 0;
        }
        if (view.getId() == R.id.imageView1_0)
        {
            String str = textViewDisplayMiddle.getText().toString();
            str = str + "1";
            textViewDisplayMiddle.setText(str);
            num2 = 1;
        }
        if (view.getId() == R.id.imageView2_0)
        {
            String str = textViewDisplayMiddle.getText().toString();
            str = str + "2";
            textViewDisplayMiddle.setText(str);
            num2 = 2;
        }
        if (view.getId() == R.id.imageView3_0)
        {
            String str = textViewDisplayMiddle.getText().toString();
            str = str + "3";
            textViewDisplayMiddle.setText(str);
            num2 = 3;
        }
        if (view.getId() == R.id.imageView4_0)
        {
            String str = textViewDisplayMiddle.getText().toString();
            str = str + "4";
            textViewDisplayMiddle.setText(str);
            num2 = 4;
        }
        if (view.getId() == R.id.imageView5_0)
        {
            String str = textViewDisplayMiddle.getText().toString();
            str = str + "5";
            textViewDisplayMiddle.setText(str);
            num2 = 5;
        }
        if (view.getId() == R.id.imageView6_0)
        {
            String str = textViewDisplayMiddle.getText().toString();
            str = str + "6";
            textViewDisplayMiddle.setText(str);
            num2 = 6;
        }
        if (view.getId() == R.id.imageView7_0)
        {
            String str = textViewDisplayMiddle.getText().toString();
            str = str + "7";
            textViewDisplayMiddle.setText(str);
            num2 = 7;
        }
        if (view.getId() == R.id.imageView8_0)
        {
            String str = textViewDisplayMiddle.getText().toString();
            str = str + "8";
            textViewDisplayMiddle.setText(str);
            num2 = 8;
        }
        if (view.getId() == R.id.imageView9_0)
        {
            String str = textViewDisplayMiddle.getText().toString();
            str = str + "9";
            textViewDisplayMiddle.setText(str);
            num2 = 9;
        }
        //plus, minus, multiply, divide
        if (view.getId() == R.id.imageView10)
        {
            operation = "plus";
            plus.setBackgroundColor(Color.rgb(255, 173, 249));
            minus.setBackgroundColor(Color.rgb(255,255,255));
            multiply.setBackgroundColor(Color.rgb(255,255,255));
            divide.setBackgroundColor(Color.rgb(255,255,255));

        }
        if (view.getId() == R.id.imageView11)
        {
            operation = "minus";
            minus.setBackgroundColor(Color.rgb(255, 173, 249));
            plus.setBackgroundColor(Color.rgb(255,255,255));
            multiply.setBackgroundColor(Color.rgb(255,255,255));
            divide.setBackgroundColor(Color.rgb(255,255,255));
        }
        if (view.getId() == R.id.imageView12)
        {
            operation = "multiply";
            multiply.setBackgroundColor(Color.rgb(255, 173, 249));
            plus.setBackgroundColor(Color.rgb(255, 255, 255));
            divide.setBackgroundColor(Color.rgb(255,255,255));
            minus.setBackgroundColor(Color.rgb(255,255,255));
        }
        if (view.getId() == R.id.imageView13)
        {
            operation = "divide";
            plus.setBackgroundColor(Color.rgb(255, 255, 255));
            minus.setBackgroundColor(Color.rgb(255,255,255));
            multiply.setBackgroundColor(Color.rgb(255,255,255));
            divide.setBackgroundColor(Color.rgb(255, 173, 249));
        }
        //calculate
        if (view.getId() == R.id.imageView22)
        {
            if (operation == "plus")
            {
                answer = num1 + num2;
                textViewDisplayBottom.setText("" + answer);
            }
            if (operation == "minus")
            {
                answer = num1 - num2;
                textViewDisplayBottom.setText("" + answer);
            }
            if (operation == "multiply")
            {
                answer = num1 * num2;
                textViewDisplayBottom.setText("" + answer);
            }
            if (operation == "divide")
            {
                if (num2 == 0)
                    textViewDisplayBottom.setText("ERROR");
                else
                {
                    answer = num1 / num2;
                    textViewDisplayBottom.setText("" + answer);
                }
            }
        }
    }
}