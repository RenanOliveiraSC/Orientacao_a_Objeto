/**
 * Pacote respons�vel pelo armazenamento de informa��es sobre o Gerente.
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
 * @param salario -> Armazena o sal�rio do gerente.
 * @param usuario -> Armazena o usu�rio do gerente.
 * @param senha -> Armazena a senha do usu�rio;
 */
	public Gerente(String nome, double salario, String usuario, String senha){
		super(nome,salario);
		setUsuario(usuario);
		setSenha(senha);
	}
/**
 * @bonifica��o -> M�todo para aumentar o salario com base na Bonifica��o.	
 */
	@Override
	public void bonificacao(){
		setBonificacao(getSalario() *(15d / 100));
		setSalario(getBonificacao() *((15d / 100)+1));
	}
/**
 * @consultarDados -> M�todo para consultar as informa��es de usu�rio e senha.	
 */
	@Override
	public String consultarDados(){
		return super.consultarDados() + "\n Usu�rio: "+getUsuario()+ "\n Senha: "+getSenha();
	}
}
