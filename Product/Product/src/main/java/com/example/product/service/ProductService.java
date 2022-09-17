package com.example.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.product.bean.Product;
import com.example.product.respository.ProductRepository;

@Service
@Transactional
public class ProductService {
	@Autowired
	private ProductRepository repository;

	public Product saveProduct(Product product)
	{
		return repository.save(product);
	}
	
	 
	public List<Product> getProducts()
	{
		return (List<Product>) repository.findAll();
				
	}
	public Product getProductById(int id)
	{
		return   repository.findById(id).orElse(null);
	}
	
	
	
	
	public String deleteProduct(int id)
	{
		repository.deleteById(id);
		return "Product is removed Successfully"+id;
	}
	
	public Product updateProduct(Product product)
	{
		Product existingProduct=repository.findById(product.getId()).orElse(null);
		existingProduct.setName(product.getName());
		existingProduct.setPrice(product.getPrice());
		existingProduct.setQuantity(product.getQuantity());
		return repository.save(existingProduct);
		}


	
	
}
