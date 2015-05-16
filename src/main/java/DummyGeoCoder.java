public class DummyGeoCoder implements GeoCoder {
    
    @Override
    public Coordinates lookupCoordinates(CoordinatesDetails coordinatesDetails) {
        return new Coordinates(52.52222, 13.29750); //hardCode
    }
}
