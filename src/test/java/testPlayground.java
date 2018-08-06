import Attractions.Attraction;
import Attractions.Park;
import Attractions.Playground;
import Attractions.Rollercoaster;
import org.junit.Test;

public class testPlayground {
    @Test
    public void testCreatePlayGround() {

        Attraction aPLay;
        Playground play1 = new Playground("PlayGround Best", 2);
        aPLay = new Playground("aPlayy",3);
        System.out.println(play1);
        System.out.println(aPLay);

    }


}
