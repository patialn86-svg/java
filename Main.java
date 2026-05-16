class Car {
    private String brand;
    private int speed;

    public void setBrand(String b) {
        brand = b;
    }

    public String getBrand() {
        return brand;
    }

    public void setSpeed(int s) {
        speed = s;
    }

    public int getSpeed() {
        return speed;
    }
}

public class Main {
    public static void main(String[] args) {

        Car c = new Car();

        c.setBrand("BMW");
        c.setSpeed(180);

        System.out.println("Brand: " + c.getBrand());
        System.out.println("Speed: " + c.getSpeed());
    }
}