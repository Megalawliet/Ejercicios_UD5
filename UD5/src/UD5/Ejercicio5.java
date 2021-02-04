package UD5;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Introduzca un numero: ");
		int n1 = reader.nextInt();
		if (n1%2==0)
			  System.out.println(n1 + " es divisible por 2");
			else
			  System.out.println(n1 + " NO es divisible por 2");	
	}

}
