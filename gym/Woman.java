package academia;

public class Mulher extends Pessoa {

	@Override
	public double setValorMensalidade(Pessoa pessoa) {
		double valorMensalidade = 0;
		if (pessoa.getIdade() <= 15) {
			valorMensalidade = 60;
		} else if (pessoa.getIdade() <= 18) {
			valorMensalidade = 80;
		} else if (pessoa.getIdade() <= 25) {
			valorMensalidade = 70;
		} else if (pessoa.getIdade() <= 30) {
			valorMensalidade = 90;

		} else {
			valorMensalidade = 100;
		}
		return valorMensalidade;
	}

}
