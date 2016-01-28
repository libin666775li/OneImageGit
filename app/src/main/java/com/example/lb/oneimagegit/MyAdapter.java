package com.example.lb.oneimagegit;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import java.util.List;

/**
 * Created by lb on 2016/1/27.
 */
public class MyAdapter extends RecyclerView.Adapter {

    private List<String> mDummyStrings;
    private Context mContext;

    public MyAdapter(Context context, List<String> list) {
        mDummyStrings = list;
        mContext = context;
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.listview_cell, parent, false);
        ItemViewHolder vh = new ItemViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int position) {
        ItemViewHolder holder = (ItemViewHolder) viewHolder;
        String str = mDummyStrings.get(position);
        holder.mCellNumber.setText("" + position);
        holder.mCellText.setText(str);

    }

    @Override
    public int getItemCount() {
        return mDummyStrings.size();
    }

    public static class ItemViewHolder extends RecyclerView.ViewHolder {
        TextView mCellNumber;
        TextView mCellText;

        public ItemViewHolder(View itemView) {
            super(itemView);
            mCellNumber = (TextView) itemView.findViewById(R.id.cell_number);
            mCellText = (TextView) itemView.findViewById(R.id.cell_text);
        }
    }


}
