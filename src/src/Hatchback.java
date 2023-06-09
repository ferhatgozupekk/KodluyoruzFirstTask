package src;
public class Hatchback {
	public String color,name;
	public int model,dailyPrice;
	
	Hatchback(String color,String name,int dailyPrice,int model){
		this.color = color;
		this.name = name;
		this.model = model;
		this.dailyPrice = dailyPrice;
	}

	public double monthlyPrice(){
		if (this.model < 2015 ) {
			return 30 * (this.dailyPrice * 0.70);
		}
		else if (this.model >= 2015 || this.model < 2020) {
			return 30 * (this.dailyPrice * 0.80);
		}
		else {
			return 30 * (this.dailyPrice * 0.90);
		}
	}
	
}
