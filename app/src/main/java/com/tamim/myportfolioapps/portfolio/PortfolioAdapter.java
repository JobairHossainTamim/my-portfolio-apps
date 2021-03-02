package com.tamim.myportfolioapps.portfolio;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.tamim.myportfolioapps.R;

import java.util.List;

public class PortfolioAdapter extends RecyclerView.Adapter<PortfolioAdapter.PortfolioViewHolder> {
    List<PortfolioItem> mdata;
    PortfolioCallback listener;

    public PortfolioAdapter(List<PortfolioItem> mdata, PortfolioCallback listener) {

        this.mdata = mdata;
        this.listener = listener;
    }

    @NonNull
    @Override
    public PortfolioViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_portfolio, parent, false);
        return new PortfolioViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PortfolioViewHolder holder, int position) {
        holder.tv_position.setText(String.valueOf(position));
    }

    @Override
    public int getItemCount() {
        return mdata.size();
    }

    public class PortfolioViewHolder extends RecyclerView.ViewHolder {
        TextView tv_position;

        public PortfolioViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_position = itemView.findViewById(R.id.item_port_text);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onPortfolioItemClick(getAdapterPosition());
                }
            });
        }
    }
}
