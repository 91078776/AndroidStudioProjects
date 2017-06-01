package com.example.palmdigital.imaeview01;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView contacts = (ImageView) findViewById(R.id.imageView);
        contacts.setOnClickListener(this);

        final ImageView email = (ImageView) findViewById(R.id.imageView2);
        email.setOnClickListener(this);

        final ImageView messages = (ImageView) findViewById(R.id.imageView3);
        messages.setOnClickListener(this);

    }

    public void onClick(View view)
    {
        if (view.getId() == R.id.imageView)
        {
            Toast.makeText(this, "You selected contacts", Toast.LENGTH_SHORT).show();
        }

        if (view.getId() == R.id.imageView2)
        {
            Toast.makeText(this, "You selected email", Toast.LENGTH_SHORT).show();
        }

        if (view.getId() == R.id.imageView3)
        {
            Toast.makeText(this, "You selected messages", Toast.LENGTH_SHORT).show();
        }

    }
}
