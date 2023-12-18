public class DeluxPizza extends Pizza {
    public DeluxPizza(Boolean veg) {
        super(veg);
        super.AddExctraCheese();
        super.AddExctraToppings();
    }

    @Override
    public void AddExctraCheese() {
    }

    @Override
    public void AddExctraToppings() {
    }

}
