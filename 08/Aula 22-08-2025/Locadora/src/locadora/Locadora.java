/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package locadora;

import java.util.Scanner;

/**
 *
 * @author ALUNO
 */
public class Locadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Veiculo gol;
        Scanner s = new Scanner(System.in);
        
        System.out.print("Digitea marca: ");
        String marca = s.nextLine();
        
        gol = new Carro(5, "Gasolina", "Volkswagen", "Gol", "ABC4E67", 2005, true);
        
        gol.setMarca(marca);
        System.out.println("A marca para o veiculo " + gol.getModelo() + " informada foi: " + gol.getMarca() + "!");
    }
    
}
