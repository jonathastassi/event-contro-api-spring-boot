package com.jonathastassi.eventcontrolapi.services;

import com.jonathastassi.eventcontrolapi.models.EventCategoryModel;
import com.jonathastassi.eventcontrolapi.repositories.EventCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventCategoryService {

    @Autowired
    private EventCategoryRepository eventCategoryRepository;

    public EventCategoryModel create(EventCategoryModel eventCategoryModel) {
        EventCategoryModel model = eventCategoryRepository.save(eventCategoryModel);
        return model;
    }

    public List<EventCategoryModel> getAll() {
        return eventCategoryRepository.findAll();
    }
}
