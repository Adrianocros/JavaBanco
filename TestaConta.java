package BancoPolimorfismo;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestaConta  {

	public static void main(String[] args) {  
    
       //numero, agencia, banco, saldo, chequeEspecial
       ContaCorrente cc1 = new ContaCorrente(1, 1, "Banco A", 1000, 1500, 31);
       ContaCorrente cc2 = new ContaCorrente(4, 1, "Banco A", 1300, 100, 31);
       ContaCorrente cc3 = new ContaCorrente(5, 1, "Banco A", 1500, 500, 31);
      
       //numero, agencia, banco, saldo, diaAniversario, taxaDeJuros
     // ContaPoupanca cp1 = new ContaPoupanca(2, 1, "Banco A", 100, 25, 0.05);

       //numero, agencia, banco, saldo, quantidadeDeSaques
      // ContaSalario cs1 = new ContaSalario(3, 1, "Banco A", 1000, 3);

       List<ContaCorrente> contas = Arrays.asList(cc1,cc2,cc3);

      //foreach
       for(ContaCorrente conta:contas){
         System.out.println(conta);
       }

       System.out.println("---------Clientes-------------------");

       Cliente cli1 = new Cliente("Adriano", "123", true, 10);
       cli1.autentica("a13");

       Cliente cli2 = new Cliente("Fernanda", "113", true, 30);
       cli2.autentica("113");

       Cliente cli3 = new Cliente("Renato","13", false, 15);
       cli3.autentica("120");

       Cliente cli4 = new Cliente("Maria", "123", true, 40);
       cli4.autentica("a13");

       Cliente cli5 = new Cliente("João", "113", true, 8);
       cli5.autentica("113");

       Cliente cli6 = new Cliente("Tamires","13", false, 2);
       cli6.autentica("120");

       Cliente cli7 = new Cliente("Renata", "123", true, 6);
       cli7.autentica("a13");

       Cliente cli8 = new Cliente("Flavia", "113", true, 26);
       cli8.autentica("113");

       Cliente cli9 = new Cliente("Thiago","13", false, 59);
       cli9.autentica("120");

       Cliente cli10 = new Cliente("Rafael","13", false, 70);
       cli10.autentica("120");

       //Lista de cliente com Arrays 
       List<Cliente> clientes = Arrays.asList(cli1, cli2, cli3, cli4, cli5, cli3, cli6, cli7, cli8, cli9, cli10);
         //expressao lambda
       //clientes.forEach(cli -> System.out.println(cli.getCompras()));
       //Steam
       Stream<Cliente> stream = clientes.stream().filter(cliente -> cliente.getCompras() < 10);
       //Collectors
      List<Cliente> selecionados = stream.collect(Collectors.toList());
      selecionados.forEach(c -> System.out.println(c.getCompras()));

       System.out.println("------Clente que mais comprou-------");

   
         Cliente clientesFiel = clientes.stream().max(Comparator.comparingInt(Cliente ::getCompras)).get();
         System.out.println("O Cliente que mais comprou foi: " + clientesFiel.getNome() + " - Quantidade : " + clientesFiel.getCompras());
       
        System.out.println("------Clente que menos comprou-------");

        Cliente clienteMenor = clientes.stream().min(Comparator.comparingInt(Cliente :: getCompras)).get();
        System.out.println("O Cliente que menos comprou foi: " + clienteMenor.getNome() + " - Quantidade : " + clienteMenor.getCompras());
      
        System.out.println("------Media de compras -------");

        double media = clientes.stream()
        .mapToDouble(cliente -> cliente
        .getCompras()).average().getAsDouble();

        System.out.println("A media de compras foi : " + media);
        
        
        
      }
   
}
