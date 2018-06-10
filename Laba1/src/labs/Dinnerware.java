package labs;

public class Dinnerware {

    private String color = "standard";
    private String typeOfDish = "all";
    private String material = "plastic";
    private double diameter;
    private double price;

    private static double totalPrice = 0;

    public static double getTotalPrice() {
        return totalPrice;
    }

    public static void setTotalPrice(final double totalPrice) {
        Dinnerware.totalPrice = totalPrice;
    }

    public String getColor() {
        return color;
    }

    public void setColor(final String color) {
        this.color = color;
    }

    public String getTypeOfDish() {
        return typeOfDish;
    }

    public void setTypeOfDish(final String typeOfDish) {
        this.typeOfDish = typeOfDish;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(final String material) {
        this.material = material;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(final double diameter) {
        this.diameter = diameter;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(final double price) {
        totalPrice = totalPrice - this.price + price;
        this.price = price;

    }

    public String toString() {
        return "Color: " + getColor() + '\n' + "Type of dish: " + getTypeOfDish() + '\n' + "Material: " + getMaterial()
                + '\n' + "Diameter: " + getDiameter() + '\n' + "Price: " + getPrice() + '\n';
    }

    public static void printStaticSum() {
        System.out.println("Total price:" + totalPrice);
    }

    public void printSum() {
        System.out.println("Total price: " + totalPrice);
    }

    public void resetValues(final String color, final String typeOfDish, final String material, final double diameter,
                            final double price) {
        this.color = color;
        this.typeOfDish = typeOfDish;
        this.material = material;
        this.diameter = diameter;
        this.price = price;
    }

    public Dinnerware() {

    }

    public Dinnerware(final String color, final String typeOfDish, final String material, final double price) {
        this.color = color;
        this.typeOfDish = typeOfDish;
        this.material = material;
        setPrice(price);
    }

    public Dinnerware(final String color, final String typeOfDish, final String material, final double diameter,
                      final double price) {
        this.color = color;
        this.typeOfDish = typeOfDish;
        this.material = material;
        this.diameter = diameter;
        setPrice(price);
    }

    public static void main(String[] args) {
        Dinnerware plate = new Dinnerware("red", "main course", "glass", 27.5, 90.0);
        Dinnerware mug = new Dinnerware("white", "drink", "ceramics", 50.75);
        Dinnerware bowl = new Dinnerware();
        System.out.println("Plate:");
        System.out.println(plate.toString());
        System.out.println("Mug:");
        System.out.println(mug.toString());
        System.out.println("Bowl:");
        System.out.println(bowl.toString());
        System.out.println("Dinnerware:");
        Dinnerware.printStaticSum();
    }

}
