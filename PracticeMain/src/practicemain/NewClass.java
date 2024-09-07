/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicemain;

import java.util.Scanner;

public class NewClass {
    
    public  void otherMethod(){
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        
        System.out.println("My name is: "+name);
        
    }
    
    public int Twonumbers(){
       Scanner sc = new Scanner(System.in);
        int n1, n2, result;
        System.out.print("Enter number 1: ");
        n1 = sc.nextInt();
        System.out.print("Enter number 2: ");
        n2 = sc.nextInt();
        System.out.println(result = n1  + n2);
        return 0;
        
    }
    
}
