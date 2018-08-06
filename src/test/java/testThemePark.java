import Attractions.Attraction;
import Attractions.Rollercoaster;
import Visitor;

import org.junit.Before;
import org.junit.Test;

public class testThemePark {

    @Before
    public void before() {
        Attraction anattraction;
        Rollercoaster a1 = new Rollercoaster("RCBase", 2);
        anattraction = new Rollercoaster("aRC",3);
        Visitor visitor1 = new Visitor(18, 172, 500);
}

    @Test
    public void testRC() {

    }
}
