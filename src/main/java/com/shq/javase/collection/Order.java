package com.shq.javase.collection;

public class Order implements Comparable<Order> {

    private int id;
    private String orderNo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Order(int id, String orderNo) {
        this.id = id;
        this.orderNo = orderNo;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", orderNo='" + orderNo + '\'' +
                '}';
    }


    @Override
    public int compareTo(Order order) {
        return this.getOrderNo().compareTo(order.getOrderNo());
    }
}
