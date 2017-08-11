package Exercicio3_Folha;

import java.text.DecimalFormat;

public class TesteFolha {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#0.00");
		Chefe compras = new Chefe("Marcio", "Pereira");
		compras.setSalario(5000d);
		TrabalhadorComissionado vendedor = new TrabalhadorComissionado("Robson", "Santos", 1.5d, 100);
		TrabalhadorPecaProduzida producao = new TrabalhadorPecaProduzida("Caique", "Dias", 5000, 0.50d);
		TrabalhadorHora consultor = new TrabalhadorHora("Adriano", "Polidoro", 180, 65d);
		
		System.out.println("Salário Chefe: R$ " + df.format(compras.calularGanho()) +"\nResumo: Salario R$:"+df.format(compras.getSalario()));
		System.out.println();
		System.out.println("Salário Vendedor: R$ " + df.format(vendedor.calularGanho()) +"\nResumo: Salario R$:"+df.format(vendedor.getSalario())+
				"\nComissão: R$ "+ df.format(vendedor.getComissao()));
		System.out.println();
		System.out.println("Salário Produção: R$ " + df.format(producao.calularGanho()) +"\nResumo: Salario R$:"+df.format(producao.getSalario())+
				"\nValor da Peça: R$ "+ df.format(producao.getValorPeca())+"\nQuantidade de Peças:"+df.format(producao.getPecaProduzida()));
		System.out.println();
		System.out.println("Salário Consultor: R$ " + df.format(consultor.calularGanho()) +"\nResumo: Salario R$:"+df.format(consultor.getSalario()));
		System.out.println();
		
	}
}
