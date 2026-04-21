package za.co.kani;

public class Coffee {
    private int waterLevel;
    private int beanWeight;
    private int totalBrewedCount;

    public Coffee() {
        this.waterLevel = 0;
        this.beanWeight = 0;
        this.totalBrewedCount= 0;

    }

    public int getWaterLevel(int ml) {
        if (ml < 1000) {
            return waterLevel += ml;
        }
        else {
            System.out.println("TOO much Water!!");
            return waterLevel;
        }
    }

    public int addBeans(int beans) {
        if (beans < 500) {
            return beanWeight += beans;
        }
        else {
            System.out.println("TOO much Beans!");
            return beanWeight;
        }
    }

    public void makeCoffee() {
        if (waterLevel >= 250 && beanWeight >= 15) {
            totalBrewedCount ++;
            waterLevel -= 250;
            beanWeight -= 15;
        } else if (waterLevel < 250) {
            System.out.println("Need more water!!");

        } else if (beanWeight < 15) {
            System.out.println("Need more beans!!");
        }

    }

    public int getRemainingCups() {
      int waterResult = waterLevel / 250;
      int beanResult = beanWeight / 15;


      return Math.min(waterResult, beanResult);
    }
}
//w