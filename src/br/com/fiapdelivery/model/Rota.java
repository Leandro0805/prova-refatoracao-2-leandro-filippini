package br.com.fiapdelivery.model;

public class Rota {
 private Pacote pacote;
 private Veiculo veiculo;

 public Rota(Pacote pacote, Veiculo veiculo) {
     this.pacote = pacote;
     this.veiculo = veiculo;
 }

 public void iniciarEntrega() {
     System.out.println("Iniciando rota do pacote " + pacote.getCodigo() + 
                        " com o veículo placa " + veiculo.getPlaca());
 }
}