package com.example.palmdigital.buttonchallenge1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button) findViewById(R.id.button);
        button1.setText("Contacts");
        button1.setBackgroundColor(0xff00ffff);
        button1.setOnClickListener(this);

        Button button2 = (Button) findViewById(R.id.button2);
        button2.setText("Email");
        button2.setBackgroundColor(0xff00ff00);
        button2.setOnClickListener(this);

        Button button3 = (Button) findViewById(R.id.button3);
        button3.setText("Messages");
        button3.setBackgroundColor(0xffff00ff);
        button3.setOnClickListener(this);

    }

    public void onClick(View view)
    {
        if(view.getId() == R.id.button)
        {
            Toast.makeText(this, "You selected Contacts!", Toast.LENGTH_SHORT).show();
            Log.i("info", "You selected Contacts!");
        }
        if(view.getId() == R.id.button2)
        {
            Toast.makeText(this, "You selected Email!", Toast.LENGTH_SHORT).show();
            Log.i("info", "You selected Email!");
        }
        if(view.getId() == R.id.button3)
        {
            Toast.makeText(this, "You selected Messages!", Toast.LENGTH_SHORT).show();
            Log.i("info", "You selected Messages!");
        }
    }
}
