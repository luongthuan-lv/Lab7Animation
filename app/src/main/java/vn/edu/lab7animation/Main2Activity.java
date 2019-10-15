package vn.edu.lab7animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class Main2Activity extends AppCompatActivity {
ImageView imgHour,imgMinute,imgSecond;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        imgHour=findViewById(R.id.imgHour);
        imgMinute=findViewById(R.id.imgMinute);
        imgSecond=findViewById(R.id.imgSecond);

    }

    public void Run(View view) {
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.clock);
        imgHour.startAnimation(animation);

        Animation animation1 = AnimationUtils.loadAnimation(this, R.anim.clock_1);
        imgMinute.startAnimation(animation1);

        Animation animation2 = AnimationUtils.loadAnimation(this, R.anim.clock_2);
        imgSecond.startAnimation(animation2);
    }
}
