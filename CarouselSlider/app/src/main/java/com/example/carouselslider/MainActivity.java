package com.example.carouselslider;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;
import androidx.appcompat.app.AppCompatActivity;

import com.example.carouselslider.R;

public class MainActivity extends AppCompatActivity {

    private ImageSwitcher imageSwitcher;
    private int[] images = {R.drawable.image1, R.drawable.image2, R.drawable.image3};
    private int currentIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageSwitcher = findViewById(R.id.imageSwitcher);
        Button prevButton = findViewById(R.id.prevButton);
        Button nextButton = findViewById(R.id.nextButton);

        // Set the factory for the ImageSwitcher
        imageSwitcher.setFactory(() -> {
            ImageView imageView = new ImageView(getApplicationContext());
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setLayoutParams(new ImageSwitcher.LayoutParams(
                    ImageSwitcher.LayoutParams.MATCH_PARENT,
                    ImageSwitcher.LayoutParams.MATCH_PARENT
            ));
            return imageView;
        });

        // Set initial image
        imageSwitcher.setImageResource(images[currentIndex]);

        // Next button functionality
        nextButton.setOnClickListener(v -> {
            currentIndex = (currentIndex + 1) % images.length;
            imageSwitcher.setImageResource(images[currentIndex]);
        });

        // Previous button functionality
        prevButton.setOnClickListener(v -> {
            currentIndex = (currentIndex - 1 + images.length) % images.length;
            imageSwitcher.setImageResource(images[currentIndex]);
        });
    }
}
