/*
Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Suponiendo todos los meses de 30 días.
 */
package Introduccion;

import javax.swing.JOptionPane;

/**
 *
 * @author giova
 */
public class Exercise7 {
    public static void main(String[] args) {
        int dd,mm,yy;
        
        dd = Integer.parseInt(JOptionPane.showInputDialog("*** Digite el dia: "));
        mm = Integer.parseInt(JOptionPane.showInputDialog("*** Digite el mes: "));
        yy = Integer.parseInt(JOptionPane.showInputDialog("*** Digite el año: "));
        
        if (dd >= 1 && dd <= 30) { // Si el dia es correcto
            if (mm >= 1 && mm <= 12) {  // Si el mes es correcto
                if (yy != 0) {   // Si el año es correcto
                    JOptionPane.showMessageDialog(null, "***** FECHA CORRECTA *****");
                }
                else{
                    JOptionPane.showMessageDialog(null, "***** El año ingresado es Incorrecto *****");
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "***** El mes ingresado es Incorrecto *****");
            }
        } else {
            JOptionPane.showMessageDialog(null, "***** El dia ingresado es Incorrecto *****");
        }
    }
}
