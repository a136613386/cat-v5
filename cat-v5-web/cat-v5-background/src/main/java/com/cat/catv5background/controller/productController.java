package com.cat.catv5background.controller;

import com.cat.v5.product.interfaces.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class productController {

    @Autowired
    private IProductService productService;

    @RequestMapping("getHello")
    @ResponseBody
    public String getHello(){
        return "hello";
    }

}
