package com.example.acme.csci3130_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickSubmit(View view){
        // get the user input
        TextView textView = findViewById(R.id.editText);
        String userInput = textView.getText().toString();
        // Log.i("g", "clickSubmit: " + userInput);
        //update the textbox
        TextView textbox = findViewById(R.id.textBox);
        textbox.setText(userInput);

        // remove the input
        textView.setText("");

    }
}
