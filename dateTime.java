import java.time.LocalDate;

public static String findDay(int month, int day, int year) {
        LocalDate dt = LocalDate.of(year, month, day);
        return dt.getDayOfWeek().name();

    }

//alternative method
return LocalDate.of(year, month, day).getDayOfWeek().name();
