package com.springboot.learning.DI_IoC_Beans;

import org.springframework.stereotype.Component;

@Component
public class Hardisk
{
    public String getHardisk()
    {
        return "Hardisk is of 512 GB";
    }
}
