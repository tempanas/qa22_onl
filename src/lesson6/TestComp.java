package lesson6;

public class TestComp {
    public static void main(String[] args) {
        Computer computer1 = new Computer(3000, "Asus Vivobook");
        computer1.print();
        RAM ram = new RAM("Kingston",16);
        HDD hdd = new HDD("Kingston", 512, "internal");
        Computer computer2 = new Computer(2999, "Huawei Matebook",ram, hdd);
        computer2.print();
        computer1.setCompPrice(3299);
    }
}
