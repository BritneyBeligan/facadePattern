package facadePattern;
// A service class implementing the HotelService interface, responsible for vehicle valet parking and pick-up.
// It includes the pickUpVehicle(plateNumber) method.
public class Valet implements HotelService{
    private String plateNumber;

    public Valet(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    @Override
    public void pickUpVehicle() {
        System.out.println("Valet is parking or picking up the vehicle with plate number: " + plateNumber);
    }

    @Override
    public void cleanRoom() {

    }

    @Override
    public void requestCart() {

    }

}
