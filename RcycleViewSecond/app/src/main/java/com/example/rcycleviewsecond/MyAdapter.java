package com.example.rcycleviewsecond;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.SearchView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<Holder> implements Filterable {
    ArrayList<Model>data;
    ArrayList<Model>copy;
    Context applicationContext;

    MyAdapter(ArrayList<Model> data, Context applicationContext){
        this.data=data;
        copy=new ArrayList<>(data);
        this.applicationContext=applicationContext;
    }


    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View view=layoutInflater.inflate(R.layout.onerow,parent,false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        Model md=data.get(position);

        holder.img.setImageResource(data.get(position).getImv());
        holder.tv1.setText(data.get(position).getTx1());
        holder.tv2.setText(data.get(position).getTx2());

        holder.img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(applicationContext,SecondPage.class);

                intent.putExtra("image",md.getImv());
                intent.putExtra("header",md.getTx1());
                intent.putExtra("description",md.getTx2());

                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

                applicationContext.startActivity(intent);
            }
        });



    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    @Override
    public Filter getFilter() {
        return filter;
    }

    Filter filter=new Filter() {
        @Override
        protected FilterResults performFiltering(CharSequence key) {

            ArrayList<Model>filterList=new ArrayList<>();
            if (key.toString().isEmpty()){
                filterList.addAll(copy);

            }
            else {
                for (Model fm:copy){
                    if (key.toString().equalsIgnoreCase(String.valueOf(fm.getTx1()))){
                        filterList.add(fm);
                    }
                }
            }

            FilterResults result=new FilterResults();
            result.values = filterList;

            return result;
        }

        @Override
        protected void publishResults(CharSequence charSequence, FilterResults results) {
            data.clear();
            data.addAll((ArrayList<Model>) results.values);
            notifyDataSetChanged();

        }
    };
}
