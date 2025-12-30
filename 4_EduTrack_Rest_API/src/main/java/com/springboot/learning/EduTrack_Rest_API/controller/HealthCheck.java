package com.springboot.learning.EduTrack_Rest_API.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheck
{
    @GetMapping("HealthCheck")
    public  String HealthCheck()
    {
        return "Everything is Ok";
    }
}
