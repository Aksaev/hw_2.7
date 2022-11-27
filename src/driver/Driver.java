package driver;

import transport.BodyType;
import transport.Competing;
import transport.Transport;

public abstract class Driver<T extends Transport & Competing> {
    private final String fullName;
    private final String category;
    private final int drivingExperience;
    private final T car; // Машина водителя

    public Driver(String fullName,
                  String category,
                  int drivingExperience,
                  T car) {
        this.fullName = fullName;
        this.category = category;
        this.drivingExperience = drivingExperience;
        this.car = car;
    }

    // Метод начать движение
    public void startMovement() {
        System.out.printf("Водитель %s начал движение", this.fullName);
        this.car.startMovement();
    }

    // Метод закончить движение
    public void stoptMovement() {
        System.out.printf("Водитель %s остановился", this.fullName);
        this.car.stopMovement();
    }

    // Метод заправить авто
    public void refill() {
        System.out.printf("Водитель %s запрвляет %s %s", this.fullName, this.car.getBrand(), this.car.getModel());
    }

    public String getFullName() {
        return fullName;
    }

    public String getCategory() {
        return category;
    }

    public int getDrivingExperience() {
        return drivingExperience;
    }

    @Override
    public String toString() {
        return fullName + ", стаж вождения: " + drivingExperience + " лет, категория: " + category;
    }
}
