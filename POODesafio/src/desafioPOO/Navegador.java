package desafioPOO;

import servicos.Internet;

public class Navegador {
	@Override
	public void exibirPagina() {
		System.err.println("Exibindo pagina web");
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionando nova aba");
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando página");
	}
}
