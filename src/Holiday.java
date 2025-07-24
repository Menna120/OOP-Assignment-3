public class Holiday {
    private String name;
    private int day;
    private String month;

    public Holiday(String name, int day, String month) {
        this.name = name;
        this.day = day;
        this.month = month;
    }

    public boolean inSameMonth(Holiday otherHoliday) {
        return this.month.equalsIgnoreCase(otherHoliday.month);
    }

    public double avgDate(Holiday[] holidays) {
        if (holidays == null || holidays.length == 0) {
            return 0.0;
        }

        double sumOfDays = 0;
        for (Holiday holiday : holidays) {
            sumOfDays += holiday.day;
        }
        return sumOfDays / holidays.length;
    }

    public String getName() {
        return name;
    }

    public int getDay() {
        return day;
    }

    public String getMonth() {
        return month;
    }
}
