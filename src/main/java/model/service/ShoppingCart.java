package service;
import model.Discountable;
import model.Food;

public class ShoppingCart {
    private Food[] items;

    public ShoppingCart(Food[] items) {
        this.items = items;
    }

    public double getTotalPriceWithoutDiscount() {
        double total = 0;
        for (int i = 0; i < items.length; i++) {
            total += items[i].getAmount() * items[i].getPrice();
        }
        return total;
    }

    public double getTotalPriceWithDiscount() {
        double total = 0;
        for (int i = 0; i < items.length; i++) {
            double discount = 0;
            if (items[i] instanceof Discountable) {
                discount = ((Discountable) items[i]).getDiscount();
            }
            double priceAfterDiscount = items[i].getPrice() * (1 - discount / 100);
            total += items[i].getAmount() * priceAfterDiscount;
        }
        return total;
    }

    public double getTotalVegetarianPrice() {
        double total = 0;
        for (int i = 0; i < items.length; i++) {
            if (items[i].isVegetarian()) {
                total += items[i].getAmount() * items[i].getPrice();
            }
        }
        return total;
    }
}