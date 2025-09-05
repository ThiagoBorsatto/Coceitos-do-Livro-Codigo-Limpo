package br.com.codigolimpo.refatorandoOSerialDate;

import java.io.Serializable;
import java.text.DateFormatSymbols;
import java.util.Calendar;

public abstract class DayDate {
    /*
    implements Comparable, Serializable {
    public static enum Month {
        JANUARY(1), FEBRUARY(2), MARCH(3), APRIL(4), MAY(5), JUNE(6), JULY(7), AUGUST(8), SEPTEMBER(9), OCTOBER(10), NOVEMBER(11), DECEMBER(12);
        public final int index;

        Month(int index) {
            this.index = index;
        }
    }

    public static Month make(int monthIndex) {
        for (Month m : Month.values()) {
            if (m.index == monthIndex)
                return m;
        }
        throw new IllegalArgumentException("Invalid month index " + monthIndex);
    }

    public enum WeekInMonth {
        FIRST(1), SECOND(2), THIRD(3), FOURTH(4), LAST(0);
        public final int index;

        WeekInMonth(int index) {
            this.index = index;
        }
    }

    public enum Day {
        MONDAY(Calendar.MONDAY), TUESDAY(Calendar.TUESDAY), WEDNESDAY(Calendar.WEDNESDAY), THURSDAY(Calendar.THURSDAY), FRiDAY(Calendar.FRIDAY), SATURDAY(Calendar.SATURDAY), SUNDAY(Calendar.SUNDAY);

        public final int index;
        private static DateFormatSymbols dateSymbols = new DateFormatSymbols();

        Day(int day) {
            index = day;
        }
    }

    public static Day make(int index) throws IllegalArgumentException {
        for (Day d : Day.values())
            if (d.index == index)
                return d;
        throw new IllegalArgumentException(String.format("Illegal day index: %d.", index));
    }

    public static Day parse(String s) throws IllegalArgumentException {
        String[] shortWeekDayNames = dateSymbols.getShortWeekdays();
        String[] weekDayNames = dateSymbols.getWeekdays();

        s = s.trim();
        for (Day day : Day.values()) {
            if (s.equalsIgnoreCase(shortWeekDayNames[day.index]) || s.equalsIgnoreCase(weekDayNames[day.index])) {
                return day;
            }
        }
        throw new IllegalArgumentException(String.format("%s is not a valid weekday string", s));
    }

    public String toString() {
        return dateFormatSymbols.getWeekdays()[index - 1];
    }

    public String toShortString() {
        return dateFormatSymbols.getWeekdays()[index - 1];
    }

    public static String[] getMonthNames() {
        return dateFormatSymbols.getMonths();
    }

    public int quarter() {
        return 1 + (index - 1)/3;
    }
     */
}
