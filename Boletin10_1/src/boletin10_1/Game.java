/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin10_1;

import javax.swing.JOptionPane;

/**
 *
 * @author Samuel
 */
public class Game {

    public int intentos = 5;
    int contador;

    public void juego() {
        int numeroSecreto = Integer.parseInt(JOptionPane.showInputDialog(null, "introduzca numero que su compañero debe adivinar entre 1 y 50"));
        JOptionPane.showMessageDialog(null, "Ya puede mirar el segundo jugador");
        JOptionPane.showMessageDialog(null, "Posees un total de 5 intentos");
        for (contador = 0; contador < intentos; contador++) {
            int intentos = Integer.parseInt(JOptionPane.showInputDialog(null, "introduzca un numero entre 1 y 50"));
            if (intentos > numeroSecreto) {
                JOptionPane.showMessageDialog(null, "Su numero es mayor que el que su compañero ha introducido");
            } else if (intentos < numeroSecreto) {
                JOptionPane.showMessageDialog(null, "Su numero es menor que el que su compañero ha introducido");
            } else {
                JOptionPane.showMessageDialog(null, "Felicidades has ganado");
                break;
            }
        }
        JOptionPane.showMessageDialog(null, "El juego se ha acabado");
    }
}
