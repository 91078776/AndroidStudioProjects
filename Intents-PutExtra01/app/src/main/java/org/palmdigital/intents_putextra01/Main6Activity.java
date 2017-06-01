package org.palmdigital.intents_putextra01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Main6Activity extends AppCompatActivity {

    String newString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

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

    public void next04(View andrew)
    {
        EditText et_food2 = (EditText) findViewById(R.id.edit_text_food2);
        EditText et_food3 = (EditText) findViewById(R.id.edit_text_food3);
        EditText et_number2 = (EditText) findViewById(R.id.edit_text_number2);

        String tv_food2 = et_food2.getText().toString();
        String tv_food3 = et_food3.getText().toString();
        String tv_number2 = et_number2.getText().toString();

        String story = newString + "Some kids like " + tv_food2 + " pizza the best, but my favorite" +
                " is the " + tv_food3 + " pizza. If I could, I would eat pizza " + tv_number2 +
                " times a day!";

        Intent i = new Intent(this, Main2Activity.class);
        i.putExtra("STORY_SO_FAR", story);

        startActivity(i);
    }
}
