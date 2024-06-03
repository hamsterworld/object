package ch14;

import lombok.Getter;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
public class Call {

    private DateTimeInterval interval;

    public Call(LocalDateTime from ,LocalDateTime to) {
        this.interval = DateTimeInterval.of(from,to);
    }

    public Duration getDuration(){
        return interval.duration();
    }

    public LocalDateTime getFrom(){
        return interval.getFrom();
    }
    public LocalDateTime getTo(){
        return interval.getTo();
    }

    public List<DateTimeInterval> splitByDay() {
        return interval.splitByDay();
    }


}
