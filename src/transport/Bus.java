package transport;

import java.util.concurrent.ThreadLocalRandom;

// Класс Автобусы
public class Bus extends Transport implements Competing {
    private final PlaceType placeType;

    public Bus(String brand,
               String model,
               float engineVolume,
               PlaceType placeType) {
        super(brand, model, engineVolume);
        this.placeType = placeType;
    }

    @Override
    public void startMovement() {
        System.out.printf("Автобус %s %s начал движение.\n", this.getBrand(), this.getModel());
    }

    @Override
    public void stopMovement() {
        System.out.printf("Автобус %s %s закончил движение.\n", this.getBrand(), this.getModel());
    }

    @Override
    public void pitStop() {
        System.out.printf("Автобус %s %s выполняет пит-стоп.\n", this.getBrand(), this.getModel());
    }

    @Override
    public void getBestLapTime() {
        System.out.printf("Автобус %s %s имеет лучшее время круга %d.\n",
                this.getBrand(),
                this.getModel(),
                ThreadLocalRandom.current().nextInt(1, 100));
    }

    @Override
    public void getMaxSpeed() {
        System.out.printf("Автобус %s %s имеет максимальную скорость %d.\n",
                this.getBrand(),
                this.getModel(),
                ThreadLocalRandom.current().nextInt(1, 180));
    }

    @Override
    public void printType() {
        if (this.placeType != null) {
            System.out.printf("Автобус %s %s, вместимость %s\n",
                    this.getBrand(),
                    this.getModel(),
                    this.placeType);
        } else {
            System.out.printf("Автобус %s %s, вместимость - Данных недостаточно!\n",
                    this.getBrand(),
                    this.getModel());
        }
    }

    @Override
    public boolean service() {
        System.out.printf("Автобус %s %s, в диагностике не требуется.\n",
                this.getBrand(),
                this.getModel());
        return true;
    }

    @Override
    public void repair() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + " отремонтирован!");
    }

    public PlaceType getPlaceType() {
        return placeType;
    }
}
