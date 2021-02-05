package UD5;
import javax.swing.JOptionPane;
public class Ejercicio12 {
	public static void main(String[] args) {
		int i;
		//int intentos = 4;
		String pwd ="1234";
		boolean ctrl = false;
		
		for(i=0;i<3 && !ctrl; i++) {
			String contrasenya = JOptionPane.showInputDialog(null,"Password: ");
			if (contrasenya.equals(pwd)) {
				JOptionPane.showMessageDialog(null, "Enhorabuena!");
				ctrl = true;
			}
			else {
				//JOptionPane.showMessageDialog(null, "Error, quedan: " +(3-1)+" intentos");
				JOptionPane.showMessageDialog(null, "Error, vuelve a intentarlo");	
			}		
		}		
	}
}
