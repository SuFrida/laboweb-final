package com.ecommerceproj.app.cart_products;

import com.ecommerceproj.app.cart.Cart;
import com.ecommerceproj.app.product.Product;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Cart_Products {

    @Id
    @OneToOne(cascade = CascadeType.ALL)
    private Cart cart;

    @Id
    @OneToOne(cascade = CascadeType.ALL)
    private Product product;

    private int cart_product_quantity;

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getCart_product_quantity() {
        return cart_product_quantity;
    }

    public void setCart_product_quantity(int cart_product_quantity) {
        this.cart_product_quantity = cart_product_quantity;
    }
}
