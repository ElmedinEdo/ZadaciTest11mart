package jedan;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	  Scanner input = new Scanner(System.in);
	
	System.out.println("Unesite naziv knjige: ");
	String imeKnjige=input.nextLine();
	
	System.out.println("Unesite ime autora:");
	String imeAutora = input.nextLine();
	
	System.out.println("E-mail autora");
	String email = input.nextLine();
	
	System.out.println("Gender (m/f):");
	char spol = input.next().charAt(0);
	
	System.out.println("cijena knjige:");
	input.nextLine();
	
	double cijena = input.nextDouble();
	System.out.println("kolicina na stanju:");
	input.nextLine();
	
	int kolicina = input.nextInt();
	Author author = new Author(imeAutora, email, spol);
	
	Book test=new Book(imeKnjige, author, cijena, kolicina);
	System.out.println("Info o knjizi: ");
	
	System.out.println(test.toString());
		}
		}


