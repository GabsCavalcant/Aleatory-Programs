
import entities.Product;
import java.util.ArrayList;
import java.util.List;
import modelServices.ProductService;

public class App {
    public static void main(String[] args) throws Exception {
        List<Product> lista = new ArrayList<>();

        lista.add(new Product("Tv", 900.0));
        lista.add(new Product("Mouse", 50.0));
        lista.add(new Product("Tv", 350.50));
        lista.add(new Product("HD ", 80.90));


        ProductService ps = new ProductService();
        double sum = ps.filteredSum(lista, p -> p.getName().charAt(0) == 'T');

        System.out.println("Sum = " + String.format("%.2f", sum));
    }
}
