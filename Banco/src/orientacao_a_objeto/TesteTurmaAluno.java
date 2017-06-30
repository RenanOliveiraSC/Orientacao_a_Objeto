package orientacao_a_objeto;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TesteTurmaAluno {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		
		//Criação do objeto Turma com suas informações
		Turma turma = new Turma();
		turma.periodo = "Matutino";
		turma.serie = "1";
		turma.sigla = "JAV";
		turma.tpEnsino = "Presencial";
		
		//Criação do objeto Aluno com suas informações
		Aluno aluno = new Aluno();
		aluno.nome = "José";
		aluno.rg = "123456";
		aluno.data = sdf.parse("01/01/1995");
		
		//Criação do vínculo entre turma e aluno
		aluno.turma = turma;
		
		System.out.println("O aluno "+aluno.nome+
				" com RG "+aluno.rg+
				" que nasceu no dia "+sdf.format(aluno.data)+
				" pertence a turma "+aluno.turma.sigla+
				" do período "+ aluno.turma.periodo+
				" da serie "+ aluno.turma.serie+
				" do tipo de ensino "+aluno.turma.tpEnsino);
	}
}
