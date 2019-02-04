package com.example.ciscoproject.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.example.ciscoproject.R;
import com.example.ciscoproject.adapter.SchemesCatergoryAdapter;
import com.example.ciscoproject.model.SchemeCategory;
import com.example.ciscoproject.repository.SchemeRepository;

import java.util.ArrayList;
import java.util.Collections;

/**
 * A simple {@link Fragment} subclass.
 */
public class SchemeCatergoryFragment extends Fragment implements AdapterView.OnItemSelectedListener {
    private RecyclerView schemescategories;
    private SchemesCatergoryAdapter adapter;
    private ArrayList<SchemeCategory> schemeCategories=new ArrayList<>();
    private Spinner spinner;

    public SchemeCatergoryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View output =inflater.inflate(R.layout.fragment_scheme_catergory, container, false);
        schemescategories=output.findViewById(R.id.schemescategories);
        String[] arraySpinner=new String[]{
              "All", "Communication & IT Sector","Commercial & Industrial Sector","Rural Development","Health & Family Welfare","Education","Transport","Agricultire","Water Resources"

        };



        spinner=output.findViewById(R.id.spinner);
        ArrayAdapter<String> adapter1=new ArrayAdapter<String>(getContext(),android.R.layout.simple_spinner_item,arraySpinner);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter1);
        spinner.setOnItemSelectedListener(this);
        adapter=new SchemesCatergoryAdapter(getContext(),schemeCategories);


        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
        schemescategories.setLayoutManager(linearLayoutManager);
        schemescategories.setItemAnimator(new DefaultItemAnimator());

        schemeCategories.clear();
        schemeCategories.addAll(SchemeRepository.getSchemeCategories());
        Log.d("getcategories",SchemeRepository.getSchemeCategories()+"");
        adapter.notifyDataSetChanged();
        schemescategories.setAdapter(adapter);

        return  output;
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String selectedItem= parent.getItemAtPosition(position).toString();
        if(selectedItem.equals("Communication & IT Sector")){

        }
        else if(selectedItem.equals("commercial &Industrial Sector")){

        }
        else if(selectedItem.equals("Rural Development")){

        }
        else if(selectedItem.equals("Health & Family Welfare")){

        }
        else if(selectedItem.equals("Education")){

        }
        else if(selectedItem.equals("Transport")){

        }
        else if(selectedItem.equals("Agriculture")){

        }
        else if(selectedItem.equals("Water Resources")){

        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
