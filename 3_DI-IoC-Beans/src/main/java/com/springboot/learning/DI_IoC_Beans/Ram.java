package com.springboot.learning.DI_IoC_Beans;

import org.springframework.stereotype.Component;

@Component
public class Ram
{
    public String getRam()
    {
        return "Ram is of 8 GB";
    }
}
