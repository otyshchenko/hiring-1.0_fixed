import java.util.Locale;

public class CoordinatesDetails {

    private final String address, region;
    private final Locale locale;

    public CoordinatesDetails(String address, String region, Locale locale) {
        this.address = address;
        this.region = region;
        this.locale = locale;
    }

    public String getAddress() {
        return address;
    }

    public String getRegion() {
        return region;
    }

    public Locale getLocale() {
        return locale;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CoordinatesDetails that = (CoordinatesDetails) o;

        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (locale != null ? !locale.equals(that.locale) : that.locale != null) return false;
        if (region != null ? !region.equals(that.region) : that.region != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = address != null ? address.hashCode() : 0;
        result = 31 * result + (region != null ? region.hashCode() : 0);
        result = 31 * result + (locale != null ? locale.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "CoordinatesDetails{" +
                "address='" + address + '\'' +
                ", region='" + region + '\'' +
                ", locale=" + locale +
                '}';
    }
}
