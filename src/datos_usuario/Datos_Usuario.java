package datos_usuario;

import javax.swing.JOptionPane;

public class Datos_Usuario {

    public static void main(String[] args) {

        String Nombre = " ";
        int Edad = 0;
        Nombre = JOptionPane.showInputDialog("Ingrese su nombre: ");
        Edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad: "));
        JOptionPane.showMessageDialog(null, "Hola " + Nombre+"\ntienes  " + Edad + " años");
    }
}
