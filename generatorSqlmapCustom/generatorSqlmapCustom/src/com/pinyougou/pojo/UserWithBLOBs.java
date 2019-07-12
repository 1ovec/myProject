package com.pinyougou.pojo;

public class UserWithBLOBs extends User {
    private String faceFeature;

    private String collectImageUrl;

    public String getFaceFeature() {
        return faceFeature;
    }

    public void setFaceFeature(String faceFeature) {
        this.faceFeature = faceFeature == null ? null : faceFeature.trim();
    }

    public String getCollectImageUrl() {
        return collectImageUrl;
    }

    public void setCollectImageUrl(String collectImageUrl) {
        this.collectImageUrl = collectImageUrl == null ? null : collectImageUrl.trim();
    }
}