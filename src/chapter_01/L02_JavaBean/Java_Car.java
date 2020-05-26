package chapter_01.L02_JavaBean;

/**
 * @author yangww
 * @date 2020/5/26
 *
 */
public class Java_Car {
    private int miles;
    private final int year;

    public Java_Car(int year) {
        this.year = year;
    }

    public int getMiles() {
        return miles;
    }

    public void setMiles(int miles) {
        this.miles = miles;
    }

    public int getYear() {
        return year;
    }

    public static void main(String[] args) {
        Java_Car car = new Java_Car(2000);
        System.out.println("year: " + car.getYear());
        System.out.println("Miles: " + car.getMiles());
        System.out.println("Setting miles");
        car.setMiles(200);
        System.out.println("Miles: " + car.getMiles());
    }

}
