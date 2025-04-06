import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        
        List<Integer> lista = Arrays.asList(1,3,4,5);
        List<String> lista2 = Arrays.asList("Maria","Paulo","joão");

        ImprimirFila(lista);
        ImprimirFila(lista2);
    }


    public static void ImprimirFila(List<?> lista){
        for( Object Obj : lista){

            System.out.println(Obj);

        }
    }
}
