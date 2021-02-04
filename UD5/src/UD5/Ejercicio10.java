package UD5;
import java.util.Scanner;

//qué es mejor hacer, poner el asterisco 
//para que según programemos el vaya a coger 
//lo que necesite sin necesidad de repetirse?
//o mejor especificamos la utilidad concreta cada vez?
import javax.swing.*;


public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Demanes cuantes ventes vols
		Scanner lectura = new Scanner(System.in);
		System.out.println("Cuántas ventas? ");
		int numeroventas = lectura.nextInt();
		int SumarVentas=0;
		for(int i = 0; i<numeroventas; i++) {
			
			int venta=lectura.nextInt();
			SumarVentas=SumarVentas+venta;
		}
		//Demanes les ventes per pantalla
		
		System.out.println("El total es: " +SumarVentas);
		
		
		

		
	}

}
