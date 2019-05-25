package com.rkm.rest.controller;

public class ClothDO {

    public String clothId;
    public String clothMaterial;
    public String clothPrice;
    public String manuFacutreDate;

    public String getClothId() {
        return clothId;
    }

    public void setClothId(String clothId) {
        this.clothId = clothId;
    }

    public String getClothMaterial() {
        return clothMaterial;
    }

    public void setClothMaterial(String clothMaterial) {
        this.clothMaterial = clothMaterial;
    }

    public String getClothPrice() {
        return clothPrice;
    }

    public void setClothPrice(String clothPrice) {
        this.clothPrice = clothPrice;
    }

    public String getManuFacutreDate() {
        return manuFacutreDate;
    }

    public void setManuFacutreDate(String manuFacutreDate) {
        this.manuFacutreDate = manuFacutreDate;
    }

    @Override
    public String toString() {
        return "ClothDO{" +
                "clothId='" + clothId + '\'' +
                ", clothMaterial='" + clothMaterial + '\'' +
                ", clothPrice='" + clothPrice + '\'' +
                ", manuFacutreDate='" + manuFacutreDate + '\'' +
                '}';
    }
}
