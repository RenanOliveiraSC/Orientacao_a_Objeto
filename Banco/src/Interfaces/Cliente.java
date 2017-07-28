/**
 * Pacote respons�vel armazenar os atributos em comunm do cliente.
 */
package Interfaces;
/**
 * 
 * @author Renan Oliveira
 *
 */
public class Cliente implements Usuario {
/**
 * usu�rio -> Armazena o usu�rio de acesso ao sistema.
 * senha -> Armazena a senha de acesso ao sistema.
 * codigo -> Armazena o c�digo do usu�rio.
 * nome -> Armazena o nome do usu�rio.
 */
	private String usuario;
	private String senha;
	private int codigo;
	private String nome;

/**
 *  Construtor/ Return usu�rio
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
*  Construtor/ Return c�digo
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
