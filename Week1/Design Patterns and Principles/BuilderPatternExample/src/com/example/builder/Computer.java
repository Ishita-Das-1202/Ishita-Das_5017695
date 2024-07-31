//package com.example.builder;
//
//public class Computer {
////Attribute of Computer
//	private String CPU;
//	private String RAM;
//	private String storage;
//	private String graphicsCard;
//	
//	//Private constructor
//	private Computer(Builder builder)
//	{
//		this.CPU =builder.CPU;
//		this.RAM = builder.RAM;
//		this.storage = builder.storage;
//		this.graphicsCard =builder.graphicsCard;
//	}
//	
//	//Getters
//	public String getCPU() {
//		return CPU;
//	}
//	
//	public String getRAM() {
//        return RAM;
//    }
//	
//	public String getStorage() {
//	return graphicsCard;	
//	}
//	
//	//Static nested Builder class
//	public static class Builder{
//		private String CPU;
//		private String RAM;
//		private String storage;
//		private String graphicsCard;
//		
//		//Methods to each attribute
//		public Builder setCPU(String CPU)
//		{
//			this.CPU = CPU;
//			return this;
//		}
//		public Builder setRAM(String RAM)
//		{
//			this.RAM =RAM;
//			return this;
//		}
//		public Builder setStorage(String storage)
//		{
//			this.storage = storage;
//			return this;
//		}
//		public Builder setGraphicsCard(String graphicsCard)
//		{
//			this.graphicsCard = graphicsCard;
//			return this;
//		}
//		public Computer build() {
//			return new Computer(this);
//		}
//	}
//}
package com.example.builder;

public class Computer {
    // Attributes of Computer
    private String CPU;
    private String RAM;
    private String storage;
    private String graphicsCard;

    // Private constructor
    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
        this.graphicsCard = builder.graphicsCard;
    }

    // Getters
    public String getCPU() {
        return CPU;
    }

    public String getRAM() {
        return RAM;
    }

    public String getStorage() {
        return storage;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    // Static nested Builder class
    public static class Builder {
        private String CPU;
        private String RAM;
        private String storage;
        private String graphicsCard;

        // Methods to set each attribute
        public Builder setCPU(String CPU) {
            this.CPU = CPU;
            return this;
        }

        public Builder setRAM(String RAM) {
            this.RAM = RAM;
            return this;
        }

        public Builder setStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public Builder setGraphicsCard(String graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }

        // Build method to return an instance of Computer
        public Computer build() {
            return new Computer(this);
        }
    }
}
