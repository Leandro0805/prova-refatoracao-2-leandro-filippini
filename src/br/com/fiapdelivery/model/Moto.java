package br.com.fiapdelivery.model;

public class Moto extends Veiculo {
 private boolean temBau;

 public Moto(String placa, double quantidadeTanque, boolean temBau) {
     super(placa, quantidadeTanque);
     this.temBau = temBau;
 }
}
