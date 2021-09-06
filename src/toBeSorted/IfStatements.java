// Brooke Davis

package toBeSorted;

public class IfStatements {
	
	public static void main(String[] args) {  
		  
		  int i = 25;
		  int j = 50;
		  int k = 24;
		  //Simple If statement
		  System.out.println("***Simple If Statement Example***");
		  if (i<j) //Bellow given message will be printed only if value of variable i is less than value of variable j.
			  System.out.println("Value Of i("+i+") Is Smaller Than Value Of j("+j+")." );
		  
		  //If Else Statement
		  System.out.println("");
		  System.out.println("***If Else Statement Example***");
		  if (i>=j) { //Bellow given message will be printed if value of variable i is greater than or equals to value of variable j.
			  System.out.println("Value Of i("+i+") Is Greater Than Or Equals To Value Of j("+j+")." );
		  } else { //Bellow given message will be printed if value of variable i is less than value of variable j.
			  System.out.println("Value Of i("+i+") Is Smaller Than Value Of j("+j+")." );
		  }
		  
		  //Nested If Else Statement
		  System.out.println("");
		  System.out.println("***Nested If Else Statement Part***");
		  if (k<i) { //Bellow given message will be printed if value of variable k is less than value of variable i.
			  System.out.println("Value Of k("+k+") Is Less Than Value Of i("+i+")" );
		  } else if (k>=i && k<=j) { //Bellow given message will be printed if value of variable k is greater than or equals to value of variable i and less than or equals to value of variable j.
			  System.out.println("Value Of k("+k+") Is In Between Value Of i("+i+") And Value Of Value Of j("+j+")" );
		  } else { //Bellow given message will be printed if value of variable k is greater than value of variable j.
			  System.out.println("Value Of k("+k+") Is Greater Than Value Of j("+j+")" );
		  }
	}
}