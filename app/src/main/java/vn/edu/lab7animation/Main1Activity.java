package vn.edu.lab7animation;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Main1Activity extends AppCompatActivity {
    Button btnAll, btnNobita, btnDoraemon;
    ImageView imgPicture;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        btnAll = findViewById(R.id.btnAll);
        btnNobita = findViewById(R.id.btnNobita);
        btnDoraemon = findViewById(R.id.btnDoraemon);
        imgPicture = findViewById(R.id.imgPicture);
        onclick();


    }

    public void onclick() {
        btnAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showImage("All");
            }
        });


        btnDoraemon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showImage("Doraemon");
            }
        });


        btnNobita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showImage("Nobita");
            }
        });
    }

    public void showImage(String img) {

        //hide image
        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(imgPicture, "translationX", 0f, 500f);
        objectAnimator.setDuration(2000);
        ObjectAnimator objectAnimator1 = ObjectAnimator.ofFloat(imgPicture, "alpha", 1f, 0f);
        objectAnimator1.setDuration(2000);

        //show image
        ObjectAnimator objectAnimator2 = ObjectAnimator.ofFloat(imgPicture, "translationX", -500f, 0f);
        objectAnimator2.setDuration(2000);
        ObjectAnimator objectAnimator3 = ObjectAnimator.ofFloat(imgPicture, "alpha", 0f, 1f);
        objectAnimator3.setDuration(2000);


        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(objectAnimator2).with(objectAnimator3).after(objectAnimator).after(objectAnimator1);
        animatorSet.start();

        final String imgName = img;
        objectAnimator1.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationCancel(Animator animation) {
                super.onAnimationCancel(animation);
            }

            @Override
            public void onAnimationEnd(Animator animation) {
                if (imgName == "Nobita") {
                    imgPicture.setImageResource(R.drawable.nobita_1);
                }
                if (imgName == "Doraemon") {
                    imgPicture.setImageResource(R.drawable.doraemon);
                }
                if (imgName=="All"){
                    imgPicture.setImageResource(R.drawable.all);
                }

            }

            @Override
            public void onAnimationRepeat(Animator animation) {
                super.onAnimationRepeat(animation);
            }

            @Override
            public void onAnimationStart(Animator animation) {
                super.onAnimationStart(animation);
            }

            @Override
            public void onAnimationPause(Animator animation) {
                super.onAnimationPause(animation);
            }

            @Override
            public void onAnimationResume(Animator animation) {
                super.onAnimationResume(animation);
            }
        });


    }
}
