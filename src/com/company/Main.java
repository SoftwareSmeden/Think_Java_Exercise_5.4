package com.company;

public class Main {

    public static void main(String[] args) {
        // Think Java - Exercise 5.4

        boolean yes = true;
        boolean no = false;
        int loVal = -999;
        int hiVal = 999;
        double grade = 87.5;
        double amount = 50.0;
        String hello = "world";


            System.out.println( amount == 40.0 || 50.0 );
            //An error is given, and it tells: "first type:  boolean || second type: double".
        }


        /* Expression                                Result:                Operators explained:

         yes == no || grade > amount                 true                   //yes ==(is equal) to no || grade >(is bigger) than amount
         amount == 40.0 || 50.0                      error (not sure)       //amount ==(is equal) to 40.0 and it's a boolean expression || 50.0 is just a double value.
         hiVal != loVal || loVal < 0                 true                   //hiVal !=(is not equal) to loVal || loVal is greater than 0, both expressions are true.
         True || hello.length() > 0                  error                  //True (I think it should have been with a lowercase and not uppercase, not sure tho) || hello.length() >(is bigger) than 0, would give an error cause the first type is a String and the other type is an Int.
         hello.isEmpty() && yes                      false                  //hello.isEmpty() the string is not empty it got "world" written between the quotation marks and if the string was empty it would have been empty between the quotation marks "".
         grade <= 100 && !false                      true                   //grade <=(less or equal) than 100 && !false will result in true.
         !yes || no                                  false                  //!yes will be false || no are already false and the entire expression will be false cause of the logical operator ||.
         grade > 75 > amount                         error (not sure)       //
         amount <= hiVal && amount >= loVal          true                   //amount <=(is less or equal) than hiVal && amount >=(is bigger or equal) than loVal. They are both true.
         no && !no || yes && !yes	                 false                  //((no=(false) && !no=(true))=false) || ((yes=(true) && !yes=(false))=false) this gives a false on both sides of the logical operator.
         */

}
