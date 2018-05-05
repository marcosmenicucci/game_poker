import junit.framework.TestCase;

public class TestRodadas extends TestCase {

	public void testeUmParUmaTrinca() {
		Jogador jogador1 = new Jogador();
		Jogador jogador2 = new Jogador();

		jogador1.setCartas(new String[] { "5H", "5C", "6S", "7S", "KD" });
		jogador2.setCartas(new String[] { "2C", "3S", "8S", "8D", "8H" });

		Rodada rodada = new Rodada();
		rodada.setJogador1(jogador1);
		rodada.setJogador2(jogador2);
		Jogador vencedor = rodada.validarRodada();
		assertEquals(vencedor, jogador2);
	}

	public void testeMaiorCarta() {
		Jogador jogador1 = new Jogador();
		Jogador jogador2 = new Jogador();

		jogador1.setCartas(new String[] { "5D", "8C", "9S", "JS", "AC" });
		jogador2.setCartas(new String[] { "2C", "5C", "7D", "8S", "QH" });

		Rodada rodada = new Rodada();
		rodada.setJogador1(jogador1);
		rodada.setJogador2(jogador2);
		Jogador vencedor = rodada.validarRodada();
		assertEquals(vencedor, jogador1);
	}
}
