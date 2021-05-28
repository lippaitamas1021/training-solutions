package enumtype.week;

public enum Day {
    MONDAY(DayType.WORKDAY, 0),
    TUESDAY(DayType.WORKDAY, 2),
    WEDNESDAY(DayType.WORKDAY, 3),
    THURSDAY(DayType.WORKDAY, 4),
    FRIDAY(DayType.WORKDAY, 5),
    SATURDAY(DayType.HOLIDAY, 6),
    SUNDAY(DayType.HOLIDAY, 7);

    private DayType type;
    private int index;

    Day(DayType type, int index) {
        this.type = type;
        this.index = index;
    }

    public DayType getType() {
        return type;
    }

    public int getIndex() {
        return index;
    }
}
