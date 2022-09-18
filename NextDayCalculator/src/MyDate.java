public class MyDate {
    int day;
    int month;
    int year;



    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }



    public boolean isEndOfYear() {
        if(this.day==31 && this.month==12) return true;
        return false;
    }

    public boolean isMonthHas30Day(int month) {
     switch (month) {
         case 4 :
         case 6 :
         case 9:
         case 11:
             return true;
         default:
             return false;
     }

    }

    public boolean isMonthHas31Days(int month) {
        switch (month) {
            case 1 :
            case 3 :
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return true;
            default:return false;
        }
    }

    public boolean isEndOfMonth() {
        if(this.day==30 && isMonthHas30Day(this.month))
            return true;
        if(this.day==31 && isMonthHas31Days(this.month))
            return true;
        if(this.day==28 && this.month==2 && !isLeapYear(this.year))
            return true;
        if (this.day==29 && this.month==2 && isLeapYear(this.year))
            return true;
        return false;
    }

    public boolean isLeapYear(int year) {
       if(this.year %4 == 0 && this.year %100 !=0)
           return true;
       return false;
    }

    public MyDate getNextDate() {
        if(isEndOfYear()) {
            return  new MyDate(1,1,this.year+1);
        }
        else if (isEndOfMonth()) {
            return new MyDate(1,this.month +1,this.year);
        } else {
            return new MyDate(this.day + 1,this.month, this.year);
        }

    }
     public String toString() {
        return this.day + "/" + this.month+ "/"+ this.year;
     }

}
