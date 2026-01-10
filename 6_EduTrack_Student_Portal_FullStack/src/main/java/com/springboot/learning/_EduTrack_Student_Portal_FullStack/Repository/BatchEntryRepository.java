package com.springboot.learning._EduTrack_Student_Portal_FullStack.Repository;

import com.springboot.learning._EduTrack_Student_Portal_FullStack.Entity.BatchEntry;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BatchEntryRepository extends MongoRepository<BatchEntry, ObjectId>
{
}


