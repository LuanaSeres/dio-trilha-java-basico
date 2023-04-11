package desafioPOO;

import servicos.Telefone;
import java.util.Scanner;
import java.util.Random;

public class Telefonar {
	
	@Override
	public void ligar() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Para quem você deseja ligar?");
		String nome = sc.nextLine();
		System.out.println("Ligando para " + nome);
		sc.close();
	}

	@Override
	public void atender() {
		String[] pessoas = {"nome1", "nome2", "nome3", "nome4", "nome5"};
		Random random = new Random();
        int numero = random.nextInt(5);
        
        System.out.println(pessoas[numero] + " está te ligando!");
        System.err.println("Você atendeu "+pessoas[numero]);
		
	}

	@Override
	public void iniciarCorrerioVoz() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Para quem você deseja enviar um correio de voz?");
		String nome = sc.nextLine();
		System.out.println("Enviando Correio de voz para " + nome);
		sc.close();
	}
}
