package desafioPOO;

public class Celular {

	public static void main(String[] args) {
		Navegador navegador = new Navegador();
		Musica spotify = new Musica();
		Telefonar telefone = new Telefonar();	
		
		navegador.exibirPagina();
		navegador.adicionarNovaAba();
		navegador.atualizarPagina();
		System.out.println("--------");
		spotify.tocar();
		spotify.pausar();
		spotify.selecionarMusica();
		System.out.println("--------");
		telefone.ligar();
		telefone.atender();
		telefone.iniciarCorrerioVoz();
	}

}
