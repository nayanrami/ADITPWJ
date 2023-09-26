/*
nner Class:
Define two nested classes: Processor and RAM inside the outer class: CPU with following 
data members
class CPU {
 double price;
 class Processor{ // nested class
 double cores;
 double catch()
 String manufacturer;
 double getCache() 
 void displayProcesorDetail()
 }
 protected class RAM{ // nested protected class
 // members of protected nested class
 double memory;
 String manufacturer;
 Double clockSpeed;
 double getClockSpeed()
 void displayRAMDetail()
 }
}
1. Write appropriate Constructor and create instance of Outer and inner class and call the 
methods in main function
  */

class CPU {
    double price;

    class Processor {
        double cores;
        String manufacturer;

        double getCache() {
            return 4.0; // Some default cache value for demonstration
        }

        void displayProcessorDetail() {
            System.out.println("Processor Cores: " + cores);
            System.out.println("Processor Manufacturer: " + manufacturer);
            System.out.println("Processor Cache: " + getCache() + " MB");
        }
    }

    protected class RAM {
        double memory;
        String manufacturer;
        Double clockSpeed;

        double getClockSpeed() {
            return 2.4; // Some default clock speed value for demonstration
        }

        void displayRAMDetail() {
            System.out.println("RAM Memory: " + memory + " GB");
            System.out.println("RAM Manufacturer: " + manufacturer);
            System.out.println("RAM Clock Speed: " + getClockSpeed() + " GHz");
        }
    }

    CPU(double price) {
        this.price = price;
    }

    Processor createProcessor(double cores, String manufacturer) {
        return new Processor(cores, manufacturer);
    }

    RAM createRAM(double memory, String manufacturer) {
        return new RAM(memory, manufacturer);
    }
}

public class Main {
    public static void main(String[] args) {
        CPU cpu = new CPU(500.0);
        CPU.Processor processor = cpu.createProcessor(4, "Intel");
        CPU.RAM ram = cpu.createRAM(8, "Kingston");

        System.out.println("CPU Price: $" + cpu.price);
        System.out.println("Processor Details:");
        processor.displayProcessorDetail();
        System.out.println("\nRAM Details:");
        ram.displayRAMDetail();
    }
}
