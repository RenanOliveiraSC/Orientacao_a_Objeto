package orientacao_a_objeto;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TesteAluno {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		Aluno aluno1 = new Aluno();
		aluno1.nome = "Renan";
		aluno1.rg = "47266837-7";
		aluno1.data = sdf.parse("09/07/1990");

		Aluno aluno2 = new Aluno();
		aluno2.nome = "Maria";
		aluno2.rg = "2664478-7";
		aluno2.data = sdf.parse("04/04/2010");
		System.out.println("Aluno Aluno: " + aluno1.nome + "  RG Aluno: " + aluno1.rg + "  Data Nasc: "
				+ sdf.format(aluno1.data));
		System.out.println("Aluno Aluno: " + aluno2.nome + "  RG Aluno: " + aluno2.rg + "  Data Nasc: "
				+ sdf.format(aluno2.data));
	}
}
