package com.example.vmarket;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class HomeAdapter extends RecyclerView.Adapter<HomeHolder>{

    ArrayList<HomeModel> data1;
    Context applicationContext1;

    public HomeAdapter(ArrayList<HomeModel> data1, Context applicationContext1) {
        this.data1 = data1;
        this.applicationContext1 = applicationContext1;
    }



    @NonNull
    @Override
    public HomeHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View view=layoutInflater.inflate(R.layout.home_one_menu,parent,false);
        return new HomeHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HomeHolder holder, int position) {

        HomeModel md=data1.get(position);
        holder.home_img.setImageResource(data1.get(position).getHome_img());
        holder.home_desc1.setText(data1.get(position).getHome_desc1());
        holder.home_desc2.setText(data1.get(position).getHome_desc2());

        holder.home_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(applicationContext1,Details.class);

                intent.putExtra("image",md.getHome_img());
                intent.putExtra("header",md.getHome_desc1());
                intent.putExtra("description",md.getHome_desc2());

                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

                applicationContext1.startActivity(intent);
            }

        });



    }

    @Override
    public int getItemCount() {
        return data1.size();
    }
}
