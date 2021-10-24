package com.example.dicee;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button rollButton = (Button) findViewById(R.id.buttonDice);
        ImageView leftDice = (ImageView) findViewById(R.id.image_Dice1);
        ImageView rightDice = (ImageView) findViewById(R.id.image_Dice2);
        int[] diceArray = {
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6,
        };
        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Dicee","Pressed successfully!");
                Random randomGenerator = new Random();
                int randomLeft = randomGenerator.nextInt(6);
                int randomRight = randomGenerator.nextInt(6);
                Log.d("Dicee","Random number is "+randomLeft+ "and"+ randomRight);
                leftDice.setImageResource(diceArray[randomLeft]);
                rightDice.setImageResource(diceArray[randomRight]);
            }


        });



    }
}