package com.example.recyclerviewtoastactivity.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewtoastactivity.ItemClickLister;
import com.example.recyclerviewtoastactivity.R;
import com.example.recyclerviewtoastactivity.model.FoodModel;

import java.util.List;

public class MyCustomAdapter  extends RecyclerView.Adapter<MyCustomAdapter.FoodViewHolder> {

    List<FoodModel> foodModelList;

    ItemClickLister itemClickLister;

    public void setClickListner(ItemClickLister itemClickLister) {
        this.itemClickLister = itemClickLister;
    }

    public MyCustomAdapter(List<FoodModel> foodModelList) {
        this.foodModelList = foodModelList;
    }


    @NonNull
    @Override
    public MyCustomAdapter.FoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list,parent,false);

        return new FoodViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyCustomAdapter.FoodViewHolder holder, int position) {

        FoodModel foodModel = foodModelList.get(position);

        holder.desc.setText(foodModel.getDescription());
        holder.name.setText(foodModel.getName());
        holder.foodImage.setImageResource(foodModel.getImage());

    }

    @Override
    public int getItemCount() {
        return foodModelList.size();
    }


    public  class FoodViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView name , desc;
        ImageView foodImage;

        public FoodViewHolder(@NonNull View itemView) {
            super(itemView);

            foodImage = itemView.findViewById(R.id.foodimage);
            name = itemView.findViewById(R.id.foodname);
            desc = itemView.findViewById(R.id.foodDesc);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {

            if(itemClickLister != null){

                itemClickLister.onClick(v, getAdapterPosition());
            }
        }
    }
}
