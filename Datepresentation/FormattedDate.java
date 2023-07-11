public class FormattedDate extends Date{
    enum Format{DDMMYYYY, MMDDYYYY, YYYYMMDD}

    enum Month{JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY,
        AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER}
    private Format format;

    public FormattedDate(String m, int d, int y){
        this(m, d, y, Format.DDMMYYYY);
    }

    public FormattedDate(String m, int d, int y, Format f){
        super(m, d, y);
        format = f;
    }

    public FormattedDate(FormattedDate that){
        super(that);
        format = that.format;
    }

    public FormattedDate(){
        this("May", 15, 1897, Format.MMDDYYYY);
    }

    public Object clone(){
        return (FormattedDate)super.clone();
    }

    public FormattedDate nextYear() {
        FormattedDate result = new FormattedDate(this);
        result.setYear(result.getYear()+1);
        return result;
    }

    public static void writeOutput(Date date, Format format){
        String day = date.getDay()<10?"0"+date.getDay():date.getDay()+"";
        int m = Month.valueOf(date.getMonth().toUpperCase()).ordinal();
        String month = (m+1)<10?"0"+(m+1):(m+1)+"";

        switch (format){
            case DDMMYYYY:
                System.out.println(day+"/"+month+"/"+date.getYear());
                break;
            case MMDDYYYY:
                System.out.println(month+"/"+day+"/"+date.getYear());
                break;
            case YYYYMMDD:
                System.out.println(date.getYear()+"/"+month+"/"+day);
                break;
        }
    }

    public void writeOutput(){
        writeOutput(this, format);
    }

    public String toString(){
        String day = getDay()<10?"0"+getDay():getDay()+"";
        int m = Month.valueOf(getMonth().toUpperCase()).ordinal();
        String month = (m+1)<10?"0"+(m+1):(m+1)+"";

        switch (format){
            case DDMMYYYY:
                return (day+"/"+month+"/"+getYear());
            case MMDDYYYY:
                return (month+"/"+day+"/"+getYear());

            case YYYYMMDD:
                return (getYear()+"/"+month+"/"+day);

        }
        return null;
    }

    public boolean equals(Object that){
       return super.equals(that) && format == ((FormattedDate)that).format;
    }

    public static void main(String[] args) {
        FormattedDate date = new FormattedDate("March", 5, 1989, Format.YYYYMMDD);
        FormattedDate date1 = new FormattedDate("July", 5, 1987, Format.YYYYMMDD);
        //date.writeOutput();
        //writeOutput(date.nextYear(), Format.DDMMYYYY);
        //Date date1 = new FormattedDate("July", 5, 1987, Format.YYYYMMDD);
        System.out.println(date.compareTo(date1));
    }
}
