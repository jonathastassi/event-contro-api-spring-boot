package com.jonathastassi.eventcontrolapi.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/event-categories")
public class EventCategoryController {
    @GetMapping
    public ResponseEntity<String> getAllCategory() {
        return ResponseEntity.ok("Get All Category");
    }
}
