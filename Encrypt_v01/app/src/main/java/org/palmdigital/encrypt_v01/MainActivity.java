package org.palmdigital.encrypt_v01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    String result;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Button button01 = (Button) findViewById(R.id.Encrypt);
        button01.setOnClickListener(this);

        Button button02 = (Button) findViewById(R.id.Decrypt);
        button02.setOnClickListener(this);

    }

    public void onClick(View view)
    {
        int shift;
        EditText et_input = (EditText) findViewById(R.id.Message);
        String str_input = et_input.getText().toString();
        EditText et_shift = (EditText) findViewById(R.id.Shift);
        String str_shift = et_shift.getText().toString();
        TextView encryptedMessage = (TextView) findViewById(R.id.textView03);
        if (str_shift.isEmpty())
        {
            shift = 0;
            Toast.makeText(this, "Please enter a shift", Toast.LENGTH_SHORT).show();
        }
        else
        {
            shift = Integer.parseInt(str_shift);
        }
        if (view.getId() == R.id.Encrypt)
        {
            String myInput = str_input;
            String result = encrypt(myInput, shift);
            encryptedMessage.setText(result);
        }
        if (view.getId() == R.id.Decrypt)
        {
            String myInput = str_input;
            String result = decrypt(myInput, shift);
            encryptedMessage.setText(result);
        }

    }

    public String encrypt(String input, int shift)
    {
        int size = 26;
        char[] alphabet = new char[size];
        alphabet[0] = 'A';
        alphabet[1] = 'B';
        alphabet[2] = 'C';
        alphabet[3] = 'D';
        alphabet[4] = 'E';
        alphabet[5] = 'F';
        alphabet[6] = 'G';
        alphabet[7] = 'H';
        alphabet[8] = 'I';
        alphabet[9] = 'J';
        alphabet[10] = 'K';
        alphabet[11] = 'L';
        alphabet[12] = 'M';
        alphabet[13] = 'N';
        alphabet[14] = 'O';
        alphabet[15] = 'P';
        alphabet[16] = 'Q';
        alphabet[17] = 'R';
        alphabet[18] = 'S';
        alphabet[19] = 'T';
        alphabet[20] = 'U';
        alphabet[21] = 'V';
        alphabet[22] = 'W';
        alphabet[23] = 'X';
        alphabet[24] = 'Y';
        alphabet[25] = 'Z';
        int shiftCharIndex;
        int fixedCharIndex;
        String output = "";
        String toUpperCase = input.toUpperCase();
        for (int i = 0; i < input.length(); i++)
        {
            for (int j = 0; j < alphabet.length; j++)
            {
                if (toUpperCase.charAt(i) == alphabet[j])
                {
                    shiftCharIndex = j + shift;
                    fixedCharIndex = shiftCharIndex % 26; // now this can only be  0 through 25
                    output = output + alphabet[fixedCharIndex];
                } // end of if statement
            } // end of inner loop
            if (input.charAt(i) == ' ')
            {
                output += "  ";
            }
        } // end of outer for loop
        return output;
    }
    public String decrypt(String input, int shift)
    {
        int size = 26;
        char[] alphabet = new char[size];
        alphabet[0] = 'A';
        alphabet[1] = 'B';
        alphabet[2] = 'C';
        alphabet[3] = 'D';
        alphabet[4] = 'E';
        alphabet[5] = 'F';
        alphabet[6] = 'G';
        alphabet[7] = 'H';
        alphabet[8] = 'I';
        alphabet[9] = 'J';
        alphabet[10] = 'K';
        alphabet[11] = 'L';
        alphabet[12] = 'M';
        alphabet[13] = 'N';
        alphabet[14] = 'O';
        alphabet[15] = 'P';
        alphabet[16] = 'Q';
        alphabet[17] = 'R';
        alphabet[18] = 'S';
        alphabet[19] = 'T';
        alphabet[20] = 'U';
        alphabet[21] = 'V';
        alphabet[22] = 'W';
        alphabet[23] = 'X';
        alphabet[24] = 'Y';
        alphabet[25] = 'Z';
        int shiftCharIndex;
        int fixedCharIndex;
        int newShiftCharIndex;
        String output = "";
        String toUpperCase = input.toUpperCase();
        for (int i = 0; i < input.length(); i++)
        {
            for (int j = 0; j < alphabet.length; j++)
            {
                if (toUpperCase.charAt(i) == alphabet[j])
                {
                            shiftCharIndex = j - shift;
                    if (shiftCharIndex < 0)
                    {
                        int newShift = shift - j;
                        fixedCharIndex = 26 - newShift;
                    }
                    else
                    {
                        fixedCharIndex = shiftCharIndex;
                    }
                    output = output + alphabet[fixedCharIndex];
                } // end of if statement
            } // end of inner loop
            if (input.charAt(i) == ' ')
            {
                output += "  ";
            }
        } // end of outer for loop
        return output;
    }
} // end of class
