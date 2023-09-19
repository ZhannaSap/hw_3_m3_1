package com.example.hw_3_m3_1;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class OnaA extends Fragment {
    private RecyclerView rv_food;
    private ArrayList<String> foodList = new ArrayList<>();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_ona_a, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rv_food = requireActivity().findViewById(R.id.rv_food);
        loadData();
        FoodAdapter adapter = new FoodAdapter(foodList);
        rv_food.setAdapter(adapter);
    }

    private void loadData() {
        foodList.add("Some food");
        foodList.add("Another food");
        foodList.add("Some food");
        foodList.add("Another food");
        foodList.add("Some food");
        foodList.add("Another food");
        foodList.add("Some food");
        foodList.add("Another food");
        foodList.add("Some food");
        foodList.add("Another food");
        foodList.add("Some food");
        foodList.add("Another food");
        foodList.add("Some food");
        foodList.add("Another food");
        foodList.add("Some food");
        foodList.add("Another food");
        foodList.add("Some food");
        foodList.add("Another food");
        foodList.add("Some food");
        foodList.add("Some food");
        foodList.add("Some food");
        foodList.add("Some food");
    }
}