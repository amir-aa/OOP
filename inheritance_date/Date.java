/*This is a sample for OOP concepts and inheritance for classes in pure JAVA */
public class Date
{

    private static int index =0;

    public Date(Date that){
        this(that.month,that.day, that.year);
//        this.month = that.month;
//        this.day = that.day;
//        this.year = that.year;
    }
    public Date(String month, int day, int year){
        index++;
        this.month = month;
        this.day = day;
        this.year = year;
        //this.
    }

    public Date(){
        this("June", 14, 1675);
        //doThing();
//        this.month = "May";
//        this.day = 12;
//        this.year = 1978;
        //this.
    }

    private String month = "May";
    private int day = 13;
    private int year = 1675; //a four digit number.

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

    public static void main(String[] args)
    {
        System.out.println(index);
        Date date1, date2;
        date1 = new Date();
        System.out.println(index);
        System.out.println("date1 before :");
        date1.writeOutput();
        date2 = new Date(date1);
        //date2 = new Date("July", 4, 1776);
        date1.month = "December";
        date1.day = 31;
        date1.year = 2012;
        System.out.println("date1 after:");
        date1.writeOutput();
        //date2.month = "July";
       // date2.day = 4;
        //date2.year = 1776;
        System.out.println("date2:");
        date2.writeOutput();

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
}
