package orientacao_a_objeto;

public class TesteTurma {

	public static void main(String[] args) {
		Turma tm1 = new Turma();
		tm1.periodo = "Noturno";
		tm1.serie = "3";
		tm1.sigla = "JAV";
		tm1.tpEnsino = "Presencial";

		Turma tm2 = new Turma();
		tm2.periodo = "Vespertino";
		tm2.serie = "5";
		tm2.sigla = "PHP";
		tm2.tpEnsino = "Presencial";
		System.out.println("Per�do: " + tm1.periodo + "  S�rie: " + tm1.serie + "  Sigla: " + tm1.sigla + "  Ensino:  "
				+ tm1.tpEnsino);
		System.out.println("Per�do: " + tm2.periodo + "  S�rie: " + tm2.serie + "  Sigla: " + tm2.sigla + "  Ensino:  "
				+ tm2.tpEnsino);
	}
}
