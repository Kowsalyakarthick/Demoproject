package com.example.product.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.product.bean.Product;
import com.example.product.service.ProductService;

@RestController
@RequestMapping(value={"/product"})
public class ProductController {

	@Autowired
	private ProductService service;
	
	@PostMapping("/add")
	public Product addProduct(@RequestBody Product product)
	{
		return service.saveProduct(product);
	}
	 
	@GetMapping("/getProducts")
	public List<Product> getProduct(){
		
		return service.getProducts();
	}
	@GetMapping("/getId/{id}")
	public Product getById(@PathVariable("id") int id)
	{
		return service.getProductById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteId(@PathVariable ("id") int id) {
		return service.deleteProduct(id);
		
	}
	
	@PutMapping("/update")
	public Product update(@RequestBody Product product)
	{
		return service.updateProduct(product);
	}
}
