package com.example.guessgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       Button button3 = (Button) findViewById(R.id.button3);
       button3.setOnClickListener(view -> {
           Intent mainactivityaintent3 =new Intent(MainActivity.this,MainActivity3.class);
           mainactivityaintent3.putExtra("number",3);
           startActivity(mainactivityaintent3);
       });


        Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(view -> {
            Intent mainactivityintent4 = new Intent(MainActivity.this,MainActivity2.class);
            mainactivityintent4.putExtra("number",4);
            startActivity(mainactivityintent4);
        });


        Button button5 =(Button) findViewById(R.id.button5);
        button5.setOnClickListener(view -> {
            Intent mainactivityintent5 = new Intent(MainActivity.this,MainActivity4.class);
            mainactivityintent5.putExtra("number",5);
            startActivity(mainactivityintent5);

        });

        Button button6 = (Button) findViewById(R.id.button6);
        button6.setOnClickListener(view -> {
            Intent mainactivityintent6 =new Intent(MainActivity.this,MainActivity5.class);
            mainactivityintent6.putExtra("number",6);
            startActivity(mainactivityintent6);
        });


    }
}