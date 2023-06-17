
public abstract class Car {
	int dailyPrice , model ;
	String color , name;
	
	public Car(String color , String name , int dailyPrice , int model) {
		this.color = color ;
		this.name = name ;
		this.dailyPrice = dailyPrice;
		this.model = model ;
	}
	
	public double monthlyPrice() {
		double Price;
		if (model < 2020) {
			Price = (dailyPrice * 0.80 )* 30 ;
			return Price;
		}
		else {
			Price = (dailyPrice * 0.90 ) * 30 ; 
			return Price;
		}
	}
	

	
	public int getDailyPrice() {
		return dailyPrice;
	}
	public void setDailyPrice(int dailyPrice) {
		this.dailyPrice = dailyPrice;
	}
	public int getModel() {
		return model;
	}
	public void setModel(int model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
