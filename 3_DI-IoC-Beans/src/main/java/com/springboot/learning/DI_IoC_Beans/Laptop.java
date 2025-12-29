package com.springboot.learning.DI_IoC_Beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Laptop
{
    // Field Injection
    @Autowired          // Automatic connection with actul object from BEAN
    Hardisk hobj;

    @Autowired
    Ram robj;

    @GetMapping("Laptop")
    public String LaptopInformation()
    {
        String h = hobj.getHardisk();
        String r = robj.getRam();

        String data = "Laptop Configuration : "+h+" & "+r;

        return data;

        //return "It is a Laptop having __ configuration";
    }
}
