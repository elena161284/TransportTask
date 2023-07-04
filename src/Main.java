public class Main {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle("Next Bless Lady 2022 17", 2);
        Car car = new Car("Mercedes-Benz A-класс", 4);
        Truck truck = new Truck("Легковой прицеп МЗСА", 3);

        ServiceStation station = new ServiceStation();
        System.out.println("Велосипед:");
        station.service(bicycle);
        System.out.println("Автомобиль:");
        station.service(car);
        System.out.println("Прицеп:");
        station.service(truck);
    }
}