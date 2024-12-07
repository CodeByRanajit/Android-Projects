package com.example.vmarket;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MenuHolder extends RecyclerView.ViewHolder {
    ImageView menu_img;
    TextView menu_desc;
    public MenuHolder(@NonNull View itemView) {
        super(itemView);
        menu_img=itemView.findViewById(R.id.menu_img);
        menu_desc=itemView.findViewById(R.id.menu_desc);
    }
}

