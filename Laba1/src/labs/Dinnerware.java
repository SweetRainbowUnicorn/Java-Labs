package labs;

public class Dinnerware {
	
	private String color="standard";
	private String typeOfDish="all";
	private String material="plastic";
	private double diameter;
	private double price;
	
	public static double totalPrice=0;
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color=color;
	}
	
	public String getTypeOfDish() {
		return typeOfDish;
	}
	public void setTypeOfDish(String typeOfDish) {
		this.typeOfDish=typeOfDish;
	}
	
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material=material;
	}
	
	public double getDiameter() {
		return diameter;
	}
	public void setDiameter(double diameter) {
		this.diameter=diameter;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		totalPrice=totalPrice-this.price+price;
		this.price=price;
		
	} 
	
	public String toString() {
		return "Color: "+getColor()+'\n'+"Type of dish: "+getTypeOfDish()+'\n'+"Material: "+getMaterial()+'\n'+"Diameter: "+getDiameter()+'\n'+"Price: "+getPrice();
	}
	
	public static void printStaticSum() {
		System.out.println("Total price:"+totalPrice);
	}
	
	public void printSum() {
		System.out.println("Total price: "+totalPrice);
	}
	
	public void resetValues(String color, String typeOfDish, String material, double diameter, double price) {
		 this.color=color;
		 this.typeOfDish=typeOfDish;
		 this.material=material;
		 this.diameter=diameter;
		 this.price=price;
	}
	
	 public Dinnerware() {
		 
	 }
	 
	 public Dinnerware(String color, String typeOfDish, String material, double price) {
		 this.color=color;
		 this.typeOfDish=typeOfDish;
		 this.material=material;
		 setPrice(price);
	 }

	public Dinnerware(String color, String typeOfDish, String material, double diameter, double price) {
		 this.color=color;
		 this.typeOfDish=typeOfDish;
		 this.material=material;
		 this.diameter=diameter;
		 setPrice(price);
	}
	public static void main(String[] args) {
		Dinnerware Plate = new Dinnerware("red", "main course", "glass", 27.5, 90.0);
		Dinnerware Mug = new Dinnerware("white", "drink", "ceramics", 50.75);
		Dinnerware Bowl = new Dinnerware();
		System.out.println("Plate:");
		System.out.println(Plate.toString());
		System.out.println("Mug:");
		System.out.println(Mug.toString());
		System.out.println("Bowl:");
		System.out.println(Bowl.toString());
		System.out.println("Dinnerware:");
		Dinnerware.printStaticSum();
	}

}
