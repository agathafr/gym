package academia;

public abstract class Pessoa {
	private int idade;

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getIdade() {
		return this.idade;
	}

	public abstract double setValorMensalidade(Pessoa pessoa);
	


}