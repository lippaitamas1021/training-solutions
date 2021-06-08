package lambdaintro;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAccessor;
import java.util.Arrays;
import java.util.List;

public class FamilyBirthdays {

    private List<LocalDate> familyBirthdays;

    public FamilyBirthdays(LocalDate... familyBirthdays) {
        this.familyBirthdays = Arrays.asList(familyBirthdays);
    }

    public boolean isFamilyBirthday(TemporalAccessor date) {
        int day = date.get(ChronoField.DAY_OF_MONTH);
        int month = date.get(ChronoField.MONTH_OF_YEAR);
        for (LocalDate familyBirthday : familyBirthdays) {
            if ((familyBirthday.get(ChronoField.MONTH_OF_YEAR) == month) &&
            (familyBirthday.get(ChronoField.DAY_OF_MONTH) == day)) {
                return true;
            }
        }
        return false;
    }

    public int nextFamilyBirthday(TemporalAccessor date) {
        LocalDate today = LocalDate.of(date.get(ChronoField.YEAR),
                                    date.get(ChronoField.MONTH_OF_YEAR),
                                    date.get(ChronoField.DAY_OF_MONTH));
        int min = Integer.MAX_VALUE;
        for (LocalDate familyBirthday : familyBirthdays) {
            LocalDate nextBirthday = familyBirthday.withYear(today.getYear());
                if (nextBirthday.isBefore(today)) {
                    nextBirthday = familyBirthday.withYear(today.getYear() + 1);
                }
                int difference = (int) ChronoUnit.DAYS.between(today, nextBirthday);
                if (difference < min) {
                    min = difference;
                }
        }
        return min;
    }
}
