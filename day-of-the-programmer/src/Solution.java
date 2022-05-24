public class Solution {
    public static String programmersDay(int year) {
        // Write your code here
        final boolean isJulianCalendar = (year >= 1700) && (year <= 1917);
        final boolean isTransition = year == 1918;
        final boolean isGregorianCalendar = year >= 1919;

        int februaryDays = 0;
        boolean isLeapYear;

        if (isGregorianCalendar) {
            isLeapYear = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
            februaryDays = isLeapYear ? 29 : 28;
        }

        else if (isJulianCalendar) {
            isLeapYear = year % 4 == 0;
            februaryDays = isLeapYear ? 29 : 28;
        }

        else if (isTransition) {
            februaryDays = 15;
        }

        final int[] calendar = {31, februaryDays, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        return get256thDayOfYear(calendar, year);

    }

    public static String get256thDayOfYear(int[] currentCalendar, int programmerYear) {
        int remainingToProgrammerDay = 256;
        int programmerDay = 0;
        int programmerMonth = 0;

        for (int monthIndex = 0; monthIndex <= 12; monthIndex++) {
            int monthDays = currentCalendar[monthIndex];

            if (remainingToProgrammerDay > monthDays) {
                remainingToProgrammerDay -= monthDays;
            }
            else {
                programmerDay = remainingToProgrammerDay;
                programmerMonth = monthIndex + 1;
                break;
            }
        }

        String formattedDate = String.format("%02d.%02d.%d", programmerDay, programmerMonth, programmerYear);

        return formattedDate;
    }
}
