# Weekly Temperature Tracker

A Java program that stores and retrieves daily average temperatures for one week using ArrayLists.

## Description

This program allows users to input daily temperatures for a full week and then query either a specific day's temperature or view a complete weekly summary with the average temperature. It demonstrates the use of ArrayLists, loops, and decision structures in Java.

## Features

- Store day names and temperatures for 7 days of the week
- Query individual day temperatures by name
- Display complete weekly summary with all temperatures
- Calculate and display weekly average temperature
- Case-insensitive day name matching

## How to Run

1. Clone the repository
2. Open the project in Eclipse IDE or any Java IDE
3. Run the `TempCalc.java` file
4. Follow the prompts to enter each day and temperature
5. Enter a specific day name to see its temperature, or type "week" for the full summary

## Example Usage
```
Enter Day: Monday
Enter Temperature: 88
Enter Day: Tuesday
Enter Temperature: 89
Enter Day: Wednesday
Enter Temperature: 78
Enter Day: Thursday
Enter Temperature: 86
Enter Day: Friday
Enter Temperature: 87
Enter Day: Saturday
Enter Temperature: 85
Enter Day: Sunday
Enter Temperature: 87

Enter a day of the week or 'week' for the weekly summary: Wednesday
Searching for the day: On Wednesday, The temperature was 78.0
```

**Weekly Summary Example:**
```
Enter a day of the week or 'week' for the weekly summary: week
Weekly Summary:
Monday : 88.0
Tuesday : 89.0
Wednesday : 78.0
Thursday : 86.0
Friday : 87.0
Saturday : 85.0
Sunday : 87.0
The weekly average temperature was : 85.71428571428571
```

## Requirements

- Java SE 25 or higher
- Eclipse IDE (or any Java IDE)
