package com.stark.inventory.controller;

import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.stark.inventory.entities.Product;
import com.stark.inventory.service.ProductService;

@Controller
public class HomeController {
	
	@Autowired
	ProductService productService;

    @GetMapping("/home")
    public String getInventory(Model model) {
        Iterable<Product> productList = productService.findAll();
        int totalQuantity = StreamSupport.stream(productList.spliterator(), false)
                                          .mapToInt(Product::getQuantity)
                                          .sum();
        model.addAttribute("product", productList);
        model.addAttribute("totalQuantity", totalQuantity);
        System.out.println("Quantity has been displayed");
        return "home";
    }
    
    @PostMapping("/delete-product/{pId}")
    public String deleteProductOnClick(@PathVariable("pId") int pId) {
    	productService.deleteProduct(pId);
    	System.out.println("Product has been deleted");
    	return "redirect:/home"; 
    }
    
    @GetMapping("/home/add-new-product")
    public String addNewProduct(Model model) {
        return "add_new_product";
    }
    
    @PostMapping("/home/addNewProduct")
    public String addNewProductForm(@ModelAttribute ("addNewProductForm") Product product) {
    	productService.addProduct(product);
    	System.out.println("Product has been saved");
    	return "redirect:/home";
    }
    
    @GetMapping("/home/update-product-details/{pId}")
    public String showUpdateProductForm(@PathVariable("pId") int pId, Model model) {
		Product product = productService.getProduct(pId);
		model.addAttribute("product", product);
        return "update_product_details";
    }	
    
    @PostMapping("/home/updateProduct/{pId}")
    public String updateProductOnClick(@PathVariable("pId") int pId, @ModelAttribute("product") Product product) {
    	productService.updateProduct(product);
    	System.out.println("Product has been updated");
    	return "redirect:/home";
    }
    
}
