package com.searchHome.beans;

import java.time.LocalDateTime;

public class Appointment {
    private int appointment_id;
    private LocalDateTime time_start;

    private User user_id;
    private Post post_id;

    public Appointment() {
    }

    public Appointment(int appointment_id, LocalDateTime time_start, User user_id, Post post_id) {
        this.appointment_id = appointment_id;
        this.time_start = time_start;
        this.user_id = user_id;
        this.post_id = post_id;
    }

    public int getAppointment_id() {
        return appointment_id;
    }

    public void setAppointment_id(int appointment_id) {
        this.appointment_id = appointment_id;
    }

    public LocalDateTime getTime_start() {
        return time_start;
    }

    public void setTime_start(LocalDateTime time_start) {
        this.time_start = time_start;
    }

    public User getUser_id() {
        return user_id;
    }

    public void setUser_id(User user_id) {
        this.user_id = user_id;
    }

    public Post getPost_id() {
        return post_id;
    }

    public void setPost_id(Post post_id) {
        this.post_id = post_id;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "appointment_id=" + appointment_id +
                ", time_start=" + time_start +
                ", user_id=" + user_id +
                ", post_id=" + post_id +
                '}';
    }
}
