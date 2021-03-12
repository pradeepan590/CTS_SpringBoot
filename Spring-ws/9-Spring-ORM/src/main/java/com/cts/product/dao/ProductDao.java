package com.cts.product.dao;

import java.util.List;

import com.cts.product.entity.Product;

public interface ProductDao {

	// save product
	void saveProduct(Product prod);

	// list all products
	List<Product> findAllProducts();

	// find a product by id
	Product findProductById(int id);

	// update Product
	void updateProduct(Product prod);

	// delete product by id
	void deleteProductById(int id);

}