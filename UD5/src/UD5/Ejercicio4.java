package UD5;

//import java.util.Scanner;

import javax.swing.JOptionPane;

//import java.util.Scanner;
public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println();
		//java.util.Scanner valor = new java.util.Scanner(System.in);
		//Scanner leer = new Scanner(System.in);
		String numero = JOptionPane.showInputDialog("Dime un radio: ");
		double r = Double.parseDouble(numero);
		//double a= 3.1416 * Math.pow(r*r); 
		
		
		//double doble = Double.parseDouble(r);
		double a= Math.PI*Math.pow(r, 2);
		System.out.println("El area es: "+a);

	}

}
