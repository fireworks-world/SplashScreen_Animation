package com.example.splashscreen_animation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {
Button b1;
ImageView iv1;
Animation button,rocket;
ProgressBar pb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.button);
        iv1=findViewById(R.id.imageView4);
        pb=findViewById(R.id.progressBar);
        button= AnimationUtils.loadAnimation(this,R.anim.button);
        rocket=AnimationUtils.loadAnimation(this,R.anim.rocket);
        b1.setAnimation(button);
        iv1.setAnimation(rocket);

        new Thread(new Runnable() {
            @Override
            public void run() {
                running();
                startapp();
                finish();
            }
        }).start();
    }
    public void running(){
        for (int progress=0; progress<100; progress+=10) {
            try {
                Thread.sleep(3000);
                pb.setProgress(progress);
            } catch (Exception e) {
                e.printStackTrace();

            }
        }
    }
    private void startapp(){
        Intent i=new Intent(getApplicationContext(),Main2Activity.class);
        startActivity(i);
    }
}
