package lesson6;

public class Computer {
    String model;
    int price;
    RAM ram;
    HDD hdd;

    public Computer(int price, String model) {
        this.price = price;
        this.model = model;
        this.ram = new RAM();
        this.hdd = new HDD();
    }

    public Computer(int price, String model, RAM ram, HDD hdd) {
        this.price = price;
        this.model = model;
        this.ram = ram;
        this.hdd = hdd;
    }

    void print() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Computer{" +
                "model='" + model + '\'' +
                ", price=" + price +
                ", ram=" + ram +
                ", hdd=" + hdd +
                '}';
    }

    public int getCompPrice() {
        return price;
    }

    public void setCompPrice(int price) {
        this.price = price;
    }
}
