package com.example.palmdigital.button032;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonObject01 = (Button)findViewById(R.id.buttonMyButton01);
        buttonObject01.setText("The Blue Pill");

        buttonObject01.setOnClickListener(this);

        Button buttonObject02 = (Button) findViewById(R.id.buttonMyButton02);
        buttonObject02.setText("The Red Pill");

        buttonObject02.setOnClickListener(this);
        Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
    }

    public void onClick(View view)
    {
        if (view.getId() == R.id.buttonMyButton01)
        {
            Toast.makeText(this, "You pressed The Blue Pill", Toast.LENGTH_SHORT).show();
        }

        if (view.getId() == R.id.buttonMyButton02)
        {
            Toast.makeText(this, "You pressed The Red Pill", Toast.LENGTH_SHORT).show();
        }
    }
}

