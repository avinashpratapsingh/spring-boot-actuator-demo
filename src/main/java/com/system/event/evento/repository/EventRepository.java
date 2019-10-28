package com.system.event.evento.repository;

import com.system.event.evento.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public interface  EventRepository extends JpaRepository<Event, Long> {

    @Query(value = "Select * from Event where id=?1",nativeQuery = true)
    List<Event> getAllEventWithId(Long id);

    @Query(value = "Select * from Event where event_name=?1",nativeQuery = true)
    List<Event> getAllEventWithName(String eventName);

    @Modifying
    @Query(value = "DELETE from Event e where e.id=?1",nativeQuery = true)
    void deleteById(Long id);
}
