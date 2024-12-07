package com.example.recyclerviewfirst;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.Holder> {
    @NonNull
    String data[];
    MyAdapter(String data[]){
        this.data=data;
    }
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View view=layoutInflater.inflate(R.layout.onerow,parent,false);

        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        holder.tv.setText(data[position]);
    }

    @Override
    public int getItemCount() {
        return data.length;
    }




    public class Holder extends RecyclerView.ViewHolder{
        TextView tv;

        public Holder(@NonNull View itemView) {
            super(itemView);
            tv=itemView.findViewById(R.id.tv);
        }
    }

}
