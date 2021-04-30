package labor10_2;

public class DateUtil {
    public static boolean leapYear(int year){
        return( (year % 4 == 0));
    }
    public static boolean isValidDate(int year, int month, int day){
        if( year <=0 || month <=0 || day<=0){
            return false;
        }

        if( month == 4 || month == 6 || month == 9 || month == 11){
            if(day<=30){
                return true;
            }
        }else if(month == 2){
            if(leapYear(year ) && day <=29){
                return true;
            }else{
                if( day <=28){
                    return true;
                }
            }
        }else if(month <= 12){
            if( day <= 31){
                return true;
            }
        }

        return false;
    }

}
