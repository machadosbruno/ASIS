/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemplo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author ALUNO
 */
public class Exemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<String> lista = new ArrayList<String>();
        
        lista.add("Bruno");
        lista.add("Miguel");
        lista.add("Jean");
        
        Collections.sort(lista);
        JOptionPane.showMessageDialog(null, lista);
    }
    
}
