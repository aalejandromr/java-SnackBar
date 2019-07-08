package snackBarApp;

public class Main
{
  public static void main(String[] args) {
    Customer c1 = new Customer("Jane", 45.25);
    Customer c2 = new Customer("Bob", 33.14);

    VendingMachine m1 = new VendingMachine("Food");
    VendingMachine m2 = new VendingMachine("Drink");
    VendingMachine m3 = new VendingMachine("Office");

    Snack chips = new Snack("Chips", 36, 1.75, m1.getId());
    Snack chocolate = new Snack("Chocolate", 36, 1.00, m1.getId());
    Snack pretzel = new Snack("Pretzel", 30, 2.00, m1.getId());

    Snack soda = new Snack("Soda", 24, 2.50, m2.getId());
    
    // PROCESSING
    chips.buySnack(3);
    c1.buySnack(chips.geTotalCost(3));
    System.out.println(c1.getCashOnHand());
    System.out.println(chips.getQuantity());

    pretzel.buySnack(1);
    c1.buySnack(pretzel.geTotalCost(1));
    System.out.println(c1.getCashOnHand());
    System.out.println(pretzel.getQuantity());

    soda.buySnack(2);
    c2.buySnack(soda.geTotalCost(2));
    System.out.println(c2.getCashOnHand());
    System.out.println(pretzel.getQuantity());

    c1.addCash(10.00);
    System.out.println(c1.getCashOnHand());

    chocolate.buySnack(2);
    c1.buySnack(chocolate.geTotalCost(2));
    System.out.println(c1.getCashOnHand());
    System.out.println(chocolate.getQuantity());

    pretzel.addQuantity(12);
    System.out.println(pretzel.getQuantity());

    pretzel.buySnack(3);
    c2.buySnack(pretzel.geTotalCost(3));
    System.out.println(c2.getCashOnHand());
    System.out.println(pretzel.getQuantity());

  }
}