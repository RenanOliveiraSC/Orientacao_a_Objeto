package orientacao_a_objeto;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TesteTurmaAluno {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		
		//Cria��o do objeto Turma com suas informa��es
		Turma turma = new Turma();
		turma.periodo = "Matutino";
		turma.serie = "1";
		turma.sigla = "JAV";
		turma.tpEnsino = "Presencial";
		
		//Cria��o do objeto Aluno com suas informa��es
		Aluno aluno = new Aluno();
		aluno.setNome("Jos�");
		aluno.setRg("123456");
		aluno.setData(sdf.parse("01/01/1995"));
		
		//Cria��o do v�nculo entre turma e aluno
		aluno.setTurma(turma);
		
		System.out.println("O aluno "+aluno.getNome()+
				" com RG "+aluno.getRg()+
				" que nasceu no dia "+sdf.format(aluno.getData())+
				" pertence a turma "+aluno.getTurma().sigla+
				" do per�odo "+ aluno.getTurma().periodo+
				" da serie "+ aluno.getTurma().serie+
				" do tipo de ensino "+aluno.getTurma().tpEnsino);
	}
}
