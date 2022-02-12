package FlyingTests;

import Flying.Plane;
import Flying.PlaneType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {
    Plane plane;

    @Before
    public void before(){
        plane = new Plane(PlaneType.AIRBUSBELUGA);
    }

    @Test
    public void hasType(){
        assertEquals(PlaneType.AIRBUSBELUGA, plane.getType());
    }

    @Test
    public void hasCapacity(){
        assertEquals(300, plane.getSeatCapacity());
    }

    @Test
    public void hasWeight(){
        assertEquals(12000, plane.getWeightCapacity());
    }
}
