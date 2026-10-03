package br.com.fiapdelivery.model;

public class Pacote {
    private String codigo;
    private double peso;
    private String status;

    public Pacote(String codigo, double peso, String status) {
        this.codigo = codigo;
        this.peso = peso;
        this.status = status;
    }
   
    public void alterarStatus(String novoStatus) {
        this.status = novoStatus;
    }

    public String getCodigo() {
        return this.codigo;
    }
    public String getStatus() {
        return this.status;
    }
}