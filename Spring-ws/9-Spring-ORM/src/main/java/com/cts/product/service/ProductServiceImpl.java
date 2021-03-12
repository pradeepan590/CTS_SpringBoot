package com.cts.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cts.product.dao.ProductDao;
import com.cts.product.entity.Product;
@Service
public class ProductServiceImpl implements ProductService {

	// Inject ProductDao to ServiceImpl class
	@Autowired
	private ProductDao prodDao;
	
	
	@Transactional()
	public void processTransaction() {
		// 3 operations

		// Update Product
		Product p2=prodDao.findProductById(14);
		p2.setName("New-3");
		prodDao.updateProduct(p2);
		
	
		
		// Insert Product
		Product p1=new Product();
		p1.setName("AAA");
		p1.setPrice(23);
		p1.setDescription("BBB");
		
		prodDao.saveProduct(p1);
		
		// Delete Product
		prodDao.deleteProductById(18);
		
	}

	@Override
	@Transactional
	public void saveProduct(Product prod) {
		prodDao.saveProduct(prod);
	}

	@Override
	
	public List<Product> findAllProducts() {

		return prodDao.findAllProducts();
	}

	@Override
	@Transactional
	public Product findProductById(int id) {

		return prodDao.findProductById(id);
	}

	@Override
	@Transactional
	public void updateProduct(Product prod) {

		prodDao.updateProduct(prod);

	}

	@Override
	@Transactional
	public void deleteProductById(int id) {

		prodDao.deleteProductById(id);

	}

}
