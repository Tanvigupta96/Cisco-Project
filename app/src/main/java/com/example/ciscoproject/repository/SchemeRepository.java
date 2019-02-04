package com.example.ciscoproject.repository;

import com.example.ciscoproject.R;
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
        categories.add(getCommercialSchemes());
        categories.add(getRuralDevelopmentSchemes());
        categories.add(getHealthSchemes());
        categories.add(getEducationSchemes());
        categories.add(getTransportSchemes());
        categories.add(getAgricultureSchemes());
        categories.add(getWaterResourcesSchemes());
        return  categories;
    }

    private static SchemeCategory getCommunicationSchemes(){
        ArrayList<Scheme> schemes=new ArrayList<>();

        schemes.add(new Scheme("IREDA Scheme For Discounting Energy Bills","It is proposed to provide bill discounting facility for the energy bills of indian Renewable Energy Development Agency(IREDA) borrowers which are pending for payment with utilities for upto 6 months",R.drawable.ireda,Gender.MALE, IncomeType.ALL, ResidentType.RURAL));
        schemes.add(new Scheme("Credit Enhancement Guarantee Scheme-An initiative of Ministry of Social Justice and Empowerment","To encourage and promote entrepreneurships among the Scheduled Castes who are oriented towards innovations and growth technologies by supporting the Bank and Financial Institutions in the form of Credit Enhancement Guarantee (minimum Rs.0.15 crore and maximum Rs.5.00 crore) against Working Capital Loans, Term Loans or Composite Terms Loans granted by MLIs to SC entrepreneurs.",R.drawable.cegs,Gender.ALL,IncomeType.HIGH,ResidentType.URBAN));
        schemes.add(new Scheme("Pradhan Mantri Mudra Yojana","MUDRA offers incentives through these interventions:\n" +
                ">Shishu: covering loans upto INR 50,000/-\n" +
                "> Kishor: covering loans above INR 50,000/- and upto INR 5 Lakhs\n" +
                "> Tarun: covering loans above INR 5 Lakhs and upto INR 10 Lakhs",R.drawable.pmmj,Gender.FEMALE,IncomeType.LOW,ResidentType.RURAL));
        SchemeCategory schemeCategory=new SchemeCategory("Communication & IT Sector", R.drawable.communication,schemes);

        return schemeCategory;
    }

    private static SchemeCategory getCommercialSchemes(){
        ArrayList<Scheme> schemes=new ArrayList<>();
        schemes.add(new Scheme("Pradhan Mantri Jan Dhan Yojana (PMJDY)","Hon’ble Prime Minister announced Pradhan Mantri Jan Dhan Yojana as the National Mission on Financial Inclusion in his Independence Day address on 15th August 2014, to ensure comprehensive financial inclusion of all the households in the country by providing universal access to banking facilities with at least one basic bank account to every household, financial literacy, access to credit, insurance and pension facility.",R.drawable.pmjy,Gender.ALL,IncomeType.LOW,ResidentType.RURAL));
        schemes.add(new Scheme("Prime Minister’s Employment Generation Programme (PMEGP)","The scheme is implemented by Khadi and Village Industries Commission (KVIC) functioning as the nodal agency at the national level. At the state level, the scheme is implemented through State KVIC Directorates, State Khadi and Village Industries Boards (KVIBs), District Industries Centres (DICs) and banks. In such cases KVIC routes government subsidy through designated banks for eventual disbursal to the beneficiaries / entrepreneurs directly into their bank accounts.",R.drawable.pmegs,Gender.ALL,IncomeType.LOW,ResidentType.RURAL));
        schemes.add(new Scheme("Coir Industry Technology Upgradation Scheme (CITUS)","A new component namely “Coir Industry Technology Upgradation Scheme (CITUS)” has been introduced replacing the earlier component i.e. “Development of Production Infrastructure” of Coir Vikas Yojana for giving away assistance to the entrepreneurs for procurement of eligible Plant & Machinery for modernization, upgradation and/or establishing a new unit on making application for the purpose to go for larger investment in the coir sector.",R.drawable.citus,Gender.ALL,IncomeType.ALL,ResidentType.SEMI_URBAN));
        SchemeCategory schemeCategory=new SchemeCategory("Commercial & Industrial Sector",R.drawable.commercial,schemes);

        return schemeCategory;
    }

    private static SchemeCategory getRuralDevelopmentSchemes(){
        ArrayList<Scheme> schemes=new ArrayList<>();
        schemes.add(new Scheme("Pradhan Mantri Gram Sadak Yojna","Rural Road Connectivity is not only a key component of Rural Development by promoting access to economic and social services and thereby generating increased agricultural incomes and productive employment opportunities in India, it is also as a result, a key ingredient in ensuring sustainable poverty reduction.",R.drawable.pmgsy,Gender.ALL,IncomeType.ALL,ResidentType.RURAL));
        schemes.add(new Scheme("Pradhan Mantri Awaas Yojna","Pradhan Mantri Awas Yojana (PMAY) is an initiative by Government of India in which affordable housing will be provided to the urban poor with a target of building 20 million affordable houses by 31 March 2022.",R.drawable.pmay,Gender.ALL,IncomeType.LOW,ResidentType.RURAL));
        schemes.add(new Scheme("Sansad Adarsh Gram Yojna","Sansad Adarsh Gram Yojana (SAGY) is a village development project launched by Government of India in October 2014, under which each Member of Parliament will take the responsibility of developing physical and institutional infrastructure in three villages by 2019.",R.drawable.sagy,Gender.ALL,IncomeType.ALL,ResidentType.RURAL));
        SchemeCategory schemeCategory=new SchemeCategory("Rural Development",R.drawable.ruraldevp,schemes);

        return schemeCategory;
    }

    private static SchemeCategory getHealthSchemes(){
        ArrayList<Scheme> schemes=new ArrayList<>();
        schemes.add(new Scheme("Pradhan Mantri Swasthya Suraksha Yojana(PMSSY)","The Pradhan Mantri Swasthya Suraksha Yojana (PMSSY) was announced in 2003 with objectives of correcting regional imbalances in the availability of affordable/ reliable tertiary healthcare services and also to augment facilities for quality medical education in the country.",R.drawable.pmssy,Gender.ALL,IncomeType.ALL,ResidentType.SEMI_URBAN));
        schemes.add(new Scheme("National Rural Health Mission(NRHM)","The National Rural Health Mission (NRHM) was launched on 12th April 2005, to provide accessible, affordable and quality health care to the rural population, especially the vulnerable groups.",R.drawable.nrhm,Gender.ALL,IncomeType.LOW,ResidentType.RURAL));
        schemes.add(new Scheme("Rashtriya Swasthya Bima Yojana","Rashtriya Swasthya Bima Yojana (RSBY) is a government-run health insurance programme for the Indian poor.It provides for cashless insurance for hospitalisation in public as well as private hospitals.",R.drawable.rsby,Gender.ALL,IncomeType.ALL,ResidentType.SEMI_URBAN));
        SchemeCategory schemeCategory=new SchemeCategory("Health & Family Welfare ",R.drawable.health,schemes);

        return schemeCategory;
    }

    private static SchemeCategory getEducationSchemes(){
        ArrayList<Scheme> schemes=new ArrayList<>();
        schemes.add(new Scheme("Sarva Shiksha Abhiyan", "Sarva Shiksha Abhiyan or SSA, is an Indian Government programme aimed at the universalisation of elementary education, the 86th Amendment to the Constitution of India making free and compulsory education to adults between the ages of 6 to 14(estimated to be 205 million children in 2001) a fundamental right. The programme was pioneered by former Indian Prime Minister Atal Bihari Vajpayee.))",R.drawable.ssa,Gender.ALL,IncomeType.LOW,ResidentType.RURAL));
        schemes.add(new Scheme("Mahila Samakhya Programme","Education will be used as an agent of basic change in the status of woman. In order to neutralise the accumulated distortions of the past, there will be a well-conceived edge in favour of women. The National Education System will play a positive, interventionist role in the empowerment of women. It will foster the development of new values through redesigned curricula, textbooks, the training and orientation of teachers, decision-makers and administrators, and the active involvement of educational institutions. This will be an act of faith and social engineering…” NPE, 1986",R.drawable.msp,Gender.FEMALE,IncomeType.ALL,ResidentType.SEMI_URBAN));
        schemes.add(new Scheme("Scheme to Provide Quality Education in Madrasas (SPQEM)","SPQEM seeks to bring about qualitative improvement in Madrasas to enable Muslim children attain standards of the national education system in formal education subjects. The salient features of SPQEM scheme are :\n" +
                "\n" +
                "To strengthen capacities in Madrasas for teaching of the formal curriculum subjects like Science, Mathematics, Language, Social Studies etc. through enhanced payment of teacher honorarium.\n" +
                "Training of such teachers every two years in new pedagogical practices.\n" +
                "Providing Science labs, Computer labs with annual maintenance costs in the secondary and higher secondary stage madrasas.\n" +
                "Provision of Science/Mathematics kits in primary/upper primary level madrassas.\n" +
                "Strengthening of libraries/book banks and providing teaching learning materials at all levels of madrasas.",R.drawable.spqem,Gender.ALL,IncomeType.LOW,ResidentType.SEMI_URBAN));
        schemes.add(new Scheme("Beti Bachao, Beti Padhao Yojana","\n" + "Beti Bachao, Beti Padhao (translation: Save the daughter, educate the daughter) is a campaign of the Government of India that aims to generate awareness and improve the efficiency of welfare services intended for girls. The scheme was launched with an initial funding of ₹100 crore (US$14 million).[1] It mainly targets the clusters in Uttar Pradesh, Haryana, Uttarakhand, Punjab, Bihar and Delhi.Launched\t22 January 2015; 4 years ago, It aims to address the issue of the declining child sex ratio image (CSR) and is a national initiative jointly run by the Ministry of Women and Child Development, the Ministry of Health and Family Welfare and the Ministry of Human Resource Development. It initially focused multi-sector action in 100 districts throughout the country where there was a low CSR.",R.drawable.bbbp,Gender.FEMALE,IncomeType.LOW,ResidentType.RURAL));
        SchemeCategory schemeCategory=new SchemeCategory("Education ",R.drawable.education,schemes);

        return schemeCategory;
    }

    private static SchemeCategory getTransportSchemes(){
        ArrayList<Scheme> schemes=new ArrayList<>();
        schemes.add(new Scheme("Green Urban Transport Scheme (GUTS)","On accounting the growing amount of air pollution in the India, particularly in major urban cities and towns, government of India plans to introduce a new scheme under which the air pollution caused due to the transportation would be reduced.",R.drawable.guts,Gender.ALL,IncomeType.ALL,ResidentType.SEMI_URBAN));
        schemes.add(new Scheme(" Transport Subsidy Scheme (TSS) ","Under the scheme, subsidy on the transport cost for transportation of raw material and finished goods to and from the location of the unit and the designated rail-head was reimbursed for a period of 5 years from the date of commencement of commercial production. For North Eastern states, subsidy is 90%. However, for the movement of goods within NER, the subsidy is 50% on finished goods and 90% on raw material.",R.drawable.tss,Gender.ALL,IncomeType.ALL,ResidentType.SEMI_URBAN));
        schemes.add(new Scheme("Public Bicycle-sharing scheme","A bicycle-sharing system, public bicycle system, or bike-share scheme, is a service in which bicycles are made available for shared use to individuals on a short term basis for a price or free. Many bike share systems allow people to borrow a bike from a \"dock\" and return it at another dock belonging to the same system. Docks are special bike racks that lock the bike, and only release it by computer control. The user enters payment information, and the computer unlocks a bike. The user returns the bike by placing it in the dock, which locks it in place. Other systems are dockless. For many systems, smartphone mapping apps show nearby available bikes and open docks.",R.drawable.pbss,Gender.ALL,IncomeType.LOW,ResidentType.URBAN));
        SchemeCategory schemeCategory=new SchemeCategory("Transport",R.drawable.transport,schemes);

        return schemeCategory;
    }

    private static SchemeCategory getAgricultureSchemes(){
        ArrayList<Scheme> schemes=new ArrayList<>();
        schemes.add(new Scheme("Government of India has introduced Green Revolution – Krishonnati Yojana for farmers in the year 2005. Krishonnati Yojana is a five-year agriculture sector umbrella programme. Cabinet Committee on Economic Affairs – CCEA has approved the continuation of 12th five year plan of Krishonnati Yojana in May 2018. This scheme will continue for a duration of 2017-2018 to 2019-2020. Green Revolution – Krishonnati Yojana","This scheme comprises of 11 schemes and mission under a single umbrella scheme. Government is planning to develop the agriculture and allied sector in a holistic & scientific manner further to increase the income of farmer by enhancing production, productivity and better returns on produce under this Krishonnati Yojana.",R.drawable.ky,Gender.MALE,IncomeType.LOW,ResidentType.RURAL));
        schemes.add(new Scheme("Pradhan Mantri Fasal Bima Yojana","The new Crop Insurance Scheme is in line with One Nation – One Scheme theme.  It incorporates the best features of all previous schemes and at the same time, all previous shortcomings / weaknesses have been removed. The PMFBY will replace the existing two schemes National Agricultural Insurance Scheme as well as the Modified NAIS.aims at To provide insurance coverage and financial support to the farmers in the event of failure of any of the notified crop as a result of natural calamities, pests & diseases.\n" +
                "To stabilise the income of farmers to ensure their continuance in farming.\n" +
                "To encourage farmers to adopt innovative and modern agricultural practices.\n" +
                "To ensure flow of credit to the agriculture sector.",R.drawable.pmfby,Gender.MALE,IncomeType.LOW,ResidentType.RURAL));
        schemes.add(new Scheme("Paramparagat Krishi Vikas Yojana","“Paramparagat Krishi Vikas Yojana” is an elaborated component of Soil Health Management (SHM) of major project National Mission of Sustainable Agriculture (NMSA). Under PKVY Organic farming is promoted through adoption of organic village by cluster approach and PGS certification. The scheme aims at Promotion of commercial organic production through certified organic farming.\n" +
                "The produce will be pesticide residue free and will contribute to improve the health of consumer.\n" +
                "It will raise farmer's income and create potential market for traders.\n" +
                "It will motivate the farmers for natural resource mobilization for input production.",R.drawable.pkvy,Gender.ALL,IncomeType.LOW,ResidentType.RURAL));
        SchemeCategory schemeCategory=new SchemeCategory("Agriculture",R.drawable.agriculture,schemes);

        return schemeCategory;
    }

    private static SchemeCategory getWaterResourcesSchemes(){
        ArrayList<Scheme> schemes=new ArrayList<>();
        schemes.add(new Scheme("National Mission for Clean Ganga","National Mission for Clean Ganga(NMCG) was registered as a society on 12th August 2011 under the Societies Registration Act 1860.It acted as implementation arm of National Ganga River Basin Authority(NGRBA) which was constituted under the provisions of the Environment (Protection) Act (EPA),1986. NGRBA has since been dissolved with effect from the 7th October 2016, consequent to constitution of National Council for Rejuvenation, Protection and Management of River Ganga.The Act envisages five tier structure at national, state and district level to take measures for prevention, control and abatement of environmental pollution in river Ganga and to ensure continuous adequate flow of water so as to rejuvenate the river Ganga",R.drawable.nmfcg,Gender.ALL,IncomeType.ALL,ResidentType.SEMI_URBAN));
        schemes.add(new Scheme("Swajal Scheme","Ministry of Drinking Water and Sanitation aims to provide every rural person with adequate safe water for drinking, cooking and other domestic basic needs on a sustainable basis. This basic requirement should meet minimum water quality standards and be readily and conveniently accessible at all times and in all situations. Ministry has initiated a pilot project in the name of “Swajal” that is designed as a demand driven and community centred program to provide sustainable access to drinking water to people in rural areas.Community–led drinking water projects to be called ‘Swajal’ aiming at providing sustainable and adequate drinking water in an integrated manner to the rural masses on pilot basis. It is envisaged that the State government in partnership with rural communities; shall plan, design, construct, operate and maintain their water supply and sanitation schemes; so that they get potable water and attain health and hygiene benefits; the State Government and its sector institutions shall act as supporter, facilitator and co-financier and as per need shall provide technical assistance, training and cater for bigger construction works and sectoral contingencies.",R.drawable.ss,Gender.ALL,IncomeType.ALL,ResidentType.RURAL));
        schemes.add(new Scheme("Accelerated Irrigation Benefits Programme ","The Union Government launched the Accelerated Irrigation Benefits Programme (AIBP) in 1996-97 for providing financial assistance, to expedite completion of ongoing Major/Medium Irrigation (MMI) including Extension, Renovation and Modernization (ERM) of irrigation projects and Surface Minor Irrigation schemes, as well asLift Irrigation Schemes(LIS).",R.drawable.aibp,Gender.ALL,IncomeType.ALL,ResidentType.SEMI_URBAN));


        SchemeCategory schemeCategory=new SchemeCategory("Water Resouces",R.drawable.water,schemes);
        return schemeCategory;
    }



}
