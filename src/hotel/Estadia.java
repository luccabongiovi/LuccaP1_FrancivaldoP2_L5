package hotel;

/**
 * Classe responsável pela representação da estadia de um animal no Pet Hotel.
 * 
 * @author Francivaldo Cabral - 116111544
 *
 */

public class Estadia extends Animal {
	private Animal animal;
	private double valor;
	private int dias;

	/**
	 * Construtor da classe estadia.
	 * 
	 * @param nome
	 * @param tipo
	 * @param idade
	 * @param animal
	 * @param valor
	 * @param dias
	 */
	public Estadia(String nome, String tipo, int idade, Animal animal, double valor, int dias) {
		super(nome, tipo, idade);
		this.animal = animal;
		this.valor = valor;
		this.dias = dias;
	}

	/**
	 * @return the animal
	 */
	public Animal getAnimal() {
		return animal;
	}

	/**
	 * @return the valor
	 */
	public double getValor() {
		return valor;
	}

	/**
	 * @return the dias
	 */
	public int getDias() {
		return dias;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return getNome() + ", " + getTipo() + ", " + getDias() + " dias com o preço de R$ " + getValor();
	}
}
