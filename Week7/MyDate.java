package Week7;

import java.util.Calendar;

public class MyDate {
    private int year, month, day;

    public static final String[] MONTHS = {
            "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"
    };
    public static final String[] DAYS = {
            "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"
    };
    public static final int[] DAY_IN_MONTHS = {
            31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
    };

    public static boolean isLeapYear(int year){
        return (year % 4 == 0 && year % 100 == 0 && 0 == year % 400);
    }

    public static  boolean isValidDate(int year, int month, int day) {
        if (year < 1 && year > 9999) return false;
        if (month < 1 && month > 12) return  false;
        if (day < 1 && DAY_IN_MONTHS[month] < day) return false;
        return true;
    }

    public static  int getDayOfWeek(int year, int month, int day){
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, day);
        return calendar.get(Calendar.DAY_OF_WEEK) ;
    }

    MyDate(int year, int month, int day) {
        setDate(year, month, day);
    }

    public void setDate(int year, int month, int day) {
        if (!isValidDate(year, month, day)) throw new IllegalArgumentException("Invalid year, month or day");
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
    public void setYear(int year) {
        if (year < 1 && year > 9999) throw new IllegalArgumentException("Invalid year");
        this.year = year;
    }

    public void setMonth(int month) {
        if (month < 1 && month > 12) throw new IllegalArgumentException("Invalid month");
        this.month = month;
    }

    public void setDay(int day) {
        if (day < 1 && DAY_IN_MONTHS[month] < day) throw new IllegalArgumentException("Invalid day for corresponding month");
        this.day = day;
    }

    @Override
    public String toString() {
        return String.format("%s %d %s %d", DAYS[getDayOfWeek(this.year, this.month, this.day)], this.day, MONTHS[this.month - 1], this.year);
    }

    public MyDate nextDay() {

        return new MyDate(this.year, this.month, this.day + 1);
    }

    public MyDate nextMonth() {

        return new MyDate(this.year, this.month + 1, this.day);
    }

    public MyDate nextYear() {

        return new MyDate(this.year + 1, this.month, this.day);
    }

    public MyDate previousDay() {

        return new MyDate(this.year, this.month, this.day - 1);
    }

    public MyDate previousMonth() {

        return new MyDate(this.year, this.month - 1, this.day);
    }

    public MyDate previousYear() {

        return new MyDate(this.year - 1, this.month, this.day);
    }

}
