import Attractions.Attraction;
import Attractions.Park;
import Attractions.Rollercoaster;
import org.junit.Test;

public class testPark {
    @Test
    public void testCreatePark() {
        Attraction aPark;
        Park park1 = new Park("Park Cotton field", 2);
        aPark = new Rollercoaster("aPark",3);
        System.out.println(park1);
        System.out.println(aPark);
    }
}
