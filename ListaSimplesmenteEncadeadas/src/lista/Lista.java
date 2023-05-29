package lista;

import basicas.Celula;

public class Lista {

	private Celula primeiro;
	private Celula ultimo;
	private int totalElementos = 0;

	public void listar() {

		Celula aux = this.primeiro;
		for (int i = 0; i < this.totalElementos - 1; i++) {
			System.out.print(aux.getElemento() + " - ");
			aux = aux.getProxima();
		}

		System.out.println(aux.getElemento());
	}

	public void adicionarNoComeco(Object elemento) {

		Celula nova = new Celula(this.primeiro, elemento);
		this.primeiro = nova;

		if (this.totalElementos == 0) {
			this.ultimo = nova;
		}
		this.totalElementos++;
	}

	public void adicionaNoFinal(Object elemento) {
		if (this.totalElementos == 0) {
			this.adicionarNoComeco(elemento);
		} else {
			Celula nova = new Celula(elemento);
			this.ultimo.setProxima(nova);
			this.ultimo = nova;
			this.totalElementos++;
		}
	}

	public void adicionarPorPosicao(int posicao, Object elemento) {

		Celula aux = this.primeiro;

		if (posicao > this.totalElementos || posicao < 0) {
			System.out.println("Posicao fora dos limites");
		}
		
		if(posicao == 0) {
			this.adicionarNoComeco(elemento);
			
		}else {
			for (int i = 0; i < posicao - 1; i++) {
				aux = aux.getProxima();
			}
			
			Celula nova = new Celula(aux.getProxima(), elemento);
			aux.setProxima(nova);
			this.totalElementos++;
		}

		

		
	}

}
