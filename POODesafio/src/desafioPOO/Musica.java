package desafioPOO;

import servicos.Reproduzir;
import java.util.Scanner;

public class Musica {
	@Override
	public void tocar() {
		System.out.println("Iniciando faixa musical");		
	}

	@Override
	public void pausar() {
		System.out.println("Musica pausada");		
	}

	@Override
	public void selecionarMusica() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escolha uma musica para tocar: ");
		String msc = sc.nextLine();
		System.out.println("Você escolheu " + msc + ", reproduzindo...");
		sc.close();
	}
}
