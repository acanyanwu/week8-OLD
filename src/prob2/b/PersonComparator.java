package prob2.b;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


/**
 * Show comparator based on title only.
 * @author anthonyanyanwu
 *
 */
public class PersonComparator implements Comparator<Product>
{

    @Override
    public int compare(Product product1, Product product2)
    {
        return product1.getTitle().compareTo(product2.getTitle());
    }
    
    public static void main(String[] args) {
        List<Product> productList  = Arrays.asList(new Product("Red Shoe", 4.0, 2),
            new Product("Red Shoe", 1.0, 1), new Product("Gold Shoe", 10.0, 7), new Product("Purple Shoe", 14.0, 10),
            new Product("Diamond Shoe", 8.0, 7));
        System.out.println("Before sort product: " + productList);
        System.out.println("=================================");
        Collections.sort(productList, new PersonComparator());
        System.out.println("After sort product: " + productList);
        
    }

}
