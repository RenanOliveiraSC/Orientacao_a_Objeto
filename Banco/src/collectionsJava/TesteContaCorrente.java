package collectionsJava;

import java.util.ArrayList;
import java.util.List;

public class TesteContaCorrente {

	public static void main(String[] args) {

		ContaCorrente contaC1 = new ContaCorrente();
		contaC1.setAgencia(85);
		contaC1.setConta(4568);

		ContaCorrente contaC2 = new ContaCorrente();
		contaC2.setAgencia(45);
		contaC2.setConta(4578);

		ContaPoupanca contaP1 = new ContaPoupanca();
		contaP1.setAgencia(41);
		contaP1.setConta(44444);

		ContaPoupanca contaP2 = new ContaPoupanca();
		contaP2.setAgencia(23);
		contaP2.setConta(5555);
		
		List<ContaCorrente> lContas = new ArrayList<>();
		lContas.add(contaC1);
		lContas.add(contaC2);

		for (ContaCorrente contaCorrente : lContas) {
			System.out.println(contaCorrente.getConta());
		}
		lContas.remove(0);
		lContas.clear();
		int quantidadeC = lContas.size();
		System.out.println(quantidadeC);

		
		List<ContaPoupanca> lContasP = new ArrayList<>();
		lContasP.add(contaP1);
		lContasP.add(contaP2);

		for (ContaPoupanca contaPoupanca : lContasP) {
			System.out.println(contaPoupanca.getConta());
		}
		int quantidadeP = lContas.size();
		lContasP.remove(1);
		lContasP.clear();

		System.out.println(quantidadeP);
		
	}
}
