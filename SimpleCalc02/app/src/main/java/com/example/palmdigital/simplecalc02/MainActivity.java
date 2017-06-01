package com.example.palmdigital.simplecalc02;

import android.graphics.Color;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    TextView textViewDisplayTop;
    TextView textViewDisplayMiddle;
    TextView textViewDisplayBottom;

    int num1, num2, answer;
    double divide1, divide2, divideAnswer;
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
        multiply.setOnClickListener(this);
        divide.setOnClickListener(this);
        plus.setOnClickListener(this);
        minus.setOnClickListener(this);
        equals.setOnClickListener(this);
        //first row numbers
        if (view.getId() == R.id.imageView)
        {
            textViewDisplayTop.setText("0");
            num1 = 0;
            divide1 = 0;
        }
        if (view.getId() == R.id.imageView1)
        {
            textViewDisplayTop.setText("1");
            num1 = 1;
            divide1 = 1;
        }
        if (view.getId() == R.id.imageView2)
        {
            textViewDisplayTop.setText("2");
            num1 = 2;
            divide1 = 2;
        }
        if (view.getId() == R.id.imageView3)
        {
            textViewDisplayTop.setText("3");
            num1 = 3;
            divide1 = 3;
        }
        if (view.getId() == R.id.imageView4)
        {
            textViewDisplayTop.setText("4");
            num1 = 4;
            divide1 = 4;
        }
        if (view.getId() == R.id.imageView5)
        {
            textViewDisplayTop.setText("5");
            num1 = 5;
            divide1 = 5;
        }
        if (view.getId() == R.id.imageView6)
        {
            textViewDisplayTop.setText("6");
            num1 = 6;
            divide1 = 6;
        }
        if (view.getId() == R.id.imageView7)
        {
            textViewDisplayTop.setText("7");
            num1 = 7;
            divide1 = 7;
        }
        if (view.getId() == R.id.imageView8)
        {
            textViewDisplayTop.setText("8");
            num1 = 8;
            divide1 = 8;
        }
        if (view.getId() == R.id.imageView9)
        {
            textViewDisplayTop.setText("9");
            num1 = 9;
            divide1 = 9;
        }
        //second row numbers
        if (view.getId() == R.id.imageView0_0)
        {
            textViewDisplayMiddle.setText("0");
            num2 = 0;
            divide2 = 0;
        }
        if (view.getId() == R.id.imageView1_0)
        {
            textViewDisplayMiddle.setText("1");
            num2 = 1;
            divide2 = 1;
        }
        if (view.getId() == R.id.imageView2_0)
        {
            textViewDisplayMiddle.setText("2");
            num2 = 2;
            divide2 = 2;
        }
        if (view.getId() == R.id.imageView3_0)
        {
            textViewDisplayMiddle.setText("3");
            num2 = 3;
            divide2 = 3;
        }
        if (view.getId() == R.id.imageView4_0)
        {
            textViewDisplayMiddle.setText("4");
            num2 = 4;
            divide2 = 4;
        }
        if (view.getId() == R.id.imageView5_0)
        {
            textViewDisplayMiddle.setText("5");
            num2 = 5;
            divide2 = 5;
        }
        if (view.getId() == R.id.imageView6_0)
        {
            textViewDisplayMiddle.setText("6");
            num2 = 6;
            divide2 = 6;
        }
        if (view.getId() == R.id.imageView7_0)
        {
            textViewDisplayMiddle.setText("7");
            num2 = 7;
            divide2 = 7;
        }
        if (view.getId() == R.id.imageView8_0)
        {
            textViewDisplayMiddle.setText("8");
            num2 = 8;
            divide2 = 8;
        }
        if (view.getId() == R.id.imageView9_0)
        {
            textViewDisplayMiddle.setText("9");
            num2 = 9;
            divide2 = 9;
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
                if (divide2 == 0)
                    textViewDisplayBottom.setText("ERROR");
                else
                {
                    divideAnswer = divide1 / divide2;
                    textViewDisplayBottom.setText("" + divideAnswer);
                }
            }
        }
    }
}