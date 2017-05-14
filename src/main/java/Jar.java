import java.util.Random;


public class Jar {
    private String name;
    private int maximumNumber;
    private int itemsInJar;

    public Jar(String name, int maximumNumber) {
        this.name = name;
        this.maximumNumber = maximumNumber;
        this.itemsInJar = 0;
    }

    public String getName() {
        return name;
    }

    public int getMaximumNumber() {
        return maximumNumber;
    }

    public int getItemsInJar() {
        return itemsInJar;
    }

    public void fill() {
        Random random = new Random();
        itemsInJar = random.nextInt(maximumNumber)+1;
    }
}
