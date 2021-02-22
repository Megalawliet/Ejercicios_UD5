package UD5;
import javax.swing.JOptionPane;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String numero = JOptionPane.showInputDialog("Dime un radio: ");
		double r = Double.parseDouble(numero);

		double a= Math.PI*Math.pow(r, 2);
		System.out.println("El area es: "+a);

	}

}
