package com.tamim.myportfolioapps.team;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.tamim.myportfolioapps.R;

import java.util.List;

public class TeamAdapter extends RecyclerView.Adapter<TeamAdapter.TeamViewHolder> {

    List<TeamItem> mdata;

    public TeamAdapter(List<TeamItem> mdata) {
        this.mdata = mdata;
    }

    @NonNull
    @Override
    public TeamViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_team, parent, false);
        return new TeamViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TeamViewHolder holder, int position) {
        holder.tv_name.setText(mdata.get(position).getName());
        holder.tv_data.setText(mdata.get(position).getDescription());
        holder.img.setImageResource(mdata.get(position).getImg());

    }

    @Override
    public int getItemCount() {
        return mdata.size();
    }

    public class TeamViewHolder extends RecyclerView.ViewHolder {
        TextView tv_name, tv_data;
        ImageView img;

        public TeamViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_name = itemView.findViewById(R.id.team_item_name);
            tv_data = itemView.findViewById(R.id.team_item_desc);
            img = itemView.findViewById(R.id.team_item_img);

        }
    }
}
