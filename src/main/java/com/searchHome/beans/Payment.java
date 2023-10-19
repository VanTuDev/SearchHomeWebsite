package com.searchHome.beans;

public class Payment {
    private int payment_id;
    private int type;
    ;

    public Payment() {
    }

    public Payment(int payment_id, int type) {
        this.payment_id = payment_id;
        this.type = type;
    }

    public int getPayment_id() {
        return payment_id;
    }

    public void setPayment_id(int payment_id) {
        this.payment_id = payment_id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "payment_id=" + payment_id +
                ", type=" + type +
                '}';
    }
}
