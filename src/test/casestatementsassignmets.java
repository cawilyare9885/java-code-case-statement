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
/* 
Switch case statement is used when we have number of options 
(or choices) and we may need to perform a different task for each choice.
or The switch case statement is used when we have multiple options 
and we need to perform a different task for each option.
The syntax of Switch case statement looks like this –

*/
public class casestatementsassignmets {
    
   public static void main(String args[]){
      int i=9;
      switch(i)
      {
	 case 1:
	   System.out.println("Case1 ");
	   break;
	 case 2:
	   System.out.println("Case2 ");
	   break;
	 case 3:
	   System.out.println("Case3 ");
	   break;
	 case 4:
           System.out.println("Case4 ");
           break;
	 default:
	   System.out.println("Default ");
      }
   }
}

