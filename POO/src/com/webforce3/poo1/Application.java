package com.webforce3.poo1;

public class Application {
	
	public static void main(String[] args) {
		Car voiture = new Car(null, 0, 0, null);
		voiture.setBrand("Mercedes");
		voiture.setInitialPrice(6099);
		voiture.setManufacturingYear(2012);
		voiture.setRegistrationNumber("345ERETT355");
	
		
		//System.out.println(voiture);
		
		//voiture.Hello();
		
		System.out.println(voiture.estilateCarPrice());
		System.out.println(voiture.priceInserance());
		
		
		User user = new User("Fred", "10 allee fred", "fred@yahoo.com", "ZT443");
		//System.out.println(user);
		Parking parking = new Parking(null, "1 Boulevar General de Gaule Etage", null ,null);
		
		System.out.println(user.getName()+" "+ "Votre voiture Sortie en :" + " "+ voiture.getManufacturingYear()
		+"\n" +" "+"Garée dans le parking a : "+ parking.getAddress() + " " + parking.getFloor() + "\n"
		+"son prix initial est de " + " "+ voiture.getInitialPrice()+"\n"

		+"Apres notre calcul son prix revent est estimé a "+ " "+ voiture.estilateCarPrice()+ "\n"
		
		+"le coup dassurance de ton "+ voiture.getBrand()+ " " + "est " + voiture.priceInserance() );
		
	}

}
