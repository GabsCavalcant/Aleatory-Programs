package modelServices;
import entities.Product;
import java.util.List;
import java.util.function.Predicate;


public class ProductService{

    public double filteredSum(List<Product> lista, Predicate<Product> criteria ){
        double sum = 0.0;
        for(Product p : lista){
                if (criteria.test(p)){
                    sum += p.getPrice();
                }
        }
        return sum;
    }
}