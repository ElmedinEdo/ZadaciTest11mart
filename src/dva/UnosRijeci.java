package dva;

import java.util.ArrayList;
import java.util.Scanner;

public class UnosRijeci {
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String rijec = " ";
		ArrayList lista = new ArrayList();
		while(rijec.equals("kraj")==false)
		{
			System.out.println("Unesite rijeci koje zelite:");
		 rijec = input.nextLine();
		lista.add(rijec);
		}
		System.out.println("Output");
		for(int i=0;i<lista.size();i++)
		{
			System.out.print(lista.get(i)+" ");
		}
	}






}








