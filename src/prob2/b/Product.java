package prob2.b;

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


    @Override
    public String toString()
    {
        return String.format("\n %s : %s : %s", title, price, model);
    }

}
