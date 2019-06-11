package prob2.c;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * Show sort product by price or by title.
 * @author anthonyanyanwu
 *
 */
public class Product
{
    enum SortType {BY_PRICE, BY_TITLE};
    
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
    
    private static int compareByPrice(Product product1, Product product2) {
        return product1.getPrice().compareTo(product2.getPrice());
    }
    
    private static int compareByTitle(Product product1, Product product2) {
        return product1.getTitle().compareTo(product2.getTitle());
    }
    
    public static void sort(List<Product> products, SortType method) {
        Collections.sort(products, new Comparator<Product>()
        {
            @Override
            public int compare(Product product1, Product product2)
            {
                if(method.equals(SortType.BY_PRICE))
                    return compareByPrice(product1, product2);
                else
                    return compareByTitle(product1, product2);
            }
        });
    }
    
    public static void main(String[] args) {
        List<Product> productList  = Arrays.asList(new Product("Orange Shoe", 4.0, 2),
            new Product("Red Shoe", 1.0, 1), new Product("Gold Shoe", 10.0, 7), new Product("Purple Shoe", 14.0, 10),
            new Product("Diamond Shoe", 8.0, 7));
        System.out.println("Before sort product: " + productList);
        System.out.println("=================================");
        System.out.println();
        Product.sort(productList, SortType.BY_PRICE);
        System.out.println("After sort product by price: " + productList);
        System.out.println("=================================");
        System.out.println();
        Product.sort(productList, SortType.BY_TITLE);
        System.out.println("After sort product by title: " + productList);
        
    }


    @Override
    public String toString()
    {
        return String.format("\n %s : %s : %s", title, price, model);
    }

}
