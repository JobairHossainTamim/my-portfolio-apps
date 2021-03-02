package com.tamim.myportfolioapps.cvForm;

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

public class CvFrgment extends Fragment {
    RecyclerView RvCv;
    cv_adapter adapter;
    View view;
    List<cv_item> items;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_cv, container, false);
        RvCv = view.findViewById(R.id.recyclerview_cv);

        //create a list of cv item
        items = new ArrayList<>();
        items.add(new cv_item("20 April 2013", getString(R.string.Lorem_Text2)));
        items.add(new cv_item("18 April 2015", getString(R.string.Lorem_Text2)));
        items.add(new cv_item("18 May 2018", getString(R.string.Lorem_Text2)));
        items.add(new cv_item("18 June 2020", getString(R.string.Lorem_Text2)));
        adapter = new cv_adapter(items);
        RvCv.setLayoutManager(new LinearLayoutManager(getContext()));
        RvCv.setAdapter(adapter);

        return view;
    }

}
