public class Rodada {

	Jogador jogador1 = new Jogador();

	Jogador jogador2 = new Jogador();

	String[] cartasDisponiveis = new String[] { "5H", "5C", "6S", "7S", "KD" };

	private void distribuirCartas() {
		jogador1.getCartas().add("5H");

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
