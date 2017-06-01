package org.palmdigital.intents_putextra01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void next01(View kyrie)
    {
        // references
        EditText et_adj01 = (EditText) findViewById(R.id.edit_text_adj1);
        EditText et_nationality1 = (EditText) findViewById(R.id.edit_text_nationality1);
        EditText et_name1 = (EditText) findViewById(R.id.edit_text_name);
        EditText et_object1 = (EditText) findViewById(R.id.edit_text_object);

        String str_adj1 = et_adj01.getText().toString();
        String str_nationality1 = et_nationality1.getText().toString();
        String str_name1 = et_name1.getText().toString();
        String str_object1 = et_object1.getText().toString();

        String story = "Pizza was invented by a " + str_adj1 + " " + str_nationality1 + " chef named " +
                str_name1 + ". To make a pizza, you need to take a lump of " + str_object1 + ",";

        Intent i = new Intent(this, Main4Activity.class);
        i.putExtra("STORY_SO_FAR", story);

        startActivity(i);
    }


}
