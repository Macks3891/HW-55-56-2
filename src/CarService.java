import java.util.ArrayList;
import java.util.List;

public class CarService {
    private List<Car> cars;

    public CarService() {
        cars = new ArrayList<>();
        // Добавляем несколько машин в список
        cars.add(new Car("Toyota", "Corolla", 2020));
        cars.add(new Car("Honda", "Civic", 2019));
        cars.add(new Car("Ford", "Mustang", 2021));
    }

    public Car getCar(String brand, String model, int year) {
        for (Car car : cars) {
            if (car.getBrand().equalsIgnoreCase(brand) &&
                    car.getModel().equalsIgnoreCase(model) &&
                    car.getYear() == year) {
                return car;
            }
        }
        throw new CarNotFoundException("Машина с параметрами " + brand + " " + model + " " + year + " в списке не найдена");
    }
}