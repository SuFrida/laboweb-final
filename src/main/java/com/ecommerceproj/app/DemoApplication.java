package com.ecommerceproj.app;

import com.ecommerceproj.app.cart.CartService;
import com.ecommerceproj.app.customer.CustomerService;
import com.ecommerceproj.app.orders.OrdersService;
import com.ecommerceproj.app.product.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class DemoApplication {

	@Autowired
	private OrdersService ordersService;

	@Autowired
	private ProductService productService;

	@Autowired
	private CustomerService customerService;

	@Autowired
	private CartService cartService;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@RequestMapping("/")
	public String index() {
		return "";
	}

	@RequestMapping("/shop")
	public String shop() {
		return "shop";
	}

	@RequestMapping("/contact")
	public String defectDetails() {
		return "contact";
	}

}
