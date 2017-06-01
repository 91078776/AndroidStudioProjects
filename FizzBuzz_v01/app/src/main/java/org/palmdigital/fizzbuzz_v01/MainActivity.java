package org.palmdigital.fizzbuzz_v01;

import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    int num;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText number = (EditText) findViewById(R.id.editText);
        TextView FizzBuzz = (TextView) findViewById(R.id.textView2);

        number.getContext().;
        num = number;


            if (num % 3 == 0)
            {
                if (num % 5 == 0)
                {
                    System.out.println("FizzBuzz");
                }
                else
                System.out.println("Fizz");
            }
            else
            {
                if (num % 5 == 0)
                {
                    System.out.println("Buzz");
                }
            }
    }

}
