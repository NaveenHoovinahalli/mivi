package com.example.android.naveenproject.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by ramesh on 27/7/18.
 */

public class Model {

    @SerializedName("data")
    private Data mdata;
    @SerializedName("included")
    ArrayList<Included> includeds;

    public Data getMdata() {
        return mdata;
    }

    public void setMdata(Data mdata) {
        this.mdata = mdata;
    }

    public ArrayList<Included> getIncludeds() {
        return includeds;
    }

    public void setIncludeds(ArrayList<Included> includeds) {
        this.includeds = includeds;
    }

    @Override
    public String toString() {
        return "Model{" +
                "mdata=" + mdata +
                ", includeds=" + includeds +
                '}';
    }
}
