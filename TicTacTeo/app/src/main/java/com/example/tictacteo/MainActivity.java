package com.example.tictacteo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9,restart;
    TextView result;
    int flag = 0;
    int count = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt1 = findViewById(R.id.bt1);
        bt1.setOnClickListener(this);
        bt2 = findViewById(R.id.bt2);
        bt2.setOnClickListener(this);
        bt3 = findViewById(R.id.bt3);
        bt3.setOnClickListener(this);
        bt4 = findViewById(R.id.bt4);
        bt4.setOnClickListener(this);
        bt5 = findViewById(R.id.bt5);
        bt5.setOnClickListener(this);
        bt6 = findViewById(R.id.bt6);
        bt6.setOnClickListener(this);
        bt7 = findViewById(R.id.bt7);
        bt7.setOnClickListener(this);
        bt8 = findViewById(R.id.bt8);
        bt8.setOnClickListener(this);
        bt9 = findViewById(R.id.bt9);
        bt9.setOnClickListener(this);

        restart = findViewById(R.id.restart);
        restart.setOnClickListener(this);


        result=findViewById(R.id.result);


    }

    public void onClick(View v)
    {
        Button cb = (Button) v;
        if (String.valueOf(cb.getText()).equals(""))
        {


            if (flag == 0)
            {
                cb.setText("x");
                flag = 1;
                count++;
            }
            else
            {
                cb.setText("o");
                flag = 0;
                count++;
            }
            if (count > 4)
            {
                String bt1v = String.valueOf(bt1.getText());
                String bt2v = String.valueOf(bt2.getText());
                String bt3v = String.valueOf(bt3.getText());
                String bt4v = String.valueOf(bt4.getText());
                String bt5v = String.valueOf(bt5.getText());
                String bt6v = String.valueOf(bt6.getText());
                String bt7v = String.valueOf(bt7.getText());
                String bt8v = String.valueOf(bt8.getText());
                String bt9v = String.valueOf(bt9.getText());

                if (bt1v.equals(bt2v) && bt1v.equals(bt3v) && !String.valueOf(bt1v).equals(""))
                {
                    Toast.makeText(this, "You win", Toast.LENGTH_LONG).show();
                    clearAll();
                    result.setText("Congrats You Win..!!");
                }
                else if (bt4v.equals(bt5v) && bt4v.equals(bt6v) && !String.valueOf(bt4v).equals(""))
                {
                    Toast.makeText(this, "You win", Toast.LENGTH_LONG).show();
                    clearAll();
                    result.setText("Congrats You Win..!!");
                }
                else if (bt7v.equals(bt8v) && bt7v.equals(bt9v) && !String.valueOf(bt7v).equals(""))
                {
                    Toast.makeText(this, "You win", Toast.LENGTH_LONG).show();
                    clearAll();
                    result.setText("Congrats You Win..!!");
                }
                else if (bt1v.equals(bt4v) && bt1v.equals(bt7v) && !String.valueOf(bt1v).equals(""))
                {
                    Toast.makeText(this, "You win", Toast.LENGTH_LONG).show();
                    clearAll();
                    result.setText("Congrats You Win..!!");
                }
                else if (bt2v.equals(bt5v) && bt2v.equals(bt8v) && !String.valueOf(bt2v).equals(""))
                {
                    Toast.makeText(this, "You win", Toast.LENGTH_LONG).show();
                    clearAll();
                    result.setText("Congrats You Win..!!");
                }
                else if (bt3v.equals(bt6v) && bt3v.equals(bt9v) && !String.valueOf(bt3v).equals(""))
                {
                    Toast.makeText(this, "You win", Toast.LENGTH_LONG).show();
                    clearAll();
                    result.setText("Congrats You Win..!!");
                }
                else if (bt1v.equals(bt5v) && bt1v.equals(bt9v) && !String.valueOf(bt1v).equals(""))
                {
                    Toast.makeText(this, "You win", Toast.LENGTH_LONG).show();
                    clearAll();
                    result.setText("Congrats You Win..!!");
                }
                else if (bt3v.equals(bt5v) && bt3v.equals(bt7v) && !String.valueOf(bt3v).equals(""))
                {
                    Toast.makeText(this, "You win", Toast.LENGTH_LONG).show();
                    result.setText("Congrats You Win..!!");
                    clearAll();
                }

            }
        }
        if (String.valueOf(cb.getText()).equals("-Restart-")){
            clearAll();
            result.setText("");
        }

    }
    public void clearAll () {
        bt1.setText("");
        bt2.setText("");
        bt3.setText("");
        bt4.setText("");
        bt5.setText("");
        bt6.setText("");
        bt7.setText("");
        bt8.setText("");
        bt9.setText("");



    }
}