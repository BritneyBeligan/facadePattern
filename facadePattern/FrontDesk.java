package facadePattern;
//FrontDesk: The facade class that coordinates interactions between the client (HotelApp) and the individual hotel services.
public class FrontDesk {
    public void requestService(HotelService service) {
        service.cleanRoom();
        service.pickUpVehicle();
        service.requestCart();
    }
}
