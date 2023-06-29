public class FormattedDate extends Date{
    enum Format{DDMMYYYY, MMDDYYYY, YYYYMMDD}

    enum Month{JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY,
        AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER}
    private Format format;

    public FormattedDate(String m, int d, int y){
        this(m, d, y, Format.DDMMYYYY);
//        setMonth(m);
//        setDay(d);
//        setYear(y);
//        format = Format.DDMMYYYY;
    }

    public FormattedDate(String m, int d, int y, Format f){
        setMonth(m);
        setDay(d);
        setYear(y);
        format = f;
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

    public static void main(String[] args) {
        FormattedDate date = new FormattedDate("July", 5, 1987, Format.YYYYMMDD);
        date.writeOutput();
    }
}
