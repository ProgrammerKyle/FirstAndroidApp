package com.example.kyle.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.firstMessage);
    }

    public void showHelloWorld(View view){
        if(count == 0)
        {
            String message = "That's all I got. But...";
            textView.setText(message);
            count++;
        }
        else
        {
            String message = "Mike likes butts.";
            textView.setText(message);
        }
    }
}
