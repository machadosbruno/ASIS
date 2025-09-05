/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package locadora;

import java.util.List;
import locadora.Aluguel;

/**
 *
 * @author ALUNO
 */
public class Cliente {
    private String nome, cpf, telefone;
    private List<Aluguel> historicoAlugueis;

    public Cliente(String nome, String cpf, String telefone, List<Aluguel> historicoAlugueis) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.historicoAlugueis = historicoAlugueis;
    }
    
    public Aluguel realizarAluguel(){
        Aluguel aluguel = new Aluguel();
        return aluguel;
    }
    
    public void devolverVeiculo(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public List<Aluguel> getHistoricoAlugueis() {
        return historicoAlugueis;
    }

    public void setHistoricoAlugueis(List<Aluguel> historicoAlugueis) {
        this.historicoAlugueis = historicoAlugueis;
    }
    
    
}
