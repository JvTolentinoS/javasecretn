import java.util.Random;
import java.util.Scanner;

public class SecretN {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random gerador = new Random();
        boolean continuar = true;

            System.out.println("  /$$$$$$                                            /$$           /$$   /$$");
            System.out.println(" /$$__  $$                                          | $$          | $$$ | $$");
            System.out.println("| $$  \\__/  /$$$$$$   /$$$$$$$  /$$$$$$   /$$$$$$  /$$$$$$        | $$$$| $$");
            System.out.println("|  $$$$$$  /$$__  $$ /$$_____/ /$$__  $$ /$$__  $$|_  $$_/        | $$ $$ $$");
            System.out.println(" \\____  $$| $$$$$$$$| $$      | $$  \\__/| $$$$$$$$  | $$          | $$  $$$$");
            System.out.println(" /$$  \\ $$| $$_____/| $$      | $$      | $$_____/  | $$ /$$      | $$\\  $$$");
            System.out.println("|  $$$$$$/|  $$$$$$$|  $$$$$$$| $$      |  $$$$$$$  |  $$$$/      | $$ \\  $$");
            System.out.println(" \\______/  \\_______/ \\_______/|__/       \\_______/   \\___/        |__/  \\__/");
            System.out.println("                                                                            ");
            System.out.println("                                                                            ");

        while (continuar) {
            int numeroAleatorio = gerador.nextInt(10);
            int numero = -1;
            int tentativas = 0;

            System.out.println("Escreva seu nome:");
            String nome = scanner.nextLine();

            for (int i = 0; i < 10; i++) {
                System.out.println("Qual é o número da sorte?");
                numero = scanner.nextInt();
                tentativas++;

                if (numero > numeroAleatorio) {
                    System.out.println("Acima demais!");
                } else if (numero < numeroAleatorio) {
                    System.out.println("Baixo demais!");
                } else {
                    System.out.println("Parabéns " + nome + " - O número da sorte é: " + numero +
                            ", você precisou de " + tentativas + " tentativas.");
                    break;
                }
            }

            if (numero != numeroAleatorio) {
                System.out.println(" ");
                System.out.println(" ");
                System.out.println(" /$$$$$$$$             /$$$");
                System.out.println("| $$_____/            /$$_/");
                System.out.println("| $$             /$$ /$$/  ");
                System.out.println("| $$$$$         |__/| $$   ");
                System.out.println("| $$__/             | $$   ");
                System.out.println("| $$             /$$|  $$  ");
                System.out.println("| $$            |__/ \\  $$$");
                System.out.println("|__/                  \\___/");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println("Você falhou! O número correto era: " + numeroAleatorio);
            }

            System.out.println("Deseja jogar novamente? (s/n)");
            scanner.nextLine();
            String resposta = scanner.nextLine();

            if (!resposta.equalsIgnoreCase("s")) {
                continuar = false;
            }
        }

        System.out.println(" ");
        System.out.println(" ");
        System.out.println("  /$$$$$$  /$$                 /$$                           /$$           /$$");
        System.out.println(" /$$__  $$| $$                |__/                          | $$          | $$");
        System.out.println("| $$  \\ $$| $$$$$$$   /$$$$$$  /$$  /$$$$$$   /$$$$$$   /$$$$$$$  /$$$$$$ | $$");
        System.out.println("| $$  | $$| $$__  $$ /$$__  $$| $$ /$$__  $$ |____  $$ /$$__  $$ /$$__  $$| $$");
        System.out.println("| $$  | $$| $$  \\ $$| $$  \\__/| $$| $$  \\ $$  /$$$$$$$| $$  | $$| $$  \\ $$|__/");
        System.out.println("| $$  | $$| $$  | $$| $$      | $$| $$  | $$ /$$__  $$| $$  | $$| $$  | $$    ");
        System.out.println("|  $$$$$$/| $$$$$$$/| $$      | $$|  $$$$$$$|  $$$$$$$|  $$$$$$$|  $$$$$$/ /$$");
        System.out.println(" \\______/ |_______/ |__/      |__/ \\____  $$ \\_______/ \\_______/ \\______/ |__/");
        System.out.println("                                   /$$  \\ $$                                  ");
        System.out.println("                                  |  $$$$$$/                                  ");
        System.out.println("                                   \\______/                                   ");

        scanner.close();
    }
}
