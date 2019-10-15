package vn.edu.lab7animation;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imgNobita;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgNobita = findViewById(R.id.imgNobita);
    }

    public void Rotation(View view) {
        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(imgNobita, "rotation",1080);
        objectAnimator.setDuration(3000);
      // objectAnimator.setRepeatCount(1000);
        objectAnimator.setRepeatMode(ValueAnimator.RESTART);
        objectAnimator.start();
    }

    public void Moving(View view) {
        ObjectAnimator objectAnimator=ObjectAnimator.ofFloat(imgNobita,"translationY",0f, -700f);
        objectAnimator.setDuration(3000);
        objectAnimator.setRepeatCount(1000);
        objectAnimator.setRepeatMode(ValueAnimator.RESTART);
        objectAnimator.start();


        imgNobita.setImageResource(R.drawable.fly);
        AnimationDrawable animationDrawable = (AnimationDrawable) imgNobita.getDrawable();
        animationDrawable.start();


    }

    public void Zoom(View view) {
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.zoom);
        imgNobita.startAnimation(animation);
    }
}
