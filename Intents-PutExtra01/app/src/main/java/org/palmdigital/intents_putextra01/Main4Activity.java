package org.palmdigital.intents_putextra01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity
{

    String newString;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        if (savedInstanceState == null)
        {
            Bundle extras = getIntent().getExtras();
            if (extras == null)
            {
                newString = null;
            }
            else
            {
                newString = extras.getString("STORY_SO_FAR");
            }
        }
        else
        {
            newString = (String) savedInstanceState.getSerializable("STORY_SO_FAR");
        }



    }

    public void next02(View chris)
    {
        EditText et_adj2 = (EditText) findViewById(R.id.edit_text_adj2);
        EditText et_object2 = (EditText) findViewById(R.id.edit_text_object2);
        EditText et_adj3 = (EditText) findViewById(R.id.edit_text_adj3);
        EditText et_adj4 = (EditText) findViewById(R.id.edit_text_adj4);

        String tv_adj2 = et_adj2.getText().toString();
        String tv_object2 = et_object2.getText().toString();
        String tv_adj3 = et_adj3.getText().toString();
        String tv_adj4 = et_adj4.getText().toString();

        String story = newString + " and make a thin, round " + tv_adj2 + " " + tv_object2 +
                ". Then you cover it with " + tv_adj3 + " sauce, " + tv_adj4 + " cheese, and" +
                " fresh chopped ";

        Intent i = new Intent(this, Main5Activity.class);
        i.putExtra("STORY_SO_FAR", story);

        startActivity(i);
    }
}
