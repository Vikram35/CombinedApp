package com.choudhary.combinedapk;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class ContactsAdapter extends RecyclerView.Adapter<ContactsAdapter.ViewHolder> {



    Context context;

    ArrayList<ModelContact> modelContacts;

    public ContactsAdapter(Context context, ArrayList<ModelContact> modelContacts) {
        this.context = context;
        this.modelContacts = modelContacts;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View View = LayoutInflater.from(context).inflate(R.layout.item_contact,parent,false);

       return  new ViewHolder(View);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.textView.setText(modelContacts.get(position).getName());
        Glide.with(context).load(modelContacts.get(position).getImageurl()).into(holder.imageView);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent go = new Intent(context,Detail_activity.class);
                go.putExtra("IMAGE_URL",modelContacts.get(position).getImageurl());
                go.putExtra("NAME",modelContacts.get(position).getName());
                go.putExtra("NUMBER",modelContacts.get(position).getPhone());
                go.putExtra("EMAIL",modelContacts.get(position).getEmail());
                go.putExtra("ADDRESS",modelContacts.get(position).getAdrress());
                context.startActivity(go);
            }
        });

    }

    @Override
    public int getItemCount() {
        return modelContacts.size();
    }

    public  class ViewHolder extends RecyclerView.ViewHolder{

        TextView textView;
        ImageView imageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.contactsName);
            imageView = itemView.findViewById(R.id.profile_full_screen);


        }
    }
}
