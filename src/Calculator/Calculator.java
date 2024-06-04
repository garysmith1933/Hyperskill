package Calculator;
import java.util.HashMap;

public class Calculator {
    public static void main(String[] args) {
        HashMap<String, String> prices = new HashMap<String, String>();

        prices.put("Bubblegum", "$2");
        prices.put("Toffee", "$0.2");
        prices.put("Ice cream", "$5");
        prices.put("Milk chocolate", "$4");
        prices.put("Doughnut", "$2.5");
        prices.put("Pancake", "$3.2");

        System.out.println("Prices:");
        for (String product: prices.keySet()) {
            System.out.println(product + ": " + prices.get(product));
        }

    }
}
