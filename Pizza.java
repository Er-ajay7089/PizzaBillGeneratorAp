public class Pizza {
    private int price;
    private Boolean veg;
    private int ExctraCheese = 100;
    private int ExctraToppingsAdded = 150;
    private int BackPackPrice = 20;
    private int basePizzaPrice;
    private Boolean isExctraCheese = false;
    private Boolean IsExctraToppings = false;
    private Boolean isOptedForTakeAway = false;

    public Pizza(Boolean veg) {
        this.veg = veg;
        if (this.veg) {
            this.price = 300;
        } else {
            this.price = 400;
        }
        basePizzaPrice = this.price;
    }

    public void AddExctraCheese() {
        isExctraCheese = true;

        this.price += ExctraCheese;

    }

    public void AddExctraToppings() {
        IsExctraToppings = true;

        this.price += ExctraToppingsAdded;

    }

    public void takeAway() {
        isOptedForTakeAway = true;

        this.price += BackPackPrice;
    }

    public void getBill() {
        String Bill = "";
        System.out.println("Pizza: " + basePizzaPrice);
        if (isExctraCheese) {
            Bill += "Extra Cheese added: " + ExctraCheese + "\n";
        }
        if (IsExctraToppings) {
            Bill += "Extra Toppings added: " + ExctraToppingsAdded + "\n";
        }
        if (isOptedForTakeAway) {
            Bill += "Opted for take away: " + basePizzaPrice + "\n";
        }
        Bill += "Bill: " + this.price + "\n";
        System.out.println(Bill);

    }
}


