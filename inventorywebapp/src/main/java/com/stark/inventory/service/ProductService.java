package com.stark.inventory.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.stark.inventory.dao.ProductDAO;
import com.stark.inventory.entities.Product;

@Service
public class ProductService {
	
	@Autowired
	private ProductDAO productDao;
	
	public Product getProduct(int pId) {
		return productDao.getReferenceById(pId);
	}

    public Iterable <Product> findAll() {
        return productDao.findAll();
    }

	public String addProduct(Product product) {
		productDao.save(product);
		return "Product has been added";
	}
	
	public String addProduct(List<Product> product) {
		productDao.saveAll(product);
		return "All new Products have been added";
	}
	
	public String deleteProduct(int pId) {
		productDao.deleteById(pId);
		return "Product has been deleted";
	}
		
	public String updateProduct(Product product) {
			productDao.save(product);
			return "Product has been saved";
	}
	

}
