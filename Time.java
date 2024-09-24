package java_qap1;

public class Time {
    
    private int seconds;
    private int minutes;
    private int hours;

    public Time(int hours, int minutes, int seconds) {
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
    }

    public int getSeconds() {
        return this.seconds;
    }

    public int getMinutes() {
        return this.minutes;
    }

    public int getHours() {
        return this.hours;
    }

    public void secondsSet(int seconds) {
        this.seconds = seconds;
    }

    public void minutesSet(int minutes) {
        this.minutes = minutes;
    }

    public void hoursSet(int hours) {
        this.hours = hours;
    }

    public void setTime(int seconds, int minutes, int hours) {
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
    }

    public String toString() {
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }

    public Time nextSecond() {
        this.seconds++;
        if (this.seconds == 60) {
            this.seconds = 0;
            this.minutes++;
            if (this.minutes == 60) {
                this.minutes = 0;
                this.hours++;
                if (this.hours == 24) {
                    this.hours = 0;
                }
            }
        }
        return this;
    }

    public Time previousSecond() {
        this.seconds--;
        if (this.seconds < 0) {
            this.seconds = 59;
            this.minutes--;
            if (this.minutes < 0) {
                this.minutes = 59;
                this.hours--;
                if (this.hours < 0) {
                    this.hours = 23;
                }
            }
        }
        return this;
    }
}
