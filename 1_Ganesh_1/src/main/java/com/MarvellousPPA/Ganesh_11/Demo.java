package com.MarvellousPPA.Ganesh_11;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo
{
    @GetMapping("PPA")
    public String Display()
    {
        return "<h1>Jay Ganesh..!</h1>";
    }
}
