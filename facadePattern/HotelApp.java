package facadePattern;

public class HotelApp {
    public static void main(String[] args) {
            FrontDesk frontDesk = new FrontDesk();

            //
             Valet valetPlateNum = new Valet("NAW 8822277755");
             frontDesk.requestService(valetPlateNum);


            // Request housekeeping service
            HouseKeeping houseService = new HouseKeeping(401);
            frontDesk.requestService(houseService);

            // Request cart service
            Cart cartService = new Cart(15);
            frontDesk.requestService(cartService);
        }
}

