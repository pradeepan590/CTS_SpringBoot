package com.cts.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.cts.product.dao.ProductDao;
import com.cts.product.entity.Product;

@Service
public class ProductServiceImpl {

	@Value("${prod.price}")
	private double price;

	@Autowired
	private ProductDao prodDao;

	public List<Product> filterProductByprice() {
		return prodDao.findProductByPriceGreaterThanEqual(price);
	}

}
