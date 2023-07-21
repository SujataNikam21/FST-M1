package activities;

interface BicycleParts{
    public int gears=0;
    public int speed=0;
}
interface BicycleOperations{
    public void applyBrake(int decrement);
    public void speedUp(int increment);
}
class Bicycle implements BicycleParts, BicycleOperations {
    public int gears;
    public  int speed;
    public Bicycle(int gears, int currentSpeed) {
        this.gears = gears;
        this.speed = currentSpeed;
    }
    public void applyBrake(int decrement) {
        speed = speed-decrement;
        System.out.println("Decreased Current speed: " + speed);
    }

    public void speedUp(int increment) {
        speed = speed+increment;
        System.out.println("Increased Current speed: " + speed);
    }
    public String bicycleDesc() {
        return("Number of gears: "+ gears + "\nCurrent Speed of bicycle: " + speed);
    }
}
class MountainBike extends Bicycle {
    public int seatHeight;
    public MountainBike(int gears, int currentSpeed, int startHeight) {
        //Invoking base-class(Bicycle) constructor
        super(gears, currentSpeed);
        seatHeight = startHeight;
    }
    public void setHeight(int newValue) {
        seatHeight = newValue;
    }
    public String bicycleDesc() {
        return (super.bicycleDesc()+ "\nSeat height is " + seatHeight);
    }
}
public class Activity7 {
    public static void main(String[] args) {
        MountainBike b = new MountainBike(3, 0, 25);
        System.out.println(b.bicycleDesc());
        b.speedUp(20);
        b.applyBrake(5);
    }

}

