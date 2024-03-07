import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do agente do valorant: ");
        String agentName = scanner.nextLine();

        List<String> highPerformanceAgents = Arrays.asList("Sage", "Viper", "Cypher", "Reyna", "Phoenix", "Sova",
                "Kayo", "Raze", "Jett", "Breach", "DeadLock", "Yoru");

        if (highPerformanceAgents.contains(agentName)) {
            if (agentName.equalsIgnoreCase("DeadLock")) {
                System.out.println("Sai fora ruim!");
            } else {
                System.out.println("Slc que gostoso vc!");
            }
        } else {
            System.out.println("Agente desconhecido.");
        }
    }
}