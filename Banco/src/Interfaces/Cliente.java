/**
 * Pacote responsável armazenar os atributos em comunm do cliente.
 */
package Interfaces;
/**
 * 
 * @author Renan Oliveira
 *
 */
public class Cliente implements Usuario {
/**
 * usuário -> Armazena o usuário de acesso ao sistema.
 * senha -> Armazena a senha de acesso ao sistema.
 * codigo -> Armazena o código do usuário.
 * nome -> Armazena o nome do usuário.
 */
	private String usuario;
	private String senha;
	private int codigo;
	private String nome;

/**
 *  Construtor/ Return usuário
 */
	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
/**
*  Construtor/ Return senha
*/
	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
/**
*  Construtor/ Return código
*/
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
/**
*  Construtor/ Return nome
*/
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
