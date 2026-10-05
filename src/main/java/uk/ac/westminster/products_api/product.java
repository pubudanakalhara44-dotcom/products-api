package uk.ac.westminster.products_api;

public class product {
    private long id;
    private String name;
    private double price;

    public double getPrice() {
        return price;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public product(long id,String name,double price){
        this.id=id;
        this.name=name;
        this.price=price;
    }
}
