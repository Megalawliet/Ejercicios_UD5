package UD5;

//import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ejercicio13 {	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner n1 = new Scanner(System.in);
		//Scanner n2 = new Scanner(System.in);
		
		//int opciones=0;
		int n1,n2;
		double calculo;
		
		n1=Integer.parseInt(JOptionPane.showInputDialog("Dime el 1r n�mero: "));
		String opciones = (JOptionPane.showInputDialog("Dime la operaci�n que desas utilizar"));
		n2=Integer.parseInt(JOptionPane.showInputDialog("Dime el 2� n�mero: "));
		
		
		switch (opciones) {
		case "+": {
			calculo=(n1+n2);
			JOptionPane.showMessageDialog(null,"El resultado de la suma es: "+calculo);
			break;	
		}
		case "-": {
			calculo=(n1-n2);
			JOptionPane.showMessageDialog(null,"El resultado de la resta es: "+calculo);
			break;	
		}
		case "*": {
			calculo=(n1*n2);
			JOptionPane.showMessageDialog(null,"El resultado de la multiplicaci�n es: "+calculo);
			break;	
		}
		case "/": {
			calculo=(n1/n2);
			JOptionPane.showMessageDialog(null,"El resultado de la divisi�n es: "+calculo);
			break;	
		}
		case "^": {
			calculo=(n1^n2);
			JOptionPane.showMessageDialog(null,"El resultado de la potencia es: "+calculo);
			break;	
		}
		case "%": {
			calculo=(n1%n2);
			JOptionPane.showMessageDialog(null,"El resultado del modulo es: "+calculo);
			break;	
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + opciones);
		}
		
		
		
}
}