package prob2.d;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Showing sort product based on title first, then by model number.
 * @author anthonyanyanwu
 *
 */
public class Product
{
    final String title;
    final Double price;
    final Integer model;


    public String getTitle()
    {
        return title;
    }


    public Double getPrice()
    {
        return price;
    }


    public Integer getModel()
    {
        return model;
    }


    public Product(String title, Double price, int model)
    {
        this.title = title;
        this.price = price;
        this.model = model;
    }
    
    public static void main(String[] args) {
        List<Product> productList  = Arrays.asList(new Product("Red Shoe", 4.0, 7),
            new Product("Red Shoe", 8.0, 2), new Product("Gold Shoe", 10.0, 7), new Product("Purple Shoe", 14.0, 10),
            new Product("Diamond Shoe", 8.0, 7));
        System.out.println("Before sort product: " + productList);
        System.out.println("=================================");
        System.out.println();
        Collections.sort(productList, (product1, product2)->{
            int outcome = product1.getTitle().compareTo(product2.getTitle());
            if(outcome == 0)
                outcome = product1.getModel().compareTo(product2.getModel());
            return outcome;
        });
        System.out.println("After sort product by title and model: " + productList);
        System.out.println("=================================");
        
    }


    @Override
    public String toString()
    {
        return String.format("\n %s : %s : %s", title, price, model);
    }

}

