package com.ecommerceproj.app.orders;

import com.ecommerceproj.app.customer.Customer;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Orders {

    @Id
    private long order_id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="customer_id", referencedColumnName = "customer_id")
    private Customer customer;

    private LocalDate order_date;

    private float order_total;

    public Orders() {
    }

    public Orders(long order_id) {
        this.order_id = order_id;
    }

    public long getOrder_id() {
        return order_id;
    }

    public void setOrder_id(long order_id) {
        this.order_id = order_id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public LocalDate getOrder_date() {
        return order_date;
    }

    public void setOrder_date(LocalDate order_date) {
        this.order_date = order_date;
    }

    public float getOrder_total() {
        return order_total;
    }

    public void setOrder_total(float order_total) {
        this.order_total = order_total;
    }
}
