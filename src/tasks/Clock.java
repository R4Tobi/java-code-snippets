package tasks;

public class Clock {
    int minutes;
    int hours;

    public Clock() {
        int minute = minutes;
        int hour = hours;
    }

    public int[] init(int hour, int minute){
        this.hours = hour;
        this.minutes = minute;

        overload(this.hours, this.minutes);

        return new int[]{this.hours, this.minutes};
    }

    private void overload(int hour, int minute){
        if(hour > 23){
            this.hours = hour - 24;
            overload(this.hours, this.minutes);
        }
        if(minute > 59){
            this.hours++;
            this.minutes = minute - 60;
            overload(this.hours, this.minutes);
        }
    }

    public int getMinutes(){
        return this.minutes;
    }

    public int getHours(){ return this.hours; }

    public void addHours(int hours){
        this.hours += hours;
        overload(this.hours, this.minutes);
    }

    public void addMinutes(int minutes){
        this.minutes += minutes;
        overload(this.hours, this.minutes);
    }

    public String returnString(){
        return this.hours + ":" + this.minutes;
    }
}
