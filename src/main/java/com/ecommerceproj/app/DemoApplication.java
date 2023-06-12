package com.ecommerceproj.app;

import com.ecommerceproj.app.cart.Cart;
import com.ecommerceproj.app.cart.CartService;
import com.ecommerceproj.app.customer.CustomerService;
import com.ecommerceproj.app.orders.OrdersService;
import com.ecommerceproj.app.product.Product;
import com.ecommerceproj.app.product.ProductService;

import java.io.Console;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

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
	public String viewHomePage(Model model) {
		List<Product> listProducts = productService.listAll();
		model.addAttribute("listProducts", listProducts);
		List<Cart> listCartProducts = cartService.listAll();
		model.addAttribute("listCartProducts", listCartProducts);
		return "index";
	}

	@RequestMapping("/new")
	public String showNewProductPage(Model model) {
		Product product = new Product();
		model.addAttribute("product", product);

		return "new_product";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveProduct(@ModelAttribute("product") Product product) {
		productService.save(product);
		return "redirect:/";
	}

	@RequestMapping("/edit/{id}")
	public ModelAndView showEditProductPage(@PathVariable(name = "id") int id) {
		ModelAndView mav = new ModelAndView("edit_product");
		Product product = productService.get(id);
		mav.addObject("product", product);
		return mav;
	}

	@RequestMapping("/delete/{id}")
	public String deleteProduct(@PathVariable(name = "id") int id) {
		productService.delete(id);
		return "redirect:/";
	}

	// Cart
	@RequestMapping("/new")
	public String showNewCart(Model model) {
		Cart cart = new Cart();
		model.addAttribute("cart", cart);

		return "new_cart";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveCart(@ModelAttribute("cart") Cart cart) {
		cartService.save(cart);
		return "redirect:/";
	}

	@RequestMapping("/edit/{id}")
	public ModelAndView showEditCart(@PathVariable(name = "id") int id) {
		ModelAndView mav = new ModelAndView("edit_cart");
		Cart cart = cartService.get(id);
		mav.addObject("cart", cart);
		return mav;
	}

	@RequestMapping("/delete/{id}")
	public String deleteCart(@PathVariable(name = "id") int id) {
		cartService.delete(id);
		return "redirect:/";
	}

	// @RequestMapping("/")
	// public String index() {
	// return "";
	// }

	@RequestMapping("/shop")
	public String viewShopPage() {
		return "shop";
	}

	@RequestMapping("/contact")
	public String viewContactPage() {
		return "contact";
	}

}
