package com.cloud.eshop.service;

import com.cloud.eshop.model.ProductInventory;

public interface ProductInventoryService {
	
	public void add(ProductInventory productInventory);
	
	public void update(ProductInventory productInventory);
	
	public void delete(Long id);
	
	public ProductInventory findById(Long id);

	public ProductInventory findByProductId(Long productId);
}
