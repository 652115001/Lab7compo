package se331.lab.rest.dao;

import se331.lab.rest.entity.Event;

import java.util.List;

public interface EventDao {
    Integer getEventSize();
    List<Event> getEvents(Integer pageSize, Integer page);
    Event getEventById(Long id);

    Event getEvent(Long id);
}