/**
* Author - Tyler Fuentes
* ITSC1212 - section number, Instructor last name (i.e. ITSC1212-003, Najjar
* version 1.0 
* 10/01/2021
* ITSC 1212 Project 1A - Budget Planning
* This project organizes user data and displays incremental expenses, total expenses, and working hours required
* in hour to break even each month and also hours required to have extra savings at the end of each month
*/
public class Budget 
{
    public static void main(String[] args)
    { 
        // ************
        // Project 1A
        // ************
        
        //Monthly Expenses and the sum of their expenditures
        int funMoney = 150;
        double wage = 10.0;
        double savings = 100.0;
        int rent = 625;
        int internet = 27;
        int grocery = 250; 
        int expenses = (rent + internet + grocery + funMoney);

        //Calculate how many hours the student will have to work to afford the monthly expenses listed above.
        double hours = expenses / wage;

        //Calculate how many hours the student will have to work to include an additional savings of $100 per month.
        double totalHours = (expenses + savings) / wage;
        double extraHours = totalHours - hours;
        //Print statements
        System.out.println("Your hourly wage is $" + wage + ".");
        System.out.println("Your monthly cost of rent is $" + rent + ".");
        System.out.println("Your grocery expenses every month is $" + grocery + ".");
        System.out.println("Your monthly alLotted expense for fun is $" + funMoney + ".");
        System.out.println("Your total expenses for the month is $" + expenses + ".");
        System.out.println("The total amount of hours you would have to work to afford monthly expenses is " + hours + " hours.");
        System.out.println("The total amount of hours you would have to work to have $100 in savings is " + totalHours + " hours.");
        System.out.println("You will have to work " + extraHours + " more hours per month in order to have $100 in savings.");
        //Extra sentence
        System.out.println("One day I will get a better paying job to pay these bills. I cannot wait until that day!");
    }
}