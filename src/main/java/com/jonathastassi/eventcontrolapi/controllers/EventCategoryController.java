package com.jonathastassi.eventcontrolapi.controllers;

import com.jonathastassi.eventcontrolapi.dtos.CreateEventCategoryDto;
import com.jonathastassi.eventcontrolapi.dtos.UpdateEventCategoryDto;
import com.jonathastassi.eventcontrolapi.mappers.EventCategoryMapper;
import com.jonathastassi.eventcontrolapi.models.EventCategoryModel;
import com.jonathastassi.eventcontrolapi.services.EventCategoryService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/event-categories")
public class EventCategoryController {

    @Autowired
    private EventCategoryService eventCategoryService;

    @GetMapping
    public ResponseEntity<List<EventCategoryModel>> getAllCategory() {
        List<EventCategoryModel> data = eventCategoryService.getAll();
        return ResponseEntity.ok(data);
    }

    @PostMapping
    public ResponseEntity<EventCategoryModel> createCategory(@RequestBody CreateEventCategoryDto createEventCategoryDto) {
        EventCategoryModel eventCategoryModel = eventCategoryService.create(EventCategoryMapper.toModel(createEventCategoryDto));

        return ResponseEntity.ok(eventCategoryModel);
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateCategory(@PathVariable ObjectId id, @RequestBody UpdateEventCategoryDto updateEventCategoryDto) {
        return ResponseEntity.ok("Get All Category - teste");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCategory(@PathVariable ObjectId id) {
        return ResponseEntity.ok("Get All Category - teste");
    }
}
