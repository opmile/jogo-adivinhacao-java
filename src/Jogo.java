import java.util.Random;
import java.util.Scanner;

public class Jogo {
    public static void main(String[] args) {
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);

    int numeroAleatorio = random.nextInt(101);
    int tentativasUser = 5;
    boolean acertou = false;

        for (int i = 1; i <= tentativasUser; i++) {
            int palpiteUser = scanner.nextInt();

            if (palpiteUser == numeroAleatorio) {
                System.out.println("parabéns você acertou em " + i + " tentativas");
                break;
            } else if (palpiteUser > numeroAleatorio) {
                System.out.println("o numero aleatorio é menor");
            } else if (palpiteUser > numeroAleatorio) {
                System.out.println("o numero aleatorio é maior");
            }
        }

        if (!acertou) {
            System.out.println("tente novamente! 5 tentativas não foram suficientes");
            System.out.println("o número correto era " + numeroAleatorio);
        }

    }
}
