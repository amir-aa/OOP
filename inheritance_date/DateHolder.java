public class DateHolder implements Cloneable {

    private String string;
    private Date date;
    private int val;

    public DateHolder clone(){
        try {
            DateHolder var = (DateHolder) super.clone();
            var.date = (Date)date.clone();
            return var;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

    }
    public DateHolder(String string, Date date, int val) {
        this.string = string;
        this.date = (Date)date.clone();
        this.val = val;
    }

    public String toString(){
        return val+" "+string+" "+date;
    }

    public static void main(String[] args) {
        DateHolder dateHolder = new DateHolder("XYY",
                new FormattedDate(), 56);
        System.out.println(dateHolder);
        DateHolder dateHolder1 =  dateHolder.clone();
        System.out.println(dateHolder1);
        dateHolder1.date.setYear(1000);
        System.out.println(dateHolder);
        System.out.println(dateHolder1);
    }
}
