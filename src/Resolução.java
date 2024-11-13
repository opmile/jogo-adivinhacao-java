import java.awt.*;
import java.util.Random;
import java.util.Scanner;

public class Resolução {
    public static void main(String[] args) {
        System.out.println("bem-vindo ao jogo do numero secreto!");
        System.out.println("voce tem 5 tentativas para adivinhar um numero entre 0 e 100");

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int numeroAleatorio = random.nextInt(101);
        int numeroVidas = 5;
        boolean checkAcerto = false;

        for (int i = 1; i <= numeroVidas; i++) {
            int palpiteUsuario = scanner.nextInt();

            if (palpiteUsuario == numeroAleatorio) {
                System.out.println("parabéns! você acertou! em " + i + " tentativas");
                checkAcerto = true;
                break;
            } else if (palpiteUsuario > numeroAleatorio) {
                System.out.println("o numero aleatorio é menor que seu chute!");
            } else {
                System.out.println("o numero aleatorio é maior que seu chute!");
            }
        }

        if (!checkAcerto) {
            System.out.println("você errou! o numero correro era " + numeroAleatorio);
        }

    }
}
