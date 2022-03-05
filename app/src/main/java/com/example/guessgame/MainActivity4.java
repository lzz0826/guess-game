package com.example.guessgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity4 extends MainActivity2 {

    Guess_5 game;
    int number;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = this.getIntent();
        number = intent.getIntExtra("number",5);


        display = (TextView) findViewById(R.id.display);
        Button button_home = findViewById(R.id.button_home);
        Button button_new = findViewById(R.id.button_new);
        Button button_01 =findViewById(R.id.button_01);
        Button button_02 =findViewById(R.id.button_02);
        Button button_03 =findViewById(R.id.button_03);
        Button button_04 =findViewById(R.id.button_04);
        Button button_05 =findViewById(R.id.button_05);
        Button button_06 =findViewById(R.id.button_06);
        Button button_07 =findViewById(R.id.button_07);
        Button button_08 =findViewById(R.id.button_08);
        Button button_09 =findViewById(R.id.button_09);
        Button button_00 =findViewById(R.id.button_00);


        button_01.setEnabled(false);
        button_02.setEnabled(false);
        button_03.setEnabled(false);
        button_04.setEnabled(false);
        button_05.setEnabled(false);
        button_06.setEnabled(false);
        button_07.setEnabled(false);
        button_08.setEnabled(false);
        button_09.setEnabled(false);
        button_00.setEnabled(false);


        button_home.setOnClickListener(view -> {
            Intent main2activityintent = new Intent(MainActivity4.this,MainActivity.class);
            startActivity(main2activityintent);

        });

        button_new.setOnClickListener(view -> {
            game = new Guess_5(number);
            user_input= "";
            count = 0 ;
            display.setText("");


            button_01.setEnabled(true);
            button_02.setEnabled(true);
            button_03.setEnabled(true);
            button_04.setEnabled(true);
            button_05.setEnabled(true);
            button_06.setEnabled(true);
            button_07.setEnabled(true);
            button_08.setEnabled(true);
            button_09.setEnabled(true);
            button_00.setEnabled(true);
            display.append("遊戲開始"+"\n");
        });

        button_01.setOnClickListener(view -> {
            if (count != number){
                user_input += "1";
                count +=1;
                display.append("1");
            }
            if (count == number){
                getResult();
            }
        });

        button_02.setOnClickListener(view -> {
            if (count !=number){
                user_input +="2";
                count += 1;
                display.append("2");
            }
            if (count == number){
                getResult();
            }
        });

        button_03.setOnClickListener(view -> {
            if (count != number){
                user_input += "3";
                count += 1 ;
                display.append("3");;
            }
            if (count == number){
                getResult();
            }
        });

        button_04.setOnClickListener(view -> {
            if (count != number){
                user_input += "4";
                count += 1;
                display.append("4");
            }
            if (count == number){
                getResult();
            }
        });

        button_05.setOnClickListener(view -> {
            if (count != number){
                user_input +="5";
                count += 1;
                display.append("5");
            }
            if (count == number){
                getResult();
            }
        });

        button_06.setOnClickListener(view -> {
            if (count != number){
                user_input += "6";
                count += 1;
                display.append("6");
            }
            if (count == number){
                getResult();
            }
        });

        button_07.setOnClickListener(view -> {
            if (count != number){
                user_input += "7";
                count += 1;
                display.append("7");
            }
            if (count == number){
                getResult();
            }
        });

        button_08.setOnClickListener(view -> {
            if (count != number){
                user_input += "8";
                count += 1;
                display.append("8");
            }
            if (count == number){
                getResult();
            }
        });

        button_09.setOnClickListener(view -> {
            if (count != number){
                user_input += "9";
                count +=1;
                display.append("9");
            }
            if (count == number){
                getResult();
            }
        });

        button_00.setOnClickListener(view -> {
            if (count != number){
                user_input += "0";
                count +=1;
                display.append("0");
            }
            if (count == number){
                getResult();
            }
        });



    }

    void getResult(){
        display.append(":");
        count = 0;
        game.ABcounter(user_input);
        if (game.findNumber(user_input)) {
            display.append("數字重複"+"\n");
        } else {
            if (game.getAB().equals("5A0B")) {
                display.append("恭喜答對"+"\n");

//                button_01.setEnabled(false);
//                button_02.setEnabled(false);
//                button_03.setEnabled(false);
//                button_04.setEnabled(false);
//                button_05.setEnabled(false);
//                button_06.setEnabled(false);
//                button_07.setEnabled(false);
//                button_08.setEnabled(false);
//                button_09.setEnabled(false);
//                button_00.setEnabled(false);
            }
            else {
                display.append(game.getAB()+"\n");
            }
        }
        user_input = "";
    }
}