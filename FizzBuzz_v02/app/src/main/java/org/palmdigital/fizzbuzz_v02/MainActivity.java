package org.palmdigital.fizzbuzz_v02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    int input;
    String strInput;
    TextView output;
    EditText eInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculate(View okay)
    {
        eInput = (EditText) findViewById(R.id.input);
        output = (TextView) findViewById(R.id.output);

        strInput = eInput.getText().toString();
        input = Integer.parseInt(strInput);

        if (input % 5 == 0)
        {
            if (input % 3 == 0)
                output.setText("FizzBuzz");
            else
                output.setText("Buzz");
        }
        else if (input % 3 == 0)
            output.setText("Fizz");
        else
        output.setText(strInput);
    }
}
