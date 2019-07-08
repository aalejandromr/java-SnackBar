package snackBarApp;

public class Customer
{
  public static int maxId = 0;
  private int id;
  private String name;
  private double cash;

  public Customer(String name, double cash)
  {
    maxId++;
    id = maxId;
    this.name = name;
    this.cash = cash;
  }

  public void buySnack(double total)
  {
    // System.out.println("Before: $" + cash);
    cash -= total;
    // System.out.println("Now: $" + cash);
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public String getName()
  {
    return name;
  }

  public double getCashOnHand()
  {
    return cash;
  }

  public void addCash(double cash)
  {
    this.cash += cash;
  }
  
}