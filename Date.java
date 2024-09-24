package java_qap1;

public class Date {
    private int years;
    private int months;
    private int days;

public Date(int days, int months, int years) {
    this.years = years;
    this.months = months;
    this.days = days;
    }

    public int getYears() {
        return this.years;
    }

    public int getMonths() {
        return this.months;
    }

    public int getDays() {
        return this.days;
    }

    public void yearsSet(int years) {
        this.years = years;
    }

    public void monthsSet(int months) {
        this.months = months;
    }

    public void daysSet(int days) {
        this.days = days;
    }

    public void datesSet(int days, int months, int years) {
        this.days = days;
        this.months = months;
        this.years = years;
    }

    public String toString() {
        return String.format("%02d/%02d/%04d", days, months, years);
    }
}
