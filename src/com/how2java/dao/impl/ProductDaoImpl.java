package com.how2java.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.how2java.dao.ProductDao;
import com.how2java.pojo.Product;

public class ProductDaoImpl extends HibernateTemplate implements ProductDao {

	@Override
	public List<Product> list() {
		// TODO Auto-generated method stub
		return find("from Product p");
	}

	@Override
	public void add(Product p) {
		// TODO Auto-generated method stub
		save(p);
	}

}
