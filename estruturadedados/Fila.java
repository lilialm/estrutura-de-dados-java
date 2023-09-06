package estruturadedados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Fila {

	public static void main(String[] args) {
		Queue<String> filaClientes = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Menu:");
            System.out.println("1- Adicionar Cliente na Fila");
            System.out.println("2- Listar todos os clientes");
            System.out.println("3- Retirar cliente da fila");
            System.out.println("0- Sair");
            System.out.print("Entre com a opção desejada: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome: ");
                    String nomeCliente = scanner.next();
                    filaClientes.add(nomeCliente);
                    System.out.println("\nFila: ");
                    for (String cliente : filaClientes) {
                        System.out.println(cliente);
                    }
                    System.out.println("Cliente Adicionado!\n");
                    break;
                case 2:
                    System.out.println("\nLista de Clientes na Fila: ");
                    for (String cliente : filaClientes) {
                        System.out.println(cliente);
                    }
                    System.out.println();
                    break;
                case 3:
                    if (filaClientes.isEmpty()) {
                        System.out.println("\nA Fila está vazia!\n");
                    } else {
                        String clienteChamado = filaClientes.poll();
                        System.out.println("\nFila: ");
                        for (String cliente : filaClientes) {
                            System.out.println(cliente);
                        }
                        System.out.println("\nO Cliente foi Chamado!\n");
                    }
                    break;
                case 0:
                    System.out.println("Programa finalizado.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.\n");
            }
        } while (opcao != 0);

        scanner.close();

	}

}
