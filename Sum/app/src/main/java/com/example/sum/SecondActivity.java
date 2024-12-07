package com.example.sum;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class SecondActivity extends AppCompatActivity implements View.OnClickListener
{
    Button translate,rotate,scalling,alpha;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_second);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;



        });
        tv=findViewById(R.id.tv);

        scalling=findViewById(R.id.scalling);
        scalling.setOnClickListener(this);

        rotate=findViewById(R.id.rotate);
        rotate.setOnClickListener(this);

        translate=findViewById(R.id.translate);
        translate.setOnClickListener(this);

        alpha=findViewById(R.id.alpha);
        alpha.setOnClickListener(this);




    }

    @Override
    public void onClick(View view) {
        Animation an= AnimationUtils.loadAnimation(this,R.anim.translate);
        tv.startAnimation(an);
    }
}