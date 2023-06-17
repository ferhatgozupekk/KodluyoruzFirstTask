import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Suv c1 = new Suv("Kirmizi", "Hyundai Bayon", 800, 2018);
		Suv c2 = new Suv("Beyaz","Dacia Duster", 950,2021);
		
		Sedan c3 = new Sedan("Kirmizi","Audi A6", 600,2017);
		Sedan c4 = new Sedan("Mavi","Kia Rio", 800,2022);
		
		Hatchback c5 = new Hatchback("Gri","Seat Ibiza", 450,2017);
		Hatchback c6 = new Hatchback("Yeşil","Citroen C3", 650,2022);
		
		Scanner input = new Scanner(System.in);
	    int a,b,c;
	    
	   
	    System.out.println("HOSGELDINIZ LUTFEN DEVAM ETMEK ICIN BIR SECIM YAPINIZ.");
		System.out.println("1- SIRKETIM ICIN KIRALAMAK ISTIYORUM.\n2- KENDIM ICIN KIRALAMAK ISTIYORUM." );
		
		a = input.nextInt();
		
		System.out.println("1- GUNLUK KIRALAMAK ISTIYORUM.\n2- AYLIK KIRALAMAK ISTIYORUM." );
		
		b = input.nextInt();
		
		  if (a==1 && b ==1 ) { // ŞİRKET VE GÜNLÜK
		    	System.out.println("---------------------SUV ARACLAR---------------------");
				System.out.println("1- " + c1.name +" --- Renk: " + c1.color + " --- Gunluk Ucret : " + c1.dailyPrice );
				System.out.println("2- " + c2.name +" --- Renk: " + c2.color + " --- Gunluk Ucret : " + c2.dailyPrice );
				System.out.println("---------------------SEDAN ARACLAR---------------------");
				System.out.println("3- " + c3.name +" --- Renk: " + c3.color + " --- Gunluk Ucret : " + c3.dailyPrice );
				System.out.println("4- " + c4.name +" --- Renk: " + c4.color + " --- Gunluk Ucret : " + c4.dailyPrice );
				System.out.println("---------------------HATCHBACK ARACLAR---------------------");
				System.out.println("5- " + c5.name +" --- Renk: " + c5.color + " --- Gunluk Ucret : " + c5.dailyPrice );
				System.out.println("6- " + c6.name +" --- Renk: " + c6.color + " --- Gunluk Ucret : " + c6.dailyPrice );

				
				System.out.println("--------------------LUTFEN SECIMINIZI YAPINIZ--------------------");
				c = input.nextInt();
				System.out.println(c + " NUMARALI ARAC GUNLUK OLARAK SIRKETINIZ ADINA KIRALANMISTIR.");
				
			}
		    else if (a == 1 && b == 2) { // ŞİRKET VE AYLIK
		    	System.out.println("---------------------SUV ARACLAR---------------------");
				System.out.println("1- " + c1.name +" --- Renk: " + c1.color + " --- Aylik Ucret: " + c1.monthlyPrice());
				System.out.println("2- " + c2.name +" --- Renk: " + c2.color + " --- Aylik Ucret: " + c2.monthlyPrice());
				System.out.println("---------------------SEDAN ARACLAR---------------------");
				System.out.println("3- " + c3.name +" --- Renk: " + c3.color + " --- Aylik Ucret: " + c3.monthlyPrice());
				System.out.println("4- " + c4.name +" --- Renk: " + c4.color + " --- Aylik Ucret: " + c4.monthlyPrice());
				System.out.println("---------------------HATCHBACK ARACLAR---------------------");
				System.out.println("5- " + c5.name +" --- Renk: " + c5.color + " --- Aylik Ucret: " + c5.monthlyPrice());
				System.out.println("6- " + c6.name +" --- Renk: " + c6.color + " --- Aylik Ucret: " + c6.monthlyPrice());
				
				System.out.println("--------------------LUTFEN SECIMINIZI YAPINIZ--------------------");
				c = input.nextInt();
				System.out.println(c + " NUMARALI ARAC AYLIK OLARAK SIRKETINIZ ADINA KIRALANMISTIR.");
			}
		    else if (a == 2 && b == 1) { // ŞAHIS VE GÜNLÜK
		    	System.out.println("---------------------HATCHBACK ARACLAR---------------------");
				System.out.println("1- " + c5.name +" --- Renk: " + c5.color + " --- Gunluk Ucret : " + c5.dailyPrice + " --- Aylik Ucret: " + c5.monthlyPrice());
				System.out.println("2- " + c6.name +" --- Renk: " + c6.color + " --- Gunluk Ucret : " + c6.dailyPrice + " --- Aylik Ucret: " + c6.monthlyPrice());
				System.out.println("--------------------LUTFEN SECIMINIZI YAPINIZ--------------------");
				c = input.nextInt();
				System.out.println(c + " NUMARALI ARAC GUNLUK OLARAK SAHSINIZ ADINA KIRALANMISTIR.");
			}
		    else if (a == 2 && b == 2) { // ŞAHIS VE AYLIK 
				System.out.println("ELIMIZDEKI ARACLARI SADECE GUNLUK KIRALAYABILIRSINIZ");
			}
		    
		    else { // A VEYA B İÇİN FARKLI DEĞERLER GİRDİĞİNDE HATA KONTROLÜ
				System.out.println("HATALI VEYA YANLIS BIR SECIM YAPTINIZ LUTFEN SECIMLERINIZI TEKRAR YAPINIZ.");
			}
		
	}

}
