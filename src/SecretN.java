import java.util.Random;
import java.util.Scanner;

public class SecretN {

    public static void main(String[] args) {
        Random gerador = new Random();
        int numeroaleatorio = gerador.nextInt(10);
        int numero = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println(numeroaleatorio);
        System.out.println("Escreva seu nome");
        String nome = scanner.nextLine();

        int numerocorreto = 0;

        while (numeroaleatorio != numerocorreto) {
            int tentativas = 0;
            for (int i = 0; i < 10; i++) {
                System.out.println("Qual é o número da sorte?");
                numero = scanner.nextInt();
                if (numero > numeroaleatorio) {
                    System.out.println("Acima");
                } else if (numero < numeroaleatorio) {
                    System.out.println("Abaixo");
                } else {
                    System.out.println("Parabéns " + nome);
                }
                numerocorreto = numero;
            }
        }
    }
}


