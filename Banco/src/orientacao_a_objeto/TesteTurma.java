package orientacao_a_objeto;

public class TesteTurma {

	public static void main(String[] args) {
		Turma tm1 = new Turma();
		tm1.periodo = "Manhã";
		tm1.serie = "3";
		tm1.sigla = 'B';
		tm1.tpEnsino = "Ensino Médio";

		Turma tm2 = new Turma();
		tm2.periodo = "Tarde";
		tm2.serie = "5";
		tm2.sigla = 'C';
		tm2.tpEnsino = "Ensino Médio";
		System.out.println("Perído: " + tm1.periodo + "  Série: " + tm1.serie + "  Sigla: " + tm1.sigla + "  Ensino: "
				+ tm1.tpEnsino);
		System.out.println("Perído: " + tm2.periodo + "  Série: " + tm2.serie + "  Sigla: " + tm2.sigla + "  Ensino: "
				+ tm2.tpEnsino);
	}
}
