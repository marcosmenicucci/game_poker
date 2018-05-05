import java.util.ArrayList;
import java.util.List;

public class Jogador {

	private String nome;

	List<String> cartas;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<String> getCartas() {
		return cartas;
	}

	public void setCartas(List<String> cartas) {
		this.cartas = cartas;
	}

	private int duplas;
	private int trinca;
	private int quadrupla;
	private int maiorCarta;
	private int fullHouse;

	public void contarCartas() {
		this.duplas = 0;
		this.trinca = 0;
		this.quadrupla = 0;
		this.maiorCarta = 0;
		this.fullHouse = 0;

		List<Contador> contadores = new ArrayList<>();
		for (String carta : cartas) {
			String numero = carta.substring(0, 1);

			int idx = contadores.indexOf(numero);
			if (idx == -1) {
				contadores.add(new Contador(numero, 1));
			} else {
				contadores.get(idx).setQuantidade(contadores.get(idx).getQuantidade() + 1);
			}
		}

		for (Contador contador : contadores) {
			if (contador.getQuantidade() == 4)
				this.quadrupla = 1;
			else if (contador.getQuantidade() == 3)
				this.trinca = 1;
			else if (contador.getQuantidade() == 2)
				this.duplas++;
		}

		if (this.trinca == 1 && this.duplas == 1) {
			this.fullHouse = 1;
		}

	}

	class Contador {
		String identificador;
		private int quantidade;

		public Contador(String identificador, int contador) {
			super();
			this.identificador = identificador;
			this.quantidade = contador;
		}

		public String getIdentificador() {
			return identificador;
		}

		public void setIdentificador(String identificador) {
			this.identificador = identificador;
		}

		public int getQuantidade() {
			return quantidade;
		}

		public void setQuantidade(int quantidade) {
			this.quantidade = quantidade;
		}

	}

}
