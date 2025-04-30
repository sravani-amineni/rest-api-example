package com.rest.api.pojo;

import com.rest.api.entity.Test;

public class ProductPojo implements Comparable<ProductPojo>
{
    private String colour;
    private char size;
    public  String productId;
    public String productName;
    public String getProductId(){
        return productId;
    }
    public void setProductId(String productId){
        this.productId = productId;
    }
       public String getProductName(){
        return productName;
       }
       public void setProductName(String productName){
        this.productName= productName;
       }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }
    @Override
    public int compareTo(ProductPojo o) {

        return this.productId.compareTo(o.productId);
    }

    public String toString() {
        return this.productId + " -" +this.productName + " -" +this.size + " -" +this.colour;
    }


}
