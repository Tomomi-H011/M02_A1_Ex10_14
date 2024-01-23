/**
* Assignment: SDEV200_M01_Assignment1_Ex10_14
* File: MyDate.java
* Version: 1.0
* Date: 1/23/2024
* Author: Tomomi Hobara
* Description: This program defines MyDate class with year, month and day using the Gregorian Calendar, 
               elapsed time, and user defined dates. 
               Also, accessor and mutator methods are defined in this program.
* Variables: 
    - year: int
    - month: int
    - day: int
    - monthList: string list, containing the names of months
Steps:
    1. Define data fields (year, month, and day)    
    2. Create a no-arg constructor that creates a MyDate object for the current date.
    3. Create a constructor that constructs a MyDate object with a specified elapsed time since 
        midnight, January 1, 1970, in milliseconds.
    4. Create a constructor that constructs a MyDate object with the specified year, month, and day.
    5. Create three getter methods for the data fields year, month, and day.
    6. Create a method to convert months to the names of months (from int to string).
    7. Create a method named setDate(long elapsedTime) that sets a new date for the object using the elapsed time.
Related files:
    - MyDateUML.pdf: A UML diagram explaining MyDate class.
    - TestMyDate.java: Creates two MyDate objects, using new MyDate() and new MyDate(34355555133101L) and 
        displays their year, month, and day. 
*/
//p.363, 507 example

import java.util.GregorianCalendar;

public class MyDate {

    private int year;
    private int month;  //0-based months
    private int day;

    //**No-arg constructor to create a MyDate object with the current date.*/
    public MyDate() {  
        GregorianCalendar calendarDate = new GregorianCalendar();

        year = calendarDate.get(GregorianCalendar.YEAR);
        month = calendarDate.get(GregorianCalendar.MONTH);
        day = calendarDate.get(GregorianCalendar.DAY_OF_MONTH);
     
    }

    // A constructor to create a MyDate object with a specified elapsed time 
    //since midnight, January 1, 1970, in milliseconds.
    public MyDate(long elapsedTime) {
        setDate(elapsedTime);  // Call setDate method with elapsedTime provided in the test program.
    }

    // A constructor to create a MyDate object with the specified year, month, and day.
    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month-1; // Change from normal months to 0-based months
        this.day = day;
    }

    // Return year
    public int getYear() {
        return year;
    }

    // Return month
    public int getMonth() {        
        return month;
    }

    // Change the format of the month for the output
    public String getMonthString(int getMonth) {
        String[] monthList = {"January", "February", "March", "April", "May", "June", "July", 
        "August", "September", "October", "November", "December"};

        return monthList[getMonth];  //No need to deduct -1 since month is already 0-based.
    }

    // Return day
    public int getDay() {
        return day;
    }


    // Set a new date for the object using the elapsed time. Same as the second constructor.
    public void setDate(long elapsedTime) {
       
        GregorianCalendar calendarDate = new GregorianCalendar();
        calendarDate.setTimeInMillis(elapsedTime);  // Method in GregorianCalendar

        year = calendarDate.get(GregorianCalendar.YEAR);
        month = calendarDate.get(GregorianCalendar.MONTH);
        day = calendarDate.get(GregorianCalendar.DAY_OF_MONTH);
    }
    
}
