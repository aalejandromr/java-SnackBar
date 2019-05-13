package project;

public class Snack {
    // Classes DO NOT HAVE THE MAIN METHOD
    // public static void main(String[] args){
        
    // }
    
    private static int maxId;
    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int machine_id;

    public Snack(int id, String name, int quantity, double cost, int machine_id){
        maxId++;
        this.id = maxId;
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.machine_id = machine_id;
    }

    // GETTERS

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getQuantity(){
        return quantity;
    }

    public double getCost(){
        return cost;
    }

    public int getMachineId(){
        return machine_id;
    }

    // SETTERS/MUTATORS

    public void setName(String name){
        this.name = name;
    }

    public void addQuantity(int quantity){
        this.quantity += quantity;
    }

    public void setCost(double cost){
        this.cost = cost;
    }

    public void setMachineId(int machine_id){
        this.machine_id = machine_id;
    }

    public void buySnack(int quantity)
    {
        this.quantity -= quantity;
    }

}