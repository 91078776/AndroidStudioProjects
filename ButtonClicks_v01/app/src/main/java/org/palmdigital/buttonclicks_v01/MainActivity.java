package org.palmdigital.buttonclicks_v01;

import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Button button = (Button) findViewById(R.id.button);
    }

    public void getName(View andrew)
    {
        Toast.makeText(this, "This button works", Toast.LENGTH_SHORT).show();
    }
    public void testButton(View chris)
    {
        Toast.makeText(this, "chris is trash", Toast.LENGTH_SHORT).show();
    }
}
