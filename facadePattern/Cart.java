package facadePattern;
//A service class implementing the HotelService interface, responsible for handling luggage cart requests.
// It includes the requestCart(numberOfCarts) method.
public class Cart implements HotelService{
    private int numberOfCarts;

    public Cart(int numberOfCarts) {
        this.numberOfCarts = numberOfCarts;
    }


    @Override
    public void requestCart() {
        System.out.println("Cart service is handling " + numberOfCarts + " luggage cart(s)");
    }

    @Override
    public void pickUpVehicle() {

    }

    @Override
    public void cleanRoom() {

    }



}
