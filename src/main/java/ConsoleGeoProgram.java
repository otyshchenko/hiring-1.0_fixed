import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class ConsoleGeoProgram {

    public static void main(String[] args) throws IOException {

        FileWriter fileWriter = null;
        String line = null;

        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        fileWriter = new FileWriter(args[0]);
        for (; ; ) {

            try {

                System.out.println("Please provide address:");
                String address = reader.readLine();

                if (address == null || address.equals("")) {
                    throw new IllegalArgumentException("Wrong input param");
                }
                
                CoordinatesDetails coordinatesDetails = new CoordinatesDetails(address, "de", Locale.CHINA);
                GeoCoder geoCoder = new DummyGeoCoder();
                Coordinates coordinates = geoCoder.lookupCoordinates(coordinatesDetails);
                line = String.format("Address is: %1s, Latitude is: %2$,.2f ,Longitude is : %3$,.2f \n", address, coordinates.getLatitude(), coordinates.getLongitude());
              
            } finally {
                fileWriter.write(line);
                fileWriter.flush();
            }

        }
    }
}

