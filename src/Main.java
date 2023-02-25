import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Avante", LocalDate.of(2016,1,1),13000,CarBody.SEDAN);
        Car car2 = new Car("KIA", LocalDate.of(2017,1,1),18000,CarBody.CROSSOVER);
        Car car3 = new Car("CR-V", LocalDate.of(2013,1,1),10000,CarBody.HATCHBACK);
        Car car4 = new Car("Alphard", LocalDate.of(2020,1,1),80000,CarBody.UNIVERSAL);
        Car car5 = new Car("LX-470", LocalDate.of(2017,1,1),40000,CarBody.SUV);

        System.out.println(car4.bodyTypeIdentification(CarBody.UNIVERSAL));

        System.out.println(car4.determinationoYearOfManufacture());
    }
}