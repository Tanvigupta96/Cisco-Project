package com.example.ciscoproject.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ciscoproject.R;
import com.example.ciscoproject.adapter.SchemesCatergoryAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class ChoosenFragment extends Fragment {
    private RecyclerView choosensector;
    private SchemesCatergoryAdapter adapter;
    


    public ChoosenFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View output= inflater.inflate(R.layout.fragment_choosen, container, false);
        choosensector=output.findViewById(R.id.choosensector);

        
        
        return output;
    }

}
