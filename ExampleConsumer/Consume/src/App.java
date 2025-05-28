import entities.Product;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<Product> list = new ArrayList<>();
    list.add(new Product("Tv", 900.00));
    list.add(new Product("Mouse", 50.00));
    list.add(new Product("Tablet", 350.50));
    list.add(new Product("HD Case", 80.90));


        /* Utilizando apenas a interface 
        list.forEach(new PriceUpdate());
        list.forEach(System.out :: println);
        */
        /*
        utilizando metodo static na Classe Product
         *list.forEach(Product :: staticPriceUpdate);
         */

         /* Utilizano o metodo Não estatico 
         list.forEach(Product :: nonStaticUpdate);
         list.forEach(System.out :: println); */
        double factor = 1.1;
         /* outro modo 
          * ;
         Consumer<Product> cons = p -> p.setPrice(p.getPrice() * factor );
          */
            
         list.forEach(p -> p.setPrice(p.getPrice() * factor));
         list.forEach(System.out :: println);

        
    }

    
}
