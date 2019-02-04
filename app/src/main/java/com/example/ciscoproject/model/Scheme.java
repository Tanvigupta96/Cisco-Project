package com.example.ciscoproject.model;

import android.os.Parcel;
import android.os.Parcelable;


public class Scheme implements Parcelable {
    private String title;
    private String description;
    private int url;
    private Gender gender;
    private IncomeType incomeType;
    private ResidentType residentType;


    public Scheme(String title, String description, int url, Gender gender, IncomeType incomeType, ResidentType residentType) {
        this.title = title;
        this.description = description;
        this.url = url;
        this.gender = gender;
        this.incomeType = incomeType;
        this.residentType = residentType;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.title);
        dest.writeString(this.description);
        dest.writeInt(this.url);
        dest.writeInt(this.gender == null ? -1 : this.gender.ordinal());
        dest.writeInt(this.incomeType == null ? -1 : this.incomeType.ordinal());
        dest.writeInt(this.residentType == null ? -1 : this.residentType.ordinal());
    }



    protected Scheme(Parcel in) {
        this.title = in.readString();
        this.description = in.readString();
        this.url = in.readInt();
        int tmpGender = in.readInt();
        this.gender = tmpGender == -1 ? null : Gender.values()[tmpGender];
        int tmpIncomeType = in.readInt();
        this.incomeType = tmpIncomeType == -1 ? null : IncomeType.values()[tmpIncomeType];
        int tmpResidentType = in.readInt();
        this.residentType = tmpResidentType == -1 ? null : ResidentType.values()[tmpResidentType];
    }

    public static final Creator<Scheme> CREATOR = new Creator<Scheme>() {
        @Override
        public Scheme createFromParcel(Parcel source) {
            return new Scheme(source);
        }

        @Override
        public Scheme[] newArray(int size) {
            return new Scheme[size];
        }
    };

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getUrl() {
        return url;
    }

    public Gender getGender() {
        return gender;
    }

    public IncomeType getIncomeType() {
        return incomeType;
    }

    public ResidentType getResidentType() {
        return residentType;
    }
}
