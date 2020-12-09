package week07d03;

public class Date {

    private final int year;
    private final int month;
    private final int day;

    public static final int[] DAYS_OF_MONTH = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public static final int[] DAYS_OF_MONTH_LEAP_YEAR = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public static Date of(int year, int month, int day) {
        return new Date(year, month, day);
    }

    public Date withYear(int year) {
        return new Date(year, month, day);
    }

    public Date withMonth(int month) {
        return new Date(year, month, day);
    }

    public Date withDay(int day) {
        return new Date(year, month, day);
    }

    public boolean leapYear(int year) {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }

    public void paramCheck(int year, int month, int day) {
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Wrong month");
        }
        if (leapYear(year)) {
            if (day < 1 || day > DAYS_OF_MONTH_LEAP_YEAR[month]) {
                throw new IllegalArgumentException("Wrong day");
            }
        } else {
            if (day < 1 || day > DAYS_OF_MONTH[month]) {
                throw new IllegalArgumentException("Wrong day");
            }
        }
    }

    public static void main(String[] args) {
        Date date = new Date(2020, 5, 5);
        System.out.println(date.getYear() + "." + date.getMonth() + "." + date.day +".");
        System.out.println(date.leapYear(2020));
    }
}
