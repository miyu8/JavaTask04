/**
 * Created by Mihail Lobanov on 13.11.2016.
 */
public class DateMonthYear {

    private int date;
    private int month;
    private int year;
    private boolean err = false;

    public DateMonthYear(int date, int month, int year) {
        boolean mistake = false;
        if (month > 0 && month < 13 && date > 0) {
            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                mistake = date < 32;
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                mistake = date < 31;
            } else if (year % 4 == 0) {
                mistake = date < 30;
            } else {
                mistake = date < 29;
            }
        }
        if (mistake) {
            err = false;
            this.date = date;
            this.month = month;
            this.year = year;
        } else {
            err = true;
        }
    }

    public int getDate() {

        return date;
    }

    public int getMonth() {

        return month;
    }

    public int getYear() {

        return year;
    }

    public boolean error() {
        return err;
    }
}