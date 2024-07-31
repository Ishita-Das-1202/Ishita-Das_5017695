package com.example.builder;

public class BuilderPatternTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create a Computer using the Builder pattern
		Computer computer1 = new Computer.Builder()
        .setCPU("Intel i7")
        .setRAM("16GB")
        .setStorage("1TB SSD")
        .setGraphicsCard("NVIDIA GTX 1080")
        .build();
		
		//Print the computer's specifications
		System.out.println("Computer 1:");
		System.out.println("CPU:" +computer1.getCPU());
		System.out.println("RAM:" +computer1.getRAM());
		System.out.println("Stronge:" +computer1.getStorage());
		System.out.println("Graphics Card:"+computer1.getGraphicsCard());
		
		//Create another Computer with different specifications
		Computer computer2 = new Computer.Builder()
				.setCPU("AMD Ryzen 7")
				.setRAM("32GB")
				.setStorage("2TB HDD")
				.build();
		//Print the computer's specifications
		System.out.println("\nComputer 2:");
		System.out.println("CPU:"+computer2.getCPU());
		System.out.println("RAM:"+computer2.getRAM());
		System.out.println("Storage:"+computer2.getStorage());
		System.out.println("Graphics Card:"+computer2.getGraphicsCard());
	}
}




