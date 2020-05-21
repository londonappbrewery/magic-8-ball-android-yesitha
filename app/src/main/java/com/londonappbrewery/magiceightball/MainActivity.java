package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button AskButton;
        AskButton=findViewById(R.id.button);
        final int[] BallArray={R.drawable.ball1,R.drawable.ball2,R.drawable.ball3,R.drawable.ball4,R.drawable.ball5};
        final ImageView Answer=findViewById(R.id.imageView);
        AskButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random RandomNumberGenerator=new Random();
                int Index=RandomNumberGenerator.nextInt(5);
                Answer.setImageResource(BallArray[Index]);
            }
        });


    }
}
