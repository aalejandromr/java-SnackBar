package snackBarApp;

public class Snack
{
  public static int maxId = 0;
  private int id;
  private String name;
  private int quantity;
  private double cost;
  private int vMachineID;

  public Snack(String name, int quantity, double cost, int vMachineID)
  {
    maxId++;
    id = maxId;
    this.name = name;
    this.quantity = quantity;
    this.cost = cost;
    this.vMachineID = vMachineID;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public String getName()
  {
    return name;
  }

  public void addQuantity(int quantity)
  {
    this.quantity += quantity;
  }

  public void buySnack(int quantity)
  {
    this.quantity -= quantity;
  }

  public int getQuantity()
  {
    return quantity;
  }

  public void setCost(double cost)
  {
    this.cost = cost;
  }

  public double getCost()
  {
    return cost;
  }

  public void setVMachineId(int vMachineID)
  {
    this.vMachineID = vMachineID;
  }

  public int getVMachineId()
  {
    return vMachineID;
  }

  public double geTotalCost(int quantity)
  {
    return this.cost * quantity;
  }
}