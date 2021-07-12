public class homework6 {
    public static void main(String[] args) {

        int time = 8;
        int day = 12;
        int month = 7;
        int year = 2021;

        //Verification for time to be a real value
        if ((time < 1) || (time > 24)) {
            System.out.println("Time is not input correctly, please input correct time!");
        }

        // Condition A (with added rule that time can't be not be negative)
        if ((time < 12) && (time > 0)) {
            System.out.println("Good Morning Sunshine!");
        }

        // Condition B
        if ((time > 13) && (time < 19)) {
            System.out.println("Good Afternoon. Work Hard!");
        }

        // Condition C
        if ((time > 20) && (time < 24)) {
            System.out.println("Good Evening. Get some rest!");
        }

        // If the time value is changed to 20, nothing prints out, because there is no condition that includes time value 20.

        //DATE VERIFICATION

        if ((day<1) || (day>31))
        {
            System.out.println("Day value is not input correctly!");
        }

        if ((month<1) || (month>12))
        {
            System.out.println("Month value is not input correctly!");
        }

        if (year<0)
        {
            System.out.println("Year value is not input correctly!");
        }
        else
        {
            System.out.println("The date is: " + year + month + day);
        }

    }
}
