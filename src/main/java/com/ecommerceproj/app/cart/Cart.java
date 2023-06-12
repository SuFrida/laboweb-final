package com.ecommerceproj.app.cart;

import com.ecommerceproj.app.cart_products.Cart_Products;
import com.ecommerceproj.app.customer.Customer;
import com.ecommerceproj.app.product.Product;
import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Cart{

    @Id
    private long cart_id;

    @OneToOne
    private Customer customer;

    @OneToOne
    private Cart_Products products;

    private int quantity;

    public Cart() {
    }

    public long getCart_id() {
        return cart_id;
    }

    public void setCart_id(long cart_id) {
        this.cart_id = cart_id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Cart_Products getProducts() {
        return products;
    }

    public void setProducts(Cart_Products products) {
        this.products = products;
    }
}
