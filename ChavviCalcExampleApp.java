/*
Name: Huy Tran
Student ID: 1011887
Class: CIS 055
Date: 09/29/2022
*/

package com.chavviCalcExample;

import java.util.*;

/*
 * chavvi calc calculator
 */
public class ChavviCalcExampleApp {

  public static void main(String[] args) {

    float numberA = 0;
    float numberB = 0;

    addValue(numberA, numberB);

    while(true){
        Scanner input = new Scanner(System.in);
        String command = input.nextLine();

        // Quit the program
if (command.equals("q")) {
System.out.println("Thank for using Chavvi Calc");
break;
}
switch (command){
case "a":
System.out.printf("Enter a number: ");
String number = input.nextLine();
//check if the number is validation
if (numberValidation(number)) {numberA = Float.parseFloat(number);
addValue(numberA, numberB);
} else {
System.out.println("Error: Unknow command");
addValue(numberA, numberB);
}
break;
case "b":
System.out.printf("Enter a number: ");
number = input.nextLine();
//check if the number is validation
if (numberValidation(number)){
numberB = Float.parseFloat(number);
addValue(numberA, numberB);
}else{
System.out.println("Error: Unknow command");
addValue(numberA, numberB);
}
break;
case "+":
numberA = numberA + numberB;
addValue(numberA, numberB);
break;
case "-":
numberA = numberA - numberB;
addValue(numberA, numberB);
break;
case "*":
numberA = numberA * numberB;
addValue(numberA, numberB);
break;
case "/":
if (numberB == 0){
System.out.println("Error: Unable to divide by 0");
addValue(numberA, numberB);
}else{
numberA = numberA / numberB;
addValue(numberA, numberB);
}
break;
case "c":
