package Week7;

public class MyTime {
    private int hour, minute, second;
    public MyTime() {
        this.hour =0;
        this.minute =0;
        this.second =0;
    }

    public MyTime(int hour, int minute, int second){
        this.hour=hour;
        this.minute =  minute;
        this.second = second;

        setTime(hour,minute,second);
    }

    public void setTime(int hour,int minute,int second){
        setHour(hour);
        setMinute(minute);
        setSecond(second);
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
        if(hour <0 || hour >23){
            throw new IllegalArgumentException("Wrong hour");
        }
        this.hour = hour;
    }


    public void setMinute(int minute) {
        if(minute <0 || minute>60){
            throw new IllegalArgumentException("Wrong minute");
        }
        this.minute = minute;
    }


    public void setSecond(int second) {
        if(minute <0 || minute>59){
            throw new IllegalArgumentException("Wrong minute");
        }
        this.second = second;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d",getHour(),getMinute(),getSecond());
    }

    public MyTime nextSecond(){

        try{
            if(hour==23 && minute==59 && second==59){
                hour =0;
                minute =0;
                second =0;

            }else{
                setTime(hour,minute,++second);
                return this;
            }
        }catch (IllegalArgumentException e){

            second =0;
            minute++;
            return this;
        }

        return this;

    }
    public MyTime nextMinute(){
        setTime(hour,++minute,second);
        return this;
    }
    public MyTime nextHour(){
        setTime(++hour,minute,second);
        return  this;
    }
    public MyTime previousSecond(){
        try{
            if(hour<1 && minute<1 && second<1){
                hour = 23;
                minute = 59;
                second =59;
            } else{
                setTime(hour,minute,--second);
            }
        }catch (IllegalArgumentException e){
            return this;
        }
        return  this;
    }
    public MyTime previousMinute(){
        setTime(hour,--minute,second);
        return this;
    }
    public MyTime previousHour(){
        setTime(--hour,minute,second);
        return this;
    }


}

