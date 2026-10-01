package br.com.fiapdelivery.main;

public class SistemaPrincipal {
		public static void main(String[] args) {
		caminhao c = new caminhao();
		c.pl = "ABC1234";
		c.cap = -500.0;
		pacote pac = new pacote();
		pac.cod = "BR999";
		pac.p = 10.5;
		pac.s = "Pendente";
		Rota r = new Rota();
		r.p1 = pac;
		r.c1 = c;
		r.vai();

	}

}
