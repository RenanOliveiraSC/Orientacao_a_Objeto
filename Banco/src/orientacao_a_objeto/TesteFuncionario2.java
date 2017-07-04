package orientacao_a_objeto;

import java.util.Scanner;

public class TesteFuncionario2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Funcionario funcionario = new Funcionario();
		System.out.println("Informa o nome do Funcionario:");
		funcionario.nome = scanner.nextLine();

		int funcao = 1;
		while (funcao != 0) {
			System.out.println(
					"Qual operação deseja realizar? (1-Alterar Nome, 2-Alterar Salário, 3-Visualizar os Dados, 0-Encerrar");
			funcao = Integer.parseInt(scanner.nextLine());
			switch (funcao) {
			case 0:
				break;

			case 1:
				System.out.println("Qual o nome do funcionario?");
				funcionario.nome = scanner.nextLine();
				break;
			case 2:
				System.out.println("Qual o Salário?");
				funcionario.salario = Double.parseDouble(scanner.nextLine());
				break;
			case 3:
				System.out.println(funcionario.consultardados());
				break;
			default:
				System.out.println("Operação inválida!");

			}
		}

		scanner.close();

	}
}
