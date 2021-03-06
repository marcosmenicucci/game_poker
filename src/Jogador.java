import java.util.ArrayList;
import java.util.List;

public class Jogador {
	private String[] pesoCartas = { "2", "3", "4", "5", "6", "7", "8", "9", "1", "J", "Q", "K", "A" };

	private String nome;

	String[] cartas;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String[] getCartas() {
		return cartas;
	}

	public void setCartas(String[] cartas) {
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

			int pesoCarta = 0;
			for (int i = 0; i < pesoCartas.length; i++) {
				if (pesoCartas[i].equals(numero)) {
					pesoCarta = i;
					break;
				}
			}
			if (pesoCarta > maiorCarta) {
				maiorCarta = pesoCarta;
			}

			Contador achou = contadores.stream().filter(c -> c.identificador.equals(numero)).findFirst().orElse(null);
			if (achou == null) {
				contadores.add(new Contador(numero, 1));
			} else {
				achou.setQuantidade(achou.getQuantidade() + 1);
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

	public int getDuplas() {
		return duplas;
	}

	public void setDuplas(int duplas) {
		this.duplas = duplas;
	}

	public int getTrinca() {
		return trinca;
	}

	public void setTrinca(int trinca) {
		this.trinca = trinca;
	}

	public int getQuadrupla() {
		return quadrupla;
	}

	public void setQuadrupla(int quadrupla) {
		this.quadrupla = quadrupla;
	}

	public int getMaiorCarta() {
		return maiorCarta;
	}

	public void setMaiorCarta(int maiorCarta) {
		this.maiorCarta = maiorCarta;
	}

	public int getFullHouse() {
		return fullHouse;
	}

	public void setFullHouse(int fullHouse) {
		this.fullHouse = fullHouse;
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
