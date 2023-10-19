package com.searchHome.beans;

public class Post {
    private String post_id;
    private User user_id;
    private int list_id;
    private String distric_id;
    private int type_id;
    private String title;
    private int price;
    private String tag;

    public Post() {
    }

    public Post(String post_id, User user_id, int list_id, String distric_id, int type_id, String title, int price, String tag) {
        this.post_id = post_id;
        this.user_id = user_id;
        this.list_id = list_id;
        this.distric_id = distric_id;
        this.type_id = type_id;
        this.title = title;
        this.price = price;
        this.tag = tag;
    }

    public String getPost_id() {
        return post_id;
    }

    public void setPost_id(String post_id) {
        this.post_id = post_id;
    }

    public User getUser_id() {
        return user_id;
    }

    public void setUser_id(User user_id) {
        this.user_id = user_id;
    }

    public int getList_id() {
        return list_id;
    }

    public void setList_id(int list_id) {
        this.list_id = list_id;
    }

    public String getDistric_id() {
        return distric_id;
    }

    public void setDistric_id(String distric_id) {
        this.distric_id = distric_id;
    }

    public int getType_id() {
        return type_id;
    }

    public void setType_id(int type_id) {
        this.type_id = type_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    @Override
    public String toString() {
        return "Post{" +
                "post_id='" + post_id + '\'' +
                ", user_id=" + user_id +
                ", list_id=" + list_id +
                ", distric_id='" + distric_id + '\'' +
                ", type_id=" + type_id +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", tag='" + tag + '\'' +
                '}';
    }
}
