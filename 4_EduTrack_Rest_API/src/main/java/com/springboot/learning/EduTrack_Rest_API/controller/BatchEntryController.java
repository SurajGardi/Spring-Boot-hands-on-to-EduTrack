package com.springboot.learning.EduTrack_Rest_API.controller;

import com.springboot.learning.EduTrack_Rest_API.Entity.BatchEntry;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/batches")
public class BatchEntryController
{
    private Map<Long, BatchEntry> batchentries = new HashMap<>();

    @GetMapping
    public List<BatchEntry> getAll()
    {
        return  new ArrayList<>(batchentries.values());
    }

    @PostMapping
    public boolean createEntry(@RequestBody BatchEntry myentry)
    {
        batchentries.put(myentry.getId(),myentry);
        return true;
    }
}


// inside Controller package

// BatchEntryController is for accessing the BatchEntries from BatchEntry class

// Now for adding data we use POSTMAN
// go to postman paste url map endpoint as http://localhost:8080/batches
// then select method as POST => then select => Body => raw => JSON and write data according to the characterstics as:
// {
//    "id" : 1,
//    "name" : "LB++ ",
//    "fees" : 35000
//}

// then send => then Choose GET method and you will see the inserted data

