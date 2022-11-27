package transport;

import java.util.concurrent.ThreadLocalRandom;

// Класс Легковые автомобили
public class Car extends Transport implements Competing {

    private final BodyType bodyType;

    public Car(String brand, String model, float engineVolume,  BodyType bodyType) {
        super(brand, model, engineVolume);
        this.bodyType = bodyType;
    }

    @Override
    public void startMovement() {
        System.out.printf("Легковой автомобиль %s %s начал движение.\n", this.getBrand(), this.getModel());
    }

    @Override
    public void stopMovement() {
        System.out.printf("Легковой автомобиль %s %s закончил движение.\n", this.getBrand(), this.getModel());
    }

    @Override
    public void pitStop() {
        System.out.printf("Легковой автомобиль %s %s выполняет пит-стоп.\n", this.getBrand(), this.getModel());
    }

    @Override
    public void getBestLapTime() {
        System.out.printf("Легковой автомобиль %s %s имеет лучшее время круга %d.\n",
                this.getBrand(),
                this.getModel(),
                ThreadLocalRandom.current().nextInt(1, 100));
    }

    @Override
    public void getMaxSpeed() {
        System.out.printf("Легковой автомобиль %s %s имеет максимальную скорость %d.\n",
                this.getBrand(),
                this.getModel(),
                ThreadLocalRandom.current().nextInt(1, 200));
    }

    @Override
    public void printType() {
        if (this.bodyType != null) {
            System.out.printf("Легковой автомобиль %s %s, тип кузова - %s.\n",
                    this.getBrand(),
                    this.getModel(),
                    this.bodyType);
        } else {
            System.out.printf("Легковой автомобиль %s %s, тип кузова - Данных недостаточно!\n",
                    this.getBrand(),
                    this.getModel());
        }
    }

    @Override
    public boolean service() {
        return Math.random() > 0.7;
    }

    @Override
    public void repair() {
        System.out.println("Машина " + getBrand() + " " + getModel() + " отремонтирована!");
    }

    public BodyType getBodyType() {
        return bodyType;
    }

}
