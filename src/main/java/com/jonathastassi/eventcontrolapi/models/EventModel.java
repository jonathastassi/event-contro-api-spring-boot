package com.jonathastassi.eventcontrolapi.models;

import com.jonathastassi.eventcontrolapi.base.BaseModel;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "events")
public class EventModel extends BaseModel {
    public String name;
}
