package com.example.android.naveenproject.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by ramesh on 27/7/18.
 */

public class Included {
    private String type;
    private String id;

    @SerializedName("attributes")
    Attribute attribute;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Attribute getAttribute() {
        return attribute;
    }

    public void setAttribute(Attribute attribute) {
        this.attribute = attribute;
    }

    @Override
    public String toString() {
        return "Data{" +
                "type='" + type + '\'' +
                ", id='" + id + '\'' +
                ", attribute=" + attribute +
                '}';
    }
}
