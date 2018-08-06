import Attractions.Attraction;
import Attractions.Dodgem;
import org.junit.Test;

public class testDodgem {

    @Test
    public void testCreateDodgem() {
        Attraction attractionDodgem;
        Dodgem d1 = new Dodgem("Dodgy", 2);
        attractionDodgem = new Dodgem("aDodgier",3);
        System.out.println(d1);
        System.out.println(attractionDodgem);
    }






}//class end
