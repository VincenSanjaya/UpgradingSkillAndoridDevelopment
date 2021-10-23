package com.example.tugaskaksarahh;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterMakanan extends RecyclerView.Adapter<AdapterMakanan.OrangViewHolder> {

    private ArrayList<ModelMakanan> datalist;

    public AdapterMakanan(ArrayList<ModelMakanan> datalist) {
        this.datalist = datalist;
    }

    @Override
    public AdapterMakanan.OrangViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.listmakanan, parent, false);
        return new OrangViewHolder(view);
    }

    @Override
    public void onBindViewHolder(AdapterMakanan.OrangViewHolder holder, int position) {
        holder.nama.setText(datalist.get(position).getNama());
        holder.desc.setText(datalist.get(position).getDesc());
        holder.rate.setText(datalist.get(position).getRate());
    }

    @Override
    public int getItemCount() {
        return (datalist != null) ? datalist.size() : 0;
    }

    public class OrangViewHolder extends RecyclerView.ViewHolder {
        TextView nama, desc, rate;
        public OrangViewHolder(@NonNull View itemView) {
            super(itemView);

            nama =itemView.findViewById(R.id.tvnama);
            desc =itemView.findViewById(R.id.tvdesc);
            rate =itemView.findViewById(R.id.tvrate);
        }
    }
}