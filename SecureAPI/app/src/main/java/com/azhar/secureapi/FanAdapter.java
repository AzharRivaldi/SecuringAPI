package com.azhar.secureapi;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class FanAdapter extends RecyclerView.Adapter<ItemHolder> {

    public List<ModelFan> androidList;

    public FanAdapter(List<ModelFan> android) {
        this.androidList = android;
    }

    @Override
    public ItemHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item, viewGroup, false);
        return new ItemHolder(view);
    }

    @Override
    public void onBindViewHolder(ItemHolder viewHolder, int i) {

        viewHolder.tv_name.setText(androidList.get(i).getName());
        viewHolder.tv_version.setText(androidList.get(i).getVer());
        viewHolder.tv_api_level.setText(androidList.get(i).getApi());
    }

    @Override
    public int getItemCount() {
        return androidList.size();
    }

}