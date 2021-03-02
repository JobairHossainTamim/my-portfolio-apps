package com.tamim.myportfolioapps.portfolio;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.tamim.myportfolioapps.R;

import java.util.ArrayList;
import java.util.List;

public class PortfolioFragment extends Fragment implements PortfolioCallback {
    View view;
    List<PortfolioItem> mdata;
    RecyclerView RvPf;
    PortfolioAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_portfolio, container, false);
        RvPf = view.findViewById(R.id.rv_portfolio);
        mdata = new ArrayList<>();
        //create Item
        mdata.add(new PortfolioItem(R.drawable.pp));
        mdata.add(new PortfolioItem(R.drawable.p1));
        mdata.add(new PortfolioItem(R.drawable.p2));
        mdata.add(new PortfolioItem(R.drawable.p3));
        mdata.add(new PortfolioItem(R.drawable.p4));
        mdata.add(new PortfolioItem(R.drawable.p5));
        mdata.add(new PortfolioItem(R.drawable.p6));
        mdata.add(new PortfolioItem(R.drawable.p7));
        mdata.add(new PortfolioItem(R.drawable.p8));

        adapter = new PortfolioAdapter(mdata, this);
        //set up Recyclear view as grid
        RvPf.setLayoutManager(new GridLayoutManager(getActivity(), 3));
        RvPf.setAdapter(adapter);
        return view;
    }

    @Override
    public void onPortfolioItemClick(int pos) {

        Portfolio_Fragment_details portfolio_fragment_details = new Portfolio_Fragment_details();
        Bundle bundle = new Bundle();
        bundle.putSerializable("object",mdata.get(pos));
        portfolio_fragment_details.setArguments(bundle);
        portfolio_fragment_details.show(getActivity().getSupportFragmentManager(),"tagname");
    }
}
