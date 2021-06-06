package academia;

public class Homem extends Pessoa {

	@Override
	public double setValorMensalidade(Pessoa pessoa) {
		double valorMensalidade = 0;

		if (pessoa.getIdade() <= 15) {
			valorMensalidade = 50;
		} else if (pessoa.getIdade() <= 18) {
			valorMensalidade = 65;
		} else if (pessoa.getIdade() <= 30) {
			valorMensalidade = 70;
		} else if (pessoa.getIdade() <= 40) {
			valorMensalidade = 55;

		} else {
			valorMensalidade = 100;
		}
		return valorMensalidade;
	}

}
