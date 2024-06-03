package ch14.advanced;

import ch14.Call;
import ch14.DateTimeInterval;

import java.util.Collections;
import java.util.List;

public class FixedFeeCondition implements FeeCondition{
    @Override
    public List<DateTimeInterval> findTimeIntervals(Call call) {
        return Collections.singletonList(call.getInterval());
    }
}
