import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class finalProyecto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Introducción
        String content = "En un colegio aparentemente normal, un estudiante descubre accidentalmente un extraño experimento en el laboratorio de ciencias que involucra un virus desconocido. Sin darse cuenta, sufre una mordedura por parte de una rata durante el descubrimiento, pero decide ocultarla al resto del grupo. Un grupo de estudiantes curiosos decide explorar el laboratorio de ciencias después de la escuela. Descubren un extraño virus que parece ser la causa de un experimento fallido. La intriga aumenta cuando uno de ellos, sin que los demás lo sepan, es mordido por una criatura mutada.  El estudiante mordido comienza a experimentar cambios en su comportamiento y apariencia. Se vuelve cada vez más difícil ocultar la verdad a medida que la infección se propaga de manera inadvertida. Los demás comienzan a notar comportamientos extraños en su compañero, pero nadie sabe la causa real. La infección se propaga rápidamente entre los estudiantes, convirtiéndolos en zombies. El colegio se sume en el caos mientras los estudiantes no infectados intentan sobrevivir y descubrir la fuente del brote. \n" +
                "\n" + "Cuando después de leer la historia, devuelves a la página principal\n" + "\n" + "Tu personaje sera Ricky, quien sera un estudiante cuya decisiones abordara el final de la historia del juego." + "\n" + "Sobreviviente Ricky (personaje principal)";

        String creatFile = "History.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(creatFile))) {
            writer.write(content);
            System.out.println("File created successfully: " + creatFile);
        } catch (IOException e) {
            System.err.println("Error writing to the file: " + e.getMessage());
        }

        
            System.out.println("");
            System.out.println("Presiona enter para seguir la historia. ");
            scanner.nextLine();
            System.out.println("Bienvenido a nuestro juego.");
            scanner.nextLine();
            System.out.println("Ricky descubre accidentalmente un extraño experimento en el laboratorio de ciencias que involucra un virus desconocido. Este ve una rata corriendo, en el cual lo ignora y decide irse a clases. Luego de varias horas, empieza a notar que su hermano Anton empieza a mostrar comportamientos agresivos y exagerados en el salón, además de que empezó a botar saliva y llorar. Cuando Anton decide pararse a irse al baño, este nota una especie de rasguño alrededor de su brazo izquierdo.");
            scanner.nextLine();
            System.out.println("*ANTON SE VA AL BANO DESESPERADO Y EL PROFESOR NOTA ESTO*");
            System.out.println("Profesor: Hey, a donde vas Anton?!");
            scanner.nextLine();            
            System.out.println("Profesor: Ahora mismo vienes a la clase!, Ricky, ve por tu hermano!");
            scanner.nextLine();
            System.out.println("Ricky: Por supuesto maestro, voy.");
            scanner.nextLine(); 
            System.out.println("*Te encontraste con Anton en el baño, que no se sentía bien...*");
            scanner.nextLine(); 
            System.out.println("Ricky: Estas bien hermano? Te pasa algo? Cuentame ");
            scanner.nextLine(); 
            System.out.println("Anton: ALEJATE! NO VES QUE ME PASA ALGO? MIRA MIS OJOS, ESTAN ROJOS!"); 
            scanner.nextLine(); 
            System.out.println("Ricky: Calma, esta todo bien, que paso? Cuentame");
            scanner.nextLine(); 
            System.out.println("Anton: Me mordio algo, no se que fue, parece ser una rata cuando estaba en el laboratorio buscando algo para el profesor");
            scanner.nextLine(); 
            System.out.println("Anton: Estoy palido y cansado, siento que algo no esta bien..");
            scanner.nextLine(); 
            System.out.println("Ricky: Pero seguro no es na-");
            System.out.println("*ANTON GRITA DEL DOLOR*");
            scanner.nextLine();
            System.out.println("NOTAS QUE ALGO RARO ESTA PASANDO*");
            scanner.nextLine(); 

            System.out.println("¿Qué decides hacer?");
            System.out.println("1. Salir del baño y avisar a los maestros sobre el caso");
            System.out.println("2. Acercarte para ver qué le pasa a Anton y salir avisar a los maestros sobre el caso ");
            int decision1 = scanner.nextInt();
            scanner.nextLine(); 

            if(decision1 == 1) {
            System.out.println("");
            System.out.println("Luego de salir del baño y avisar a los maestros, la dirección empieza a anunciar un brote de virus agresivo que está sucediendo dentro del colegio. Le pide a los estudiantes que evacúen el área. Ricky, escuchando esto, decide buscar un lugar seguro para esconderse.");
            scanner.nextLine();} 

            if(decision1 == 2) {
            System.out.println("");
            System.out.println("Decides acercarte para ver qué le pasa a Anton. Mientras te acercas, Anton parece estar empeorando rápidamente. Sus ojos rojos te miran fijamente y comienza a temblar. ");
            scanner.nextLine();
            System.out.println("Te das cuenta de que la situación es grave y decides salir del baño para avisar a los maestros. La dirección anuncia un brote de virus agresivo y pide a los estudiantes que evacúen el área. Ricky, escuchando esto, decide buscar un lugar seguro para esconderse.");
            scanner.nextLine();}   

            System.out.println("Ricky intenta buscar un lugar seguro, pero se topa nuevamente con Anton, en el cual está mostrando signos de la virus. Anton, tiene unos movimientos agresivos, e intentar avanzar hacia donde Ricky con malas intenciones.");
            scanner.nextLine(); 
            System.out.println("Ricky: Increible, ahora estas todo como un loco...");
            scanner.nextLine(); 
            System.out.println("Ricky: No se que te pasa hermano, cuentame. No puedo creer que no sea capaz ni de reconocerte");
            scanner.nextLine(); 
            System.out.println("Ricky: Mejor vete, por favor, no quiero que salgamos lastimados");
            scanner.nextLine(); 
            System.out.println("*ANTON SIGUE SIN RESPONDER...*");
            scanner.nextLine(); 

            System.out.println("1. Intentar calmar a Anton y encontrar una cura juntos. ");
            System.out.println("2. Huir y buscar un lugar seguro sin confrontar a Anton.");
            int decision2 = scanner.nextInt();

            if (decision2 == 1) {
            scanner.nextLine(); 
            System.out.println("");
            System.out.println("Ricky: Anton, trata de calmarte, por favor, quiero que todo esto salga bien.");
            scanner.nextLine();
            System.out.println("Ricky: Estas entendiendo?!");
            scanner.nextLine();

            System.out.println("*RICKY TRATA DE COMUNICARSE CON ANTON, PERO LA SITUACIÓN SE VUELVE CADA VEZ MÁS PELIGROSA, POR LO CUAL TIENE QUE SALIR DE ESE LUGAR...*");
            scanner.nextLine();
            }

            if (decision2 == 2) {
                System.out.println("");
                System.out.println("*RICKY HUYE E INTENTA BUSCAR UN LUGAR SEGURO*");
                scanner.nextLine();
            }

            System.out.println("");
            System.out.println("Ricky, ahora en un lugar seguro, debe decidir cómo enfrentar a los infectados en el colegio, que ya mucho han sido afectados. Debes ser muy cuidadoso con tus opciones, ya que esto podría determinar el final de esta historia. ");
            scanner.nextLine(); 
            System.out.println("");
            System.out.println("Ricky: No se que tengo que hacer...");
            scanner.nextLine();
            System.out.println("Ricky: Ni se si puedo salvar a mi hermano, pero tengo que priorizar mi supervivencia, o intentar buscar la cura, el cual podria estar en el laboratorio");
            scanner.nextLine();
            System.out.println("Supongo que tendre dos opciones...");
            scanner.nextLine();
            System.out.println("1. Buscar una cura en el laboratorio de ciencia a solas, donde había encontrado al inicio. ");
            System.out.println("2. Reunir a un grupo de sobrevivientes y en el lugar seguro que ya se había encontrado para enfrentarse a los zombies. ");


            int decision3 = scanner.nextInt();

            if (decision3 == 1) {
            System.out.println("");
            scanner.nextLine();
            System.out.println("*RICKY TIENE QUE IR NUEVAMENTE AL LABORATORIO EN BUSCA DE UNA CURA, ENFRENTÁNDOSE A VARIOS ZOMBIES Y CAMUFLÁNDOSE PARA QUE NO LO VEAN.*");
            scanner.nextLine();
            System.out.println("*RICKY ESTA VOLVIENDO EN EL CAMINO, PERO ESTE SE PIERDE POR UN TIEMPO, PERO POR FIN LOGRA RECUPERAR EL CAMINO HASTA QUE...*");
            scanner.nextLine(); 
            System.out.println("*RICKY SE ENCUENTRA CARA A CARA CON ANTON EN LA CONFRONTACIÓN FINAL. ESTA SITUACIÓN EMPIEZA A INTENSIFICARSE, YA QUE AQUÍ RICKY DEBE TOMAR DECISIONES QUE AFECTAN EL FINAL DE LA HISTORIA.*");
            scanner.nextLine(); 
            System.out.println("Ricky: Anton, tienes que controlarte un poco, aquí tengo un antídoto que podría salvarte…");
            scanner.nextLine(); 
            System.out.println("Anton: *inaudible*");                  
            scanner.nextLine(); 
            System.out.println("Ricky: Ya veo, entonces tendré qu-");
            System.out.println("");    
            System.out.println("*ANTON CORRE HACIA RICKY, DESCONTROLADO Y YA CONVERTIDO EN UN ZOMBIE. RICKY NOTA ESTO E INTENTA HUIR, PERO ESTE SE TROPIEZA Y ANTON LO ALCANZA, HACIÉNDOLE UN RASGUÑO, INFECTÁNDOLO EN EL MOMENTO.*");
            System.out.println("    ");
            scanner.nextLine(); 
            System.out.println("¿Qué decides hacer?");
            System.out.println("1. Intentar curar a Anton, incluso si eso implica arriesgarse a infectarse");
            System.out.println("2. Enfrentar a Anton");
            System.out.println("3. Huir");

            int decision4 = scanner.nextInt();

            if (decision4 == 1) {
            System.out.println("");
            System.out.println("Ricky: VEN ANTON, VEN MUERDEME!");
            scanner.nextLine();
            System.out.println("Ricky: O eres un cobarde nada mas?");
            scanner.nextLine();
            System.out.println("Ricky: Eso pens-");
            System.out.println("*ANTON SE LANZA*");
            System.out.println("*RICKY LOGRA ESQUIVAR EL SALTO Y ANTON CAE EN EL PISO");
            scanner.nextLine();
            System.out.println("*RICKY APROVECHA ESTA OPORTUNIDAD PARA INYECTARLE LA CURA*");
            scanner.nextLine();
            System.out.println("Ricky: Ahora si ");
            scanner.nextLine();
            System.out.println("Ricky: Te atrape. ");
            scanner.nextLine();
            System.out.println("*RICKY LE INYECTA LA CURA");
            scanner.nextLine();
            System.out.println("*ANTON EMPIEZA A CONVULSIONAR OTRA VEZ, CADA VEZ PERDIENDO LA IMAGEN FISICA DE UN ZOMBIE");
            scanner.nextLine();
            System.out.println("Ricky: Por fin, esta volviendo a la normalidad.");
            scanner.nextLine();
            System.out.println("Ricky: Estas bien, Anton?");
            scanner.nextLine();
            System.out.println("Anton: Si... muchas gracias");
            scanner.nextLine();

            System.out.println("En este final, Ricky eligió buscar una cura y trató de curar a Anton, este cura completamente a Anton, por lo cual descubren la cura del virus. La historia concluye con ellos trabajando juntos para ayudar a reconstruir el colegio y seguir ampliando la cura para los demás infectados.");
            } 
            
            if (decision4 == 2) {
            System.out.println("");
            System.out.println("Ricky: VEN ANTON, VEN MUERDEME!");
            scanner.nextLine();
            System.out.println("Ricky: O eres un cobarde nada mas?");
            scanner.nextLine();
            System.out.println("Ricky: Eso pens-");
            System.out.println("*ANTON SE LANZA*");
            scanner.nextLine();
            System.out.println("*RICKY LOGRA ESQUIVAR EL SALTO Y ANTON CAE EN EL PISO*");
            scanner.nextLine();
            System.out.println("Ricky: Lo siento mucho...");
            scanner.nextLine();
            System.out.println("Ricky: No queria hacer esto");
            scanner.nextLine();
            System.out.println("*RICKY LOGRA INMOVILIZARLO, APROVECHANDO LA OPORTUNIDAD, RICKY DECIDE ACABAR CON LA VIDA DE SU HERMANO, O QUIEN ERA, SU HERMANO...*");
            scanner.nextLine();
            System.out.println("Ricky: Por fin, se acabo todo esto...");
            scanner.nextLine();
            System.out.println("Ricky: Descansa en paz... Anton ");
            scanner.nextLine();

            System.out.println("Ricky optó por priorizar su propia supervivencia y enfrentar a Anton como un enemigo, la confrontación final resulta en la muerte de Anton. Ricky se encuentra triste y despedazado por la decisión que tomó, sabiendo que era su propio hermano, decidió enfrentar la vida de su hermano");
            } 
           
            if (decision4 == 3) {
            System.out.println("");
            System.out.println("No puedo...");
            scanner.nextLine();
            System.out.println("Me tengo que ir, no pienso en pelear, tengo que dejarte ir...");
            scanner.nextLine();
            System.out.println("Ricky no puede contenerse, tuvo que huir del colegio, no soportaba tener la idea de enfrentar a su hermano. Este encuentra un lugar seguro en un hospital, donde se desarrolla la cura. No obstante, han pasado meses desde que por fin encontró la cura en el hospital, por lo cual localizar a su hermano será imposible. ");
            }
            }

            if (decision3 == 2){
            scanner.nextLine();
            System.out.println("Ricky arma un grupo de sobrevivientes, en el cual cubren sus cuerpos con cuadernos, mochilas, y ropas para taparse y evitar mordedura o rasgunos. ");
            scanner.nextLine();
            System.out.println("*ESPERAN DOS HORAS HASTA QUE ANTON ENTRA AL SALON DEBIDO A UN CONDUCTO Y LOS SORPRENDE A TODOS*");
            scanner.nextLine();
            System.out.println("Ricky: ESPEREN!");
            scanner.nextLine();
            System.out.println("Ricky: Es mi hermano, dejenmelo a mi. ");    
            scanner.nextLine();
            System.out.println("*RICKY SE ENCUENTRA CARA A CARA CON ANTON EN LA CONFRONTACIÓN FINAL. ESTA SITUACIÓN EMPIEZA A INTENSIFICARSE, YA QUE AQUÍ RICKY DEBE TOMAR DECISIONES QUE AFECTAN EL FINAL DE LA HISTORIA.*");
            scanner.nextLine(); 
            System.out.println("Ricky: No tengo eleccion, tendre que matarte hermano.");
            scanner.nextLine(); 
            System.out.println("*ANTON SE QUEDA QUIETO...");                  
            scanner.nextLine(); 
            System.out.println("Ricky: Ya veo, entonces tendré qu-");
            System.out.println("");    
            System.out.println("*ANTON YA INFECTADO POR EL VIRUS COMPLETAMENTE, CORRE HACIA RICKY, DESCONTROLADO Y YA CONVERTIDO EN UN ZOMBIE. RICKY NOTA ESTO E INTENTA HUIR, PERO ESTE SE TROPIEZA Y ANTON LO ALCANZA, HACIÉNDOLE UN RASGUÑO, INFECTÁNDOLO EN EL MOMENTO*.");
            System.out.println("    ");
            scanner.nextLine(); 

            System.out.println("¿Qué decides hacer?");
            System.out.println("1. Enfrentar a Anton");
            System.out.println("2. Huir");  
            scanner.nextLine();

            int decision5 = scanner.nextInt();

            if (decision5 == 1) {
            System.out.println("");
            System.out.println("Ricky: VEN ANTON, VEN MUERDEME!");
            scanner.nextLine();
            System.out.println("Ricky: O eres un cobarde nada mas?");
            scanner.nextLine();
            System.out.println("Ricky: Eso pens-");
            System.out.println("*ANTON SE LANZA*");
            scanner.nextLine();
            System.out.println("*RICKY LOGRA ESQUIVAR EL SALTO Y ANTON CAE EN EL PISO*");
            scanner.nextLine();
            System.out.println("Ricky: Lo siento mucho...");
            scanner.nextLine();
            System.out.println("Ricky: No queria hacer esto");
            scanner.nextLine();
            System.out.println("*RICKY LOGRA INMOVILIZARLO, APROVECHANDO LA OPORTUNIDAD, RICKY DECIDE ACABAR CON LA VIDA DE SU HERMANO, O QUIEN ERA, SU HERMANO...*");
            scanner.nextLine();
            System.out.println("Ricky: Por fin, se acabo todo esto...");
            scanner.nextLine();
            System.out.println("Ricky: Descansa en paz... Anton ");
            System.out.println("Ricky optó por priorizar su propia supervivencia y enfrentar a Anton como un enemigo, la confrontación final resulta en la muerte de Anton. Ricky se encuentra triste y despedazado por la decisión que tomó, sabiendo que era su propio hermano, decidió enfrentar la vida de su hermano");
            }
            
            if (decision5 == 2) {
            System.out.println("");
            System.out.println("No puedo...");
            scanner.nextLine();
            System.out.println("Me tengo que ir, no pienso en pelear, tengo que dejarte ir...");
            System.out.println("Ricky no puede contenerse, tuvo que huir del colegio, no soportaba tener la idea de enfrentar a su hermano. Este encuentra un lugar seguro en un hospital, donde se desarrolla la cura. No obstante, han pasado meses desde que por fin encontró la cura en el hospital, por lo cual localizar a su hermano será imposible. ");
            }
            }
            } 
            } 