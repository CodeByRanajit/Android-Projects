package com.example.animation;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    TextView tx,tx1,tx2,tx3;
    Button bt,bt1,bt2,bt3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tx=findViewById(R.id.tx);
        bt=findViewById(R.id.bt);
        bt.setOnClickListener(this);

        tx1=findViewById(R.id.tx1);
        bt1=findViewById(R.id.bt1);
        bt1.setOnClickListener(this);

        tx2=findViewById(R.id.tx2);
        bt2=findViewById(R.id.bt2);
        bt2.setOnClickListener(this);

        tx3=findViewById(R.id.tx3);
        bt3=findViewById(R.id.bt3);
        bt3.setOnClickListener(this);


    }
    public void onClick(View v){
        if (v.getId() == R.id.bt) {
            Animation animation = AnimationUtils.loadAnimation(this, R.anim.translate);
            tx.startAnimation(animation);
        }
        if (v.getId() == R.id.bt1) {
            Animation animation = AnimationUtils.loadAnimation(this, R.anim.rotation);
            tx1.startAnimation(animation);
        }

        if (v.getId() == R.id.bt2) {
            Animation animation = AnimationUtils.loadAnimation(this, R.anim.alpha);
            tx2.startAnimation(animation);
        }

        if (v.getId() == R.id.bt3) {
            Animation animation = AnimationUtils.loadAnimation(this, R.anim.scale);
            tx3.startAnimation(animation);
        }

    }


}