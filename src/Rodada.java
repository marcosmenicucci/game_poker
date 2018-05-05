public class Rodada {

	Jogador jogador1 = new Jogador();

	Jogador jogador2 = new Jogador();

	private void distribuirCartas() {

	}

	public void validarRodada() {
		System.out.println(jogador1.getCartas());
		System.out.println(jogador1.getCartas());
	}

	public static void main(String[] args) {
		Rodada rodada = new Rodada();
		rodada.validarRodada();
	}

}
