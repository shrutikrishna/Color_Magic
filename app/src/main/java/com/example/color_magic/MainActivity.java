package com.example.color_magic;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.util.Range;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private View view;
    private Button button;
    private int[] colors;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        colors=new int[]{Color.RED,Color.GREEN,Color.CYAN,Color.MAGENTA,Color.BLACK,Color.DKGRAY,
        Color.GRAY,Color.YELLOW,Color.LTGRAY,Color.BLUE};
        view=findViewById(R.id.viewID);
        button=(Button)findViewById(R.id.buttonID);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int colorArrayLength=colors.length;
                Random random=new Random();
                int randomNum=random.nextInt(colorArrayLength);
                view.setBackgroundColor(colors[randomNum]);
                Log.d("Random",String.valueOf(randomNum));

            }
        });

    }
}
