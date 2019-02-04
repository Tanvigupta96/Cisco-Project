package com.example.ciscoproject.fragments;


import android.content.Intent;
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

import com.example.ciscoproject.ClickListeners.SectorClickListener;
import com.example.ciscoproject.R;
import com.example.ciscoproject.activity.ListOfSchemesActivity;
import com.example.ciscoproject.adapter.SchemesCatergoryAdapter;
import com.example.ciscoproject.model.SchemeCategory;
import com.example.ciscoproject.repository.SchemeRepository;

import java.util.ArrayList;

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
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View output =inflater.inflate(R.layout.fragment_scheme_catergory, container, false);
        schemescategories=output.findViewById(R.id.schemescategories);
        String[] arraySpinner=new String[]{
              "All", "Communication & IT Sector","Commercial & Industrial Sector","Rural Development","Health & Family Welfare","Education","Transport","Agriculture","Water Resources"

        };



        spinner=output.findViewById(R.id.spinner);
        ArrayAdapter<String> adapter1=new ArrayAdapter<String>(getContext(),android.R.layout.simple_spinner_item,arraySpinner);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter1);
        spinner.setOnItemSelectedListener(this);
        adapter=new SchemesCatergoryAdapter(getContext(), schemeCategories, new SectorClickListener() {
            @Override
            public void onsectorclick(String title) {
                Intent intent=new Intent(getContext(), ListOfSchemesActivity.class);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });


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
            schemeCategories.clear();
            schemeCategories.add(SchemeRepository.getCommunicationSchemes());
            adapter.notifyDataSetChanged();

        }
        else if(selectedItem.equals("Commercial & Industrial Sector")){
            schemeCategories.clear();
            schemeCategories.add(SchemeRepository.getCommercialSchemes());
            adapter.notifyDataSetChanged();

        }
        else if(selectedItem.equals("Rural Development")){
            schemeCategories.clear();
            schemeCategories.add(SchemeRepository.getRuralDevelopmentSchemes());
            adapter.notifyDataSetChanged();

        }
        else if(selectedItem.equals("Health & Family Welfare")){
            schemeCategories.clear();
            schemeCategories.add(SchemeRepository.getHealthSchemes());
            adapter.notifyDataSetChanged();

        }
        else if(selectedItem.equals("Education")){
            schemeCategories.clear();
            schemeCategories.add(SchemeRepository.getEducationSchemes());
            adapter.notifyDataSetChanged();

        }
        else if(selectedItem.equals("Transport")){
            schemeCategories.clear();
            schemeCategories.add(SchemeRepository.getTransportSchemes());
            adapter.notifyDataSetChanged();

        }
        else if(selectedItem.equals("Agriculture")){
            schemeCategories.clear();
            schemeCategories.add(SchemeRepository.getAgricultureSchemes());
            adapter.notifyDataSetChanged();

        }
         else if(selectedItem.equals("Water Resources")){
            schemeCategories.clear();
            schemeCategories.add(SchemeRepository.getWaterResourcesSchemes());
            adapter.notifyDataSetChanged();

        }
         else if(selectedItem.equals("All")){
            schemeCategories.clear();
            schemeCategories.addAll(SchemeRepository.getSchemeCategories());
            adapter.notifyDataSetChanged();

        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
