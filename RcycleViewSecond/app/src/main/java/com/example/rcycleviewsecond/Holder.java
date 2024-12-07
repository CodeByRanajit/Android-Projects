package com.example.rcycleviewsecond;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Holder extends RecyclerView.ViewHolder {
    ImageView img;
    TextView tv1,tv2;
    public Holder(@NonNull View itemView) {
        super(itemView);
        img=itemView.findViewById(R.id.img);
        tv1=itemView.findViewById(R.id.tv1);
        tv2=itemView.findViewById(R.id.tv2);


    }
}
