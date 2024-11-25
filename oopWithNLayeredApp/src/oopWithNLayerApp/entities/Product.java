package oopWithNLayerApp.entities;
// entities ,veri tabanı nesnelerimizdir

public class Product {
    private int id;
    private String name;
    private static double unitPrice;

    public Product() {

    }

    public Product(int id, String name, double unitPrice) {
        this.id = id;
        this.name = name;
        this.unitPrice = unitPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
}
