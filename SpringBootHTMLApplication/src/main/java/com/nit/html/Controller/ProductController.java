package com.nit.html.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nit.html.entiry.Product;
import com.nit.html.service.IProductService;

@RestController 
public class ProductController {

	@Autowired  
	private IProductService productService;  
	  
	@GetMapping(value = "/product")  
	public List<Product> getProduct()   
	{  
	  
	List<Product> products = productService.AllProduct();  
	 
	return products;  
	} 
}
