package com.example.recyclerviewtoastactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.recyclerviewtoastactivity.adapter.MyCustomAdapter;
import com.example.recyclerviewtoastactivity.model.FoodModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements ItemClickLister {

    RecyclerView foodRecyclerView;

    List<FoodModel> foodModelList;

    MyCustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        foodRecyclerView = findViewById(R.id.recycleView);

        foodModelList = new ArrayList<>();

        FoodModel foodModel = new FoodModel("A","sbcsbdkjb", R.drawable.food3);
        FoodModel foodModel2 = new FoodModel("B","sbcsbdkjb", R.drawable.food3);
        FoodModel foodModel3 = new FoodModel("A","sbcsbdkjb", R.drawable.food3);
        FoodModel foodModel4 = new FoodModel("C","sbcsbdkjb", R.drawable.food3);
        FoodModel foodModel5 = new FoodModel("B","sbcsbdkjb", R.drawable.food3);
        FoodModel foodModel6 = new FoodModel("C","sbcsbdkjb", R.drawable.food3);
        FoodModel foodModel7 = new FoodModel("A","sbcsbdkjb", R.drawable.food3);
        FoodModel foodModel8 = new FoodModel("A","sbcsbdkjb", R.drawable.food3);
        FoodModel foodModel9 = new FoodModel("A","sbcsbdkjb", R.drawable.food3);

        foodModelList.add(foodModel);
        foodModelList.add(foodModel2);
        foodModelList.add(foodModel3);
        foodModelList.add(foodModel4);
        foodModelList.add(foodModel5);
        foodModelList.add(foodModel6);
        foodModelList.add(foodModel7);
        foodModelList.add(foodModel8);
        foodModelList.add(foodModel9);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        foodRecyclerView.setLayoutManager(layoutManager);

        adapter.setClickListner(this);

    }

    @Override
    public void onClick(View v, int position) {

        Toast.makeText(this, "You Select " + foodModelList.get(position).getName() , Toast.LENGTH_SHORT).show();
    }
}
