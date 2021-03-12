package com.cts.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import com.cts.product.dao.ProductDao;
import com.cts.product.entity.Product;
@Service
public class ProductServiceImpl implements ProductService {

	// Inject ProductDao to ServiceImpl class
	@Autowired
	private ProductDao prodDao;

	@Override
	@Transactional
	public void saveProduct(Product prod) {
		prodDao.saveProduct(prod);
	}

	@Override
	@Transactional
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
