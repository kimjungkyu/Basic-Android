package com.example.samplelayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public  void onButton1Clicked(View v) {
        setContentView (R.layout.activity_main);
        Button button1 = (Button) findViewById(R.id.button1);
    }
    public  void onButton2Clicked(View v) {
        setContentView (R.layout.activity_main);
        Button button2 = (Button) findViewById(R.id.button2);
    }
    public  void onButton3Clicked(View v) {
        setContentView (R.layout.activity_main);
        Button button3 = (Button) findViewById(R.id.button3);
    }
    public  void onButton4Clicked(View v) {
        setContentView (R.layout.activity_main);
        Button button4 = (Button) findViewById(R.id.button4);
    }
}
