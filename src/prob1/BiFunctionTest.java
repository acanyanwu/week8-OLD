package prob1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class BiFunctionTest
{
    public static void main(String[] args) {
        BiFunction<Double, Double, List<Double>> testFunction = (x,y) -> {
            List<Double> list = new ArrayList<>();
            list.add(Math.pow(x,y));
            list.add(x * y);
            return list;
            };
        System.out.println("testFunction.apply(7.5, 3.0)= " + testFunction.apply(7.5, 3.0));
    }
    
}
