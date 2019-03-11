package pet;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    
		Scanner input = new Scanner(System.in);
	    System.out.println("Unesite broj elemenata niza: ");
	    
	    int i=input.nextInt();
	    input.nextLine();
	   
	    int[] niz=new int[i];
	    for(int j=0;j<i;j++)
	    {
	    	System.out.print((j+1)+".");
	    	niz[j] =input.nextInt();
	    }
	    MyArray test = new MyArray(niz);
	    
	    System.out.println("Najmanji element niza je:");
	    System.out.println(test.getSmallestElement());
	   
	    System.out.println("najveci element niza je:");
	    System.out.println(test.getLargestElement());
	   
	    System.out.println("Suma svih elemenata je:");
	    
	    System.out.println(test.sumAllElements());
	    System.out.println("Elementi niza su:");
	    
	    test.printElements();
		}
	
	}


	
