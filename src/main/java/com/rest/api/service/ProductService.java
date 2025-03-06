package com.rest.api.service;

import com.rest.api.entity.Product;
import com.rest.api.pojo.ProductPojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.rest.api.repository.ProductRepository;

import java.util.ArrayList;
import java.util.List;


@Service
public class ProductService {


    @Autowired
   ProductRepository productRepository;



    public void createProduct(ProductPojo productPojo) {
        Product product = new Product();

        product.setColor(productPojo.getColour());
        product.setName(productPojo.getProductName());
        product.setSize(productPojo.getSize());
        productRepository.save(product);

    }

    public ProductPojo getProduct(String id) {
        Product product = productRepository.findById(Long.valueOf(id)).orElse(null);

        ProductPojo productPojo=new ProductPojo();
        productPojo.setProductName(product.getName());
        productPojo.setProductId(String.valueOf(product.getId()));
        productPojo.setSize(product.getSize());
        productPojo.setColour(product.getColor());
        return productPojo;

    }
    public List<ProductPojo> getAllProduct( )
    {
       List<Product> productList = productRepository.findAll();
        List<ProductPojo> pojoList=new ArrayList<>();
       for( Product product:productList)
       {
           ProductPojo productPojo=new ProductPojo();
           productPojo.setProductName(product.getName());
           productPojo.setProductId(String.valueOf(product.getId()));
           productPojo.setSize(product.getSize());
           productPojo.setColour(product.getColor());
           pojoList.add(productPojo);
       }


        return pojoList;
    }
    public void deleteProduct(String id )
    {
        Product product=new Product();
        product.setId();

         productRepository.delete( product);


    }


}
