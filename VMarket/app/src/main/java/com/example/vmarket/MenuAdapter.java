package com.example.vmarket;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MenuAdapter extends RecyclerView.Adapter<MenuHolder> {


    ArrayList<MenuModel> data;
    Context applicationContext;
    MenuAdapter(ArrayList<MenuModel> data,Context applicationContext){
        this.data=data;
        this.applicationContext=applicationContext;

    }

//    private void openCategoryActivity(String category) {
//        Intent intent = new Intent(applicationContext, ExplainMenu.class);
//        intent.putExtra("CATEGORY", category);
//        applicationContext.startActivity(intent);
//    }

    @NonNull
    @Override
    public MenuHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View view=layoutInflater.inflate(R.layout.one_menu,parent,false);

        return new MenuHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MenuHolder holder, int position) {
        MenuModel md=data.get(position);
        holder.menu_img.setImageResource(data.get(position).getMenu_img());
        holder.menu_desc.setText(data.get(position).getMenu_desc());

        String str= String.valueOf(data.get(position).getMenu_desc());

        Context ac=this.applicationContext;
        holder.menu_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ac, ExplainMenu.class);
                intent.putExtra("CATEGORY", str);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                ac.startActivity(intent);



            }

        });
 
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
