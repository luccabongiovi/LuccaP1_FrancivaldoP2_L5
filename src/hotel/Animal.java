package hotel;

/**
 * Classe responsável pela representação de um Animal.
 * 
 * @author Francivaldo Cabral - 116111544
 *
 */

public class Animal {
	private String nome, tipo;
	private int idade;

	/**
	 * Construtor da classe animal.
	 * 
	 * @param nome
	 * @param tipo
	 * @param idade
	 */
	public Animal(String nome, String tipo, int idade) {
		this.nome = nome;
		this.tipo = tipo;
		this.idade = idade;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * @return the idade
	 */
	public int getIdade() {
		return idade;
	}

}
