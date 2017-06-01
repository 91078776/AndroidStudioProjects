package com.example.palmdigital.scope01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

// we are outside the MainActivity class
// we are outside any methods

// Understanding how scope works is very important

public class MainActivity extends AppCompatActivity
{
    // in the MainActivity class, but I'm outside any methods

    // fields - any code in class can see these variables
    String myString;
    double enemyHealth;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // here, we are inside the onCreate() method, which is inside
        // the MainActivity class

        // when we declare or define a variable, we use the following format:
        // dataType variableName; <--- this is a variable declaration/definition
        int myInt; // <--- this is declaring a variable of dataType 'int' and named 'myInt'
        double myDouble; // <--- this is declaring a variable od dataType 'double' named 'myDouble'
        TextView textView_story; // <--- this is declaring a variable of dataType 'TextView' named
        // textView_story
        ImageView imageView_ex; // <--- dataType is ImageView, variableName is imageView_ex

        // assigning a value to a declared variable
        // after we declare a variable, we can assign a value to it
        // variableName = someValueOfTheSameDataTypeAsTheVariable;
        // some examples:
        myInt = 10; // <--- setting the value of myInt to 10
        myDouble = 20.12; // <--- myDouble gets the value 20.12
        textView_story = (TextView) findViewById(R.id.textView_st); // <--- set value of
        // textView_story to the UI element
        // R.id.textView_st

        imageView_ex = (ImageView) findViewById(R.id.imageView_android);

        // you know you can declare and assign in the same step
        // dataType variableName = someValueOfTheSameDataTypeAsTheVariable;
        // Some examples:
        int myInt2 = 25;// <--- this is a declaration and assignment
        myInt2 = 50; // <--- this is only an assignment
        // the difference is the dataType 'int'
        myString = "this is a string"; // <---a declaration AND assignment
        myString = "this is another string"; // this is just an assignment

        // !!!!!!!!! Wherever you declared a variable determines that variable's scope!!!!!!
        // if I declare a variable in onCreate, only code in onCreate can see it
        enemyHealth = 12.39;

    }//end of onCreate method

    public void myAwesomeMethod1()
    {
        myString = "what's going on here...";
        enemyHealth = 11.45;
    }// end of myAwesomeMethod1()

    public void myAwesomeMethod2()
    {
        enemyHealth = 10.37;
    }// end of myAwesomeMethod2()

}//end of class
