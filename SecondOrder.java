/*
 * Write a program that solves second order equations 
 * The inputs are going to be the coeficients, a,b,c 
 * a needs to be different than 0
 * If a =0 then only one solution which is (bx+c=0) -c/b
 * If a is not zero then, we have to first compute the discriminate D= b^2 -4ac
 * if (the discriminate is 0 then, there is one double solution : -b/2a
 * if however the discriminate is positive then there are two distinct solutions:
 * -b +sqrt (D) /2a the second is -b -sqrt (D) /2a
 * If the discriminate is negative then there is no real solution
 */
import java.util.Scanner;
public class SecondOrder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// how many inputs do you have ? 3 doubles 
		//declare three doubles
		double a,b,c;
		double solution,disc,solution2;
		//invite the user to input the values
		System.out.print("Enter value of a: ");
		a=sc.nextDouble();
		System.out.print("Enter value of b: ");
		b=sc.nextDouble();
		System.out.print("Enter value of c: ");
		c=sc.nextDouble();
		//read the 3 numbers
		
		//check if a is 0
		if (a==0) {
		//if it is then display the solution as being -c/b and then quit
			if (b==0 && c!=0) {
				System.out.println("There is no solution");
			}else if (b==0 && c==0) {
				System.out.println("Infinite number of solutions");
			}else if(b!=0 && c==0) {
				System.out.println("One solution is 0");
			}
			else {
				solution= -c/b;
				System.out.println("The solution is: "+ solution);
			}
					
		}
		//if it is not 
		else {
		//compute the discriminate (you need the variable for it) 
		disc=(Math.pow(b,2))-4*a*c;
		//check if the discriminate is 0 then you have one double solution
		if (disc==0) {
		// else if the discriminate is positive then you have two distant solutions
			solution=(-b)/(2*a);
			System.out.println("The solution is: "+ solution);
		}
		else if (disc>0) {
		//compute them and display them
			solution=(-b+(Math.sqrt(disc)))/(2*a);
			solution2=(-b-(Math.sqrt(disc)))/(2*a);
			System.out.println("The solutions are: "+ solution +" and "+ solution2);
			
		}else {
		//else(which mean it is negative ) just display a message saying no real solution
			System.out.println("NO REAL SOLUTION");
		}
		}
			sc.close();
	}

}
