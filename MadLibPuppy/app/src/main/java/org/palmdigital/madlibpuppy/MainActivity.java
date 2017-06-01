package org.palmdigital.madlibpuppy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void makeStory(View chris)
    {
        TextView tv_story = (TextView) findViewById(R.id.textViewStory);
        EditText et_color1 = (EditText) findViewById(R.id.editTextColor);
        EditText et_bodyPart = (EditText) findViewById(R.id.editTextBodyPart);
        EditText et_object1 = (EditText) findViewById(R.id.editTextObject);
        EditText et_verb1 = (EditText) findViewById(R.id.editTextVerb);
        EditText et_adj1 = (EditText) findViewById(R.id.editTextAdj);
        EditText et_adj2 = (EditText) findViewById(R.id.editTextAdj2);
        EditText et_verb2 = (EditText) findViewById(R.id.editTextVerb2);
        EditText et_object2 = (EditText) findViewById(R.id.editTextObject2);

        String str_color1 = et_color1.getText().toString();
        String str_bodyPart1 = et_bodyPart.getText().toString();
        String str_object1 = et_object1.getText().toString();
        String str_verb1 = et_verb1.getText().toString();
        String str_adj1 = et_adj1.getText().toString();
        String str_adj2= et_adj2.getText().toString();
        String str_verb2 = et_verb2.getText().toString();
        String str_object2 = et_object2.getText().toString();

        String story = "Today I saw him again. When he looks at me with those " + str_color1 +
                " eyes, it makes my " + str_bodyPart1 + " go pitterpat, and I feel as if I have a " +
                str_object1 + " in my stomach. When he scrunches his nose, I want to " + str_verb1 +
                " him softly. He is so " + str_adj1 + " and " + str_adj2 + ". Tomorrow he will be " +
                "mine. For now he " + str_verb2 + " in the store " + str_object2 + " looking at me." +
                " Puppy love is hard to resist.";

        tv_story.setText(story);
    }
}
