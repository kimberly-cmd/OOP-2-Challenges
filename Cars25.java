package Java2.CodingChallenge;

public class Cars25 {
    void carType() {
        int doors;
        int windows;
        int wheels;

        doors = 4;
        System.out.println("The car has " + doors + " doors");

        windows = 4;
        System.out.println("The car has "+ windows + " working windows");

        wheels = 4;
        System.out.println("The car has " + wheels + " wheels");
    }

    public static void main(String[] args) {
        (new Cars25()).carType();
    }
}