package org.palmdigital.intents_putextra01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Main5Activity extends AppCompatActivity
{
    String newString;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

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

    public void next03(View andrew)
    {
        EditText et_food1 = (EditText) findViewById(R.id.edit_text_food1);
        EditText et_object3 = (EditText) findViewById(R.id.edit_text_object3);
        EditText et_number1 = (EditText) findViewById(R.id.edit_text_number1);
        EditText et_shape1 = (EditText) findViewById(R.id.edit_text_shape1);

        String tv_food1 = et_food1.getText().toString();
        String tv_object3 = et_object3.getText().toString();
        String tv_number1 = et_number1.getText().toString();
        String tv_shape1 = et_shape1.getText().toString();

        String story = newString + tv_food1 + ". Next you have to bake it in a very hot " + tv_object3
                + ". When it is done, cut it into " + tv_number1 + " " + tv_shape1 + ". ";

        Intent i = new Intent(this, Main6Activity.class);
        i.putExtra("STORY_SO_FAR", story);

        startActivity(i);
    }
}
