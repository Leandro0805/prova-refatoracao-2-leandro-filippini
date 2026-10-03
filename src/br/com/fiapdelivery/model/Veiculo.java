package br.com.fiapdelivery.model;

public class Veiculo {

 private String placa;
 private double quantidadeTanque;

 public Veiculo(String placa, double quantidadeTanque) {
     this.placa = placa;
     this.quantidadeTanque = quantidadeTanque;
 }

 public void abastecer(double litros) {
     if (litros > 0) {
         this.quantidadeTanque += litros;
         System.out.println("Abastecido: " + litros + "L na placa " + this.placa);
     } else {
         System.out.println("Erro: Não é possível abastecer valores negativos.");
     }
 }

 public void consumirCombustivel(double litros) {
     if (litros > 0 && litros <= this.quantidadeTanque) {
         this.quantidadeTanque -= litros;
     } else {
         System.out.println("Erro: Combustível insuficiente ou valor inválido.");
     }
 }

 public String getPlaca() {
     return this.placa;
 }
}