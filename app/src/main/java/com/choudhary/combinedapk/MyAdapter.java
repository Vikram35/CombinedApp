package com.choudhary.combinedapk;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    ArrayList<Model> arrayList;
    Context context;

    public MyAdapter(ArrayList<Model> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.item_layout,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.Name.setText(arrayList.get(position).getName());
        holder.BloodType.setText(arrayList.get(position).getBloodType());
        holder.Adress.setText(arrayList.get(position).getAddrress());

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class  ViewHolder extends RecyclerView.ViewHolder{

        TextView Name, Adress,BloodType;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            Name = itemView.findViewById(R.id.id_Name);
            Adress = itemView.findViewById(R.id.Id_address);
            BloodType = itemView.findViewById(R.id.id_bloodType);
        }

    }
}
