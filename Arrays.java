/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1;


import java.util.Scanner;

/**
 *
 * @author mk210
 */
public class Arrays {
//Program to find sum, average, maximum, and minimum of elements in an integer array.
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int arrayLength = 0;
        
        System.out.println("How long is your array? ");
        arrayLength = scanner.nextInt();
        scanner.nextLine();
        double[] myArray = new double[arrayLength];
        
         // Prompt the user to enter the elements of the array
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < arrayLength; i++){
            myArray[i] = scanner.nextDouble();
            scanner.nextLine();
        }
        
        //TO FIND THE SUM
        double sum = 0;
        for(int i = 0; i < myArray.length; i++){
            sum = sum + myArray[i];
        }
        
        //TO FIND AVERAGE
        double average = 0;
        average = sum/arrayLength;
        
        //TO FIND THE MINIMUM
        double min = Double.MAX_VALUE;
        for(int i = 0; i < arrayLength; i++){
            min=Math.min(min, myArray[i]);
        }
        
        //TO FIND THE MAXIMUM
        double max = Double.MIN_VALUE;
        for(int i = 0; i < arrayLength; i++){
            max=Math.max(max, myArray[i]);
        }
        
        //OUTPUTS
        System.out.println("The sum is: " + sum);
        System.out.println("The average is: " +average);
        System.out.println("The minimum is: " +min);
        System.out.println("The maximum is: " +max);
       
    }  
    
}
