
import entities.Employee;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);

        Scanner teclado = new Scanner(System.in);

        System.out.println("Entre com o caminho do arquivo: ");
        String caminho = teclado.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {

            List<Employee> emp = new ArrayList<>();
            String line = br.readLine();

            while (line != null) {
                String[] fields = line.split(",");
                emp.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
                line = br.readLine();

            }

            System.out.println("Entre com o valor Cujo salario sera verificado:");
            double valor = teclado.nextInt();

            List<String> salaryMax = emp.stream()
                    .filter(p -> p.getSalary() > valor)
                    .map(p -> p.getMail())
                    .sorted()
                    .collect(Collectors.toList());

            System.out.println("Email das pesoas  com o salario acima de: " + valor);
            salaryMax.forEach(System.out::println);

            double soma = emp.stream()
                          .filter(p -> p.getName().startsWith("M"))
                          .map(p -> p.getSalary())
                          .reduce(0.0 , (x,y) -> x + y);

            System.out.print("A soma de todos os salarios que começa com a letra M É :");
            System.out.println(soma);


        } catch (IOException i) {
            System.err.println("Err " + i.getMessage());
        }
    }
}
