package za.co.kani;

public class CoffeeTest {

    public static void main(String[] args) {
        Coffee kitch = new Coffee();
        kitch.addBeans(300);
        kitch.getWaterLevel(800);
        kitch.makeCoffee();
        System.out.println(kitch.getRemainingCups());
    }
}
