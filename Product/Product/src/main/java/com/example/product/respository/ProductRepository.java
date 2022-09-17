package com.example.product.respository;




import org.springframework.data.repository.CrudRepository;

import com.example.product.bean.Product;

public interface ProductRepository  extends CrudRepository<Product, Integer>{



	//List<Product> saveAll(Product products);

	//List<Product> findAll(Product product);

	 //Product findByName(String name);

	 

}
