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
public class Reverse_Array {
//program to reverse an array of integers.    
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter the size of an array");
        int n = in.nextInt();
        
        //DECLARE AN ARRAY
        int arr[] = new int[n];
        
        System.out.println("Enter an array value");
        
        //INPUT ARRAY VALUES
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }
        
        int temp;
        int start = 0;
        int end = n-1;
        
        //1,2,3,4,5
        while (start < end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            
            start++;
            end--;
        }
        
        System.out.println("array after reversal");
        
        for(int j = 0; j < n; j++){
            System.out.println(arr[j]);
     
        }
        
 
        
    }
    
}
