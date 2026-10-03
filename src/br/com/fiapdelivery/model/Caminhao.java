package br.com.fiapdelivery.model;

public class Caminhao extends Veiculo {
 private int quantidadeEixos;

 public Caminhao(String placa, double quantidadeTanque, int quantidadeEixos) {
     super(placa, quantidadeTanque); 
     this.quantidadeEixos = quantidadeEixos;
 }
}