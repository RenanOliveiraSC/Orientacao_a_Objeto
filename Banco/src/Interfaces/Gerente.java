/**
 * Pacote responsável pelo armazenamento de informações sobre o Gerente.
 */
package Interfaces;
/**
 * 
 * @author Renan Oliveira
 *
 */
public class Gerente extends Funcionario {

	public Gerente(){
	}
/**
 * 	
 * @param nome -> Armazena o nome do gerente.
 * @param salario -> Armazena o salário do gerente.
 * @param usuario -> Armazena o usuário do gerente.
 * @param senha -> Armazena a senha do usuário;
 */
	public Gerente(String nome, double salario, String usuario, String senha){
		super(nome,salario);
		setUsuario(usuario);
		setSenha(senha);
	}
/**
 * @bonificação -> Método para aumentar o salario com base na Bonificação.	
 */
	@Override
	public void bonificacao(){
		setBonificacao(getSalario() *(15d / 100));
		setSalario(getBonificacao() *((15d / 100)+1));
	}
/**
 * @consultarDados -> Método para consultar as informações de usuário e senha.	
 */
	@Override
	public String consultarDados(){
		return super.consultarDados() + "\n Usuário: "+getUsuario()+ "\n Senha: "+getSenha();
	}
}
