package com.searchHome.beans;

import java.util.Date;
//        `user_id` BIGINT NOT NULL,
//        `user_name` VARCHAR(45) NULL DEFAULT NULL,
//        `password` VARCHAR(45) NULL DEFAULT NULL,
//        `fullname` VARCHAR(100) CHARACTER SET 'utf8mb3' NULL DEFAULT NULL,
//        `phone` VARCHAR(45) NULL DEFAULT NULL,
//        `gmail` VARCHAR(45) NULL DEFAULT NULL,
//        `dob` DATE NULL DEFAULT NULL,
//        `cccd` VARCHAR(45) NULL DEFAULT NULL,
//        `role` INT NULL DEFAULT NULL,
//        `address` VARCHAR(200) CHARACTER SET 'utf8mb3' NULL DEFAULT NULL,
//        `image` VARCHAR(200) NULL,
public class User {
    private String user_id;
    private String user_name;
    private String password;
    private String full_name;
    private String phone;
    private String gmail;
    private Date dob;
    private String cccd;
    private int role;
    private String address;
    private String image;

    public User() {
    }

    public User(String user_id) {
        this.user_id = user_id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getCccd() {
        return cccd;
    }

    public void setCccd(String cccd) {
        this.cccd = cccd;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_id='" + user_id + '\'' +
                ", user_name='" + user_name + '\'' +
                ", password='" + password + '\'' +
                ", full_name='" + full_name + '\'' +
                ", phone='" + phone + '\'' +
                ", gmail='" + gmail + '\'' +
                ", dob=" + dob +
                ", cccd='" + cccd + '\'' +
                ", role=" + role +
                ", address='" + address + '\'' +
                ", image='" + image + '\'' +
                '}';
    }
}
