package aplicacao;

import java.util.ArrayList;
import java.util.Scanner;

import entidades.Funcionario;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<Funcionario> lista_funcionarios = new ArrayList<>();

		int opcao;

		do {

			System.out.println("--------------------------------");
			System.out.println("-------- MENU PRINCIPAL --------");
			System.out.println("--------------------------------");
			System.out.println();
			System.out.println("1 - INSERIR");
			System.out.println("2 - EXCLUIR");
			System.out.println("3 - EXIBIR");
			System.out.println("0 - SAIR");
			System.out.print("DIGITE SUA OPÇÃO: ");
			opcao = sc.nextInt();

			if (opcao == 1) {

				System.out.println("------- CADASTRO DE FUNCIONÁRIOS ------");

				System.out.print("ID: ");
				int id = sc.nextInt();
				System.out.print("NOME: ");
				String nome = sc.next();
				System.out.print("SALÁRIO: ");
				double salario = sc.nextDouble();

				lista_funcionarios.add(new Funcionario(id, nome, salario));

			}

			else if (opcao == 3) {
				for (Funcionario funcionarios_cadastrados : lista_funcionarios) {
					System.out.println("ID: " + funcionarios_cadastrados.getId());
					System.out.println("NOME: " + funcionarios_cadastrados.getNome());
					System.out.println("SALÁRIO: " + funcionarios_cadastrados.getSalario());
				}
			}

		} while (opcao != 0);

		sc.close();

	}

}
