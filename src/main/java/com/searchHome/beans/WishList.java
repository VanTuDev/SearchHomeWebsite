package com.searchHome.beans;

public class WishList {
    private int list_id;
    private String content;
    private int start;
    private User user_id;

    public WishList() {

    }

    public WishList(int list_id, String content, int start, User user_id) {
        this.list_id = list_id;
        this.content = content;
        this.start = start;
        this.user_id = user_id;
    }

    public int getList_id() {
        return list_id;
    }

    public void setList_id(int list_id) {
        this.list_id = list_id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public User getUser_id() {
        return user_id;
    }

    public void setUser_id(User user_id) {
        this.user_id = user_id;
    }

    @Override
    public String toString() {
        return "WishList{" +
                "list_id=" + list_id +
                ", content='" + content + '\'' +
                ", start=" + start +
                ", user_id=" + user_id +
                '}';
    }
}
