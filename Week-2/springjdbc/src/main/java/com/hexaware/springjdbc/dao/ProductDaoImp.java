package com.hexaware.springjdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.hexaware.springjdbc.entity.Product;
import javax.sql.DataSource;

@Repository
public class ProductDaoImp implements IProductDao {

	JdbcTemplate jdbcTemplate;
	
	@Autowired
	public ProductDaoImp(DataSource datasource)
	{
		jdbcTemplate = new JdbcTemplate(datasource);
		System.out.println(jdbcTemplate);
	}
	
	@Override
	public boolean createProduct(Product product) {
		
		String insert = "insert into Products(pid,pname,price) values(?,?,?)";
		
		int count = jdbcTemplate.update(insert,product.getProductId(),product.getProductName(),product.getPrice());
		
		
		
		return count>0;
	}

	@Override
	public boolean updateProduct(Product product) {
		
		String update  = "update Products set pname =?, price = ? where pid =?";
		
		int count = jdbcTemplate.update(update, product.getProductName(),product.getPrice(),product.getProductId());
		
		return count>0;
	}

	@Override
	public boolean deleteProductById(int productId) {
		
		return false;
	}

	@Override
	public Product selectProductById(int productId) {
		String selectById = "select pid, pname, price from products where pid=?";
		Product product = jdbcTemplate.queryForObject(selectById, new ProductMapper(), productId);
		
		return product;
	}

	@Override
	public List<Product> selectAllProduct() {
		
		return null;
	}

}
