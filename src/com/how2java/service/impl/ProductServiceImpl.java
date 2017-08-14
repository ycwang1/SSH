package com.how2java.service.impl;

import java.util.List;

import com.how2java.dao.ProductDao;
import com.how2java.pojo.Product;
import com.how2java.service.ProductService;

public class ProductServiceImpl implements ProductService {
	ProductDao productdao;
	public ProductDao getProductdao() {
		return productdao;
	}
	public void setProductdao(ProductDao productdao) {
		this.productdao = productdao;
	}
	@Override
	public List<Product> list() {
		// TODO Auto-generated method stub
		List<Product> products =productdao.list();
		if(products.isEmpty()){
			for(int i=0;i<5;i++){
				Product p=new Product();
				p.setName("product"+i);
				productdao.add(p);
				products.add(p);
			}
		}
		return products;
	}

}
