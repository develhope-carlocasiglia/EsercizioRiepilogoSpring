package co.develhope.Calendar.controller;

import co.develhope.Calendar.model.Calendar;
import co.develhope.Calendar.model.DTO.EventDTO;
import co.develhope.Calendar.model.Event;
import co.develhope.Calendar.model.User;
import co.develhope.Calendar.service.CalendarService;
import co.develhope.Calendar.service.UserService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpResponse;

@RestController
@RequestMapping(name = "/calendar")
public class MainController {

    @Autowired
    private UserService userService;
    @Autowired
    private CalendarService calendarService;

    @PostMapping("/add-event")
    public ResponseEntity addEvent(
            @RequestBody EventDTO newEventDTO,
            @RequestParam int ownerId,
            @RequestParam int calendarId) {
        try {
            User owner = userService.findUserById(ownerId);
            Calendar calendar = calendarService.findCalendarById(calendarId);
            Event newEvent = new Event(
                    newEventDTO.getDateBegin(),
                    newEventDTO.getDateEnd(),
                    newEventDTO.getTitle(),
                    newEventDTO.getDescription(),
                    owner,
                    calendar);
            return ResponseEntity.ok(newEvent);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

}
