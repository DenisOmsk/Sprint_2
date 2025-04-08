public class Main {
    public static void main(String[] args) {
        model.Food meat = new model.Meat(5, 100);
        model.Food redApple = new model.Apple(10, 50, model.constants.Colour.RED);
        model.Food greenApple = new model.Apple(8, 60, model.constants.Colour.GREEN);

        model.Food[] products = {meat, redApple, greenApple};

        service.ShoppingCart cart = new service.ShoppingCart(products);

        System.out.println("Общая сумма товаров без скидки:" + cart.getTotalPriceWithoutDiscount());
        System.out.println("Общая сумма товаров со скидкой:" + cart.getTotalPriceWithDiscount());
        System.out.println("Сумма всех вегетарианских продуктов без скидки:" + cart.getTotalVegetarianPrice());
    }
}
