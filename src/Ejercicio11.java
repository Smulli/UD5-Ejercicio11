import javax.swing.JOptionPane;

public class Ejercicio11 {
	
	public static void main(String args[]) {
		
		String dia = JOptionPane.showInputDialog("Introduzca un dia de la semana");
		
		switch(dia){
		case"lunes":
			
			
			
		case"martes":
		case"miercoles":
		case"jueves":
		case"viernes":
			JOptionPane.showMessageDialog(null, "Es un dia laboral");
			break;
		case"sabado":
		case"domingo":
			JOptionPane.showMessageDialog(null, "Es un dia festivo");
			break;
		}
	}
	
}
			
				
