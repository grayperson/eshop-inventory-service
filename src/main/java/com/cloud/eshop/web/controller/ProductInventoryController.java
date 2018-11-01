package com.cloud.eshop.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cloud.eshop.model.ProductInventory;
import com.cloud.eshop.service.ProductInventoryService;

@RestController
@RequestMapping("/product-inventory")
public class ProductInventoryController {

	@Autowired
	private ProductInventoryService productInventoryService;
	
	@RequestMapping("/add") 
	@ResponseBody
	public String add(ProductInventory productInventory) {
		try {
			productInventoryService.add(productInventory);
		} catch (Exception e) {
			e.printStackTrace(); 
			return "error";
		}
		return "success";
	}
	
	@RequestMapping("/update") 
	@ResponseBody
	public String update(ProductInventory productInventory) {
		try {
			productInventoryService.update(productInventory); 
		} catch (Exception e) {
			e.printStackTrace(); 
			return "error";
		}
		return "success";
	}
	
	@RequestMapping("/delete") 
	@ResponseBody
	public String delete(Long id) {
		try {
			productInventoryService.delete(id); 
		} catch (Exception e) {
			e.printStackTrace(); 
			return "error";
		}
		return "success";
	}
	
	@RequestMapping("/findById") 
	@ResponseBody
	public ProductInventory findById(Long id){
		try {
			return productInventoryService.findById(id);
		} catch (Exception e) {
			e.printStackTrace(); 
		}
		return new ProductInventory();
	}
	
}
