package inc.machine_code.world_orbit_list.Country;

import android.app.LauncherActivity;

import java.io.Serializable;

public class Satellite extends LauncherActivity.ListItem implements Serializable {

    private String SatCat_No;
    private String Name;
    private String Satellite_Type;
    private String Date;
    private int image;

    public Satellite(String SatCat_No, String name, String satellite_Type, String date, int image) {
        this.SatCat_No = SatCat_No;
        this.Name = name;
        this.Satellite_Type = satellite_Type;
        this.Date = date;
        this.image = image;
    }

    public Satellite() {
    }

    public String getSatCat_No() {
        return SatCat_No;
    }

    public void setSatCat_No(int SatCat_No) {
        SatCat_No = SatCat_No;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSatellite_Type() {
        return Satellite_Type;
    }

    public void setSatellite_Type(String satellite_Type) {
        Satellite_Type = satellite_Type;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
