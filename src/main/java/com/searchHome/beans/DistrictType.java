package com.searchHome.beans;

public class DistrictType {

    private int dicstrict_id;
    private String type;

    public DistrictType() {
    }

    public DistrictType(int dicstrict_id, String type) {
        this.dicstrict_id = dicstrict_id;
        this.type = type;
    }

    public int getDicstrict_id() {
        return dicstrict_id;
    }

    public void setDicstrict_id(int dicstrict_id) {
        this.dicstrict_id = dicstrict_id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "DistrictType{" +
                "dicstrict_id=" + dicstrict_id +
                ", type='" + type + '\'' +
                '}';
    }
}
