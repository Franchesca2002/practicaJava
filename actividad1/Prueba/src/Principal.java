import java.util.Scanner;

import javax.swing.JOptionPane;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final  double porciento = 0.30;
		double sueldoOriginal=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese su sueldo"));
		
		double resultadoFinal=sueldoOriginal+(sueldoOriginal*porciento);
		
		System.out.println("El resultado del sueldo final es: "+resultadoFinal);
		
     
	}

}
