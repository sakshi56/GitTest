package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;
public class MainActivity extends AppCompatActivity {
//    private int[] images;

    public List<Hotel> hotelist = new ArrayList<>();
    //    private RecyclerView recyclerView;
    private ListAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView list = (RecyclerView) findViewById(R.id.recycler);
        mAdapter = new ListAdapter(this,hotelist);

//        list.setHasFixedSize(true);
        list.setLayoutManager(new LinearLayoutManager(this));

//        images = new int[]{R.drawable.cdv, R.drawable.cferv, R.drawable.fec, R.drawable.images, R.drawable.imefages, R.drawable.index, R.drawable.vdvc};
        prepareData();
        mAdapter.setData(hotelist);
        list.setAdapter(mAdapter);

//

        //String[] hotels={"Hotel V.W kenyan","Hotel meera","Hotel Mayura","Hotel Sukhsagar","Hotel celebration","Hotel aditya","Hotel HariRaj"};

        //String[] hotelsDesc={"Located on raipur VIP road","On jaistambh chowk","On VIP road","G.E road","new Raipur","fafadeeh"};

        //list.setAdapter(new ListAdapter(hotels));

        //
//        list.setAdapter(new ListAdapter(this,hotelist));




    }

    private void prepareData() {
        Hotel hotel = new Hotel( R.drawable.images,"Hotel V.W kenyan", "Located on raipur VIP road");
        hotelist.add(hotel);

        hotel = new Hotel(R.drawable.cdv,"Hotel Mayura", "On jaistambh chowk");
        hotelist.add(hotel);

        hotel = new Hotel(R.drawable.cferv,"Hotel Sukhsagar", "On GE road");
        hotelist.add(hotel);

        hotel = new Hotel(R.drawable.fec,"Hotel celebration", "On VIP road");
        hotelist.add(hotel);

        hotel = new Hotel(R.drawable.vdvc,"Hotel Meera", "On VIP road");
        hotelist.add(hotel);

        hotel = new Hotel( R.drawable.imefages,"Hotel Aditya", "On new Raipur");
        hotelist.add(hotel);
        hotel = new Hotel(R.drawable.vdvc,getString(R.string.abc), "At Bhilai");
        hotelist.add(hotel);
    }
}