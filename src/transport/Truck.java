package transport;

import java.util.concurrent.ThreadLocalRandom;

// Класс Грузовые автомобили
public class Truck extends Transport implements Competing {

    private final CapacityType capacityType;

    public Truck(String brand,
                 String model,
                 float engineVolume, CapacityType capacityType) {
        super(brand, model, engineVolume);
        this.capacityType = capacityType;
    }

    @Override
    public void startMovement() {
        System.out.printf("Грузовой автомобиль %s %s начал движение.\n", this.getBrand(), this.getModel());
    }

    @Override
    public void stopMovement() {
        System.out.printf("Грузовой автомобиль %s %s закончил движение.\n", this.getBrand(), this.getModel());
    }

    @Override
    public void pitStop() {
        System.out.printf("Грузовой автомобиль %s %s выполняет пит-стоп.\n", this.getBrand(), this.getModel());
    }

    @Override
    public void getBestLapTime() {
        System.out.printf("Грузовой автомобиль %s %s имеет лучшее время круга %d.\n",
                this.getBrand(),
                this.getModel(),
                ThreadLocalRandom.current().nextInt(1, 100));
    }

    @Override
    public void getMaxSpeed() {
        System.out.printf("Грузовой автомобиль %s %s имеет максимальную скорость %d.\n",
                this.getBrand(),
                this.getModel(),
                ThreadLocalRandom.current().nextInt(1, 180));
    }

    @Override
    public void printType() {
        if (this.capacityType != null) {
            System.out.println(this.capacityType);
        } else {
            System.out.printf("Грузовой автомобиль %s %s, грузоподъемность - Данных недостаточно!\n",
                    this.getBrand(),
                    this.getModel());
        }
    }

    @Override
    public boolean service() {
        return Math.random() > 0.75;
    }

    @Override
    public void repair() {
        System.out.println("Грузовик " + getBrand() + " " + getModel() + " отремонтирован!");
    }

    public CapacityType getCapacityType() {
        return capacityType;
    }
}
