import org.junit.Test;

import java.util.Locale;

import static org.junit.Assert.assertEquals;

public class GeoCoderTest {

    private static final String ADDRESS = "address";
    private static final String REGION = "de";

    @Test
    public void runProgram() throws Exception {
        GeoCoder geoCoder = new DummyGeoCoder();
        CoordinatesDetails coordinatesDetails = new CoordinatesDetails(ADDRESS, REGION, Locale.GERMAN);
        Coordinates coordinates = geoCoder.lookupCoordinates(coordinatesDetails);
        assertEquals(52.52222, coordinates.getLatitude(), 0);
        assertEquals(13.29750, coordinates.getLongitude(), 0);

    }
}
