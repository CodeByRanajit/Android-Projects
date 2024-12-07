package com.example.test;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Handle TextView for the hyperlink
        TextView hyperlink = findViewById(R.id.hyperlink);
        hyperlink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open a URL when the hyperlink is clicked
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com"));
                startActivity(browserIntent);
            }
        });

        // Handle ImageView click to perform an action
        ImageView imageView = findViewById(R.id.imageView);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Perform any action, e.g., show a Toast message
                Toast.makeText(MainActivity.this, "Image clicked!", Toast.LENGTH_SHORT).show();

                // Additional actions can be added here (like opening a new activity)
            }
        });
    }
}
