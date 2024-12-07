package com.example.vmarket;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    EditText email, password,location;
    AppCompatButton login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        login = findViewById(R.id.login);
        location=findViewById(R.id.loaction);


        login.setOnClickListener(this);

    }

    public void onClick(View view) {
        if(view.getId()==login.getId())
        {
            if (!email.getText().toString().isEmpty() && !password.getText().toString().isEmpty() && !location.getText().toString().isEmpty()) {
                Intent intent = new Intent(LoginActivity.this, HomePAge.class);
                intent.putExtra("location", String.valueOf(location.getText()));
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
            else {
                Toast t = Toast.makeText(this,"Please fill all the fieldes",Toast.LENGTH_LONG);
                t.show();
            }

        }
    }
}