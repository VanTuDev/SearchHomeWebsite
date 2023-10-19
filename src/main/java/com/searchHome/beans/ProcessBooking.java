package com.searchHome.beans;

public class ProcessBooking {
    private int processBooking_id;
    private String proccess_booking;

    public ProcessBooking() {
    }

    public ProcessBooking(int processBooking_id, String proccess_booking) {
        this.processBooking_id = processBooking_id;
        this.proccess_booking = proccess_booking;
    }

    public int getProcessBooking_id() {
        return processBooking_id;
    }

    public void setProcessBooking_id(int processBooking_id) {
        this.processBooking_id = processBooking_id;
    }

    public String getProccess_booking() {
        return proccess_booking;
    }

    public void setProccess_booking(String proccess_booking) {
        this.proccess_booking = proccess_booking;
    }

    @Override
    public String toString() {
        return "ProcessBooking{" +
                "processBooking_id=" + processBooking_id +
                ", proccess_booking='" + proccess_booking + '\'' +
                '}';
    }
}
