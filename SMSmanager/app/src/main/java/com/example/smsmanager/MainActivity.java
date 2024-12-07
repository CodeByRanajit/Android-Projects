package com.example.smsmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.*;
import android.widget.*;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{

    EditText tx1, tx2;
    Button b;

    TextView tx3,tx4;

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tx1 = findViewById(R.id.tx1);
        tx2 = findViewById(R.id.tx2);
        tx3= findViewById(R.id.tx3);
        tx4= findViewById(R.id.tx4);
        b= findViewById(R.id.b);

        b.setOnClickListener(this);
    }


    @SuppressLint("SetTextI18n")
    public void onClick(View view)
    {
        String number = tx1.getText().toString();
        String msg = tx2.getText().toString();
        try
        {
            SmsManager obj = SmsManager.getDefault();
            obj.sendTextMessage(number, null, msg, null, null);
            tx4.setText("Message Sent");
        }
        catch (Exception ignored) {}
    }
}