package com.example.vmarket;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Details extends AppCompatActivity {
    ImageView imageView,back_to_exp;
    TextView textView1,textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_details);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        imageView=findViewById(R.id.image);
        textView1=findViewById(R.id.txv1);
        textView2=findViewById(R.id.txv2);

        back_to_exp=findViewById(R.id.back_to_exp);
        back_to_exp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Details.this, HomePAge.class);
                startActivity(intent);
            }
        });

        imageView.setImageResource(getIntent().getIntExtra("image",0));
        textView1.setText(getIntent().getStringExtra("header"));
        textView2.setText(getIntent().getStringExtra("description"));
    }
}