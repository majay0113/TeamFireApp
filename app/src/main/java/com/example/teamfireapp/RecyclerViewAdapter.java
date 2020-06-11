package com.example.teamfireapp;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    private  static final String TAG = "RecyclerView";

    private  Context mContent;
    private List<foodDescription> mdata;


    public RecyclerViewAdapter(Context mContent, List<foodDescription> mdata) {
        this.mContent = mContent;
        this.mdata = mdata;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_list,parent,false);
        ViewHolder holder = new ViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {

        holder.imageName.setText(mdata.get(position).getName());
        holder.images.setImageResource(mdata.get(position).getImage());

        holder.parentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

              /* Intent intent = new Intent(mContent,foodDescription.class);
               intent.putExtra("orange",mdata.get(position).getName());
               intent.putExtra("food picture",mdata.get(position).getImage());
               mContent.startActivity(intent);*/


            }
        });
    }

    @Override
    public int getItemCount() {
        return mdata.size();
    }

    public class  ViewHolder extends RecyclerView.ViewHolder{
        TextView imageName;
        RelativeLayout parentLayout;
        CircleImageView images;
        protected ViewHolder(View itemView){
            super(itemView);
            images = itemView.findViewById(R.id.image);
            imageName = itemView.findViewById(R.id.image_name);
            parentLayout= itemView.findViewById(R.id.parent_layout);
         }

    }


}
