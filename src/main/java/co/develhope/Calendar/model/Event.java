package co.develhope.Calendar.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "events")
public class Event {

    @Id
    private int id;
    private LocalDateTime dateBegin;
    private LocalDateTime dateEnd;
    private String title;
    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(
            name = "owner_id",
            nullable = false,
            unique = true)
    private User owner;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(
            name = "calendar_id",
            nullable = false,
            unique = true)
    private Calendar calendar;

    // BONUS: participants
    // many-to-many association with calendar (an event can appear in many calendars)

    public Event() {
    }

    public Event(LocalDateTime dateBegin, LocalDateTime dateEnd, String title, String description, User owner, Calendar calendar) {
        this.dateBegin = dateBegin;
        this.dateEnd = dateEnd;
        this.title = title;
        this.description = description;
        this.owner = owner;
        this.calendar = calendar;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getDateBegin() {
        return dateBegin;
    }

    public void setDateBegin(LocalDateTime dateBegin) {
        this.dateBegin = dateBegin;
    }

    public LocalDateTime getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(LocalDateTime dateEnd) {
        this.dateEnd = dateEnd;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Calendar getCalendar() {
        return calendar;
    }

    public void setCalendar(Calendar calendar) {
        this.calendar = calendar;
    }
    // private User user;
    // private Set<User> participants;

}
