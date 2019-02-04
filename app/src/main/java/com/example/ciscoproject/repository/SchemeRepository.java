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

    public static SchemeCategory getCommunicationSchemes(){
        ArrayList<Scheme> schemes=new ArrayList<>();

        schemes.add(new Scheme("IREDA Scheme For Discounting Energy Bills","It is proposed to provide bill discounting facility for the energy bills of indian Renewable Energy Development Agency(IREDA) borrowers which are pending for payment with utilities for upto 6 months.\n Minister: Ministry of New and Renewable Energy(MNARE).\n Headed By:(Indian Renewable Energy Development Agency)IREDA\nStakeHolder: Startup",R.drawable.ireda,Gender.MALE, IncomeType.ALL, ResidentType.RURAL,"http://blog.trendonix.com/ireda-scheme-discounting-energy-bills/"));
        schemes.add(new Scheme("Credit Enhancement Guarantee Scheme-An initiative of Ministry of Social Justice and Empowerment","To encourage and promote entrepreneurships among the Scheduled Castes who are oriented towards innovations and growth technologies by supporting the Bank and Financial Institutions in the form of Credit Enhancement Guarantee (minimum Rs.0.15 crore and maximum Rs.5.00 crore) against Working Capital Loans, Term Loans or Composite Terms Loans granted by MLIs to SC entrepreneurs.Eligibility – Registered Companies and Societies/Registered Partnership Firms/Sole Proprietorship firms/Individual SC Entrepreneur having more than 51% shareholding by Scheduled Caste entrepreneurs/promoters/members with management control for the past 6 months are eligible for guarantee from IFCI against the loans extended by MLI Banks/Institutions.\n" +
                "Amount of guarantee cover – Minimum Rs.0.15 crore and maximum Rs.5.00 crore.",R.drawable.cegs,Gender.ALL,IncomeType.HIGH,ResidentType.URBAN,"https://www.ifcicegssc.in/#No-back"));
        schemes.add(new Scheme("Pradhan Mantri Mudra Yojana","Pradhan Mantri MUDRA Yojana (PMMY) is a scheme launched by the Hon’ble Prime Minister on April 8, 2015 for providing loans upto 10 lakh to the non-corporate, non-farm small/micro enterprises. These loans are classified as MUDRA loans under PMMY. These loans are given by Commercial Banks, RRBs, Small Finance Banks, Cooperative Banks, MFIs and NBFCs. The borrower can approach any of the lending institutions mentioned above or can apply online through this portal. Under the aegis of PMMY, MUDRA has created three products namely 'Shishu', 'Kishore' and 'Tarun' to signify the stage of growth / development and funding needs of the beneficiary micro unit / entrepreneur and also provide a reference point for the next phase of graduation / growth.MUDRA offers incentives through these interventions:\n" +
                ">Shishu: covering loans upto INR 50,000/-\n" +
                "> Kishor: covering loans above INR 50,000/- and upto INR 5 Lakhs\n" +
                "> Tarun: covering loans above INR 5 Lakhs and upto INR 10 Lakhs",R.drawable.pmmj,Gender.FEMALE,IncomeType.LOW,ResidentType.RURAL,"https://www.indiatoday.in/education-today/gk-current-affairs/story/what-is-mudra-yojana-of-narendra-modi-led-central-government-1338872-2018-09-13"));
        SchemeCategory schemeCategory=new SchemeCategory("Communication & IT Sector", R.drawable.communication,schemes);

        return schemeCategory;
    }

    public static SchemeCategory getCommercialSchemes(){
        ArrayList<Scheme> schemes=new ArrayList<>();
        schemes.add(new Scheme("Pradhan Mantri Jan Dhan Yojana (PMJDY)","\n" +
                "Pradhan Mantri Jan Dhan Yojana (PMJDY)\n" +
                "PM Modi launches the Pradhan Mantri Jan Dhan Yojana.jpg\n" +
                "PM Modi launches the \"Pradhan Mantri Jan Dhan Yojana\"\n" +
                "Country\tIndia\n" +
                "Prime Minister(s)\tNarendra Modi\n" +
                "Ministry\tFinance\n" +
                "Key people\tArun Jaitley\n" +
                "Launched\t28 August 2014; 4 years ago\n" +
                "Website\twww.pmjdy.gov.in\n" +
                "Status: Unknown\n" +
                "Pradhan Mantri Jan Dhan Yojana (PMJDY), is financial inclusion program of Government of India which is applicable to 18 to 65 years age group ,that aims to expand and make affordable access to financial services such as bank accounts, remittances, credit, insurance and pensions. This financial inclusion campaign was launched by the Prime Minister of India Narendra Modi on 15 August 2014.[1] He had announced this scheme on his first Independence Day speech on 15 August 2014.\n" +
                "\n" +
                "Run by Department of Financial Services, Ministry of Finance, under this scheme 1.5 Crore (15 million) bank accounts were opened on inauguration day.[Hon’ble Prime Minister announced Pradhan Mantri Jan Dhan Yojana as the National Mission on Financial Inclusion in his Independence Day address on 15th August 2014, to ensure comprehensive financial inclusion of all the households in the country by providing universal access to banking facilities with at least one basic bank account to every household, financial literacy, access to credit, insurance and pension facility.",R.drawable.pmjy,Gender.ALL,IncomeType.LOW,ResidentType.RURAL,"https://en.wikipedia.org/wiki/Pradhan_Mantri_Jan_Dhan_Yojana"));
        schemes.add(new Scheme("Prime Minister’s Employment Generation Programme (PMEGP)","The scheme is implemented by Khadi and Village Industries Commission (KVIC) functioning as the nodal agency at the national level. At the state level, the scheme is implemented through State KVIC Directorates, State Khadi and Village Industries Boards (KVIBs), District Industries Centres (DICs) and banks. In such cases KVIC routes government subsidy through designated banks for eventual disbursal to the beneficiaries / entrepreneurs directly into their bank accounts.Objectives\n" +
                "(i) To generate employment opportunities in rural as well as urban areas of the country through setting up of new self-employment ventures/projects/micro enterprises.\n" +
                "(ii) To bring together widely dispersed traditional artisans/ rural and urban unemployed youth and give them self-employment opportunities to the extent possible, at their place.\n" +
                "(iii) To provide continuous and sustainable employment to a large segment of traditional and prospective artisans and rural and urban unemployed youth in the country, so as to help arrest migration of rural youth to urban areas.\n" +
                "(iv) To increase the wage earning capacity of artisans and contribute to increase in the growth rate of rural and urban employment.",R.drawable.pmegs,Gender.ALL,IncomeType.LOW,ResidentType.RURAL,"https://my.msme.gov.in/mymsme/reg/COM_PMEGPForm.aspx"));
        schemes.add(new Scheme("Coir Industry Technology Upgradation Scheme (CITUS)","A new component namely “Coir Industry Technology Upgradation Scheme (CITUS)” has been introduced replacing the earlier component i.e. “Development of Production Infrastructure” of Coir Vikas Yojana for giving away assistance to the entrepreneurs for procurement of eligible Plant & Machinery for modernization, upgradation and/or establishing a new unit on making application for the purpose to go for larger investment in the coir sector.Formation of Coir Board\n" +
                "Coir Board was established by the Govt. of India under the Coir Industries Act 1953\n" +
                "(No.45 of 1953) for the overall and sustainable development of coir industry in India . It is the\n" +
                "duty of theBoard to promote by such measures as it thinks fit the development, under the control\n" +
                "of the Central Government, of the Coir Industry.\n" +
                "The Board shall consist of a Chairman and other members not exceeding forty to be\n" +
                "appointed by the Central Government by notification in the Official Gazette from among persons\n" +
                "representing\n" +
                "a) Growers of coconuts and producers of husks, and coir yarn;\n" +
                "b) Persons engaged in the production of husks, coir and coir yarn and in the manufacture of\n" +
                "coir products;\n" +
                "c) Manufacturers of coir products;\n" +
                "d) Dealers in coir, coir yarn and coir products, including both exporters and internal traders;\n" +
                "e) Parliament;\n" +
                "f) Governments of the principal coconut growing States;\n" +
                "g) Such other persons or class of persons who, in the opinion of the Central Government,\n" +
                "ought to be represented on the Board.",R.drawable.citus,Gender.ALL,IncomeType.ALL,ResidentType.SEMI_URBAN,"http://coirboard.gov.in/wp-content/uploads/2018/12/CITUS.pdf"));
        SchemeCategory schemeCategory=new SchemeCategory("Commercial & Industrial Sector",R.drawable.commercial,schemes);

        return schemeCategory;
    }

    public static SchemeCategory getRuralDevelopmentSchemes(){
        ArrayList<Scheme> schemes=new ArrayList<>();
        schemes.add(new Scheme("Pradhan Mantri Gram Sadak Yojna","Rural Road Connectivity is not only a key component of Rural Development by promoting access to economic and social services and thereby generating increased agricultural incomes and productive employment opportunities in India, it is also as a result, a key ingredient in ensuring sustainable poverty reduction.The PMGSY is under the authority of the Ministry of Rural Development and was begun on 25 December 2000.[6] It is fully funded by the central government. During November 2015, following the recommendations of the 14th Finance Commission, the Sub-Group of Chief Ministers on Rationalization of Centrally Sponsored Schemes, it was announced that the project will be funded by both the central government (60%) and states (40%). In the 2000 government was announced",R.drawable.pmgsy,Gender.ALL,IncomeType.ALL,ResidentType.RURAL,"http://vikaspedia.in/social-welfare/rural-poverty-alleviation-1/schemes/pradhan-mantri-gram-sadak-yojana"));
        schemes.add(new Scheme("Pradhan Mantri Awaas Yojna","Pradhan Mantri Awas Yojana (PMAY) is an initiative by Government of India in which affordable housing will be provided to the urban poor with a target of building 20 million affordable houses by 31 March 2022.Beneficiary\n" +
                "  A beneficiary family will comprise of husband, wife, unmarried sons and/or unmarried daughters. An adult earning member (irrespective of marital status) can be treated as a separate household",R.drawable.pmay,Gender.ALL,IncomeType.LOW,ResidentType.RURAL,"https://www.bajajfinserv.in/home-loan-pradhan-mantri-awas-yojana"));
        schemes.add(new Scheme("Sansad Adarsh Gram Yojna","Sansad Adarsh Gram Yojana (SAGY) is a village development project launched by Government of India in October 2014, under which each Member of Parliament will take the responsibility of developing physical and institutional infrastructure in three villages by 2019.Sansad Adarsh Gram Yojana was initiated to bring the member of parliament of all the political parties under the same umbrella while taking the responsibility of developing physical and institutional infrastructure in villages and turn them into model villages.",R.drawable.sagy,Gender.ALL,IncomeType.ALL,ResidentType.RURAL,"https://en.wikipedia.org/wiki/Sansad_Adarsh_Gram_Yojana"));
        SchemeCategory schemeCategory=new SchemeCategory("Rural Development",R.drawable.ruraldevp,schemes);

        return schemeCategory;
    }

    public static SchemeCategory getHealthSchemes(){
        ArrayList<Scheme> schemes=new ArrayList<>();
        schemes.add(new Scheme("Pradhan Mantri Swasthya Suraksha Yojana(PMSSY)","The Pradhan Mantri Swasthya Suraksha Yojana (PMSSY) was announced in 2003 with objectives of correcting regional imbalances in the availability of affordable/ reliable tertiary healthcare services and also to augment facilities for quality medical education in the country.The Pradhan Mantri Swasthya Suraksha Yojana (PMSSY) was announced in 2003 with objectives of correcting regional imbalances in the availability of affordable/ reliable tertiary healthcare services and also to augment facilities for quality medical education in the country.",R.drawable.pmssy,Gender.ALL,IncomeType.ALL,ResidentType.SEMI_URBAN,"http://pmssy-mohfw.nic.in/"));
        schemes.add(new Scheme("National Rural Health Mission(NRHM)","The National Rural Health Mission (NRHM) was launched on 12th April 2005, to provide accessible, affordable and quality health care to the rural population, especially the vulnerable groups.NRHM seeks to provide equitable, affordable and quality health care to the rural population, especially the vulnerable groups. Under the NRHM, the Empowered Action Group (EAG) States as well as North Eastern States, Jammu and Kashmir and Himachal Pradesh have been given special focus. ",R.drawable.nrhm,Gender.ALL,IncomeType.LOW,ResidentType.RURAL,"http://nhm.gov.in/nhm/nrhm.html"));
        schemes.add(new Scheme("Rashtriya Swasthya Bima Yojana","Rashtriya Swasthya Bima Yojana (RSBY) is a government-run health insurance programme for the Indian poor.It provides for cashless insurance for hospitalisation in public as well as private hospitals.Every \"below poverty line\" (BPL) family holding a yellow ration card pays ₹30 (42¢ US) registration fee to get a biometric-enabled smart card containing their fingerprints and photographs.[1] This enables them to receive inpatient medical care of up to ₹30,000 (US$420) per family per year in any of the empanelled hospitals.",R.drawable.rsby,Gender.ALL,IncomeType.ALL,ResidentType.SEMI_URBAN,"http://vikaspedia.in/social-welfare/unorganised-sector-1/schemes-unorganised-sector/rashtriya-swasthya-bima-yojana"));
        SchemeCategory schemeCategory=new SchemeCategory("Health & Family Welfare ",R.drawable.health,schemes);

        return schemeCategory;
    }

    public static SchemeCategory getEducationSchemes(){
        ArrayList<Scheme> schemes=new ArrayList<>();
        schemes.add(new Scheme("Sarva Shiksha Abhiyan", "Sarva Shiksha Abhiyan or SSA, is an Indian Government programme aimed at the universalisation of elementary education, the 86th Amendment to the Constitution of India making free and compulsory education to adults between the ages of 6 to 14(estimated to be 205 million children in 2001) a fundamental right. The programme was pioneered by former Indian Prime Minister Atal Bihari Vajpayee.)) Children who fail to read in early education lag behind in other subjects.The\tprogramme is designed to improve\tcomprehensive early reading,\twriting and early mathematics programme\tfor children in Classes I and II. Under this programme, ₹762 crore (US$110 million) was approved to States. The programme will not only provide print rich environment, timely distribution of books but will also include new teacher mentoring and appraisal system.",R.drawable.ssa,Gender.ALL,IncomeType.LOW,ResidentType.RURAL,"https://www.aicte-india.org/reports/overview/Sarva-Shiksha-Abhiyan"));
        schemes.add(new Scheme("Mahila Samakhya Programme","Education will be used as an agent of basic change in the status of woman. In order to neutralise the accumulated distortions of the past, there will be a well-conceived edge in favour of women. The National Education System will play a positive, interventionist role in the empowerment of women. It will foster the development of new values through redesigned curricula, textbooks, the training and orientation of teachers, decision-makers and administrators, and the active involvement of educational institutions. This will be an act of faith and social engineering…” NPE, 1986.The National Policy on Education, 1986 recognised that the empowerment of women is possibly the most critical pre-condition for the participation of girls and women in the educational process. The Mahila Samakhya programme was launched in 1988 to pursue the objectives of the National Policy on Education, 1986. It recognised that education can be an effective tool for women’s empowerment, the parameters of which are:",R.drawable.msp,Gender.FEMALE,IncomeType.ALL,ResidentType.SEMI_URBAN,"http://mhrd.gov.in/mahila-samakhya-programme"));
        schemes.add(new Scheme("Scheme to Provide Quality Education in Madrasas (SPQEM)","SPQEM seeks to bring about qualitative improvement in Madrasas to enable Muslim children attain standards of the national education system in formal education subjects. The salient features of SPQEM scheme are :\n" +
                "\n" +
                "To strengthen capacities in Madrasas for teaching of the formal curriculum subjects like Science, Mathematics, Language, Social Studies etc. through enhanced payment of teacher honorarium.\n" +
                "Training of such teachers every two years in new pedagogical practices.\n" +
                "Providing Science labs, Computer labs with annual maintenance costs in the secondary and higher secondary stage madrasas.\n" +
                "Provision of Science/Mathematics kits in primary/upper primary level madrassas.\n" +
                "Strengthening of libraries/book banks and providing teaching learning materials at all levels of madrasas.",R.drawable.spqem,Gender.ALL,IncomeType.LOW,ResidentType.SEMI_URBAN,"http://mhrd.gov.in/spqem"));
        schemes.add(new Scheme("Beti Bachao, Beti Padhao Yojana","\n" + "Beti Bachao, Beti Padhao (translation: Save the daughter, educate the daughter) is a campaign of the Government of India that aims to generate awareness and improve the efficiency of welfare services intended for girls. The scheme was launched with an initial funding of ₹100 crore (US$14 million).[1] It mainly targets the clusters in Uttar Pradesh, Haryana, Uttarakhand, Punjab, Bihar and Delhi.Launched\t22 January 2015; 4 years ago, It aims to address the issue of the declining child sex ratio image (CSR) and is a national initiative jointly run by the Ministry of Women and Child Development, the Ministry of Health and Family Welfare and the Ministry of Human Resource Development. It initially focused multi-sector action in 100 districts throughout the country where there was a low CSR.Sex-selective abortion or female foeticide has led to a sharp drop in the ratio of girls born in contrast to boy infants in some states in India. Ultrasound technology has made it possible for pregnant women and their families to learn the gender of a foetus early in a pregnancy. Discrimination against girl infants, for several reasons, has combined with the technology to result in a rise in abortions of foetuses identified as female during ultrasonic testing.\n" +
                "\n" +
                "The trend was first noticed when results of the 1991 national census were released, and it was confirmed to be a worsening problem when results of the 2001 national census were released. The reduction in the female population of certain Indian states continues to worsen, as results of the 2011 national census have shown. It has been observed that the trend is most pronounced in relatively prosperous regions of India.",R.drawable.bbbp,Gender.FEMALE,IncomeType.LOW,ResidentType.RURAL,"http://www.yogiyojana.in/beti-bachao-beti-padhao-yojana/"));
        SchemeCategory schemeCategory=new SchemeCategory("Education ",R.drawable.education,schemes);

        return schemeCategory;
    }

    public static SchemeCategory getTransportSchemes(){
        ArrayList<Scheme> schemes=new ArrayList<>();
        schemes.add(new Scheme("Green Urban Transport Scheme (GUTS)","On accounting the growing amount of air pollution in the India, particularly in major urban cities and towns, government of India plans to introduce a new scheme under which the air pollution caused due to the transportation would be reduced.The amaount of carbon emitted by the public vehicle transports are much higher when compared with the emission level of private vehicles, this was the main reason for the scheme to be introduced.it basically considers the impact caused on the urban cities due to the increasing level of pollution.",R.drawable.guts,Gender.ALL,IncomeType.ALL,ResidentType.SEMI_URBAN,"http://pmjandhanyojana.co.in/green-urban-transport-scheme-guts/"));
        schemes.add(new Scheme(" Transport Subsidy Scheme (TSS) ","Under the scheme, subsidy on the transport cost for transportation of raw material and finished goods to and from the location of the unit and the designated rail-head was reimbursed for a period of 5 years from the date of commencement of commercial production. For North Eastern states, subsidy is 90%. However, for the movement of goods within NER, the subsidy is 50% on finished goods and 90% on raw material. For North Eastern states, subsidy is 90%. However, for the movement of goods within NER, the subsidy is 50% on finished goods and 90% on raw material. TSS was modified and notified as “Freight Subsidy Scheme (FSS) – 2013, w.e.f. 22.1.2013 for a period of five years. The Scheme has been discontinued with effect from 22.11.2016. However, industrial units registered under the scheme prior to the date of issue of DIPP’s notification dated 22.11.2016 will be eligible for the benefits of the residual period under the scheme.",R.drawable.tss,Gender.ALL,IncomeType.ALL,ResidentType.SEMI_URBAN,"https://dipp.gov.in/programmes-and-schemes/himalayan-north-eastern/transport-subsidy-scheme"));
        schemes.add(new Scheme("Public Bicycle-sharing scheme","A bicycle-sharing system, public bicycle system, or bike-share scheme, is a service in which bicycles are made available for shared use to individuals on a short term basis for a price or free. Many bike share systems allow people to borrow a bike from a \"dock\" and return it at another dock belonging to the same system. Docks are special bike racks that lock the bike, and only release it by computer control. The user enters payment information, and the computer unlocks a bike. The user returns the bike by placing it in the dock, which locks it in place. Other systems are dockless. For many systems, smartphone mapping apps show nearby available bikes and open docks.The first bike sharing projects were initiated by local community organisations, or as charitable projects intended for the disadvantaged, or to promote bicycles as a non-polluting form of transport, or they were business enterprises to rent out bicycles.In an attempt to overcome losses from theft, the next innovation adopted by bike sharing programs was the use of so-called 'smart technology'. One of the first 'smart bike' programs was the Grippa™ bike storage rack system used in Portsmouth's Bikeabout scheme.",R.drawable.pbss,Gender.ALL,IncomeType.LOW,ResidentType.URBAN,"https://en.wikipedia.org/wiki/Bicycle-sharing_system"));
        SchemeCategory schemeCategory=new SchemeCategory("Transport",R.drawable.transport,schemes);

        return schemeCategory;
    }

    public static SchemeCategory getAgricultureSchemes(){
        ArrayList<Scheme> schemes=new ArrayList<>();
        schemes.add(new Scheme("Government of India has introduced Green Revolution – Krishonnati Yojana for farmers in the year 2005."," Krishonnati Yojana is a five-year agriculture sector umbrella programme. Cabinet Committee on Economic Affairs – CCEA has approved the continuation of 12th five year plan of Krishonnati Yojana in May 2018. This scheme will continue for a duration of 2017-2018 to 2019-2020. Green Revolution – Krishonnati Yojana.This scheme comprises of 11 schemes and mission under a single umbrella scheme. Government is planning to develop the agriculture and allied sector in a holistic & scientific manner further to increase the income of farmer by enhancing production, productivity and better returns on produce under this Krishonnati Yojana.The 11 schemes and missions were clubbed together under one umbrella scheme ‘Green Revolution – Krishonnati Yojana in 2017-18. They aim to develop agr... \n" +
                "\n" +
                "........ currentaffairs.gktoday.in/green-revolution-krishonnati-yojana-ccea-approves-continuation-umbrella-scheme-agriculture-sector-05201854995.html © GKToday",R.drawable.ky,Gender.MALE,IncomeType.LOW,ResidentType.RURAL,"https://www.indiafilings.com/learn/green-revolution-krishonnati-yojana/"));
        schemes.add(new Scheme("Pradhan Mantri Fasal Bima Yojana","The new Crop Insurance Scheme is in line with One Nation – One Scheme theme.  It incorporates the best features of all previous schemes and at the same time, all previous shortcomings / weaknesses have been removed. The PMFBY will replace the existing two schemes National Agricultural Insurance Scheme as well as the Modified NAIS.aims at To provide insurance coverage and financial support to the farmers in the event of failure of any of the notified crop as a result of natural calamities, pests & diseases.\n" +
                "To stabilise the income of farmers to ensure their continuance in farming.\n" +
                "To encourage farmers to adopt innovative and modern agricultural practices.\n" +
                "To ensure flow of credit to the agriculture sector.Highlights: There will be a uniform premium of only 2% to be paid by farmers for all Kharif crops and 1.5% for all Rabi crops. In case of annual commercial and horticultural crops, the premium to be paid by farmers will be only 5%. The premium rates to be paid by farmers are very low and balance premium will be paid by the Government to provide full insured amount to the farmers against crop loss on account of natural calamities.\n" +
                "There is no upper limit on Government subsidy. Even if balance premium is 90%, it will be borne by the Government.",R.drawable.pmfby,Gender.MALE,IncomeType.LOW,ResidentType.RURAL,"http://vikaspedia.in/agriculture/agri-insurance/pradhan-mantri-fasal-bima-yojana"));
        schemes.add(new Scheme("Paramparagat Krishi Vikas Yojana","“Paramparagat Krishi Vikas Yojana” is an elaborated component of Soil Health Management (SHM) of major project National Mission of Sustainable Agriculture (NMSA). Under PKVY Organic farming is promoted through adoption of organic village by cluster approach and PGS certification. The scheme aims at Promotion of commercial organic production through certified organic farming.\n" +
                "The produce will be pesticide residue free and will contribute to improve the health of consumer.\n" +
                "It will raise farmer's income and create potential market for traders.\n" +
                "It will motivate the farmers for natural resource mobilization for input production.Programme Implementation:Groups of farmers would be motivated to take up organic farming under Paramparagat Krishi Vikas Yojana (PKVY).\n" +
                "Fifty or more farmers will form a cluster having 50 acre land to take up the organic farming under the scheme. In this way during three years 10,000 clusters will be formed covering 5.0 lakh acre area under organic farming.\n" +
                "There will be no liability on the farmers for expenditure on certification.\n" +
                "Every farmer will be provided Rs. 20,000 per acre in three years for seed to harvesting of crops and to transport produce to the market.",R.drawable.pkvy,Gender.ALL,IncomeType.LOW,ResidentType.RURAL,"http://vikaspedia.in/agriculture/policies-and-schemes/crops-related/krishi-unnati-yojana/paramparagat-krishi-vikas-yojana"));
        SchemeCategory schemeCategory=new SchemeCategory("Agriculture",R.drawable.agriculture,schemes);

        return schemeCategory;
    }

    public static SchemeCategory getWaterResourcesSchemes(){
        ArrayList<Scheme> schemes=new ArrayList<>();
        schemes.add(new Scheme("National Mission for Clean Ganga","National Mission for Clean Ganga(NMCG) was registered as a society on 12th August 2011 under the Societies Registration Act 1860.It acted as implementation arm of National Ganga River Basin Authority(NGRBA) which was constituted under the provisions of the Environment (Protection) Act (EPA),1986. NGRBA has since been dissolved with effect from the 7th October 2016, consequent to constitution of National Council for Rejuvenation, Protection and Management of River Ganga.The Act envisages five tier structure at national, state and district level to take measures for prevention, control and abatement of environmental pollution in river Ganga and to ensure continuous adequate flow of water so as to rejuvenate the river Ganga.NMCG has a two tier management structure and comprises of Governing Council and Executive Committee. Both of them are headed by Director General, NMCG. Executive Committee has been authorized to accord approval for all projects up to Rs.1000 crore. Similar to structure at national level, State Programme Management Groups (SPMGs) acts as implementing arm of State Ganga Committees. Thus the newly created structure attempts to bring all stakeholders on one platform to take a holistic approach towards the task of Ganga cleaning and rejuvenation. ",R.drawable.nmfcg,Gender.ALL,IncomeType.ALL,ResidentType.SEMI_URBAN,"https://nmcg.nic.in/"));
        schemes.add(new Scheme("Swajal Scheme","Ministry of Drinking Water and Sanitation aims to provide every rural person with adequate safe water for drinking, cooking and other domestic basic needs on a sustainable basis. This basic requirement should meet minimum water quality standards and be readily and conveniently accessible at all times and in all situations. Ministry has initiated a pilot project in the name of “Swajal” that is designed as a demand driven and community centred program to provide sustainable access to drinking water to people in rural areas.Community–led drinking water projects to be called ‘Swajal’ aiming at providing sustainable and adequate drinking water in an integrated manner to the rural masses on pilot basis. It is envisaged that the State government in partnership with rural communities; shall plan, design, construct, operate and maintain their water supply and sanitation schemes; so that they get potable water and attain health and hygiene benefits; the State Government and its sector institutions shall act as supporter, facilitator and co-financier and as per need shall provide technical assistance, training and cater for bigger construction works and sectoral contingencies.vision:Community–led drinking water projects to be called ‘Swajal’ aiming at providing sustainable and\n" +
                "adequate drinking water in an integrated manner to the rural masses on pilot basis. It is envisaged\n" +
                "that the State government in partnership with rural communities; shall plan, design, construct,\n" +
                "operate and maintain their water supply and sanitation schemes; so that they get potable water and\n" +
                "attain health and hygiene benefits; the State Government and its sector institutions shall act as\n" +
                "supporter, facilitator and co-financier and as per need shall provide technical assistance, training\n" +
                "and cater for bigger construction works and sectoral contingencies. ",R.drawable.ss,Gender.ALL,IncomeType.ALL,ResidentType.RURAL,"http://vikaspedia.in/social-welfare/rural-poverty-alleviation-1/swajal-scheme"));
        schemes.add(new Scheme("Accelerated Irrigation Benefits Programme ","The Union Government launched the Accelerated Irrigation Benefits Programme (AIBP) in 1996-97 for providing financial assistance, to expedite completion of ongoing Major/Medium Irrigation (MMI) including Extension, Renovation and Modernization (ERM) of irrigation projects and Surface Minor Irrigation schemes, as well asLift Irrigation Schemes(LIS).   90% central assistance (CA) of project cost for ongoing and new SMI Schemes in case of Special Category States (North Eastern States, Sikkim, Himachal Pradesh, Jammu & Kashmir and Uttaranchal) and undivided Koraput,Bolangir,Kalahandi (KBK) districts of Odisha.\n" +
                "\n" +
                "(ii)        90% central assistance (CA) of project cost for ongoing SMI Schemes in Special Area benefiting drought prone area (DPA) and tribal area(TA) of Non-special category States.\n" +
                "\n" +
                "(iii)       75% CA of project cost for new SMI projects in Special Area benefiting drought prone area(DPA), tribal area(TA) and Left Extremist Affected Area of Non-special category States. The balance funds are to be arranged by the State Government from its own resources.\n" +
                "\n" +
                "             \n" +
                "\n" +
                "            This was stated by Union Minister of State for Water Resources, River Development and Ganga Rejuvenation Sushri Uma Bharati in a written reply in Lok Sabha today.",R.drawable.aibp,Gender.ALL,IncomeType.ALL,ResidentType.SEMI_URBAN,"http://pib.nic.in/newsite/PrintRelease.aspx?relid=107726"));


        SchemeCategory schemeCategory=new SchemeCategory("Water Resouces",R.drawable.water,schemes);
        return schemeCategory;
    }



}
