public class Date
{
    protected String month;
    int day;
    private int year; //a four digit number.

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
        Date date1, date2;
        date1 = new Date();
        date2 = new Date();
        date1.month = "December";
        date1.day = 31;
        date1.year = 2012;
        System.out.println("date1:");
        date1.writeOutput();
        date2.month = "July";
        date2.day = 4;
        date2.year = 1776;
        System.out.println("date2:");
        date2.writeOutput();
    }
}
