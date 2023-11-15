package com.jonathastassi.eventcontrolapi.repositories;

import com.jonathastassi.eventcontrolapi.models.EventCategoryModel;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventCategoryRepository extends MongoRepository<EventCategoryModel, ObjectId> {
}
