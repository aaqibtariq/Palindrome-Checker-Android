package com.example.palindromechecker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText inputText;
    private TextView displayText;
    private Button botton;
    private String text;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputText = findViewById(R.id.input_text);
        displayText = findViewById(R.id.display_text);
        botton = findViewById(R.id.button);

        botton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                text = inputText.getText().toString();

                if(isPalindrome(text)==true)
                    displayText.setText(text + " is a Palindrome");
                else
                    displayText.setText(text + " is not a Palindrome");





            }
        });


    }

    public boolean isPalindrome(String text){




        int i = 0, j = text.length() - 1;


        while (i < j) {


            if (text.toLowerCase().charAt(i) != text.toLowerCase().charAt(j))
                return false;

            i++;
            j--;
        }


        return true;
    }




    }




