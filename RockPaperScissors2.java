import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int playerScore = 0;
        int computerScore = 0;

        while (true) {
            System.out.println("Elige tu forma, (1 para piedra, 2 papel, 3 tijeras o 0 para salir del juego): ");
            int playerChoice;

            try {
                playerChoice = scanner.nextInt();

                if (playerChoice == 0) {
                    System.out.println("Saliste del juego");
                    break;
                }

                if (playerChoice < 1 || playerChoice > 3) {
                    System.out.println("Por favor elija un número del 1 hasta el 3");
                    continue;
                }

                int computerChoice = random.nextInt(3);
                System.out.println("Computer's choice: " + computerChoice);

                if (playerChoice == computerChoice) {
                    System.out.println("Empataste");
                } else if ((playerChoice == 1 && computerChoice == 3) ||
                           (playerChoice == 2 && computerChoice == 1) ||
                           (playerChoice == 3 && computerChoice == 2)) {
                    System.out.println("Ganaste");
                    playerScore++;
                } else {
                    System.out.println("Perdiste XD?!");
                    computerScore++;
                    throw new Exception("El jugador perdió esta ronda");
                }

                System.out.println("Punto del jugador: " + playerScore + " Puntos de la computadora: " + computerScore);

            } catch (Exception e) {
                System.out.println(e.getMessage());
            } finally {
                scanner.nextLine();
            }
        }
        scanner.close();
    }
}
