public class UsePizza {
    public static void main(String[] args) {
        Pizza basePizza= new Pizza(true);
          basePizza.AddExctraToppings();
        basePizza.AddExctraCheese();
        basePizza.takeAway();
        basePizza.getBill();

        DeluxPizza dp = new DeluxPizza(false);
        dp.takeAway();
        dp.getBill();
    }
}
