package ch11.composition;

import lombok.Getter;

import java.time.Duration;
import java.time.LocalDateTime;

@Getter
public class Call {

    private LocalDateTime from;
    private LocalDateTime to;

    public Call(LocalDateTime from, LocalDateTime to) {
        this.from = from;
        this.to = to;
    }

    public Duration getDuration(){
        return Duration.between(from,to);
    }

}
