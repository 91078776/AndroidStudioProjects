package com.example.palmdigital.textviewoutput01;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener
{
    // fields
    TextView textViewDisplayTop;
    TextView textViewDisplayMiddle;
    TextView textViewDisplayBottom;

    int num1, num2, answer;



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageViewNum1 = (ImageView) findViewById(R.id.imageView1);
        ImageView imageViewNum2 = (ImageView) findViewById(R.id.imageView2);
        ImageView imageViewNum3 = (ImageView) findViewById(R.id.imageView3);
        ImageView imageViewNum4 = (ImageView) findViewById(R.id.imageView4);
        ImageView imageViewNum5 = (ImageView) findViewById(R.id.imageView5);
        ImageView imageViewNum6 = (ImageView) findViewById(R.id.imageView6);
        ImageView imageViewEquals = (ImageView) findViewById(R.id.imageView7);

        textViewDisplayTop = (TextView) findViewById(R.id.textView);
        textViewDisplayMiddle = (TextView) findViewById(R.id.textView2);
        textViewDisplayBottom = (TextView) findViewById(R.id.textView3);

        imageViewNum1.setOnClickListener(this);
        imageViewNum2.setOnClickListener(this);
        imageViewNum3.setOnClickListener(this);
        imageViewNum4.setOnClickListener(this);
        imageViewNum5.setOnClickListener(this);
        imageViewNum6.setOnClickListener(this);
        imageViewEquals.setOnClickListener(this);



    } // end of onCreate

    public void onClick(View view)
    {
        if (view.getId() == R.id.imageView1)
        {
            textViewDisplayTop.setText("1");
            num1 = 1;
        }
        if (view.getId() == R.id.imageView2)
        {
            textViewDisplayTop.setText("2");
            num1 = 2;
        }
        if (view.getId() == R.id.imageView3)
        {
            textViewDisplayTop.setText("3");
            num1 = 3;
        }

        if (view.getId() == R.id.imageView4)
        {
            textViewDisplayMiddle.setText("4");
            num2 = 4;
        }
        if (view.getId() == R.id.imageView5)
        {
            textViewDisplayMiddle.setText("5");
            num2 = 5;
        }
        if (view.getId() == R.id.imageView6)
        {
            textViewDisplayMiddle.setText("6");
            num2 = 6;
        }
        if (view.getId() == R.id.imageView7)
        {
            answer = num1 + num2;
            textViewDisplayBottom.setText("" + answer);
        }
    }
}
