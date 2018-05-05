public class Rodada {

	Jogador jogador1 = new Jogador();

	Jogador jogador2 = new Jogador();

	public Jogador validarRodada() {
		jogador1.contarCartas();
		jogador2.contarCartas();

		if (jogador1.getFullHouse() > jogador2.getFullHouse()) {
			return jogador1;
		}
		if (jogador1.getFullHouse() < jogador2.getFullHouse()) {
			return jogador2;
		}
		if (jogador1.getTrinca() > jogador2.getTrinca()) {
			return jogador1;
		}
		if (jogador1.getTrinca() < jogador2.getTrinca()) {
			return jogador2;
		}
		if (jogador1.getDuplas() > jogador2.getDuplas()) {
			return jogador1;
		}
		if (jogador1.getDuplas() < jogador2.getDuplas()) {
			return jogador2;
		}
		if (jogador1.getMaiorCarta() > jogador2.getMaiorCarta()) {
			return jogador1;
		}
		if (jogador1.getMaiorCarta() < jogador2.getMaiorCarta()) {
			return jogador2;
		}
		return null;
	}

	public static void main(String[] args) {
		Rodada rodada = new Rodada();
		rodada.validarRodada();
	}

	public Jogador getJogador1() {
		return jogador1;
	}

	public void setJogador1(Jogador jogador1) {
		this.jogador1 = jogador1;
	}

	public Jogador getJogador2() {
		return jogador2;
	}

	public void setJogador2(Jogador jogador2) {
		this.jogador2 = jogador2;
	}
}
