package com.example.ciscoproject.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ciscoproject.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SchemeCatergoryFragment extends Fragment {
    private RecyclerView schemescategories;


    public SchemeCatergoryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View output =inflater.inflate(R.layout.fragment_scheme_catergory, container, false);
        schemescategories=output.findViewById(R.id.schemescategories);

        return  output;
    }

}
