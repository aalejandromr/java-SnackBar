package project;

public class Vendingmachine
{
    // private static int maxId;
    private int id;
    private String name;

    public Vendingmachine(String name, int id)
    {
        // maxId++;
        this.id = id;
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    
}