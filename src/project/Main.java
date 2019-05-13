package project;

public class Main
{

    public static void workWithData(){
        // Instantiate 2 Customers
        Customer customer1 = new Customer(1, "Jane", 45.25);
        Customer customer2 = new Customer(2, "Bob", 33.14);

        // Vending machines needed to create snacks
        Vendingmachine foods = new Vendingmachine("Foods", 1);
        Vendingmachine drinks = new Vendingmachine("Drinks", 2);

        // Instantiate 5 snacks

        // Foods
        Snack chip = new Snack(1, "Chip", 36, 1.75, foods.getId());
        Snack chocolate = new Snack(2, "Chocholate Bar", 36, 1.00, foods.getId());
        Snack pretzel = new Snack(3, "Pretzel", 30, 2.00, foods.getId());

        // Drinks
        Snack soda = new Snack(1, "Soda", 24, 2.50, drinks.getId());
        Snack water = new Snack(2, "Water", 20, 2.75, drinks.getId());

        customer1.cashUsed(soda.totalCost(3));
        soda.buySnack(3);

        System.out.println("Customer 1 cash on hand: " + customer1.getCash() + "\n" + "Quantity of snack 4: " + soda.getQuantity());

        customer1.cashUsed(pretzel.totalCost(1));
        pretzel.buySnack(1);

        System.out.println("Customer 1 cash on hand: " + customer1.getCash() + "\n" + "Quantity of snack 3: " + pretzel.getQuantity());

        customer2.cashUsed(soda.totalCost(2));
        soda.buySnack(2);
        System.out.println("Customer 2 cash on hand: " + customer2.getCash() + "\n" + "Quantity of snack 4: " + soda.getQuantity());

        customer1.addCash(10.00);
        System.out.println("Customer 1 cash on hand: " + customer1.getCash());

        customer1.cashUsed(chocolate.totalCost(1));
        chocolate.buySnack(1);
        System.out.println("Customer 1 cash on hand: " + customer1.getCash() + "\n" + "Quantity of snack 2: " + chocolate.getQuantity());

        pretzel.addQuantity(3);
        System.out.println("Quantity of snack 3: " + pretzel.getQuantity());

        customer2.cashUsed(pretzel.totalCost(3));
        pretzel.buySnack(3);
        System.out.println("Customer 2 cash on hand: " + customer2.getCash() + "\n" + "Quantity of snack 3: " + pretzel.getQuantity());

    }
    public static void main(String[] args){
        workWithData();
    }
}