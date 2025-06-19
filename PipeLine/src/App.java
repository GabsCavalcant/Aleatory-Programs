import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;




public class App {

    public static void main(String[] args) throws Exception {
        List<Integer> lista = Arrays.asList(1,2 ,3 ,4 ,5 ,1,10);
    
        );

        int sum = lista.stream().reduce(0, (x,y) -> x + y);
        System.out.println(sum);

        List<Integer> newList = lista.stream()
            .filter(x -> x % 2 == 0 )
            .map(x -> x * 10)
            .collect(Collectors.toList());

            System.out.println(Arrays.toString(newList.toArray()));
    }
}
