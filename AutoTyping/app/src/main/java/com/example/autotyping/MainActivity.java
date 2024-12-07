package com.example.autotyping;

import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.example.autotyping.R;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private String textToType = "Welcome..!!";
    private int index = 0;
    private Handler handler = new Handler();
    private boolean isTypingCompleted = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        startTypingEffect();
    }

    private void startTypingEffect() {
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                if (index < textToType.length()) {
                    textView.setText(textView.getText().toString() + textToType.charAt(index));
                    index++;
                    handler.postDelayed(this, 150); // Delay between each character (in milliseconds)
                } else {
                    isTypingCompleted = true;
                    resetTypingEffect();
                }
            }
        }, 150);
    }

    private void resetTypingEffect() {
        if (isTypingCompleted) {
            handler.postDelayed(() -> {
                textView.setText("");
                index = 0;
                isTypingCompleted = false;
                startTypingEffect(); // Restart typing effect
            }, 2000); // Delay before restarting the effect
        }
    }
}



