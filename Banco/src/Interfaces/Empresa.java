/**
 * Pacote responsável armazenar os atributos da empresa.
 */
package Interfaces;

/**
 * 
 * @author Renan Oliveira
 *
 */
public class Empresa extends Cliente {
	/**
	 * cnpj -> Armazena o CNPJ da empresa
	 */
	private String cnpj;

	/**
	 * 
	 * Construtor/ Return CNPJ
	 */

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

}
