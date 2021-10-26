package com.experiment;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Exp4 {
    public static void main(String args[]) {
        try {
            String str = new String("2021-04-17T20:53:07.028");
            LocalDateTime ld = LocalDateTime.parse(str);
//            LocalDateTime ld = LocalDateTime.now();
            System.out.println(ld.toLocalDate());
            System.out.println(ld.toString());
            System.out.println(ld.getMonth());
            System.out.println(ld.getYear());
            System.out.println(ld.getDayOfMonth());


        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
