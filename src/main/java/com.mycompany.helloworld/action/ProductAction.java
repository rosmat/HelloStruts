package com.mycompany.helloworld.action;

import com.mycompany.helloworld.test1.Product;
import com.mycompany.helloworld.test1.Service;
import com.opensymphony.xwork2.ActionSupport;

import java.util.List;

/**
 * Created by Mateusz on 27.07.2016.
 */
public class ProductAction extends ActionSupport {

    private Integer n;
    private List<Product> products;

    public void setN(Integer n) {
        this.n = n;
    }

    public List<Product> getProducts() {
        return products;
    }

    public String execute() throws Exception {
        this.products = Service.getProducts(n);
        return SUCCESS;
    }
}
