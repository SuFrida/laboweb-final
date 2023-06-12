package com.ecommerceproj.app.order_products;

import com.ecommerceproj.app.orders.Orders;
import com.ecommerceproj.app.product.Product;
import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Order_Products {

    @Id
    @OneToOne(cascade = CascadeType.ALL)
    private Orders order;

    @Id
    @OneToOne(cascade = CascadeType.ALL)
    private Product product;

    private int order_product_quantity;

    private float order_product_price;

    public Order_Products() {
    }

    public Orders getOrder() {
        return order;
    }

    public void setOrder(Orders order) {
        this.order = order;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getOrder_product_quantity() {
        return order_product_quantity;
    }

    public void setOrder_product_quantity(int order_product_quantity) {
        this.order_product_quantity = order_product_quantity;
    }

    public float getOrder_product_price() {
        return order_product_price;
    }

    public void setOrder_product_price(float order_product_price) {
        this.order_product_price = order_product_price;
    }
}
