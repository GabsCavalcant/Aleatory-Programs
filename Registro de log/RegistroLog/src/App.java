
import entities.LogEntry;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file full pat ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            Set<LogEntry> set = new HashSet<>();

            String Line = br.readLine();
            while (Line != null) {
                String[] fields = Line.split(" ");
                String username = fields[0];
                Date momement = Date.from(Instant.parse(fields[1]));

                set.add(new LogEntry(username, momement));

                Line = br.readLine();

            }
            System.out.println("Total users "+ set.size());

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
