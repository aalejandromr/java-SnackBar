package project;

public class Customer
{
    private int id;
    private String name;
    private double cash;

    public Customer(int id, String name, double cash)
    {
        this.id = id;
        this.name = name;
        this.cash = cash;
    }

    public int getId()
    {
        return this.id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setCash(double cash)
    {
        this.cash = cash;
    }

    public double getCash()
    {
        return this.cash;
    }
}