import java.util.*;

public class Product {
    String productName;
    int productPrice;
    Map<String, Integer> items = new HashMap();

    Product(String productName, int productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;

    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                '}';
    }

    public static void main(String[] args) {
        Map<String, Integer> items = new HashMap();
        Product item1 = new Product("apple", 5);
        Product item3 = new Product("apple", 5);
        Product item2 = new Product("orange", 6);
        item1.productsAdd("apple", 5);
        item2.productsAdd("orange", 6);
        item3.productsAdd("apple", 5);
        System.out.println(items);
    }

    public void productsAdd(String productName, int productPrice) {
        items.put(productName, productPrice);
    }

    /* Collections.sort(items, new Comparator<Product>() {
             @Override
             public int compare(o1,o2) {
                 String s1 = o1.productName;
                 String s2 = o2.productName;
                 return s1.compareTo(s2);
             }
     }*/
    public int productCompare(String productName, int productPrice) {
        int result=0;
        if (items.containsKey(productName)) {
            System.out.println("Products are the same");

        }
        return  result;
    }
}
