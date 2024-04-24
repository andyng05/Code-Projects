import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Collections;
import java.util.List; 
import java.util.ArrayList;

class Question {
    private String category;
    private String question;
    private int correctAnswer;
    private String correctAnswerText;
    public Question(String category, String question, int correctAnswer, String correctAnswerText) {
        this.category = category;
        this.question = question;
        this.correctAnswer = correctAnswer;
        this.correctAnswerText = correctAnswerText;
    }
    public String getCategory() {
        return category;
    }
    public String getQuestion() {
        return question;
    }
    public int getCorrectAnswer() {
        return correctAnswer;
    }
    public String getCorrectAnswerText() {
        return correctAnswerText;
    }
}

public class LoLQuiz {
    public static void main(String[] args) {
    List<Question> questionBank = start();
    Collections.shuffle(questionBank);
    Scanner scanner = new Scanner(System.in);
    int score = 0;
    int attempts = 0;
    System.out.println("");
    System.out.println("Bienvenidos al quiz de LoL querido teacher Braulio XD ");
    System.out.println("");

    try {
        for (int i = 0; i < 10 && attempts < 10 && score < 7; i++) {
        Question currentQuestion = questionBank.get(i);
        System.out.println("Categoría: " + currentQuestion.getCategory());
        System.out.println(currentQuestion.getQuestion());
    
        int userAnswer = getUserAnswer(scanner);
        attempts++;
    
        if (userAnswer == currentQuestion.getCorrectAnswer()) {
        score++;
        System.out.println("La respuesta correcta es: " + currentQuestion.getCorrectAnswerText() + ", pegaste " + score + " skillshots, sigue así, si pegas 5 skillshots ganas");
        System.out.println("");
        } else {
        System.out.println("");
        System.out.println("Fallaste tu skillshot bro, la respuesta era: " + currentQuestion.getCorrectAnswerText() + ", manco XD.");
        System.out.println("");
        }
        }
        System.out.println("");
        System.out.println("GG bro, al final obtuviste: " + score + " puntos");

        if (score >= 5) {
        System.out.println("Felicidades, pegaste 7 skillshots");
        } else {
        System.out.println("GG perdiste XD, trash ");
        }
        } catch (InputMismatchException e) {
        System.out.println("Brother al favor y escriba un número ");
        } finally {
        scanner.close();
        }
    }
        
    private static List<Question> start() {
    List<Question> questionBank = new ArrayList<>();
    questionBank.add(new Question("Campeones", "¿Quién es el maestro de las sombras? (Shen, Zed, Akali, Fizz) ", 2, "Zed"));
    questionBank.add(new Question("Campeones", "¿De cual campeón se utiliza el término insec? (Azir, Zed, Leblanc, Lee Sin) ", 4, "Lee Sin"));  
    questionBank.add(new Question("Campeones", "¿Qué campeón utiliza energía en vez de maná? (Garen, Akali, Briar, Twisted Fate) ", 2, "Akali"));
    questionBank.add(new Question("Campeones", "¿Quién es el rey de los trolls? (Brand, Tryndamere, Trundle, Sejuani) ", 3, "Trundle"));
    questionBank.add(new Question("Campeones", "¿Cuál es el título de Riven? (La Rota, La Desahuciada, La Exiliada, La Desterrada) ", 3, "La Exiliada"));
      
    questionBank.add(new Question("Lore", "¿Quién tiene el alma de Senna? (Darius, Thresh, Kayle, Corki) ", 2, "Thresh"));
    questionBank.add(new Question("Lore", "¿Quién es el hermano de Darius en la historia de League of Legends? (Garen, Swain, Vladimir, Draven) ", 4, "Draven"));
    questionBank.add(new Question("Lore", "¿Cómo se llamaba Jinx realmente? (Jinx, Emma, Caitlyn, Powder) ", 4, "Powder"));
    questionBank.add(new Question("Lore", "¿A qué región pertenece Yasuo? (Freljorld, Noxus, Ionia, Piltóver) ", 3, "Ionia"));
    questionBank.add(new Question("Lore", "¿Qué relación tenían Yasuo y Yone principalmente en el Lore? (Amigos, Hermanos, Maestro y aprendiz, Enemigos) ", 2, "Hermanos"));
      
    questionBank.add(new Question("Items", "¿Cuál es la pasiva de Rabadon's Deathcap o Sombrero de Rabadon? (Aumento de MS, Aumento AD, Aumento de AP, Aumento de AS) ", 3, "Aumento de AP"));
    questionBank.add(new Question("Items", "¿Qué botas reduce 12% del daño basico? (Tabis, Mercurio, Danza de la Muerte , Hidra Titánica) ", 1, "Tabis"));
    questionBank.add(new Question("Items", "¿Qué item de AD cuesta 350 de oro? (Daga, Capa negatron, Espada larga, Espátula)", 3, "Espada larga"));
    questionBank.add(new Question("Items", "¿Qué item hace 12% de daño AD de su vida actual? (Espada del Rey Arruinado, La Sanguinaria, Placa del Hombre Muerto, Fuerza de la Trinidad)", 1, "Espada del Rey Arruinado"));        
    questionBank.add(new Question("Items", "¿Qué item te revive luego de morir?(Youmuus, Segundo Aliento, Amuleto de la Vida, Angel Guardián) ", 4, "Ángel Guardián"));
       
    questionBank.add(new Question("Habilidades", "¿Cuál habilidad de Ahri te 'enamora' ? (Q, W, E, R) ", 3, "La R"));
    questionBank.add(new Question("Habilidades", "¿Qué campeón tiene la habilidad de transformarse en otros campeones? (Shaco, LeBlanc, Neeko, Swain) ", 3, "Neeko"));
    questionBank.add(new Question("Habilidades", "¿Qué habilidad de Ezreal atraviesa enemigos? (Descarga de Tiros Certeros, Pulso de fuego, Descarga arcana, Ultimátum ígneo) ", 1, "Disparo místico"));
    questionBank.add(new Question("Habilidades", "¿Qué campeón puede invocar un muro de viento para bloquear habilidades enemigas? (Taliyah, Janna, Anivia, Yasuo) ", 4, "Yasuo"));
    questionBank.add(new Question("Habilidades", "¿Cómo se llama la R de Lee Sin? (Furia del Dragón, Patada del Dragón, Onda Sónica, Ira del Dragón) ", 4, "Ira del Dragón"));  
    return questionBank;
    }

private static int getUserAnswer(Scanner scanner) {
    while (true) {
        try {
            System.out.println("");
            System.out.print("Tu respuesta es: ");
            System.out.print("");
            int answer = scanner.nextInt();
            if (answer < 1 || answer > 4) {
                System.out.println("Error: Ingresa un número entre 1 y 4.");
                System.out.println("");
                continue;
                }
            return answer;
        }   catch (InputMismatchException e) {
            System.out.println("Error: Escribe el número para seleccionar su respuesta. ");
            System.out.println("");
            scanner.nextLine();
        }
    }
}
}