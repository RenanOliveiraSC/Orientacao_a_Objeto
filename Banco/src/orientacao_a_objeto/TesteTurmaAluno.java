package orientacao_a_objeto;

public class TesteTurmaAluno {

	public static void main(String[] args) {
		
		Turma tu = new Turma();
		Aluno al = new Aluno();
		
		tu.aluno = al;
		tu.aluno.nome = "Felipe";
		
		System.out.println(tu.aluno.nome);
	}
}
