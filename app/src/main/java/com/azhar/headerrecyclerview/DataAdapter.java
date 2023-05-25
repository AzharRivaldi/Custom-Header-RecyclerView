package com.azhar.headerrecyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

/**
 * Created by Azhar Rivaldi on 06-04-2023
 * Youtube Channel : https://bit.ly/2PJMowZ
 * Github : https://github.com/AzharRivaldi
 * Twitter : https://twitter.com/azharrvldi_
 * Instagram : https://www.instagram.com/azhardvls_
 * LinkedIn : https://www.linkedin.com/in/azhar-rivaldi
 */

public class DataAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private final ArrayList<TypeListItem> items;

    public DataAdapter(ArrayList<TypeListItem> items) {
        this.items = items;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (viewType == TypeListItem.TYPE_HEADER) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_header, parent, false);
            return new VHHeader(view);
        } else if (viewType == TypeListItem.TYPE_ITEM) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_data, parent, false);
            return new VHItem(view);
        }
        throw new RuntimeException("there is no type that matches the type " + viewType + " + make sure your using types correctly");
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof VHHeader) {
            ModelHeader modelHeader = (ModelHeader) items.get(position);
            VHHeader VHheader = (VHHeader) holder;
            VHheader.tvHeader.setText(modelHeader.getHeader());
        } else if (holder instanceof VHItem) {
            ModelItem person = (ModelItem) items.get(position);
            VHItem VHitem = (VHItem) holder;
            VHitem.tvItem.setText(person.getItem());
        }
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    @Override
    public int getItemViewType(int position) {
        return items.get(position).getItemType();
    }

    static class VHHeader extends RecyclerView.ViewHolder {
        TextView tvHeader;

        public VHHeader(View itemView) {
            super(itemView);
            this.tvHeader = itemView.findViewById(R.id.tvHeader);
        }
    }

    static class VHItem extends RecyclerView.ViewHolder {
        TextView tvItem;

        public VHItem(View itemView) {
            super(itemView);
            this.tvItem = itemView.findViewById(R.id.tvItem);
        }
    }

}
