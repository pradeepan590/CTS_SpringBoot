package com.cts.product.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cts.product.entity.Product;

@Repository
public class ProductDaoImpl implements ProductDao {

	@Autowired
	private SessionFactory sf;

	// save product
	@Override
	public void saveProduct(Product prod) {
		sf.getCurrentSession().save(prod);
		System.out.println("Product " + prod.getName() + " saved to DB");
	}

	// list all products
	@Override
	public List<Product> findAllProducts() {
		return sf.getCurrentSession().createQuery("from Product").getResultList();
	}

	// find a product by id
	@Override
	public Product findProductById(int id) {
		return sf.getCurrentSession().get(Product.class, id);
	}

	// update Product
	@Override
	public void updateProduct(Product prod) {
		sf.getCurrentSession().update(prod);
	}

	// delete product by id
	@Override
	public void deleteProductById(int id) {
		Product prod = findProductById(id);
		if (prod != null) {
			sf.getCurrentSession().delete(prod);
		}

	}

}
