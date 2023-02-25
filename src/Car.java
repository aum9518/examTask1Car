import java.time.LocalDate;
import java.time.Period;

public class Car implements Identificationable{
    private String model;
    private LocalDate dateOfmade;
    private int price;
    private CarBody carBody;

    public Car() {
    }

    public Car(String model, LocalDate dateOfmade, int price, CarBody carBody) {
        this.model = model;
        this.dateOfmade = dateOfmade;
        this.price = price;
        this.carBody = carBody;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public LocalDate getDateOfmade() {
        return dateOfmade;
    }

    public void setDateOfmade(LocalDate dateOfmade) {
        this.dateOfmade = dateOfmade;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public CarBody getCarBody() {
        return carBody;
    }

    public void setCarBody(CarBody carBody) {
        this.carBody = carBody;
    }

    @Override
    public String bodyTypeIdentification(CarBody type) {
        if(type.equals(CarBody.SEDAN) ){
            return getModel() +" " + CarBody.SEDAN +  " The type of car passanger var";
        } else if (CarBody.CROSSOVER.equals(type)) {
            return CarBody.CROSSOVER+" "+CarBody.SUV+" the type of car SUV. ";
        } else if (CarBody.UNIVERSAL.equals(type)) {
            return getModel()+" "+CarBody.UNIVERSAL+" the type of car Universal";
        } else if (type.equals(CarBody.HATCHBACK)) {
            return getModel() + " " +CarBody.HATCHBACK+ " The type of car passanger var";
        } else if (CarBody.SUV.equals(type)) {
            return getModel() +" "+CarBody.SUV+" the type of car SUV. ";
        }
        return null;
    }

    @Override
    public int determinationoYearOfManufacture() {
        int year = Period.between(dateOfmade,LocalDate.now()).getYears();
        return year;
    }
}
