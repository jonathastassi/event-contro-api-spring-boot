package com.jonathastassi.eventcontrolapi.models;

import com.jonathastassi.eventcontrolapi.base.BaseModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;

@Document(collection = "eventCategories")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EventCategoryModel extends BaseModel {
    private String name;
    private String description;
    private List<EventModel> events;
}
