package com.example.demo.controllers;

import com.example.demo.domain.Product;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class BuyNowController {
    @Autowired
    private ApplicationContext context;

    @GetMapping("/buyproduct")
    private String buyProduct(@RequestParam("productID") int theId){
        //retrieve data on productID
        ProductService productService = context.getBean(ProductServiceImpl.class);
        Product product2=productService.findById(theId);
        int inventory = product2.getInv();

        if (inventory < 1) {
            return "failedpurchase";
        } else {
            productService.purchase(product2);
            productService.save(product2);
            return "confirmationbuynow";
        }
    }
}

