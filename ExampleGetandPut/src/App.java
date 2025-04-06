
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {

    public static void main(String[] args) throws Exception {
        List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
        List<Double> myDoubles = Arrays.asList(3.14, 6.28);
        List<String> myStrings = Arrays.asList("Maria", "Alex", "Joao");
        List<Object> myObjs = new ArrayList<Object>();
        copy(myInts, myObjs);
        printList(myObjs);
        copy(myDoubles, myObjs);
        printList(myObjs);
        copyString(myStrings, myObjs);
        printList(myObjs);

    }

    public static void copy(List<? extends Number> source, List<? super Number> destiny) {
        for (Number number : source) {
            destiny.add(number);
        }

    }
    
    public static void copyString(List<? extends String> source, List<? super String> destiny) {
        for (String number : source) {
            destiny.add(number);
        }

    }
    

    public static void printList(List<?> list) {
        for (Object number : list) {
            System.out.print(number + " ");

        }
        System.out.println();

    }
}
