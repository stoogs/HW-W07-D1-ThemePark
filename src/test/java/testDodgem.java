import Attractions.Attraction;
import Attractions.Dodgem;
import org.junit.Test;

public class testDodgem {

    @Test
    public void testCreateDodgem() {
        Attraction attractionDodgem;
        Dodgem d1 = new Dodgem(3);
        attractionDodgem = new Dodgem(3);
        System.out.println(d1);
        System.out.println(attractionDodgem);
    }
}
