package com.tamim.myportfolioapps.cvForm;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.tamim.myportfolioapps.R;

import java.util.List;

public class cv_adapter extends RecyclerView.Adapter<cv_adapter.cv_viewHolder> {
    List<cv_item> mdata;

    public cv_adapter(List<cv_item> mdata) {
        this.mdata = mdata;
    }


    @NonNull
    @Override
    public cv_viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cv, parent, false);
        return new cv_viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull cv_viewHolder holder, int position) {
        holder.tvTitle.setText(mdata.get(position).getTitle());
        holder.tvDescription.setText(mdata.get(position).getDescription());
    }

    @Override
    public int getItemCount() {
        return mdata.size();
    }

    public class cv_viewHolder extends RecyclerView.ViewHolder {
        TextView tvTitle, tvDescription;

        public cv_viewHolder(@NonNull View itemView) {
            super(itemView);
            tvTitle = itemView.findViewById(R.id.cv_title);
            tvDescription = itemView.findViewById(R.id.cv_description);
        }
    }
}
