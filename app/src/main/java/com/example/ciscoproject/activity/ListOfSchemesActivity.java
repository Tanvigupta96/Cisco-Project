package com.example.ciscoproject.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import com.example.ciscoproject.ClickListeners.SchemeClickListener;
import com.example.ciscoproject.R;
import com.example.ciscoproject.adapter.ListOfSchemesAdapter;
import com.example.ciscoproject.model.Gender;
import com.example.ciscoproject.model.IncomeType;
import com.example.ciscoproject.model.ResidentType;
import com.example.ciscoproject.model.Scheme;
import com.example.ciscoproject.model.SchemeCategory;
import java.util.ArrayList;
import java.util.List;

public class ListOfSchemesActivity extends AppCompatActivity {
    private Intent intent;
    private SchemeCategory schemeCategory;
    private Toolbar toolbar;
    private RecyclerView listrecycleview;
    private ArrayList<Scheme> schemes = new ArrayList<>();
    private ListOfSchemesAdapter adapter;
    private Spinner spinner1, spinner2, spinner3;
    private Gender selectedGender;
    private IncomeType selectedIncomeType;
    private ResidentType selectedResidentType;

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_schemes);

        intent = getIntent();

        schemeCategory = intent.getParcelableExtra("category");
        toolbar = findViewById(R.id.toolbar);
        spinner1 = findViewById(R.id.spinner1);
        spinner2 = findViewById(R.id.spinner2);
        spinner3 = findViewById(R.id.spinner3);
        setSupportActionBar(toolbar);

        listrecycleview = findViewById(R.id.listrecycleview);

        getSupportActionBar().setTitle(schemeCategory.getTitle());

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        getSupportActionBar().setDisplayShowHomeEnabled(true);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {

                finish();
            }
        });

        final String[] genderarray = new String[] {
            "ALL", "MALE", "FEMALE"
        };

        final String[] residenttypearray = new String[] {
            "ALL", "RURAL", "URBAN", "SEMI-URBAN"
        };

        final String[] incomearray = new String[] {
            "ALL", "ZERO", "LOW", "HIGH", "MEDIUM"
        };

        selectedGender = Gender.ALL;
        selectedIncomeType = IncomeType.ALL;
        selectedResidentType = ResidentType.ALL;

        ArrayAdapter<String> adapter1 =
            new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_spinner_item,
                genderarray);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter1);

        ArrayAdapter<String> adapter2 =
            new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_spinner_item,
                residenttypearray);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter2);

        ArrayAdapter<String> adapter3 =
            new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_spinner_item,
                incomearray);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner3.setAdapter(adapter3);

        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String selectedItem = genderarray[i];
                if (selectedItem.equals("ALL")) {
                    selectedGender = Gender.ALL;
                } else if (selectedItem.equals("MALE")) {
                    selectedGender = Gender.MALE;
                } else if (selectedItem.equals("FEMALE")) {
                    selectedGender = Gender.FEMALE;
                }
                setListData(selectedGender, selectedIncomeType, selectedResidentType);
            }

            @Override public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String selectedItem = residenttypearray[i];
                if (selectedItem.equals("ALL")) {
                    selectedResidentType = ResidentType.ALL;
                } else if (selectedItem.equals("URBAN")) {
                    selectedResidentType = ResidentType.URBAN;
                } else if (selectedItem.equals("RURAL")) {
                    selectedResidentType = ResidentType.RURAL;
                } else if (selectedItem.equals("SEMI-URBAN")) {
                    selectedResidentType = ResidentType.SEMI_URBAN;
                }
                setListData(selectedGender, selectedIncomeType, selectedResidentType);
            }

            @Override public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        spinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String selectedItem = incomearray[i];
                if (selectedItem.equals("ALL")) {
                    selectedIncomeType = IncomeType.ALL;
                } else if (selectedItem.equals("ZERO")) {
                    selectedIncomeType = IncomeType.ZERO;
                } else if (selectedItem.equals("LOW")) {
                    selectedIncomeType = IncomeType.LOW;
                } else if (selectedItem.equals("HIGH")) {
                    selectedIncomeType = IncomeType.HIGH;
                } else if (selectedItem.equals("MEDIUM")) {
                    selectedIncomeType = IncomeType.MEDIUM;
                }
                setListData(selectedGender, selectedIncomeType, selectedResidentType);
            }

            @Override public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        adapter = new ListOfSchemesAdapter(getApplicationContext(), schemes, new SchemeClickListener() {
            @Override public void onSchemeClick(Scheme scheme) {
                Intent intent = new Intent(getApplicationContext(), SchemeDetailActivity.class);
                intent.putExtra("scheme", scheme);
                startActivity(intent);
            }
        });
        LinearLayoutManager linearLayoutManager =
            new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false);
        listrecycleview.setLayoutManager(linearLayoutManager);
        listrecycleview.setItemAnimator(new DefaultItemAnimator());

        setListData(selectedGender, selectedIncomeType, selectedResidentType);
        listrecycleview.setAdapter(adapter);
    }

    private void setListData(Gender selectedGender, IncomeType selectedIncomeType,
        ResidentType selectedResidentType) {
        this.schemes.clear();
        List<Scheme> schemes = new ArrayList<>(schemeCategory.getSchemes());
        if (selectedGender == Gender.ALL
            && selectedIncomeType == IncomeType.ALL
            && selectedResidentType == ResidentType.ALL) {
            this.schemes.addAll(schemes);
        } else {
            for (Scheme scheme : schemes) {
                if (selectedResidentType == ResidentType.ALL
                    && selectedIncomeType == IncomeType.ALL
                    && scheme.getGender() == selectedGender) {
                    if (!this.schemes.contains(scheme)) {
                        this.schemes.add(scheme);
                    }
                }
                else if (selectedGender == Gender.ALL
                    && selectedIncomeType == IncomeType.ALL
                    && scheme.getResidentType() == selectedResidentType) {
                    if (!this.schemes.contains(scheme)) {
                        this.schemes.add(scheme);
                    }
                }
                else if (selectedGender == Gender.ALL
                    && selectedResidentType == ResidentType.ALL
                    && scheme.getIncomeType() == selectedIncomeType) {
                    if (!this.schemes.contains(scheme)) {
                        this.schemes.add(scheme);
                    }
                }
                else if (selectedGender == Gender.ALL
                    && scheme.getIncomeType() == selectedIncomeType
                    && scheme.getResidentType() == selectedResidentType) {
                    if (!this.schemes.contains(scheme)) {
                        this.schemes.add(scheme);
                    }
                }else if (selectedIncomeType == IncomeType.ALL
                    && scheme.getGender() == selectedGender
                    && scheme.getResidentType() == selectedResidentType) {
                    if (!this.schemes.contains(scheme)) {
                        this.schemes.add(scheme);
                    }
                }
                else if (selectedResidentType == ResidentType.ALL
                    && scheme.getGender() == selectedGender
                    && scheme.getIncomeType() == selectedIncomeType) {
                    if (!this.schemes.contains(scheme)) {
                        this.schemes.add(scheme);
                    }
                }
            }
        }
        adapter.notifyDataSetChanged();
    }
}
