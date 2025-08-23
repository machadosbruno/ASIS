/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package locadora;

/**
 *
 * @author ALUNO
 */
public class Aluguel {
    private int id;
    private String datainicio, dataFim;
    private double valorTotal;
    private Cliente cliente;
    private Veiculo veiculoAlugado;

    public Aluguel (){
        
    }
    public Aluguel(int id, String datainicio, String dataFim, double valorTotal, Cliente cliente, Veiculo veiculoAlugado) {
        this.id = id;
        this.datainicio = datainicio;
        this.dataFim = dataFim;
        this.valorTotal = valorTotal;
        this.cliente = cliente;
        this.veiculoAlugado = veiculoAlugado;
    }
    
    public double calcularValor(int dias){
        return 0.0;
    }
    public void encerrarAluguel(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDatainicio() {
        return datainicio;
    }

    public void setDatainicio(String datainicio) {
        this.datainicio = datainicio;
    }

    public String getDataFim() {
        return dataFim;
    }

    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Veiculo getVeiculoAlugado() {
        return veiculoAlugado;
    }

    public void setVeiculoAlugado(Veiculo veiculoAlugado) {
        this.veiculoAlugado = veiculoAlugado;
    }
    
    
}
