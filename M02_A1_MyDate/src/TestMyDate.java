/** 
* Assignment: SDEV200_M01_Assignment1_Ex10_14
* File: TestMyDate.java
* Version: 1.0
* Date: 1/23/2024
* Author: Tomomi Hobara
* Description: This program creates two MyDate objects, using new MyDate() and new MyDate(34355555133101L). 
            Then, it displays their year, month, and day. 
* Steps:
    1. Invoke two different constructors and create objects.
    2. Display the dates in "month day, year" format.
*/

public class TestMyDate {
    public static void main(String[] args) {

        MyDate date1 = new MyDate();  // Create an object with GregorianCalendar
   
        MyDate date2 = new MyDate(34355555133101L);  // Create an object with elapsed time.

        // Display year, month, and day of the two objects
        System.out.printf("%ndate1: %s %d, %d", date1.getMonthString(date1.getMonth()), date1.getDay(), date1.getYear());
        System.out.printf("%ndate2: %s %d, %d", date2.getMonthString(date2.getMonth()), date2.getDay(), date2.getYear());
      
    }
}
