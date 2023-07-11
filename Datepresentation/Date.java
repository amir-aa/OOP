public class Date implements Comparable<Date>, Cloneable
{

    public int compareTo(Date that){
        if(year==that.year){
            if(month.equals(that.month)){
               return day-that.day;
            }

            return FormattedDate.Month.valueOf(month.toUpperCase()).ordinal()-
                    FormattedDate.Month.valueOf(that.month.toUpperCase()).ordinal();
        }
        return year-that.year;
    }

    public Object clone(){
        try {
            return (Date)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
    private static int index =0;

    private String month = "May";
    private int day = 13;
    private int year = 1675; //a four digit number.

    public Date(Date that){
        this(that.month,that.day, that.year);
    }
    public Date(String month, int day, int year){
        index++;
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public Date(){
        this("June", 14, 1675);
    }

    public Date nextYear(){
        Date result = new Date(this);
        result.year++;
        return result;
    }
    public int getYear(){
        return year;
    }
    public void setYear(int year){
        if(year>=0){
            this.year = year;
        }
        else
            System.exit(0);
    }
    public void writeOutput()
    {
        System.out.println(month + " " + day + ", " + year);
    }

    public String toString(){
        return month + " " + day + ", " + year;
    }

    public static void main(String[] args)
    {
//        System.out.println(index);
//        Date date1, date2;
//        date1 = new Date();
//        System.out.println(index);
//        System.out.println("date1 before :");
//        date1.writeOutput();
//        date2 = new Date(date1);
//        //date2 = new Date("July", 4, 1776);
//        date1.month = "December";
//        date1.day = 31;
//        date1.year = 2012;
//        System.out.println("date1 after:");
//        date1.writeOutput();
//        //date2.month = "July";
//       // date2.day = 4;
//        //date2.year = 1776;
//        System.out.println("date2:");
//        date2.writeOutput();

        //doThing();

        System.out.println(index);
    }

    public static void doThing(){
        new Date().writeOutput();
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public boolean equals(Object that){
        if(that==null)
            return false;
        else if(getClass() != that.getClass())
            return false;
        else if (this==that)
            return true;
        else{
            Date other = (Date) that;
            return day==other.day && year==other.year && month.equals(other.month);
        }
    }
}
