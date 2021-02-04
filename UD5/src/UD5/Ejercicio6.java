package UD5;

import javax.swing.JOptionPane;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double IVA=0.21;
		String cadena=JOptionPane.showInputDialog("Introduce un precio");
		//String ventana = JOptionPane.showInputDialog("Nombre: ");
		int precio=Integer.parseInt(cadena);
		JOptionPane.showMessageDialog(null,"El precio es: " +precio+ " y su IVA es: "+(precio+(precio*IVA)));
	}

}
