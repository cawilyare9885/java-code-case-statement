/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author Awil
 */
public class RetrunStatement_assignments {  
  

    static int computeSize(int height, int width) {
        // Return an expression based on two arguments (variables).
        return height * width;
    }

    public static void main(String[] args) {

        // Assign to the result of computeSize.
        int result = computeSize(10, 4);
        System.out.println(result);
    }
}
   
        

