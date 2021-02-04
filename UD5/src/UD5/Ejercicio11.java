package UD5;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner dia = new Scanner(System.in);
		System.out.println("Digues en un dia de la setmana: ");
		int n=0;
		
		while (n>7 || n<1) {
			n=dia.nextInt();
			
			switch(n){
				case 1:
					System.out.println("Dilluns/Laboral");
					break;
				case 2:
					System.out.println("Dimarts/Laboral");
					break;
				case 3:
					System.out.println("Dimecres/Laboral");
					break;
				case 4:
					System.out.println("Dijous/Laboral");
					break;
				case 5:
					System.out.println("Divendres/Laboral");
					break;
				case 6:
					System.out.println("Dissabte/Festiu");
					break;
				case 7:
					System.out.println("Diumenge/Festiu");
			}
			
		}
		
		
	}

}
