package co.develhope.Calendar.service;

import co.develhope.Calendar.model.Calendar;
import co.develhope.Calendar.repository.CalendarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CalendarService {

    @Autowired
    private CalendarRepository calendarRepository;
    @Autowired
    private UserService userService;

    public Calendar findCalendarById(int calendarId) throws Exception {
        Optional<Calendar> calendarOptional = calendarRepository.findById(calendarId);
        if (calendarOptional.isEmpty()) throw new Exception(String.format("Cannot find calendar with calendar id: %d\n", calendarId));
        return calendarOptional.get();
    }

}
