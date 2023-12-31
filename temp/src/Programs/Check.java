package Programs;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * Licensed Materials - Property of IBM 6949-80Q © Copyright IBM Corp. 2019 All Rights Reserved
 * US Government Users Restricted Rights - Use, duplication or disclosure restricted by GSA ADP Schedule Contract with IBM Corp.
 *
 * @author 002KA5
 * @project temp
 * @created-on 12/09/22
 */
public class Check {
    public static void main(String[] args) {
//        Date currentDateAndTime = Date.from(Instant.now().atZone(TimeZone.getTimeZone("Asia/Kolkata").toZoneId()).toInstant());
//        long time = currentDateAndTime.getTime();
//        Calendar calendar = Calendar.getInstance();
//        System.out.println(time);

        LocalDateTime currentDate=LocalDateTime.now(TimeZone.getTimeZone("Asia/Kolkata").toZoneId());
        System.out.println(currentDate);
        LocalDateTime morningTime = LocalDateTime.of(currentDate.get(ChronoField.YEAR), currentDate.get(ChronoField.MONTH_OF_YEAR), currentDate.get(ChronoField.DAY_OF_MONTH), currentDate.get(ChronoField.HOUR_OF_DAY), 0,10);

        System.out.println(morningTime);

        if(currentDate.getHour()==9 && morningTime.isBefore(currentDate)){
            System.out.println("morning");
        }
        else {
            LocalDateTime eveningTime = LocalDateTime.of(currentDate.get(ChronoField.YEAR), currentDate.get(ChronoField.MONTH_OF_YEAR), currentDate.get(ChronoField.DAY_OF_MONTH), 18, 0,10);
            if(currentDate.getHour()==18 && eveningTime.isBefore(currentDate)) {
                System.out.println("evening");
            }
        }


//        int h = currentDate.get(ChronoField.HOUR_OF_DAY);
//        System.out.println(h);
//        if(9==h){
//            System.out.println("morning");
//        }
//        if (18==h){
//            System.out.println("evening");
//        }


    }


}
