package desafio.vetores;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class VetorPensionato {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many rooms will be rented?");
		int n = sc.nextInt();
		
		Rent[] vect = new Rent[10]; //quantidade de quartos predefinido
		
		for (int i=1; i<=n; i++) {
			System.out.println();
			System.out.println("Rent #" + i +":");
			System.out.print("Name: ");
			sc.nextLine(); //limpar buffer para o next line de leitura
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int roomNumber = sc.nextInt();
			
			Rent rent = new Rent(name, email);
			
			vect[roomNumber] = rent;
		}
		
		System.out.println();
		System.out.println("Busy rooms: ");
		for (int i=0; i<10; i++) {
			if (vect[i]!=null) {
				System.out.println(i + ": " + vect[i]);
			}
		}
		
		sc.close();
		
	}

}
