package app;

// Клас розрахунку вартості товару з урахуванням вартості доставки
public class CalcCostDelivery extends CalcCostBase {
    private final static double deliveryPrice = 10.0; // Вартість доставки

    // Розрахунок вартості товару з урахуванням доставки
    public double calcCost(Product product) {
        return super.calcCost(product)
                + deliveryPrice; // Використовуємо метод базового класу та додаємо вартість доставки
    }
}
