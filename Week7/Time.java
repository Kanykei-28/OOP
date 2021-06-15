package Week7;

public class Time{
    private int hour, minute, second;
    public Time(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second =  second;

    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void setTime(int hour,int minute,int second){

        setHour(hour);
        setMinute(minute);
        setSecond(second);

    }

    @Override
    public String toString() {

        return String.format("%02d:%02d:%02d", getHour(),getMinute(),getSecond());
    }

    public Time nextSecond(){
        setTime(hour,minute,++second);
        return this;
    }
    public Time previousSecond(){
        setTime(hour,minute,--second);
        return this;
    }
}
