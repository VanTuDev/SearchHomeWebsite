package com.searchHome.beans;

import java.time.LocalDateTime;

public class Booking {
    private int booking_id;
    private LocalDateTime create_at;
    private LocalDateTime update_at;
    private User user_id;
    private Post post_id;
    private ProcessBooking process_booking_id;
    private Payment payment_id;

    public Booking() {
    }

    public Booking(int booking_id, LocalDateTime create_at, LocalDateTime update_at, User user_id, Post post_id, ProcessBooking process_booking_id, Payment payment_id) {
        this.booking_id = booking_id;
        this.create_at = create_at;
        this.update_at = update_at;
        this.user_id = user_id;
        this.post_id = post_id;
        this.process_booking_id = process_booking_id;
        this.payment_id = payment_id;
    }

    public int getId_booking() {
        return booking_id;
    }

    public void setId_booking(int booking_id) {
        this.booking_id = booking_id;
    }

    public LocalDateTime getCreate_at() {
        return create_at;
    }

    public void setCreate_at(LocalDateTime create_at) {
        this.create_at = create_at;
    }

    public LocalDateTime getUpdate_at() {
        return update_at;
    }

    public void setUpdate_at(LocalDateTime update_at) {
        this.update_at = update_at;
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

    public ProcessBooking getProcess_booking_id() {
        return process_booking_id;
    }

    public void setProcess_booking_id(ProcessBooking process_booking_id) {
        this.process_booking_id = process_booking_id;
    }

    public Payment getPayment_id() {
        return payment_id;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "booking_id=" + booking_id +
                ", create_at=" + create_at +
                ", update_at=" + update_at +
                ", user_id=" + user_id +
                ", post_id=" + post_id +
                ", process_booking_id=" + process_booking_id +
                ", payment_id=" + payment_id +
                '}';
    }
}
