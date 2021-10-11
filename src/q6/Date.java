package q6;

public class Date {

    private int month;
    private int day;
    private int year;

    //Create Constructor
    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    //Create set and get methods
    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    //Display Date method
    public void displayDate(){
        System.out.printf("Date is %d %d %d", month, day,year);
    }
}
