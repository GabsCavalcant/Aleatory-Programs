package entities;

public class Product {

    private String name;
    private Double Price;

    public Product(String name, Double Price) {

        this.Price = Price;
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double Price) {
        this.Price = Price;
    }

    public static String StaticUpperCaseName(Product p) {
        return p.getName().toUpperCase();
    }
    public  String NonStaticUpperCaseName() {
       return name.toUpperCase();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Product{");
        sb.append("name=").append(name);
        sb.append(", Price=").append(Price);
        sb.append('}');
        return sb.toString();
    }

}
