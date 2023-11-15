package com.jonathastassi.eventcontrolapi.mappers;

import com.jonathastassi.eventcontrolapi.dtos.CreateEventCategoryDto;
import com.jonathastassi.eventcontrolapi.models.EventCategoryModel;

public class EventCategoryMapper {
    public static EventCategoryModel toModel(CreateEventCategoryDto createEventCategoryDto) {
        EventCategoryModel evento = new EventCategoryModel();
        evento.setName(createEventCategoryDto.getName());
        evento.setDescription(createEventCategoryDto.getDescription());
        return evento;
    }
}
