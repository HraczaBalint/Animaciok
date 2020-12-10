package com.example.animaciok;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private Button buttonFadeIn, buttonFadeOut, buttonZoomIn, buttonZoomOut, buttonBounce, buttonRotate, buttonFrameAnim;
    private Animation fadeIn, fadeOut, zoomIn, zoomOut, bounce, rotate;
    private ImageView imageViewFormation, imageViewFrameAnimation;

    private boolean running;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        buttonFrameAnim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!running){
                    ((AnimationDrawable) imageViewFrameAnimation.getBackground()).start();
                    running = true;
                    ((AnimationDrawable) imageViewFrameAnimation.getBackground()).stop();
                    running = false;
                }
            }
        });

        buttonFadeIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageViewFormation.startAnimation(fadeIn);
                buttonFadeIn.startAnimation(fadeIn);
            }
        });

        buttonFadeOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageViewFormation.startAnimation(fadeOut);
                buttonFadeOut.startAnimation(fadeOut);
            }
        });

        buttonZoomIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageViewFormation.startAnimation(zoomIn);
                buttonZoomIn.startAnimation(zoomIn);
            }
        });

        buttonZoomOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageViewFormation.startAnimation(zoomOut);
                buttonZoomOut.startAnimation(zoomIn);
            }
        });

        buttonBounce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageViewFormation.startAnimation(bounce);
                buttonBounce.startAnimation(bounce);
            }
        });

        buttonRotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageViewFormation.startAnimation(rotate);
                buttonRotate.startAnimation(rotate);
            }
        });
    }

    private void init() {
        buttonFadeIn = findViewById(R.id.buttonFadeIn);
        buttonFadeOut = findViewById(R.id.buttonFadeOut);
        buttonZoomIn = findViewById(R.id.buttonZoomIn);
        buttonZoomOut = findViewById(R.id.buttonZoomOut);
        buttonBounce = findViewById(R.id.buttonBounce);
        buttonRotate = findViewById(R.id.buttonRotate);
        buttonFrameAnim = findViewById(R.id.buttonFrameAnim);

        imageViewFormation = findViewById(R.id.imageViewFormation);
        imageViewFrameAnimation = findViewById(R.id.imageViewFrameAnimation);

        running = false;

        fadeIn = AnimationUtils.loadAnimation(MainActivity.this, R.anim.fade_in);
        fadeOut = AnimationUtils.loadAnimation(MainActivity.this, R.anim.fade_out);
        zoomIn = AnimationUtils.loadAnimation(MainActivity.this, R.anim.zoom_in);
        zoomOut = AnimationUtils.loadAnimation(MainActivity.this, R.anim.fade_out);
        bounce = AnimationUtils.loadAnimation(MainActivity.this, R.anim.bounce);
        rotate = AnimationUtils.loadAnimation(MainActivity.this, R.anim.rotate);

    }


}