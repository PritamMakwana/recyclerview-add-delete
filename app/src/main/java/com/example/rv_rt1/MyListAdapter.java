package com.example.rv_rt1;

import android.icu.text.IDNA;
import android.net.wifi.ScanResult;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyListAdapter extends RecyclerView.Adapter<MyListAdapter.ViewHolder> {
     public List<MyListData> listData;
    OnCountryClickListener onCountryClickListener;

    public MyListAdapter(List<MyListData> listData, OnCountryClickListener onCountryClickListener) {
        this.listData=listData;
        this.onCountryClickListener=onCountryClickListener;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View view=layoutInflater.inflate(R.layout.list_itam,parent,false);
        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }


    public interface OnCountryClickListener {
        void onCountryClick(int cphoto,String cname,String cinfo);
    }
    @Override
    public  void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final MyListData myListData=listData.get(position);
        holder.photo.setImageResource(listData.get(position).getPhoto());
        holder.title.setText(listData.get(position).getTitle());
        holder.detalis.setText(listData.get(position).getDecription());

       // final int currentPosition= position;
        final MyListData currentObject = listData.get(position);
        holder.add.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(),"Same Country "+(position)+"."+listData.get(position).getTitle()+" ADD ",Toast.LENGTH_LONG).show();

                addItem(position,currentObject);

            }
        });
        holder.delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(),"Country is "+(position)+"."+listData.get(position).getTitle()+" Delete ",Toast.LENGTH_LONG).show();
                removeItem(position);

            }


        });
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onCountryClickListener.onCountryClick(listData.get(position).getPhoto(),listData.get(position).getTitle(),listData.get(position).getDecription());
            }
        });


    }

    public void addItem(int position, MyListData currentObject) {
        listData.add(position,currentObject);
        notifyItemInserted(position);
        notifyItemRangeChanged(position,listData.size());
        //notifyDataSetChanged();

    }

    public void removeItem(int position) {
        listData.remove(position);
        notifyItemRemoved(position);
        notifyItemRangeChanged(position,listData.size());
        //notifyDataSetChanged();
    }


    @Override
    public int getItemCount() {
        return listData.size();




    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView photo;
        TextView title,detalis;
        Button delete,add;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            photo=itemView.findViewById(R.id.img_1);
            title=itemView.findViewById(R.id.title_1);
            detalis=itemView.findViewById(R.id.info_1);
            add=itemView.findViewById(R.id.btn_add);
            delete=itemView.findViewById(R.id.btn_del);

        }



    }
}
