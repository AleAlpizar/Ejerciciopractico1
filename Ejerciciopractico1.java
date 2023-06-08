/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciopractico.pkg1;

import javax.swing.JOptionPane;

public class Ejerciciopractico1 {

    public static void main(String[] args) {
        String lectura;
        int cantidad;
        double salario;
        double suma=0;
        lectura = JOptionPane.showInputDialog("Digite cuantos empleados: ");
        cantidad = Integer.parseInt(lectura);
        for (int i = 0;i < cantidad;i++){
            lectura = JOptionPane.showInputDialog("Digite el salario: ");
            salario = Double.parseDouble(lectura);
            double resultado1 = salario*0.0925;
            double resultado2 = salario*0.0508;
            suma = resultado1+resultado2;
        }
        JOptionPane.showMessageDialog(null, "La empresa debera abonar a la CCSS el monto de:" +suma+ "por concepto de SEM y IVM");
    }
}
    
