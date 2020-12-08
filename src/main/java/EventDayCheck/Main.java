package EventDayCheck;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import static EventDayCheck.PayBonusEvt.*;


public class Main {
    public static void main(String[] args) {
        System.out.println(checkEventDay(TEST_EVT.getsEvt(), TEST_EVT.geteEvt()));
    }


    private static boolean checkEventDay(String start, String end) {

        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmss", Locale.KOREA);
        Date currentTime = new Date();
        boolean eventDay = false;

        System.out.println(start);
        System.out.println(end);


        try {
            //현재 날짜
            Date today = formatter.parse(formatter.format(currentTime));
            Date eventStartDate = formatter.parse(start);
            Date eventEndDate = formatter.parse(end);

            //현재 날짜가 이벤트시작날 보다 크면 return 1
            int compare1 = today.compareTo(eventStartDate);
            System.out.println("compare1 : "+compare1);

            //현재 날짜가 이벤트종료날 보다 작으면 return 1
            int compare2 = eventEndDate.compareTo(today);
            System.out.println("compare2 : "+compare2);

            if (compare1 == 1 && compare2 == 1) {
                eventDay = true;
            }
        } catch (ParseException e) {
            System.out.println(e);
        }

        return eventDay;
    }
}



