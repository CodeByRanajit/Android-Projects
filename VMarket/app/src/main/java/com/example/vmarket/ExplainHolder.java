package com.example.vmarket;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ExplainHolder extends RecyclerView.ViewHolder {
    ImageView explain_img;
    TextView explain_desc1;
    TextView explain_desc2;

    public ExplainHolder(@NonNull View itemView) {
        super(itemView);
        explain_img=itemView.findViewById(R.id.explain_img);
        explain_desc1=itemView.findViewById(R.id.explain_desc1);
        explain_desc2=itemView.findViewById(R.id.explain_desc2);

    }
}
