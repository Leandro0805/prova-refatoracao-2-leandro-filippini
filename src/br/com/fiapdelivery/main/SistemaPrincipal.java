package br.com.fiapdelivery.main;
import br.com.fiapdelivery.model.Caminhao;
import br.com.fiapdelivery.model.Moto;
import br.com.fiapdelivery.model.Pacote;
import br.com.fiapdelivery.model.Rota;


public class SistemaPrincipal {
 public static void main(String[] args) {
     System.out.println("=== INICIANDO SISTEMA DE ENTREGAS ===\n");

     // 1. Criando os objetos 
     Caminhao caminhao = new Caminhao("ABC-1234", 50.0, 4);
     Moto moto = new Moto("XYZ-9876", 10.0, true);
     
     Pacote pacote1 = new Pacote("BR-001", 15.0, "Pendente");
     Pacote pacote2 = new Pacote("BR-002", 2.0, "Pendente");

     // 2. Testando o Encapsulamento
     System.out.println("--- TESTES DE REGRAS DE NEGÓCIO ---");
     
     // Teste A: O que acontece se tentarmos colocar gasolina negativa?
     System.out.print("Tentando abastecer caminhão com -20L: ");
     caminhao.abastecer(-20.0); // O if dentro do método vai barrar
     
     // Teste B: O que acontece se tentarmos consumir mais do que o tanque possui?
     System.out.print("Tentando consumir 50L da moto (que só tem 10L): ");
     moto.consumirCombustivel(50.0); // O if dentro do método vai barrar
     
     // Teste C: Ação válida
     System.out.print("Abastecendo moto com 5L: ");
     moto.abastecer(5.0); // Ação permitida

     // 3. Testando o comportamento das classes filhas
     System.out.println("\n--- TESTES DE ROTAS ---");
     
     // A Rota exige um (Pacote, Veiculo). Como Caminhao herda de Veiculo, ele é aceito.
     Rota rotaComCaminhao = new Rota(pacote1, caminhao);
     rotaComCaminhao.iniciarEntrega();

     // A mesma classe Rota aceita a Moto perfeitamente, sem precisarmos mudar o código da Rota.
     Rota rotaComMoto = new Rota(pacote2, moto);
     rotaComMoto.iniciarEntrega();
     
  // 4. Testando a mudança de estado (Status do Pacote)
     System.out.println("\n--- TESTES DE ATUALIZAÇÃO DE STATUS ---");
     
     // Lendo o status inicial
     System.out.println("Status original do pacote 1: " + pacote1.getStatus());
     
     // Atualizando o status através do método (ação de negócio)
     pacote1.alterarStatus("Em trânsito");
     
     // Comprovando a mudança
     System.out.println("Novo status do pacote 1: " + pacote1.getStatus());
     
     // Simulando a finalização da entrega
     pacote1.alterarStatus("Entregue");
     System.out.println("Status final do pacote 1: " + pacote1.getStatus());
 }
}

