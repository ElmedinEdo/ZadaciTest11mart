package tri;


import java.util.Scanner;

public class UnosRecenice {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite recenicu: ");
		
		String recenica=input.nextLine();
		String[] lista=recenica.split(" ");
		
		int niz = lista.length;
		System.out.println("Predzadnja rijec je "+lista[niz-2]);
	}
	}


