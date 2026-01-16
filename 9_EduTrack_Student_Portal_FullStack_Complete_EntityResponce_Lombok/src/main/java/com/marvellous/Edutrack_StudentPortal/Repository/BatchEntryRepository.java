package com.marvellous.Edutrack_StudentPortal.Repository;

import com.marvellous.Edutrack_StudentPortal.Entity.BatchEntry;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

// @Repository     // Optional, but good practice
public interface BatchEntryRepository extends MongoRepository<BatchEntry, ObjectId>
{

}
