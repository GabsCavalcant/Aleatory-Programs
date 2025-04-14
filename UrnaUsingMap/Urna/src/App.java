import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class App {

    public static void main(String[] args) throws Exception {

        Map<String, Integer> candidato = new TreeMap<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com o caminho do arquivo: ");
        String caminho = sc.nextLine(); // lê o que o usuário digitar

        BufferedReader br = new BufferedReader(new FileReader(caminho));
        String linha;

        while ((linha = br.readLine()) != null) {
            String[] partes = linha.split(",");
            String nome = partes[0].trim();
            int votos = Integer.parseInt(partes[1].trim());

            if (candidato.containsKey(nome)) {
                candidato.put(nome, candidato.get(nome) + votos);
            } else {
                candidato.put(nome, votos);
            }
        }

        br.close();

        System.out.println("\nResultado da eleição:");
        for (Map.Entry<String, Integer> entry : candidato.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        sc.close();
    }
}
