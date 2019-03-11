package cetiri;

import java.util.Scanner;

public class Test {

	public static void meni() {
		System.out.println("1.Racunar");
		System.out.println("2.Laptop");
		System.out.println("0.Izlaz");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Racunar test;
		meni();
		System.out.println("Unesite opciju: ");
		int t = input.nextInt();
		input.nextLine();

		switch (t) {
		case 1:
			System.out.println();
			System.out.println("Unesite kolicinu rama u GB");
			double ram = input.nextDouble();
			input.nextLine();
			System.out.println("Unesite kapacitet HD u GB");
			double hd = input.nextDouble();
			input.nextLine();
			System.out.println("Unesite brzinu procesora u GHz");
			double procesor = input.nextDouble();
			input.nextLine();
			System.out.println("Unesite dijagonalu monitora u inch");
			double monitor = input.nextDouble();
			System.out.println("unesite nabavnu cijenu");
			double cijena = input.nextDouble();
			input.nextLine();
			input.nextLine();
			test = new Racunar(ram, hd, procesor, monitor, cijena);
			System.out.println(test.toString());
			break;

		case 2:
			System.out.println();
			System.out.println("Unesite kolicinu rama u GB");
			ram = input.nextDouble();
			input.nextLine();
			System.out.println("Unesite kapacitet HD u GB");
			hd = input.nextDouble();
			input.nextLine();
			System.out.println("Unesite brzinu procesora u GHz");
			procesor = input.nextDouble();
			input.nextLine();
			System.out.println("Unesite dijagonalu monitora u inch");
			monitor = input.nextDouble();
			System.out.println("unesite nabavnu cijenu");
			cijena = input.nextDouble();
			input.nextLine();
			System.out.println("trajanje baterije u satima");
			double baterija = input.nextDouble();
			input.nextLine();
			System.out.println();
			test = new Laptop(ram, hd, procesor, monitor, cijena, baterija);
			System.out.println(test.toString());
			break;
		}
	}

}
