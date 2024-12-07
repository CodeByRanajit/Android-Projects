package com.example.vmarket;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ExplainAdapter extends RecyclerView.Adapter<ExplainHolder>{
    ArrayList<ExplainModel> data2;
    Context applicationContext2;

    public ExplainAdapter(ArrayList<ExplainModel> data2, Context applicationContext2) {
        this.data2 = data2;
        this.applicationContext2 = applicationContext2;
    }

    @NonNull
    @Override
    public ExplainHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View view=layoutInflater.inflate(R.layout.explain_one_row,parent,false);
        return new ExplainHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ExplainHolder holder, int position) {
        ExplainModel exm=(ExplainModel)data2.get(position);
        holder.explain_img.setImageResource(data2.get(position).getExplain_img());
        holder.explain_desc1.setText(exm.getExplain_desc1());
        holder.explain_desc2.setText(exm.getExplain_desc2());


        holder.explain_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(applicationContext2,Details.class);

                intent.putExtra("image",exm.getExplain_img());
                intent.putExtra("header",exm.getExplain_desc1());
                intent.putExtra("description",exm.getExplain_desc2());

                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

                applicationContext2.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return data2.size();
    }
}
