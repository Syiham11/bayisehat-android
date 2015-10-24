package com.linkensky.bayisehat.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.linkensky.bayisehat.R;
import com.linkensky.bayisehat.data.Information;

import java.util.Collections;
import java.util.List;

/**
 * Created by setyo on 07/10/15.
 */
public class DrawerAdapter extends RecyclerView.Adapter<DrawerAdapter.Holder>{
    private final LayoutInflater inflater;
    List<Information> data = Collections.emptyList();

    public DrawerAdapter(Context context, List<Information> data){
        inflater = LayoutInflater.from(context);
        this.data = data;
    }
    @Override
    public Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.custom_row,parent, false);
        Holder holder = new Holder(view);
        return holder;

    }

    @Override
    public void onBindViewHolder(Holder holder, int position) {
        Information current = data.get(position);
        holder.title.setText(current.title);
//        holder.icon.setImageResource(current.iconId);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class Holder extends RecyclerView.ViewHolder{
        TextView title;
        ImageView icon;
        public Holder(View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.listText);
            icon = (ImageView) itemView.findViewById(R.id.icon);
        }
    }
}
