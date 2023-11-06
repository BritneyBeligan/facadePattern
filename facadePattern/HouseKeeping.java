package facadePattern;
//: A service class implementing the HotelService interface, responsible for room cleaning.
// It includes the cleanRoom(roomNumber) method.
public class HouseKeeping implements HotelService{
    private int roomNumber;

    public HouseKeeping(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    @Override
    public void cleanRoom() {
        System.out.println("Housekeeping is cleaning room number: " + roomNumber);
    }


    @Override
    public void pickUpVehicle() {

    }

    @Override
    public void requestCart() {

    }

}
