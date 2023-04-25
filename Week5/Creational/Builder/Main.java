package Week5.Creational.Builder;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer.Builder()
                .withCase("Corsair")
                .withCPU("Intel i9")
                .withMotherboard("MSI B360M-MORTAR")
                .withGPU("nVidia Geforce RTX 4070ti")
                .withHDD("Kingston 2TB")
                .withOperatingSystem("Windows 11")
                .withPowerSupply(100)
                .withAmountOfRam(32)
                .build();

        System.out.println(computer.toString());
    }
}
