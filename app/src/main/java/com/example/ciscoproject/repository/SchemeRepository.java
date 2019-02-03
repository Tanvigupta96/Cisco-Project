package com.example.ciscoproject.repository;

import com.example.ciscoproject.model.Gender;
import com.example.ciscoproject.model.IncomeType;
import com.example.ciscoproject.model.ResidentType;
import com.example.ciscoproject.model.Scheme;
import com.example.ciscoproject.model.SchemeCategory;

import java.util.ArrayList;

public class SchemeRepository {

    public static ArrayList<SchemeCategory> getSchemeCategories(){
        ArrayList<SchemeCategory> categories=new ArrayList<>();
        categories.add(getCommunicationSchemes());
        return  categories;
    }

    private static SchemeCategory getCommunicationSchemes(){
        ArrayList<Scheme> schemes=new ArrayList<>();
        schemes.add(new Scheme("R & D Funding Scheme","bla bla","", Gender.MALE, IncomeType.ALL, ResidentType.RURAL));

        SchemeCategory schemeCategory=new SchemeCategory("Communication & IT Sector",0,schemes);
        return schemeCategory;
    }
}
