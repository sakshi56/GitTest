package com.example.myapplication;

import android.content.Context;
import android.location.Address;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import static android.widget.Toast.LENGTH_SHORT;


public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ListHolder> {

    private final Context context;
    public List<Hotel> hotellist;

    public void setData(List<Hotel> hotelist) {
        this.hotellist=hotelist;
//        this.context=context;
    }


    public  class ListHolder extends RecyclerView.ViewHolder{
        ImageView imgView;
        TextView name,address;

        public ListHolder(View v){
            super(v);
            imgView=(ImageView) v.findViewById(R.id.imgView);
            name=(TextView) v.findViewById(R.id.txtView1);
            address =(TextView) v.findViewById(R.id.txtView2);
        }



    }
    public ListAdapter(Context context, List<Hotel> hotelList) {

        this.context=context;
        this.hotellist= hotellist;
    }

    @Override
    public ListHolder onCreateViewHolder(ViewGroup parent, int viewType){
        LayoutInflater inflater= LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.list_item_layout,parent,false);
//        ListHolder listHolder=new ListHolder(view);
        return new ListHolder(view);

    }

    @Override
    public void onBindViewHolder(ListHolder listholder,int position){
////        int image_id=images[position];
//String title=data[position];
////holder.imgView.setImageResource(image_id);
//holder.txtView.setText(title);

        Hotel hotel = hotellist.get(position);
        listholder.imgView.setImageDrawable(context.getResources().getDrawable(hotel.getImage()));
        listholder.name.setText(hotel.getData());
        listholder.address.setText(hotel.getDesc());
//

    }
    @Override
    public int getItemCount(){
        final int size = hotellist.size();

        return size;


    }

}
