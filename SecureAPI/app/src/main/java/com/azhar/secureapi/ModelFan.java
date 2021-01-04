package com.azhar.secureapi;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ModelFan {

    @SerializedName("ver")
    @Expose
    public String ver;
    @SerializedName("name")
    @Expose
    public String name;
    @SerializedName("api")
    @Expose
    public String api;

    public String getVer() {
        return ver;
    }

    public void setVer(String ver) {
        this.ver = ver;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApi() {
        return api;
    }

    public void setApi(String api) {
        this.api = api;
    }
}
