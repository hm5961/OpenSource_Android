package com.khm.challenge_03;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    ImageView imageView1;
    ImageView imageView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView1 = findViewById(R.id.imageView1);
        imageView2 = findViewById(R.id.imageView2);

        Button button01 = findViewById(R.id.button1);
        button01.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                moveImageUp();
            }
        });

        Button button02 = findViewById(R.id.button2);
        button02.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                moveImageDown();
            }
        });

        moveImageUp();
    }

    private void moveImageDown() {
        imageView1.setImageResource(0);
        imageView2.setImageResource(R.drawable.bird_small);

        imageView1.invalidate();
        imageView2.invalidate();
    }

    private void moveImageUp() {
        imageView1.setImageResource(R.drawable.bird_small);
        imageView2.setImageResource(0);

        imageView1.invalidate();
        imageView2.invalidate();
    }

}