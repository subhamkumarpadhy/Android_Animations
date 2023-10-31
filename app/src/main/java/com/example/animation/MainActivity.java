package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtAnim;
    Button btnTranslate, btnAlpha, btnRotate, btnScale;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtAnim = findViewById(R.id.showTxt);

        Animation move = AnimationUtils.loadAnimation(this,R.anim.move);
        Animation alpha = AnimationUtils.loadAnimation(this,R.anim.alpha);
        Animation scale = AnimationUtils.loadAnimation(this,R.anim.scale);
        Animation rotate = AnimationUtils.loadAnimation(this,R.anim.rotate);

        btnTranslate = findViewById(R.id.btnMove);
        btnAlpha = findViewById(R.id.btnAlpha);
        btnRotate = findViewById(R.id.btnRotate);
        btnScale = findViewById(R.id.btnScale);

        btnTranslate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtAnim.startAnimation(move);
            }
        });

        btnAlpha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtAnim.startAnimation(alpha);
            }
        });

        btnScale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtAnim.startAnimation(scale);
            }
        });

        btnRotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtAnim.startAnimation(rotate);
            }
        });
    }
}