package com.example.vmarket;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class HomeHolder extends RecyclerView.ViewHolder {
    ImageView home_img;
    TextView home_desc1;
    TextView home_desc2;
    public HomeHolder(@NonNull View itemView) {
        super(itemView);
        home_img=itemView.findViewById(R.id.home_img);
        home_desc1=itemView.findViewById(R.id.home_desc1);
        home_desc2=itemView.findViewById(R.id.home_desc2);
    }
}

