package com.example.exalogicsolutions.inmegh_jdt.Models.EventResponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AdminEventImage {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("images")
    @Expose
    private String images;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }
}
