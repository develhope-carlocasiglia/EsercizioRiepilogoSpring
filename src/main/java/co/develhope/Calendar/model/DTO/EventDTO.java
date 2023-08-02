package co.develhope.Calendar.model.DTO;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;

public class EventDTO {

    @JsonFormat(pattern="yyyy-MM-dd HH:mm")
    private LocalDateTime dateBegin;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm")
    private LocalDateTime dateEnd;
    private String title;
    private String description;

    public EventDTO() {
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
}
