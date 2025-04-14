
import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);
        Set<Integer> CursoA = new HashSet<>();
        Set<Integer> CursoB = new HashSet<>();
        Set<Integer> CursoC = new HashSet<>();

        System.out.print("Quantos estudantes do curso A? ");
        Integer n = teclado.nextInt();

        for (int i = 0; i < n; i++) {
            int numeroA = teclado.nextInt();
            CursoA.add(numeroA);
        }

        System.out.print("Quantos estudantes do curso B? ");
        n = teclado.nextInt();
        for (int i = 0; i < n; i++) {
            int numeroB = teclado.nextInt();
            CursoA.add(numeroB);
        }
        System.out.print("Quantos estudantes do curso C? ");
        n = teclado.nextInt();
        for (int i = 0; i < n; i++) {
            int numeroC = teclado.nextInt();
            CursoA.add(numeroC);
        }

        Set<Integer> total = new HashSet<>(CursoA);

        total.addAll(CursoB);
        total.addAll(CursoC);

        System.out.println("Total de alunos é " + total.size());

        teclado.close();

    }

}
