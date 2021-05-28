package enumtype.week;

import java.util.ArrayList;
import java.util.List;

public class WorkdayCalculator {

       public List<DayType> dayTypes(Day firstDay, int numberOfDays) {
           List<DayType> result = new ArrayList<>();
           for (int i = firstDay.getIndex(); i < (firstDay.getIndex() + numberOfDays); i++) {
               result.add(Day.values()[i].getType());
           }
           return result;
    }

    private Day nextDay(Day day) {
        if (day.ordinal() == Day.values().length - 1) {
            return Day.values()[0];
        } else {
            return Day.values()[day.ordinal() + 1];
        }
    }
}
