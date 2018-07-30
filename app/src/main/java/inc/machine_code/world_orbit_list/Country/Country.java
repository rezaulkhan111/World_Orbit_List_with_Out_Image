package inc.machine_code.world_orbit_list.Country;

import android.app.LauncherActivity;

import java.io.Serializable;

public class Country extends LauncherActivity.ListItem implements Serializable {
    private int id;
    private String CountryName;
    private String SatelliteCount;
    private int image;

    public Country(int id, String countryName, String satelliteCount, int image) {
        this.id = id;
        CountryName = countryName;
        SatelliteCount = satelliteCount;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountryName() {
        return CountryName;
    }

    public void setCountryName(String countryName) {
        CountryName = countryName;
    }

    public String getSatelliteCount() {
        return SatelliteCount;
    }

    public void setSatelliteCount(String satelliteCount) {
        SatelliteCount = satelliteCount;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
