package com.demo.inheritance;

public class InheritanceDemo {
	 public static void main(String[] args) {
		 FourWheeler petrolCar = new PetrolCar();
		 petrolCar.retrieveCarType();
		 FourWheeler dieselCar = new DieselCar();
		 dieselCar.retrieveCarType();
		 FourWheeler lpgCar = new LPG();
		 lpgCar.retrieveCarType();
	 }
}
