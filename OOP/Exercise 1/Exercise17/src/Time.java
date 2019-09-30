public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    @Override
    public String toString() {
        if (this.hour <= 9 && this.minute <= 9 & this.second <= 9) {
            return "0" + this.hour + ":0" + this.minute + ":0" + this.second;
        } else {
            return this.hour + ":" + this.minute + ":" + this.second;
        }
    }

    private Time nextSecond() {
        if (this.second == 59) {
            this.second = 0;
            this.minute++;
        } else {
            this.second++;
        }
        return this;
    }

    private Time previousSecond() {
        if (this.second == 0) {
            this.second = 59;
            this.minute--;
        } else {
            this.second--;
        }
        return this;
    }
}
