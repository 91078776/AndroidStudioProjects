package com.example.palmdigital.chooseadventure_v02;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button leftButton;
    Button rightButton;

    TextView textView_story;
    TextView textView_question;

    String story = "start";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView_story = (TextView) findViewById(R.id.textView_story);
        textView_question = (TextView) findViewById(R.id.textView_question);

        textView_story.setText("One morning the tortoise woke up in a dream.");
        textView_question.setText("Do you want to 'wake up' or 'explore' the dream?");

        leftButton = (Button) findViewById(R.id.button_left);
        rightButton = (Button) findViewById(R.id.button_right);

        leftButton.setText("Wake up");
        rightButton.setText("Explore");

        leftButton.setOnClickListener(this);
        rightButton.setOnClickListener(this);

    }//end of onCreate()

    public void onClick(View view) {
        if (view.getId() == R.id.button_left) {
            if (story == "start") {
                wakeUp();
            } else if (story == "explore") {

            }
        }//end of button_left
        if (view.getId() == R.id.button_right) {
            if (story == "start") {
                explore();
            } else if (story == "explore") {

            }
        }//end of button_right

    }//end of onClick()

    public void wakeUp() {
        textView_story.setText("You wake up and have a boring day. The end.");
        leftButton.setVisibility(View.INVISIBLE);
        rightButton.setVisibility(View.INVISIBLE);
        textView_question.setText("");
    }//end of wakeUp()

    public void explore() {
        story = "explore";
        textView_story.setText("You approach a glowing, green bucket of ooze. Worried that you will" +
                " get in trouble, you pick up the bucket.");
        textView_question.setText("Do you want to pour the ooze into the 'backyard' or 'toilet'?");
        leftButton.setText("backyard");
        rightButton.setText("toilet");
    }//end of explore

    public void backyard() {
        story = "backyard";
        textView_story.setText("As you walk into the backyard a net scoops you up and a giant" +
                "takes you to a boiling pot of water.");
    }//end of backyard

    public void toilet() {
        story = "toilet";
    }//end of toilet


}//end of class

