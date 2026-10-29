package com.pluralsight;

import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        ZonedDateTime now = ZonedDateTime.now();

        DateTimeFormatter first =
                DateTimeFormatter.ofPattern("MM/dd/yyyy");

        DateTimeFormatter second =
                DateTimeFormatter.ofPattern("yyyy-MM-dd");

        DateTimeFormatter third =
                DateTimeFormatter.ofPattern(
                        "EEEE, MMMM d, yyyy", Locale.US);

        DateTimeFormatter fourth =
                DateTimeFormatter.ofPattern(
                        "EEEE, MMM d, yyyy  HH:mm", Locale.US);

        DateTimeFormatter challenge =
                DateTimeFormatter.ofPattern(
                        "H:mm 'on' dd-MMM-yyyy", Locale.US);

        System.out.println(now.format(first));
        System.out.println(now.format(second));
        System.out.println(now.format(third));

        ZonedDateTime gmt =
                now.withZoneSameInstant(ZoneId.of("GMT"));

        System.out.println(gmt.format(fourth));
        System.out.println(now.format(challenge));
    }
}