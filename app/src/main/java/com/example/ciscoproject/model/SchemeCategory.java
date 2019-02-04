package com.example.ciscoproject.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

public class SchemeCategory implements Parcelable {
    private String title;
    private int backgroundDrawable;
    private ArrayList<Scheme> schemes;


    public SchemeCategory(String title, int backgroundDrawable, ArrayList<Scheme> schemes) {
        this.title = title;
        this.backgroundDrawable = backgroundDrawable;
        this.schemes = schemes;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.title);
        dest.writeInt(this.backgroundDrawable);
        dest.writeTypedList(this.schemes);
    }



    protected SchemeCategory(Parcel in) {
        this.title = in.readString();
        this.backgroundDrawable = in.readInt();
        this.schemes = in.createTypedArrayList(Scheme.CREATOR);
    }

    public static final Creator<SchemeCategory> CREATOR = new Creator<SchemeCategory>() {
        @Override
        public SchemeCategory createFromParcel(Parcel source) {
            return new SchemeCategory(source);
        }

        @Override
        public SchemeCategory[] newArray(int size) {
            return new SchemeCategory[size];
        }
    };


    public String getTitle() {
        return title;
    }

    public int getBackgroundDrawable() {
        return backgroundDrawable;
    }

    public ArrayList<Scheme> getSchemes() {
        return schemes;
    }


}
