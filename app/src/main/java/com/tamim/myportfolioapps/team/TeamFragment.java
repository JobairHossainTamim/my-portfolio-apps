package com.tamim.myportfolioapps.team;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.tamim.myportfolioapps.R;

import java.util.ArrayList;
import java.util.List;

public class TeamFragment extends Fragment {
    View view;
    RecyclerView RvTeam;
    TeamAdapter adapter;
    List<TeamItem> mdata;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_team, container, false);
        RvTeam = view.findViewById(R.id.rv_team);

        TeamItem item = new TeamItem("Jobair Hossain Tamim", getString(R.string.Lorem_Text2), R.drawable.me);
        TeamItem item2 = new TeamItem("Abdul Kader", getString(R.string.Lorem_Text2), R.drawable.raihan);
        // TeamItem item3 = new TeamItem("Mehrab Hossain", getString(R.string.Lorem_Text2), R.drawable.sami);
        TeamItem item4 = new TeamItem("Jobair Hossain (Tamim)", getString(R.string.Lorem_Text2), R.drawable.personal);
        mdata = new ArrayList<>();
        mdata.add(item);
        mdata.add(item2);
        mdata.add(item4);
        //   mdata.add(item3);
        RvTeam.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter = new TeamAdapter(mdata);
        RvTeam.setAdapter(adapter);
        return view;
    }
}
