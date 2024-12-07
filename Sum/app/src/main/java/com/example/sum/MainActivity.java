package com.example.sum;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.view.*;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{


    private EditText tx1,tx2;
    private TextView tx3;
    private Button b,b2;



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tx1 = findViewById(R.id.tx1);
        tx2 = findViewById(R.id.tx2);
        b = findViewById(R.id.b);
        b2 = findViewById(R.id.b2);
        tx3 = findViewById(R.id.tx3);
        b.setOnClickListener(this);
        b2.setOnClickListener(this);
    }

    public void onClick(View v)
    {
        if(v.getId() == b.getId())
        {
            String str1=tx1.getText().toString();
            String str2=tx2.getText().toString();
            int n1=Integer.parseInt(str1);
            int n2=Integer.parseInt(str2);
            int sum=n1+n2;
            tx3.setText(String.valueOf(sum));
        }
        if(v.getId() == R.id.b2)
        {
            tx1.setText("");
            tx2.setText("");
            tx3.setText("");
        }

    }



}