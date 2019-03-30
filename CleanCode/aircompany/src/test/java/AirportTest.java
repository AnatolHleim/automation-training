import airports.Airport;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AirportTest extends MethodToTest {

  @Test
  public void testGetTransportMilitaryPlanes() {
    Assert.assertTrue(getTransportMilitaryPlanes());
  }

  @Test
  public void testGetPassengerPlaneWithMaxCapacity() {
    Airport airport = new Airport(planes);
    Assert.assertEquals(airport.getPassengerPlaneWithMaxPassengersCapacity(), planeWithMaxPassengerCapacity);
  }

  @Test
  public void testNextPlaneMaxLoadCapacityIsHigherThanCurrent() {
    Assert.assertTrue(nextPlaneMaxLoadCapacityIsHigherThanCurrent());
  }

  @Test
  public void testHasAtLeastOneBomberInMilitaryPlanes() {
    Assert.assertTrue(hasAtLeastOneBomberInMilitaryPlanes());
  }

  @Test
  public void testExperimentalPlanesHasClassificationLevelHigherThanUnclassified() {
    Assert.assertFalse(experimentalPlanesHasClassificationLevelHigherThanUnclassified());
  }
}