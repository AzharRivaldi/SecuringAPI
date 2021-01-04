package com.azhar.secureapi;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class ItemHolder extends RecyclerView.ViewHolder {

    public TextView tv_name, tv_version, tv_api_level;

    public ItemHolder(View view) {
        super(view);

        tv_name = view.findViewById(R.id.tv_name);
        tv_version = view.findViewById(R.id.tv_version);
        tv_api_level = view.findViewById(R.id.tv_api_level);

    }
}
