package com.webforce3.poo1;

public class Car {

		private  String brand;
		private  double initialPrice;
		private  int manufacturingYear;
		private  String registrationNumber;
		
		Parking parking;
		
		User user;
		
		public void Hello() {
			System.out.println("Hello");
		}

		
		
		public Car(String brand, double initialPrice, int manufacturingYear, String registrationNumber) {
			super();
			this.brand = brand;
			this.initialPrice = initialPrice;
			this.manufacturingYear = manufacturingYear;
			this.registrationNumber = registrationNumber;
			
			
		}
		
		
	public String getBrand() {
			return brand;
		}



		public void setBrand(String brand) {
			this.brand = brand;
		}



		public double getInitialPrice() {
			return initialPrice;
		}



		public void setInitialPrice(double initialPrice) {
			this.initialPrice = initialPrice;
		}



		public int getManufacturingYear() {
			return manufacturingYear;
		}



		public void setManufacturingYear(int manufacturingYear) {
			this.manufacturingYear = manufacturingYear;
		}



		public String getRegistrationNumber() {
			return registrationNumber;
		}



		public void setRegistrationNumber(String registrationNumber) {
			this.registrationNumber = registrationNumber;
		}

		

	@Override
		public String toString() {
			return "Car [brand=" + brand + ", initialPrice=" + initialPrice + ", manufacturingYear=" + manufacturingYear
					+ ", registrationNumber=" + registrationNumber + "]";
		}
	
	
	public double estilateCarPrice() {
		if (manufacturingYear >= 2010 && brand.equals("Mercedes")) {
			return initialPrice / 2 ;
		} else if (manufacturingYear <= 1980) {
			return initialPrice /6 ;
		}
		else {
			return initialPrice /4 ;
		}
	}
	
	public double priceInserance() {
		double assurance = (initialPrice * 2) / 100 ;
		return assurance;
	}

		

}


