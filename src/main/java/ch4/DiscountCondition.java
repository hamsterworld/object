package ch4;

import lombok.Getter;
import lombok.Setter;

import java.time.DayOfWeek;
import java.time.LocalTime;

@Getter
@Setter
public class DiscountCondition {
    private DiscountConditionType type;
    private int sequence;
    private DayOfWeek dayOfWeek;
    private LocalTime startTime;
    private LocalTime endTime;

    // GetType  => 캡슐화를 깨는 요인

    // 아래 isDiscountable 의 파라미터를 통해 DiscountCondition 이 DayOfWeek,LocalTime,int 를 포함하고있다는 정보를 노출시키고있다.
    public boolean isDiscountable(DayOfWeek dayOfWeek,LocalTime time){
        if(type != DiscountConditionType.PERIOD){
            throw new IllegalArgumentException();
        }
        return this.dayOfWeek.equals(dayOfWeek) &&
                this.startTime.compareTo(time) <= 0 &&
                this.endTime.compareTo(time) >= 0;
    }

    public boolean isDiscountable(int sequence){
        if(type != DiscountConditionType.SEQUENCE){
            throw new IllegalArgumentException();
        }
        return this.sequence == sequence;
    }
}
