package Attractions;

public class Rollercoaster extends Attraction
implements ITicketed{

    public Rollercoaster(String name, int rating) {
        super(name, rating);
    }

    public void defaultPrice(int guestmoney){
       guestmoney -= 50;
    }
}
