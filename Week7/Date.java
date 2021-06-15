package Week7;

public class Date {
    private int day, month, year;

    public Date(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;

    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDate(int day,int month,int year){
        setDay(day);
        setMonth(month);
        setYear(year);
    }

    @Override
    public String toString() {
        return String.format("%02d/%02d/%04d",getDay(),getMonth(),getYear());

    }


}

