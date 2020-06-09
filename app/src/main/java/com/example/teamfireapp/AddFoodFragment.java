package com.example.teamfireapp;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class AddFoodFragment extends Fragment {
    private RecyclerView recyclerView,recyclerView1,recyclerView2,recyclerView3;
    private ArrayList<foodDescription> mNamesF;

    private ArrayList<foodDescription> mNamesM;

    private ArrayList<foodDescription> mNamesV;


    private Context mContext;

    View  v;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_all_food_list, container, false);
        recyclerView1 =v.findViewById(R.id.list_all_fruit);
        RecyclerViewAdapter adapterF = new RecyclerViewAdapter(mContext,mNamesF);
        recyclerView1.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView1.setAdapter(adapterF);

        recyclerView2 =v.findViewById(R.id.list_all_meat);
        RecyclerViewAdapter adapterM = new RecyclerViewAdapter(mContext,mNamesM);
        recyclerView2.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView2.setAdapter(adapterM);

        recyclerView3 =v.findViewById(R.id.list_all_veg);
        RecyclerViewAdapter adapterV = new RecyclerViewAdapter(mContext,mNamesV);
        recyclerView3.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView3.setAdapter(adapterV);



        return v;
    }

    public AddFoodFragment () {

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mNamesF = new ArrayList<>();
        mNamesM = new ArrayList<>();
        //fruit list
        mNamesV = new ArrayList<>();
        //fruit list
        mNamesF.add(new foodDescription("Oranges",R.drawable.oranges));
        mNamesF.add(new foodDescription("Apple",R.drawable.apple));
        mNamesF.add(new foodDescription("Bananas",R.drawable.babanas));
        mNamesF.add(new foodDescription("Strawberry",R.drawable.strawberry));
        mNamesF.add(new foodDescription("Oranges",R.drawable.oranges));

        //meat and fish list
        mNamesM.add(new foodDescription("salmon fish",R.drawable.fish));
        mNamesM.add(new foodDescription("beef",R.drawable.beef));
        mNamesM.add(new foodDescription("ham",R.drawable.ham));
        mNamesM.add(new foodDescription("pork",R.drawable.pork));


        //veg list
        mNamesV.add(new foodDescription("potato",R.drawable.veg_potato));
        mNamesV.add(new foodDescription("tomato",R.drawable.veg_tomato));
        mNamesV.add(new foodDescription("lettuce",R.drawable.veg_lettuce));






    }


}
