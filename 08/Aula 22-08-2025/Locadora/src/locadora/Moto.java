/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package locadora;

/**
 *
 * @author ALUNO
 */
public class Moto extends Veiculo{
    private int cilindradas;

    public Moto(String marca, String modelo, String placa, int ano, boolean disponivel) {
        super(marca, modelo, placa, ano, disponivel);
    }
    
    public void buzinar(){}

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
}
}
