package com.example.p07_array;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    String[] fruits;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.TextView);

        fruits = new String[3];
        fruits[0] = "apple";
        fruits[1] = "banana";
        fruits[2] = "cherry";

        String strText = "Fruits\n";
        strText += "==================\n";

        for (int i = 0 ; i <fruits.length; i++) {
            strText += fruits[i] + "\n";
        }
        tv.setText(strText);

        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");

        for (int i = 0; i < fruits.size(); i++) {
            strText += fruits.get(i) + "\n";
        }
        tv.setText(strText);

    }
}