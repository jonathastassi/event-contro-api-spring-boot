package com.jonathastassi.eventcontrolapi.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CreateEventCategoryDto {
    private String name;
    private String description;
}
