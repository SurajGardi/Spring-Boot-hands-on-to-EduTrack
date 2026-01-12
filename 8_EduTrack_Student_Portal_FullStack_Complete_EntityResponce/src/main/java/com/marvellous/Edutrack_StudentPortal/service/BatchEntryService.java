package com.marvellous.Edutrack_StudentPortal.service;

import com.marvellous.Edutrack_StudentPortal.Entity.BatchEntry;
import com.marvellous.Edutrack_StudentPortal.Repository.BatchEntryRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class BatchEntryService
{
    @Autowired
    private BatchEntryRepository batchEntryRepository;

    // C : Create
    // POST : HTTP Verb
    public void saveEntry(BatchEntry batchEntry)
    {
        batchEntryRepository.save(batchEntry);
    }

    // R : Read
    // GET
    public List<BatchEntry> getAll()
    {
        return batchEntryRepository.findAll();
    }

    // R : Read
    // GET
    public Optional<BatchEntry> findById(ObjectId id)
    {
        return  batchEntryRepository.findById(id);
    }

    // D : Delete
    // DELETE
    public void deleteByID(ObjectId id)
    {
        batchEntryRepository.deleteById(id);
    }

    // U : Update
    // PUT
    public void updateById(ObjectId id)
    {
        batchEntryRepository.findById(id);
    }
}
