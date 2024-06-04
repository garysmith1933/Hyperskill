package Calculator;
import java.util.HashMap;

public class Calculator {
    public static void main(String[] args) {
        HashMap<String, Number[]> prices = new HashMap<>();

        prices.put("Bubblegum", new Number[]{2, 202});
        prices.put("Toffee", new Number[]{0.2, 118});
        prices.put("Ice cream", new Number[]{5, 2250});
        prices.put("Milk chocolate", new Number[]{4, 1680});
        prices.put("Doughnut", new Number[]{2.5, 1075});
        prices.put("Pancake", new Number[]{3.2, 80});

        int totalSales = 0;

        System.out.println("Earned amount:");
        for (String product: prices.keySet()) {
            int earnedValue = prices.get(product)[1].intValue();

            totalSales = totalSales + earnedValue;
            System.out.println(product + ": $" + earnedValue);
        }

        System.out.println("Income: $" + totalSales);
    }
}
