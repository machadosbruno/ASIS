/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package locadora;

/**
 *
 * @author ALUNO
 */
public class Carro extends Veiculo{
    private int numeroPortas;
    private String tipoCombustivel;

    public Carro(int numeroPortas, String tipoCombustivel, String marca, String modelo, String placa, int ano, boolean disponivel) {
        super(marca, modelo, placa, ano, disponivel);
        this.numeroPortas = numeroPortas;
        this.tipoCombustivel = tipoCombustivel;
    }
    
    public void ligarArCondicionado(){}

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }
}
