package transport;

import driver.Driver;
import driver.DriverB;
import driver.DriverC;
import driver.DriverD;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Mechanic<Car> vladimirMechanic = new Mechanic<>("Владимир", "Владимиров", "СТО Легковые автомобили");
        Mechanic<Truck> ivanMechanic = new Mechanic<>("Иван", "Иванов", "СТО Грузовые автомобили");
        Mechanic<Bus> leonidMechanic = new Mechanic<>("Леонид", "Леонидов", "СТО Автобусы");

        Sponsor gaykaMotors = new Sponsor("ГайкаМоторс", 10_000);
        Sponsor shinaMotors = new Sponsor("ШинаМоторс", 20_000);
        Sponsor motors = new Sponsor("Моторс", 30_000);

        // Легковые автомобили
        System.out.println("-------------------");
        System.out.println("Легковые автомобили");
        System.out.println("-------------------");

        Car ladaGrande = new Car("Lada", "Grande", 1.7f, BodyType.SEDAN);
        Car audiA8 = new Car("Audi", "A8", 3.0f, BodyType.SEDAN);
        Car bmwZ8 = new Car("BMW", "Z8", 3.0f, BodyType.SEDAN);
        Car kiaSportage4 = new Car("Kia", "Sportage 4", 2.4f, BodyType.CROSSOVER);

        DriverB driverBladaGrande = new DriverB("Иванов",1, ladaGrande);
        DriverB driverBaudiA8 = new DriverB("Петров", 2, audiA8);
        DriverB driverBbmwZ8 = new DriverB("Семенов", 2, bmwZ8);
        DriverB driverBkiaSportage4 = new DriverB("Сидоров", 3, kiaSportage4);

        ladaGrande.addDriver(new DriverB("Романов",1, ladaGrande));
        ladaGrande.addMechanic(vladimirMechanic);
        ladaGrande.addSponsor(gaykaMotors, shinaMotors);

        System.out.println(driverBladaGrande);
        System.out.println(driverBaudiA8);
        System.out.println(driverBbmwZ8);
        System.out.println(driverBkiaSportage4);
        System.out.println("-------------------");

        ladaGrande.pitStop();
        ladaGrande.getBestLapTime();
        ladaGrande.getMaxSpeed();
        ladaGrande.printType();
        service(ladaGrande);
        System.out.println("-------------------");

        audiA8.pitStop();
        audiA8.getBestLapTime();
        audiA8.getMaxSpeed();
        audiA8.printType();
        service(audiA8);
        System.out.println("-------------------");

        bmwZ8.pitStop();
        bmwZ8.getBestLapTime();
        bmwZ8.getMaxSpeed();
        bmwZ8.printType();
        service(bmwZ8);
        System.out.println("-------------------");

        kiaSportage4.pitStop();
        kiaSportage4.getBestLapTime();
        kiaSportage4.getMaxSpeed();
        kiaSportage4.printType();
        service(kiaSportage4);

        // Грузовые автомобили
        System.out.println("-------------------");
        System.out.println("Грузовые автомобили");
        System.out.println("-------------------");

        Truck maz = new Truck("Maz", "111", 12.7f, CapacityType.N3);
        Truck kamaz = new Truck("Kamaz", "222", 13.0f, CapacityType.N1);
        Truck volvo = new Truck("Volvo", "333", 15.5f, CapacityType.N2);
        Truck man = new Truck("Man", "444", 16.4f, CapacityType.N3);

        DriverC driverCmaz = new DriverC("Квасов", 11, maz);
        DriverC driverCkamaz = new DriverC("Пупкин", 8, kamaz);
        DriverC driverCvolvo = new DriverC("Захаров", 15, volvo);
        DriverC driverCman = new DriverC("Карпин", 12, man);

        maz.addDriver(new DriverC("Зайцев",5, maz));
        maz.addMechanic(ivanMechanic);
        maz.addSponsor(shinaMotors);

        System.out.println(driverCmaz);
        System.out.println(driverCkamaz);
        System.out.println(driverCvolvo);
        System.out.println(driverCman);
        System.out.println("-------------------");

        maz.pitStop();
        maz.getBestLapTime();
        maz.getMaxSpeed();
        maz.printType();
        service(maz);
        System.out.println("-------------------");

        kamaz.pitStop();
        kamaz.getBestLapTime();
        kamaz.getMaxSpeed();
        kamaz.printType();
        service(kamaz);
        System.out.println("-------------------");

        volvo.pitStop();
        volvo.getBestLapTime();
        volvo.getMaxSpeed();
        volvo.printType();
        service(volvo);
        System.out.println("-------------------");

        man.pitStop();
        man.getBestLapTime();
        man.getMaxSpeed();
        man.printType();
        service(man);

        // Автобусы
        System.out.println("-------------------");
        System.out.println("Автобусы");
        System.out.println("-------------------");

        Bus paz = new Bus("Paz", "5df", 4.75f, PlaceType.SMALL);
        Bus gazel = new Bus("Gazel", "67ju", 7.5f, PlaceType.ESPECIALLY_SMALL);
        Bus ford = new Bus("Ford", "90hg", 3.5f, PlaceType.MEDIUM);
        Bus jac = new Bus("Jac", "76dr", 6.4f, PlaceType.LARGE);

        DriverD driverDpaz = new DriverD("Смирнов", 3, paz);
        DriverD driverDgazel = new DriverD("Губарев", 14, gazel);
        DriverD driverDford = new DriverD("Левкин", 8, ford);
        DriverD driverDjac = new DriverD("Голубев", 6, jac);

        paz.addDriver(new DriverD("Котляров",5, paz));
        paz.addDriver(new DriverD("Смирнов", 3, paz));
        paz.addMechanic(leonidMechanic);
        paz.addSponsor(shinaMotors, motors);

        System.out.println(driverDpaz);
        System.out.println(driverDgazel);
        System.out.println(driverDford);
        System.out.println(driverDjac);
        System.out.println("-------------------");

        paz.pitStop();
        paz.getBestLapTime();
        paz.getMaxSpeed();
        paz.printType();
        service(paz);
        System.out.println("-------------------");

        gazel.pitStop();
        gazel.getBestLapTime();
        gazel.getMaxSpeed();
        gazel.printType();
        service(gazel);
        System.out.println("-------------------");

        ford.pitStop();
        ford.getBestLapTime();
        ford.getMaxSpeed();
        ford.printType();
        service(ford);
        System.out.println("-------------------");

        jac.pitStop();
        jac.getBestLapTime();
        jac.getMaxSpeed();
        jac.printType();
        service(jac);
        System.out.println("-------------------");

        List<Transport> transports = List.of(ladaGrande, maz, paz);

        ServiceStation serviceStation = new ServiceStation();
        serviceStation.addCar(ladaGrande);
        serviceStation.addTruck(maz);
        serviceStation.service();
        serviceStation.service();

        for (Transport transport : transports) {
            printInfo(transport);
        }

//        List<Transport> transports = List.of(
//                ladaGrande, audiA8, bmwZ8, kiaSportage4,
//                maz, kamaz, volvo, man,
//                paz, gazel, ford, jac
//        );

//        service(ladaGrande, audiA8, bmwZ8, kiaSportage4,
//                maz, kamaz, volvo, man,
//                gazel, paz,ford, jac
//        );

    }

    private static void printInfo(Transport transport) {
        System.out.println("Информация по автомобилю: " +transport.getBrand() + " " + transport.getModel());
        System.out.println("Водители: " + transport.getDrivers());
        System.out.println("Спонсоры: " + transport.getSponsors());
        System.out.println("Механики: " + transport.getMechanics());
    }

    private static void service(Transport... transports) {
        for (Transport transport : transports) {
            serviceTransport(transport);
        }
    }

    private static void serviceTransport(Transport transport) {
        try {
            if (!transport.service()) {
                throw new RuntimeException("Автомобиль " + transport.getBrand() + " " + transport.getModel() + " не прошел диагностику!");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

}