package vn.edu.lab7animation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class BossActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boss);
    }

    public void Bai1(View view) {
        startActivity(new Intent(BossActivity.this,MainActivity.class));
    }

    public void Bai2(View view) {
        startActivity(new Intent(BossActivity.this,Main1Activity.class));
    }

    public void Bai3(View view) {
        startActivity(new Intent(BossActivity.this,Main2Activity.class));
    }
}
