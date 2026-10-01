package br.com.fiapdelivery.model;

public class Rota {
	public pacote p1;
	public caminhao c1;
	public void vai() {
	System.out.println("Levando pacote " + p1.cod + " no veiculo " + c1.pl);
	}

}
