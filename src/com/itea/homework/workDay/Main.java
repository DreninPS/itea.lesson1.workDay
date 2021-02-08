package com.itea.homework.workDay;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.parse("2020-05-01T22:00:00");
        LocalTime localTimeStart = LocalTime.parse("08:30:00");
        LocalTime localTimeEnd = LocalTime.parse("17:00:00");
        System.out.println(isWorkDay(localDateTime, localTimeStart, localTimeEnd ));

    }

    private static boolean isWorkDay(LocalDateTime ldt, LocalTime start, LocalTime end){
        System.out.println(ldt.getDayOfWeek());
       if (ldt.getDayOfWeek().name().equals("SUNDAY")|ldt.getDayOfWeek().name().equals("SATURDAY")) return false;
       if (ldt.toLocalTime().isAfter(start)&ldt.toLocalTime().isBefore(end)) return true;
    return false;
    }
}
