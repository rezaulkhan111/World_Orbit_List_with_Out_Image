package inc.machine_code.world_orbit_list;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import inc.machine_code.world_orbit_list.Adapter.CountryAdapter;
import inc.machine_code.world_orbit_list.Country.Country;
import inc.machine_code.world_orbit_list.Country.Satellite;
import inc.machine_code.world_orbit_list.List.SatelliteListActivity;

public class MainActivity extends AppCompatActivity implements CountryAdapter.ICallback {

    List<Country> countryList = new ArrayList<>();
    List<Satellite> ALGERIA_Sat_Obj,
            ARGENTINA_Sat_Obj,
            AUSTRALIA_Sat_Obj,
            AZERBAIJAN_Sat_Obj,
            BANGLADESH_Sat_Obj,
            BELARUS_Sat_Obj,
            BOLIVIA_Sat_Obj,
            BRAZIL_Sat_Obj,
            BULGARIA_Sat_Obj,
            CANADA_Sat_Obj,
            CHILE_Sat_Obj,
            CHINA_Sat_Obj,
            CZECH_Sat_Obj,
            DENMARK_Sat_Obj,
            ECUADOR_Sat_Obj,
            EGYPT_Sat_Obj,
            ESTONIA_Sat_Obj,
            FRANCE_Sat_Obj,
            GERMANY_Sat_Obj,
            GREECE_Sat_Obj,
            INDIA_Sat_Obj,
            INDONESIA_Sat_Obj,
            IRAN_Sat_Obj,
            IRAQ_Sat_Obj,
            ISRAEL_Sat_Obj,
            ITALY_Sat_Obj,
            JAPAN_Sat_Obj,
            KAZAKHSTAN_Sat_Obj,
            KENIA_Sat_Obj,
            LAOS_Sat_Obj,
            LATVIA_Sat_Obj,
            LITHUANIA_Sat_Obj,
            LUXEMBOURG_Sat_Obj,
            MALAYSIA_Sat_Obj,
            MEXICO_Sat_Obj,
            MOROCCO_Sat_Obj,
            NETHERLANDS_Sat_Obj,
            NIGERIA_Sat_Obj,
            NORTH_KOREA_Sat_Obj,
            NORWAY_Sat_Obj,
            PAKISTAN_Sat_Obj,
            PERU_Sat_Obj,
            PHILIPPINES_Sat_Obj,
            POLAND_Sat_Obj,
            PORTUGAL_Sat_Obj,
            RUSSIA_Sat_Obj,
            SAUDI_ARABIA_Sat_Obj,
            SINGAPORE_Sat_Obj,
            SLOVAKIA_Sat_Obj,
            SOUTH_AFRICA_Sat_Obj,
            SOUTH_KOREA_Sat_Obj,
            SPAIN_Sat_Obj,
            SWEDEN_Sat_Obj,
            TAIWAN_Sat_Obj,
            THAILAND_Sat_Obj,
            TURKEY_Sat_Obj,
            UNITED_ARAB_EMIRATES_Sat_Obj,
            UNITED_KINGDOM_Sat_Obj,
            USA_Sat_Obj,
            URUGUAY_Sat_Obj,
            VENEZUELA_Sat_Obj,
            VIETNAM_Sat_Obj,
            FORMER_CZECHOSLOVAKIA_Sat_Obj,
            CHINA_BRAZIL_Sat_Obj,
            ARAB_SAT_COMM_ORG_Sat_Obj,
            ASIASAT_Sat_Obj,
            EUMETSAT_Sat_Obj,
            FRANCE_GERMANY_Sat_Obj,
            FRANCE_ITALY_Sat_Obj,
            GLOBALSTAR_Sat_Obj,
            INMARSAT_Sat_Obj,
            ITSO_Sat_Obj,
            NEW_ICO_Sat_Obj,
            EUTELSAT_Sat_Obj,
            NORTH_ATLANTIC_TREATY_ORGANIZATION_Sat_Obj,
            O3B_NETWORKS_Sat_Obj,
            ORBCOMM_Sat_Obj,
            RASCO_Sat_Obj,
            EUROPEAN_SPACE_AGENCY_Sat_Obj,
            SEA_LAUNCH_Sat_Obj,
            SINGAPORE_TAIWAN_Sat_Obj,
            SOCIETE_EUROPEENNE_DES_SATELLITES_Sat_Obj,
            TURKMENISTAN_MONACO,
            UNITED_STATES_BRAZIL_Sat_Obj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView mRecyclerView;

        mRecyclerView = findViewById(R.id.rv_country_name_flag);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        initRecyclerViewList();

        CountryAdapter adapter = new CountryAdapter(this, countryList);
        mRecyclerView.setAdapter(adapter);
    }

    private void initRecyclerViewList() {
        countryList.add(new Country(1, "ALGERIA", "6", R.mipmap.ic_algeria_foreground));
        countryList.add(new Country(2, "ARGENTINA", "18", R.mipmap.ic_argentina_foreground));
        countryList.add(new Country(3, "AUSTRALIA", "21", R.mipmap.ic_australia_foreground));
        countryList.add(new Country(4, "AZERBAIJAN", "1", R.mipmap.ic_azerbaijan_foreground));
        countryList.add(new Country(5, "BANGLADESH", "1", R.mipmap.ic_bangladesh_foreground));
        countryList.add(new Country(6, "BELARUS", "2", R.mipmap.ic_belarus_foreground));
        countryList.add(new Country(7, "BOLIVIA", "1", R.mipmap.ic_bolivia_foreground));
        countryList.add(new Country(8, "BRAZIL", "17", R.mipmap.ic_brazil_foreground));
        countryList.add(new Country(9, "BULGARIA", "1", R.mipmap.ic_bulgaria_foreground));
        countryList.add(new Country(10, "CANADA", "48", R.mipmap.ic_canada_foreground));
        countryList.add(new Country(11, "CHILE", "3", R.mipmap.ic_chile_foreground));
        countryList.add(new Country(12, "CHINA", "296", R.mipmap.ic_china_foreground));
        countryList.add(new Country(13, "CZECH", "3", R.mipmap.ic_czechia_foreground));
        countryList.add(new Country(84, "FORMER CZECHOSLOVAKIA", "2", R.mipmap.ic_czechia_foreground));
        countryList.add(new Country(14, "DENMARK", "9", R.mipmap.ic_denmark_foreground));
        countryList.add(new Country(15, "ECUADOR", "2", R.mipmap.ic_ecuador_foreground));
        countryList.add(new Country(16, "EGYPT", "5", R.mipmap.ic_egypt_foreground));
        countryList.add(new Country(17, "ESTONIA", "1", R.mipmap.ic_estonia_foreground));
        countryList.add(new Country(18, "FRANCE", "68", R.mipmap.ic_france_foreground));
        countryList.add(new Country(19, "GERMANY", "52", R.mipmap.ic_germany_foreground));
        countryList.add(new Country(20, "GREECE", "4", R.mipmap.ic_greece_foreground));
        countryList.add(new Country(21, "INDIA", "88", R.mipmap.ic_india_foreground));
        countryList.add(new Country(22, "INDONESIA", "16", R.mipmap.ic_indonesia_foreground));
        countryList.add(new Country(23, "IRAN", "1", R.mipmap.ic_iran_foreground));
        countryList.add(new Country(24, "IRAQ", "1", R.mipmap.ic_iraq_foreground));
        countryList.add(new Country(25, "ISRAEL", "17", R.mipmap.ic_israel_foreground));
        countryList.add(new Country(26, "ITALY", "27", R.mipmap.ic_italy_foreground));
        countryList.add(new Country(26, "JAPAN", "173", R.mipmap.ic_japan_foreground));
        countryList.add(new Country(28, "KAZAKHSTAN", "6", R.mipmap.ic_kazakhstan_foreground));
        countryList.add(new Country(29, "LAOS", "1", R.mipmap.ic_laos_foreground));
        countryList.add(new Country(30, "LATVIA", "1", R.mipmap.ic_latvia_foreground));
        countryList.add(new Country(31, "LITHUANIA", "1", R.mipmap.ic_lithuania_foreground));
        countryList.add(new Country(32, "LUXEMBOURG", "4", R.mipmap.ic_luxembourg_foreground));
        countryList.add(new Country(33, "MALAYSIA", "7", R.mipmap.ic_malaysia_foreground));
        countryList.add(new Country(34, "MEXICO", "12", R.mipmap.ic_mexico_foreground));
        countryList.add(new Country(35, "MOROCCO", "1", R.mipmap.ic_morocco_foreground));
        countryList.add(new Country(36, "NETHERLANDS", "6", R.mipmap.ic_netherlands_foreground));
        countryList.add(new Country(37, "NIGERIA", "6", R.mipmap.ic_nigeria_foreground));
        countryList.add(new Country(38, "NORTH KOREA", "2", R.mipmap.ic_north_korea_foreground));
        countryList.add(new Country(39, "NORWAY", "2", R.mipmap.ic_norway_foreground));
        countryList.add(new Country(40, "PAKISTAN", "3", R.mipmap.ic_pakistan_foreground));
        countryList.add(new Country(41, "PERU", "1", R.mipmap.ic_peru_foreground));
        countryList.add(new Country(42, "PHILIPPINES", "2", R.mipmap.ic_philippines_foreground));
        countryList.add(new Country(43, "POLAND", "2", R.mipmap.ic_poland_foreground));
        countryList.add(new Country(44, "PORTUGAL", "2", R.mipmap.ic_portugal_foreground));
        countryList.add(new Country(45, "RUSSIA", "1505", R.mipmap.ic_russia_foreground));
        countryList.add(new Country(46, "SAUDI ARABIA", "13", R.mipmap.ic_saudi_arabia_foreground));
        countryList.add(new Country(47, "SINGAPORE", "9", R.mipmap.ic_singapore_foreground));
        countryList.add(new Country(48, "SLOVAKIA", "1", R.mipmap.ic_slovakia_foreground));
        countryList.add(new Country(49, "SOUTH AFRICA", "6", R.mipmap.ic_south_africa_foreground));
        countryList.add(new Country(50, "SOUTH KOREA", "24", R.mipmap.ic_south_korea_foreground));
        countryList.add(new Country(51, "SPAIN", "23", R.mipmap.ic_spain_foreground));
        countryList.add(new Country(52, "SWEDEN", "12", R.mipmap.ic_sweden_foreground));
        countryList.add(new Country(53, "TAIWAN", "9", R.mipmap.ic_taiwan_foreground));
        countryList.add(new Country(54, "THAILAND", "9", R.mipmap.ic_thailand_foreground));
        countryList.add(new Country(55, "TURKEY", "14", R.mipmap.ic_turkey_foreground));
        countryList.add(new Country(56, "UNITED ARAB EMIRATES", "9", R.mipmap.ic_united_arab_emirates_foreground));
        countryList.add(new Country(57, "UNITED KINGDOM", "42", R.mipmap.ic_united_kingdom_foreground));
        countryList.add(new Country(58, "USA", "1619", R.mipmap.ic_united_states_of_america_foreground));
        countryList.add(new Country(59, "URUGUAY", "1", R.mipmap.ic_uruguay_foreground));
        countryList.add(new Country(60, "VENEZUELA", "3", R.mipmap.ic_venezuela_foreground));
        countryList.add(new Country(61, "VIETNAM", "3", R.mipmap.ic_vietnam_foreground));
        countryList.add(new Country(63, "NATO", "8", R.mipmap.ic_nato_foreground));
        countryList.add(new Country(64, "CHINA/BRAZIL", "3", R.mipmap.ic_china_brazil_foreground));
        countryList.add(new Country(65, "FRANCE/GERMANY", "2", R.mipmap.ic_france_germany_foreground));
        countryList.add(new Country(66, "FRANCE/ITALY", "2", R.mipmap.ic_franc_italy_foreground));
        countryList.add(new Country(68, "SINGAPORE/TAIWAN", "2", R.mipmap.ic_singapore_taiwan_foreground));
        countryList.add(new Country(69, "TURKMENISTAN/MONACO", "1", R.mipmap.ic_turkmenistan_monaco_foreground));
        countryList.add(new Country(70, "UNITED STATES/BRAZIL", "1", R.mipmap.ic_usa_brazil_foreground));
        countryList.add(new Country(71, "ARABSAT", "13", R.mipmap.ic_arabsat_foreground));
        countryList.add(new Country(72, "ASIASAT", "8", R.mipmap.ic_asiasat_foreground));
        countryList.add(new Country(73, "EUMETSAT", "8", R.mipmap.ic_eumetsat_foreground));
        countryList.add(new Country(74, "ESA", "82", R.mipmap.ic_esa_foreground));
        countryList.add(new Country(75, "EUTELSAT", "51", R.mipmap.ic_eutelsat_foreground));
        countryList.add(new Country(76, "GLOBALSTAR", "84", R.mipmap.ic_globalstar_foreground));
        countryList.add(new Country(77, "INMARSAT", "17", R.mipmap.ic_inmarsat_foreground));
        countryList.add(new Country(78, "ITSO", "85", R.mipmap.ic_itso_foreground));
        countryList.add(new Country(79, "O3B NETWORK", "16", R.mipmap.ic_o_3_b_network_foreground));
        countryList.add(new Country(80, "ORBCOMM", "41", R.mipmap.ic_orbcomm_foreground));
        countryList.add(new Country(81, "RASCOOM", "2", R.mipmap.ic_rascom_foreground));
        countryList.add(new Country(82, "SEA LAUNCH", "1", R.mipmap.ic_sea_launch_foreground));
        countryList.add(new Country(83, "SES", "56", R.mipmap.ic_ses_foreground));
        countryList.add(new Country(67, "NEW ICO", "1", R.mipmap.ic_new_ico_foreground));
    }

    public List<Satellite> ALGERIA_Satellite_List() {
        ALGERIA_Sat_Obj = new ArrayList<>();
        ALGERIA_Sat_Obj.add(new Satellite("43039", "ALCOMSAT-1", "Communication", "Dec-10-2017", R.mipmap.ic_algeria_foreground));
        ALGERIA_Sat_Obj.add(new Satellite("41789", "ALSAT 1N", "Technology", "Sep-26-2016", R.mipmap.ic_algeria_foreground));
        ALGERIA_Sat_Obj.add(new Satellite("41786", "ALSAT 2B", "Earth Observation", "Sep-26-2016", R.mipmap.ic_algeria_foreground));
        ALGERIA_Sat_Obj.add(new Satellite("41785", "ALSAT 1B", "Earth Observation", "Sep-26-2016", R.mipmap.ic_algeria_foreground));
        ALGERIA_Sat_Obj.add(new Satellite("36798", "ALSAT 2A", "Earth Observation", "July-12-2010", R.mipmap.ic_algeria_foreground));
        ALGERIA_Sat_Obj.add(new Satellite("27559", "ALSAT 1", "Earth Observation", "Nov-28-2002", R.mipmap.ic_algeria_foreground));
        return ALGERIA_Sat_Obj;
    }

    public List<Satellite> ARGENTINA_Satellite_List() {
        ARGENTINA_Sat_Obj = new ArrayList<>();
        ARGENTINA_Sat_Obj.add(new Satellite("43204", "NUSAT 5", "Earth Observation", "Feb-02-18", R.mipmap.ic_argentina_foreground));
        ARGENTINA_Sat_Obj.add(new Satellite("43195", "NUSAT 4", "Earth Observation", "Feb-02-18", R.mipmap.ic_argentina_foreground));
        ARGENTINA_Sat_Obj.add(new Satellite("42760", "NUSAT 3", "Earth Observation", "Jun-15-2017", R.mipmap.ic_argentina_foreground));
        ARGENTINA_Sat_Obj.add(new Satellite("41558", "NUSAT 2(BATATA)", "Earth Observation", "May-30-2016", R.mipmap.ic_argentina_foreground));
        ARGENTINA_Sat_Obj.add(new Satellite("41557", "NUSAT 1(FRESCO)", "Earth Observation", "May-30-2016", R.mipmap.ic_argentina_foreground));
        ARGENTINA_Sat_Obj.add(new Satellite("40941", "ARSAT 2", "Communication", "Sep-30-2015", R.mipmap.ic_argentina_foreground));
        ARGENTINA_Sat_Obj.add(new Satellite("40272", "ARSAT 1", "Communication", "Oct-16-2014", R.mipmap.ic_argentina_foreground));
        ARGENTINA_Sat_Obj.add(new Satellite("40014", "BUGSAT 1", "Technology,EO", "Jun-19-2014", R.mipmap.ic_argentina_foreground));
        ARGENTINA_Sat_Obj.add(new Satellite("39440", "CUBEBUG 2", "Technology", "Nov-21-2013", R.mipmap.ic_argentina_foreground));
        ARGENTINA_Sat_Obj.add(new Satellite("39153", "CUBEBUG 1", "Technology", "Apr-26-2013", R.mipmap.ic_argentina_foreground));
        ARGENTINA_Sat_Obj.add(new Satellite("37673", "SAC-D (AQUARIUS)", "ES(Ocean salinity)", "Jun-10-2011", R.mipmap.ic_argentina_foreground));
        ARGENTINA_Sat_Obj.add(new Satellite("29712", "PEHUENSAT 1", "Technology", "Jan-10-2007", R.mipmap.ic_argentina_foreground));
        ARGENTINA_Sat_Obj.add(new Satellite("27612", "LATINSAT A", "Comm:,Traffic Monitoring", "Dec-20-2002", R.mipmap.ic_argentina_foreground));
        ARGENTINA_Sat_Obj.add(new Satellite("27606", "LATINSAT B", "Comm:,Traffic Monitoring", "Dec-20-2002", R.mipmap.ic_argentina_foreground));
        ARGENTINA_Sat_Obj.add(new Satellite("26620", "SAC C", "Scientific", "Nov-21-2000", R.mipmap.ic_argentina_foreground));
        ARGENTINA_Sat_Obj.add(new Satellite("24714", "NAHUEL 1A", "Communication", "Jan-30-1997", R.mipmap.ic_argentina_foreground));
        ARGENTINA_Sat_Obj.add(new Satellite("20442", "OSCAR 19 (LUSAT)", "Amateur Radio Comm:", "Jan-22-1990", R.mipmap.ic_argentina_foreground));
        ARGENTINA_Sat_Obj.add(new Satellite("15642", "NAHUEL I1 (ANIK C1)", "Communication", "Apr-12-1985", R.mipmap.ic_argentina_foreground));
        ARGENTINA_Sat_Obj.add(new Satellite("14133", "NAHUEL I2 (ANIK C2)", "Communication", "Jun-18-1983", R.mipmap.ic_argentina_foreground));

        return ARGENTINA_Sat_Obj;
    }

    public List<Satellite> AUSTRALIA_Satellite_List() {
        AUSTRALIA_Sat_Obj = new ArrayList<>();
        AUSTRALIA_Sat_Obj.add(new Satellite("42786", "DIAMOND BLUE", "Communication", "Jun-23-2017", R.mipmap.ic_australia_foreground));
        AUSTRALIA_Sat_Obj.add(new Satellite("42785", "DIAMOND GREEN", "Communication", "Jun-23-2017", R.mipmap.ic_australia_foreground));
        AUSTRALIA_Sat_Obj.add(new Satellite("42783", "DIAMOND RED", "Communication", "Jun-23-2017", R.mipmap.ic_australia_foreground));
        AUSTRALIA_Sat_Obj.add(new Satellite("42731", "I-INSPIRE II", "Techs,Thermospheric research", "Nov-20-1998", R.mipmap.ic_australia_foreground));
        AUSTRALIA_Sat_Obj.add(new Satellite("42730", "SUSAT", "Technology,Atmosphere", "Nov-20-1998", R.mipmap.ic_australia_foreground));
        AUSTRALIA_Sat_Obj.add(new Satellite("42721", "CHALLENGER", "Techs,Thermospheric research", "Nov-20-1998", R.mipmap.ic_australia_foreground));
        AUSTRALIA_Sat_Obj.add(new Satellite("41794", "SKY MUSTER II", "Communication", "Oct-5-2016", R.mipmap.ic_australia_foreground));
        AUSTRALIA_Sat_Obj.add(new Satellite("40940", "SKY MUSTER", "Communication", "Sep-30-2015", R.mipmap.ic_australia_foreground));
        AUSTRALIA_Sat_Obj.add(new Satellite("40146", "OPTUS 10", "Communication", "Sep-11-2014", R.mipmap.ic_australia_foreground));
        AUSTRALIA_Sat_Obj.add(new Satellite("35756", "OPTUS D3", "Communication", "Aug-21-2009", R.mipmap.ic_australia_foreground));
        AUSTRALIA_Sat_Obj.add(new Satellite("32252", "OPTUS D2", "Communication", "Oct-5-2007", R.mipmap.ic_australia_foreground));
        AUSTRALIA_Sat_Obj.add(new Satellite("29495", "OPTUS D1", "Communication", "Oct-13-2006", R.mipmap.ic_australia_foreground));
        AUSTRALIA_Sat_Obj.add(new Satellite("27831", "OPTUS C1", "Communication", "Jun-11-2003", R.mipmap.ic_australia_foreground));
        AUSTRALIA_Sat_Obj.add(new Satellite("27598", "FEDSAT", "Science,Magnetosphere", "Dec-14-2002", R.mipmap.ic_australia_foreground));
        AUSTRALIA_Sat_Obj.add(new Satellite("25398", "WESTPAC", "Geodesy", "Jul-10-1998", R.mipmap.ic_australia_foreground));
        AUSTRALIA_Sat_Obj.add(new Satellite("23227", "OPTUS B3", "Communication", "Aug-27-1994", R.mipmap.ic_australia_foreground));
        AUSTRALIA_Sat_Obj.add(new Satellite("22087", "OPTUS B1(AUSSAT B1)", "Communication", "Aug-13-1992", R.mipmap.ic_australia_foreground));
        AUSTRALIA_Sat_Obj.add(new Satellite("18350", "OPTUS A3(AUSSAT 3)", "Communication", "Sep-16-1987", R.mipmap.ic_australia_foreground));
        AUSTRALIA_Sat_Obj.add(new Satellite("16275", "OPTUS A2(AUSSAT 2)", "Communication", "Nov-27-1985", R.mipmap.ic_australia_foreground));
        AUSTRALIA_Sat_Obj.add(new Satellite("15993", "OPTUS A1(AUSSAT 1)", "Communication", "Aug-27-1985", R.mipmap.ic_australia_foreground));
        AUSTRALIA_Sat_Obj.add(new Satellite("4321", "OSCAR 5", "Amateur Radio Comm:", "Jan-23-1970", R.mipmap.ic_australia_foreground));
        return AUSTRALIA_Sat_Obj;
    }

    public List<Satellite> AZERBAIJAN_Satellite_List() {
        AZERBAIJAN_Sat_Obj = new ArrayList<>();
        AZERBAIJAN_Sat_Obj.add(new Satellite("39079", "AZERSPACE 1", "Communication", "Feb-7-2013", R.mipmap.ic_azerbaijan_foreground));
        return AZERBAIJAN_Sat_Obj;
    }

    public List<Satellite> BANGLADESH_Satellite_List() {
        BANGLADESH_Sat_Obj = new ArrayList<>();
        BANGLADESH_Sat_Obj.add(new Satellite("43463", "BANGABANDHU", "Communication", "May-11-2018", R.mipmap.ic_bangladesh_foreground));
        return BANGLADESH_Sat_Obj;
    }

    public List<Satellite> BELARUS_Satellite_List() {
        BELARUS_Sat_Obj = new ArrayList<>();
        BELARUS_Sat_Obj.add(new Satellite("41238", "BELINTERSAT 1", "Communication", "Jan-15-2016", R.mipmap.ic_belarus_foreground));
        BELARUS_Sat_Obj.add(new Satellite("38708", "BKA 2", "Earth Observation", "Jul-22-2012", R.mipmap.ic_belarus_foreground));
        return BELARUS_Sat_Obj;
    }

    public List<Satellite> BOLIVIA_Satellite_List() {
        BOLIVIA_Sat_Obj = new ArrayList<>();
        BOLIVIA_Sat_Obj.add(new Satellite("39481", "TUPAC KATARI", "Communication", "Dec-20-2013", R.mipmap.ic_bolivia_foreground));
        return BOLIVIA_Sat_Obj;
    }

    public List<Satellite> BRAZIL_Satellite_List() {
        BRAZIL_Sat_Obj = new ArrayList<>();
        BRAZIL_Sat_Obj.add(new Satellite("42692", "SGDC", "Communication", "May-4-2017", R.mipmap.ic_brazil_foreground));
        BRAZIL_Sat_Obj.add(new Satellite("41904", "STAR ONE D1", "Communication", "Dec-21-2016", R.mipmap.ic_brazil_foreground));
        BRAZIL_Sat_Obj.add(new Satellite("40733", "STAR ONE C4", "Communication", "Jul-15-2015", R.mipmap.ic_brazil_foreground));
        BRAZIL_Sat_Obj.add(new Satellite("40024", "NANOSAT C BRl", "Science, magnetosphere", "Jun-19-2014", R.mipmap.ic_brazil_foreground));
        BRAZIL_Sat_Obj.add(new Satellite("38991", "STAR ONE C3", "Communication", "Nov-10-2012", R.mipmap.ic_brazil_foreground));
        BRAZIL_Sat_Obj.add(new Satellite("32768", "STAR ONE C2", "Communication", "Apr-18-2008", R.mipmap.ic_brazil_foreground));
        BRAZIL_Sat_Obj.add(new Satellite("32293", "STAR ONE C1", "Communication", "Nov-14-2007", R.mipmap.ic_brazil_foreground));
        BRAZIL_Sat_Obj.add(new Satellite("26469", "BRAZILSAT B4", "Communication", "Aug-17-2000", R.mipmap.ic_brazil_foreground));
        BRAZIL_Sat_Obj.add(new Satellite("25941", "SACI 1", "Scientific,Cosmic rays,Magnetic field,plasma", "Oct-14-1999", R.mipmap.ic_brazil_foreground));
        BRAZIL_Sat_Obj.add(new Satellite("25504", "SCD 2", "Data Collection", "Oct-23-1998", R.mipmap.ic_brazil_foreground));
        BRAZIL_Sat_Obj.add(new Satellite("25152", "BRAZILSAT B3", "Communication", "Feb-4-1998", R.mipmap.ic_brazil_foreground));
        BRAZIL_Sat_Obj.add(new Satellite("23536", "BRAZILSAT B2", "Communication", "Mar-28-1995", R.mipmap.ic_brazil_foreground));
        BRAZIL_Sat_Obj.add(new Satellite("23199", "BRAZILSAT B1", "Communication", "Aug-10-1994", R.mipmap.ic_brazil_foreground));
        BRAZIL_Sat_Obj.add(new Satellite("22490", "SCD 1", "Data Collection", "Feb-9-1993", R.mipmap.ic_brazil_foreground));
        BRAZIL_Sat_Obj.add(new Satellite("20440", "OSCAR 17 (DOVE)", "Amateur Radio Comm:", "Jan-22-1990", R.mipmap.ic_brazil_foreground));
        BRAZIL_Sat_Obj.add(new Satellite("16650", "BRAZILSAT 2", "Communication", "Mar-28-1986", R.mipmap.ic_brazil_foreground));
        BRAZIL_Sat_Obj.add(new Satellite("15561", "BRAZILSAT 1", "Communication", "Feb-8-1985", R.mipmap.ic_brazil_foreground));
        return BRAZIL_Sat_Obj;
    }

    public List<Satellite> BULGARIA_Satellite_List() {
        BULGARIA_Sat_Obj = new ArrayList<>();
        BULGARIA_Sat_Obj.add(new Satellite("42801", "BULGARIASAT-1", "Communication", "Jun-23-2017", R.mipmap.ic_bulgaria_foreground));
        return BULGARIA_Sat_Obj;
    }

    public List<Satellite> CANADA_Satellite_List() {
        CANADA_Sat_Obj = new ArrayList<>();
        CANADA_Sat_Obj.add(new Satellite("43157", "KEPLER-O(KIPP)", "Technology", "Jan-19-2018", R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite("42734", "EXALTA-1", "", "Nov-20-1998", R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite("41788", "CANX-7", "Technology", "Sep-26-2016", R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite("41605", "M3MSAT", "Experimental Comm:,Traffic Monitoring", "Jun-22-2016", R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite("41602", "GHGSAT-D", "Earth observation", "Jun-22-2016", R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite("41036", "TELSTAR 12V", "Communication", "Nov-24-2015", R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite("40936", "EXACTVIEW 9", "Traffic Monitoring", "Sep-28-2015", R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite("40056", "NLS 7.2/CANX 5", "Technology", "Jun-30-2014", R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite("40055", "NLS 7.1/CANX 4", "Technology", "Jun-30-2014", R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite("40020", "BRITE TORONTO", "Astronomy/Technology", "Jun-19-2014", R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite("39265", "CASSIOPE", "Comm:,Store Dump,Science", "Sep-29-2013", R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite("39127", "ANIK G1", "Communication", "Apr-15-2013", R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite("39089", "NEOSSAT", "Astronomy", "Feb-25-2013", R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite("39088", "SAPPHIRE", "Space Surveillance", "Feb-25-2013", R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite("38709", "EXACTVIEW-1", "Traffic Monitoring", "Jul-22-2012", R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite("38342", "NIMIQ 6", "Communication", "May-17-2012", R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite("37602", "TELSTAR 14R", "Communication", "May-20-2011", R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite("35873", "NIMIQ 5", "Communication", "Sep-17-2009", R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite("34111", "TELSTAR 11N", "Communication", "Feb-26-2009", R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite("33453", "CIEL-2", "Communication", "Dec-10-2008", R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite("33373", "NIMIQ 4", "Communication", "Sep-19-2008", R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite("32790", "CANX-2", "Technology", "Apr-28-2008", R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite("32784", "CANX-6", "Techs,Traffic Monitoring", "Apr-28-2008", R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite("32382", "RADARSAT 2", "Earth Observing(Radar)", "Dec-14-2007", R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite("31102", "ANIK F3", "Communication", "Apr-9-2007", R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite("28868", "ANIK F1-R", "Communication", "Sep-8-2005", R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite("28378", "ANIK F2", "Communication", "Jul-18-2004", R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite("27858", "SCISAT 1", "Atmospheric Science", "Aug-13-2003", R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite("27847", "CANX-1", "Technology", "Jun-30-2003", R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite("27843", "MOST", "Astronomy", "Jun-30-2003", R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite("27632", "NIMIQ 2", "Communication(DB)", "Dec-29-2002", R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite("26624", "ANIK F1", "Communication", "Nov-21-2000", R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite("25740", "NIMIQ 1", "Communication(DB)", "May-20-1999", R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite("23846", "MSAT M1", "Communication", "Apr-20-1996", R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite("23710", "RADARSAT", "Earth Observing (Radar)", "Nov-4-1995", R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite("21726", "ANIK E1", "Communication", "Sep-26-1991", R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite("21222", "ANIK E2", "Communication", "Apr-4-1991", R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite("13652", "ANIK C3(TELESAT-5)", "Communication", "Nov-11-1982", R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite("13652", "ANIK D1(TELESAT 6)", "Communication", "Aug-26-1982", R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite("11153", "ANIK B1(TELESAT-4)", "Communication", "Dec-16-1978", R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite("8585", "CTS", "Comm:,Experimental", "Jan-17-1976", R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite("7790", "ANIK A3(TELESAT-3)", "Communication", "May-7-1975", R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite("6437", "ANIK A2(TELESAT 2)", "Communication", "Apr-20-1973", R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite("6278", "ANIK A1(TELESAT 1)", "Communication", "Nov-10-1972", R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite("5104", "ISIS 2", "Science", "Apr-1-1971", R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite("3669", "ISIS 1", "Science", "Jan-30-1969", R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite("1804", "ALOUETTE 2", "Science,Ionosphere", "Nov-29-1965", R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite("424", "ALOUETTE 1 (S-27)", "Science,Ionosphere", "Sep-29-1962", R.mipmap.ic_canada_foreground));
        return CANADA_Sat_Obj;
    }

    public List<Satellite> CHILE_Satellite_List() {
        CHILE_Sat_Obj = new ArrayList<>();
        CHILE_Sat_Obj.add(new Satellite("42788", "SUCHAI", "Technology,Education", "Jun-23-2017", R.mipmap.ic_chile_foreground));
        CHILE_Sat_Obj.add(new Satellite("38011", "SSOT", "Earth observation", "Dec-17-2011", R.mipmap.ic_chile_foreground));
        CHILE_Sat_Obj.add(new Satellite("25395", "FASAT B", "EO,Technology", "Jul-10-1998", R.mipmap.ic_chile_foreground));
        return CHILE_Sat_Obj;
    }
////china///
    public List<Satellite> CHINA_Satellite_List() {
        CHINA_Sat_Obj = new ArrayList<>();
        CHINA_Sat_Obj.add(new Satellite("43519", "XJS B", "", "Jun-27-2018", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("43518", "XJS A", "", "Jun-27-2018", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("43491", "FENGYUN 2H", "", "Jun-5-2018", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("43485", "LUOJIA-1 01", "", "Jun-2-2018", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("43484", "GAOFEN 6", "", "Jun-2-2018", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("43472", "LONGJIANG 2", "", "May-20-2018", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("43471", "LONGJIANG 1", "", "May-20-2018", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("43470", "QUEQIAO", "", "May-20-2018", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("43461", "GAOFEN-5", "", "May-8-2018", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("43450", "APSTAR 6C", "", "May-3-2018", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("43443", "ZHUHAI-1 OHS-04", "", "Apr-26-2018", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("43442", "ZHUHAI-1 OHS-03", "", "Apr-26-2018", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("43441", "ZHUHAI-1 OHS-02", "", "Apr-26-2018", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("43440", "ZHUHAI-1 OVS-02", "", "Apr-26-2018", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("43439", "ZHUHAI-1 OHS-01", "", "Apr-26-2018", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("43279", "WEINA 1B", "", "Apr-10-2018", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("43277", "YAOGAN-31 C", "", "Apr-10-2018", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("43276", "YAOGAN-31 B", "", "Apr-10-2018", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("43275", "YAOGAN-31 A", "", "Apr-10-2018", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("43262", "GAOFEN 1-04", "", "Mar-31-2018", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("43260", "GAOFEN 1-03", "", "Mar-31-2018", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("43259", "GAOFEN 1-02", "", "Mar-31-2018", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("43246", "BEIDOU 3M8", "", "Mar-29-2018", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("43245", "BEIDOU 3M7", "", "Mar-29-2018", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("43236", "LKW-4", "", "Mar-17-2018", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("43208", "BEIDOU 3M6", "", "Feb-12-2018", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("43207", "BEIDOU 3M5", "", "Feb-12-2018", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("43199", "SHAONIAN XING", "", "Feb-2-2018", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("43194", "ZHANGHENG-1", "", "Feb-2-2018", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("43192", "FENGMANIU 1 (FMN 1)", "Feb-2-2018", "", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("43172", "YAOGAN-30 M", "", "Jan-25-2018", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("43171", "YAOGAN-30 L", "", "Jan-25-2018", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("43170", "YAOGAN-30 K", "", "Jan-25-2018", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("43169", "WEINA 1A", "", "Jan-25-2018", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("43160", "JILIN-01-08", "", "Jan-19-2018", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("43159", "JILIN-01-07", "", "Jan-19-2018", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("43158", "QUANTUTONG 1", "", "Jan-19-2018", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("43156", "ZHOU ENLAI", "", "Jan-19-2018", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("43155", "XIAOXIANG 2 (TY-2)", "", "Jan-19-2018", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("43146", "LKW-3", "", "Jan-13-2018", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("43108", "BEIDOU 3M4", "", "Jan-11-2018", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("43107", "BEIDOU 3M3", "", "Jan-11-2018", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("43100", "SUPERVIEW-1 04", "", "Jan-9-2018", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("43099", "SUPERVIEW-1 03", "", "Jan-9-2018", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("43083", "YAOGAN-30 J", "", "Dec-25-2017", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("43082", "YAOGAN-30 H", "", "Dec-25-2017", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("43081", "YAOGAN-30 G", "", "Dec-25-2017", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("43080", "LKW-2", "", "Dec-23-2017", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("43034", "LKW-1", "", "Dec-3-2017", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("43030", "YAOGAN-30 F", "", "Nov-24-2017", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("43029", "YAOGAN-30 E", "", "Nov-24-2017", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("43028", "YAOGAN-30 D", "", "Nov-24-2017", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("43024", "JILIN-01-06", "", "Nov-21-2017", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("43023", "JILIN-01-05", "", "Nov-21-2017", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("43022", "JILIN-01-04", "", "Nov-21-2017", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("43011", "HEAD-1", "", "Nov-14-2017", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("43010", "FENGYUN 3D", "", "Nov-14-2017", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("43002", "BEIDOU-3 M2", "", "Nov-5-2017", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("43001", "BEIDOU-3 M1", "", "Nov-5-2017", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("42947", "YAOGAN-30 C", "", "Nov-29-2017", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("42946", "YAOGAN-30 B", "", "Nov-29-2017", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("42945", "YAOGAN-30 A", "", "Nov-29-2017", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("42903", "SILKROAD 1", "", "Apr-20-2017", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("42787", "NUDTSAT", "", "Jun-23-2017", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("42763", "CHINASAT 9A", "", "Jun-18-2017", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("42761", "ZHUHAI-1 01 (CAS 4A)", "", "Jun-15-2017", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("42759", "ZHUHAI-1 02 (CAS 4B)", "", "Jun-15-2017", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("42758", "HXMT (HUIYAN)", "", "Jun-15-2017", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("42735", "AOXIANG-1", "", "Nov-20-1998", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("42725", "LILACSAT-1", "", "Nov-20-1998", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("42722", "NJUST-1", "", "Nov-20-1998", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("42662", "CHINASAT 16", "", "Apr-12-2017", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("42061", "TK-1", "", "Mar-2-2017", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("41915", "KAIDUN 1", "", "Jan-9-2017", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("41914", "JILIN-1-03", "", "Jan-9-2017", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("41913", "XY S 1", "", "Jan-9-2017", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("41911", "TJS-2", "", "Jan-5-2017", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("41908", "SUPERVIEW-1 02", "", "Dec-28-2016", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("41907", "SUPERVIEW-1 01", "", "Dec-28-2016", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("41901", "SPARK 2", "", "Dec-21-2016", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("41900", "SPARK 1", "", "Dec-21-2016", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("41899", "YIJIAN", "", "Dec-21-2016", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("41898", "TANSAT", "", "Dec-21-2016", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("41882", "FENGYUN 4A", "", "Dec-10-2016", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("41869", "TIANLIAN 1-04", "", "Nov-22-2016", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("41868", "SHENZHOU-11 MODULE", "", "Oct-16-2016", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("41857", "YUNHAI 1", "", "Nov-11-2016", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("41845", "LISHUI 1-01", "", "Nov-9-2016", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("41844", "PINA 2B", "", "Nov-9-2016", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("41843", "PINA 2A", "", "Nov-9-2016", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("41842", "XIAOXIANG 1", "", "Nov-9-2016", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("41841", "XPNAV-1", "", "Nov-9-2016", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("41838", "SJ-17(SHIJIAN-17)", "Nov-3-2016", "", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("41834", "BANXING-2", "", "Sep-15-2016", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("41765", "TIANGONG-2", "", "Sep-15-2016", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("41731", "QSS", "", "Aug-15-2016", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("41727", "GAOFEN 3", "", "Aug-9-2016", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("41725", "TIANTONG-1 1", "", "Aug-5-2016", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("41634", "SJ 16-02", "", "Jun-29-2016", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("41586", "BEIDOU G7", "", "Jun-12-2016", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("41556", "ZIYUAN 3-2", "", "May-30-2016", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("41473", "YAOGAN 30", "", "May-15-2016", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("41434", "BEIDOU IGSO 6", "", "Mar-29-2016", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("41315", "BEIDOU M3-S", "", "Feb-1-2016", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("41194", "GAOFEN 4", "", "Dec-28-2015", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("41173", "DAMPE", "", "Dec-17-2015", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("41103", "CHINASAT 1C", "", "Dec-9-2015", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("41038", "YAOGAN 29", "", "Nov-26-2015", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("41026", "YAOGAN 28", "", "Nov-8-2015", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("41021", "CHINASAT 2C (ZX 2C)", "", "Nov-3-2015", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("40988", "TIANHUI 1-03", "", "Oct-26-2015", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("40982", "APSTAR 9", "", "Oct-16-2015", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("40961", "JILIN 1", "", "Oct-7-2015", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("40960", "LINGQIAO VIDEO B", "", "Oct-7-2015", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("40959", "LINGQIAO VIDEO A", "", "Oct-7-2015", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("40958", "LQSAT", "", "Oct-7-2015", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("40938", "BEIDOU I2-S", "", "Sep-29-2015", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("40928", "TIANWANG 1A (TW-1A)", "", "Sep-25-2015", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("40927", "TIANWANG 1B (TW-1B)", "", "Sep-25-2015", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("40926", "TIANWANG 1C (TW-1C)", "", "Sep-25-2015", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("40925", "PUJIANG 1 (PJ-1)", "", "Sep-19-2015", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("40912", "KAITUO 1B", "", "Sep-19-2015", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("40911", "XW-2B", "", "Sep-19-2015", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("40910", "XW-2F", "", "Sep-19-2015", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("40909", "XW-2E", "", "Sep-19-2015", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("40908", "LILACSAT 2", "", "Sep-19-2015", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("40907", "XW-2D", "", "Sep-19-2015", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("40906", "XW-2C", "", "Sep-19-2015", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("40904", "KAITUO 1A", "", "Sep-19-2015", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("40903", "XW-2A", "", "Sep-19-2015", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("40902", "ZDPS 2B", "", "Sep-19-2015", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("40901", "ZDPS 2A", "", "Sep-19-2015", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("40900", "NUDT-PHONESAT", "", "Sep-19-2015", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("40894", "GAOFEN 9", "", "Sep-14-2015", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("40892", "TJS-1", "", "Sep-12-2015", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("40878", "YAOGAN 27", "", "Aug-27-2015", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("40749", "BEIDOU-3 M2", "", "Jul-25-2015", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("40748", "BEIDOU-3 M1", "", "Jul-25-2015", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("40701", "GAOFEN 8", "", "Jul-26-2015", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("40549", "BEIDOU I1-S", "", "Mar-30-2015", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("40424", "ABS 3A", "", "Mar-2-2015", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("40367", "FENGYUN 2G", "", "Dec-31-2014", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("40362", "YAOGAN 26", "", "Dec-27-2014", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("40340", "YAOGAN 25C", "", "Dec-10-2014", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("40339", "YAOGAN 25B", "", "Dec-10-2014", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("40338", "YAOGAN 25A", "", "Dec-10-2014", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("40336", "CBERS-4", "", "Dec-7-2014", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("40310", "YAOGAN 24", "", "Nov-20-2014", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("40305", "YAOGAN 23", "", "Nov-14-2014", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("40286", "SJ-11-08", "", "Oct-27-2014", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("40275", "YAOGAN 22", "", "Oct-27-2014", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("40261", "SJ-11-07", "", "Sep-28-2014", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("40144", "TIANTUO 2", "", "Sep-8-2014", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("40143", "YAOGAN 21", "", "Sep-8-2014", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("40137", "CHUANG XIN 1-04", "Sep-4-2014", "", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("40136", "LING QIAO", "", "Sep-4-2014", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("40118", "GAOFEN 2", "", "Aug-19-2014", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("40111", "YAOGAN 20C", "", "Aug-9-2014", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("40110", "YAOGAN 20B", "", "Aug-9-2014", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("40109", "YAOGAN 20A", "", "Aug-9-2014", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("39624", "SJ-11-06", "", "Mar-31-2014", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("39508", "ABS 2", "", "Feb-6-2014", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("39455", "SHIYAN-5 (SY-5)", "Nov-25-2013", "", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("39410", "YAOGAN 19", "", "Nov-25-2013", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("39363", "YAOGAN 18", "", "Oct-29-2013", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("39358", "SHIJIAN-16 (SJ-16)", "", "Oct-25-2013", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("39260", "FENGYUN 3C", "", "Sep-23-2013", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("39241", "YAOGAN 17C", "", "Sep-1-2013", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("39240", "YAOGAN 17B", "", "Sep-1-2013", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("39239", "YAOGAN 17A", "", "Sep-1-2013", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("39210", "SHIJIAN-15 (SJ-15)", "", "Jul-19-2013", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("39209", "CHUANGXIN-3 (CX-3)", "", "Jul-19-2013", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("39208", "SHIYAN-7 (SY-7)", "", "Jul-19-2013", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("39202", "SJ-11-05", "", "Jul-15-2013", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("39157", "CHINASAT 11", "", "May-1-2013", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("39150", "GAOFEN 1", "", "Apr-26-2013", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("39017", "CHINASAT 15A", "", "Nov-27-2012", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("39013", "YAOGAN 16C", "", "Nov-25-2012", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("39012", "YAOGAN 16B", "", "Nov-25-2012", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("39011", "YAOGAN 16A", "", "Nov-25-2012", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("38999", "XINYAN 1 (XY-1)", "", "Nov-18-2012", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("38998", "FENGNIAO 1 (FN-1)", "", "Nov-18-2012", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("38997", "HJ-1C", "", "Nov-18-2012", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("38953", "BEIDOU G6", "", "Oct-25-2012", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("38861", "SJ-9B", "", "Oct-14-2012", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("38860", "SJ-9A", "", "Oct-14-2012", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("38775", "BEIDOU M6", "", "Sep-18-2012", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("38774", "BEIDOU M5", "", "Sep-18-2012", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("38730", "TIANLIAN 1-03", "", "Jul-25-2012", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("38354", "YAOGAN 15", "", "May-29-2012", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("38352", "CHINASAT 2A", "", "May-26-2012", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("38257", "YAOGAN 14", "", "May-10-2012", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("38256", "TIANHUI 1-02", "", "May-6-2012", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("38251", "BEIDOU M4", "", "Apr-29-2012", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("38250", "BEIDOU M3", "", "Apr-29-2012", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("38107", "APSTAR 7", "", "Mar-31-2012", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("38091", "BEIDOU G5", "", "Feb-24-2012", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("38049", "FENGYUN 2F", "", "Feb-13-2012", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("38046", "ZY 3", "", "Feb-9-2012", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("38038", "ZY 1", "", "Dec-22-2011", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("37948", "BEIDOU IGSO 5", "", "Dec-1-2011", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("37941", "YAOGAN 13", "", "Nov-29-2011", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("37931", "SHIYUAN 4", "", "Nov-20-2011", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("37930", "CHUANG XIN 1-03", "", "Nov-20-2011", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("37875", "YAOGAN 12", "", "Nov-9-2011", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("37804", "CHINASAT 1A", "", "Sep-17-2011", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("37781", "HAIYANG 2A", "", "Aug-15-2011", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("37765", "SJ-11-02", "", "Jul-29-2011", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("37763", "BEIDOU IGSO 4", "", "Jul-26-2011", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("37737", "TIANLIAN 1-02", "", "Jul-11-2011", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("37730", "SJ-11-03", "", "Jul-6-2011", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("37677", "CHINASAT 10", "", "Jun-20-2011", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("37384", "BEIDOU IGSO 3", "", "Apr-9-2011", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("37256", "BEIDOU IGSO 2", "", "Dec-17-2010", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("37234", "CHINASAT 20A", "", "Nov-24-2010", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("37214", "FENGYUN 3B", "", "Nov-4-2010", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("37210", "BEIDOU G4", "", "Oct-31-2010", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("37180", "SJ-6H", "", "Oct-6-2010", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("37179", "SJ-6G", "", "Oct-6-2010", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("37174", "CHANG E 2", "", "Oct-1-2010", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("37167", "ZHEDA PIXING 1C", "", "Sep-22-2010", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("37166", "ZHEDA PIXING 1B", "", "Sep-22-2010", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("37165", "YAOGAN 11", "", "Sep-22-2010", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("37150", "CHINASAT 6A", "", "Sep-4-2010", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("36985", "TIANHUI 1", "", "Aug-24-2010", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("36834", "YAOGAN 10", "", "Aug-9-2010", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("36828", "BEIDOU IGSO 1", "", "Jul-31-2010", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("36596", "SJ-12", "", "Jun-15-2010", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("36590", "BEIDOU G3", "", "Jun-2-2010", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("36415", "YAOGAN 9C", "", "Mar-5-2010", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("36414", "YAOGAN 9B", "", "Mar-5-2010", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("36413", "YAOGAN 9A", "", "Mar-5-2010", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("36287", "BEIDOU G1", "", "Jan-16-2010", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("36122", "XIWANG-1 (HOPE-1)", "", "Dec-15-2009", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("36121", "YAOGAN 8", "", "Dec-15-2009", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("36110", "YAOGAN 7", "", "Dec-9-2009", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("36088", "SJ-11-01", "", "Nov-12-2009", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("34839", "YAOGAN 6", "", "Apr-22-2009", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("34779", "BEIDOU G2", "", "Apr-14-2009", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("33463", "FENGYUN 2E", "", "Dec-23-2008", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("33446", "YAOGAN 4", "", "Dec-1-2008", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("33434", "CHUANG XIN 1-02(CX-1-02)", "", "Nov-5-2008", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("33433", "SHIYUAN 3 (SY-3)", "", "Nov-5-2008", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("33409", "SJ-6F", "", "Oct-25-2008", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("33408", "SJ-6E", "", "Oct-25-2008", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("33321", "HJ-1B", "", "Sep-6-2008", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("33320", "HJ-1A", "", "Sep-6-2008", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("33051", "CHINASAT 9", "", "Jun-9-2008", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("32958", "FENGYUN 3A", "", "May-27-2008", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("32779", "CTDRS", "", "Apr-25-2008", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("32289", "YAOGAN 3", "", "Nov-11-2007", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("31800", "CHINASAT 6B", "", "Jul-5-2007", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("31490", "YAOGAN 2", "", "May-25-2007", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("31115", "BEIDOU M1", "", "Apr-13-2007", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("31113", "HAIYANG 1B", "", "Apr-11-2007", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("30323", "BEIDOU 1D", "", "Feb-2-2007", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("29640", "FENGYUN 2D", "", "Dec-8-2006", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("29516", "SINOSAT 2", "", "Oct-28-2006", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("29506", "SJ-6D", "", "Oct-23-2006", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("29505", "SJ-6C", "", "Oct-23-2006", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("29398", "CHINASAT 22A", "", "Sep-12-2006", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("29092", "YAOGAN 1", "", "Apr-26-2006", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("28890", "BEIJING 1 (TSINGHUA)", "", "Oct-27-2005", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("28737", "SJ-7", "", "Jul-5-2005", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("28638", "APSTAR 6", "", "Apr-12-2005", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("28479", "TANSUO 2", "", "Nov-18-2004", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("28470", "JB-3 C", "", "Nov-6-2004", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("28451", "FENGYUN 2C", "", "Oct-19-2004", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("28414", "SJ-6B", "", "Sep-8-2004", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("28413", "SJ-6A", "", "Sep-8-2004", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("28382", "DOUBLESTAR (TC-2)", "", "Jul-25-2004", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("28364", "APSTAR 5 (TELSTAR 18)", "", "Jun-29-2004", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("28221", "NAXING 1", "", "Apr-18-2004", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("28220", "TANSUO 1", "", "Apr-18-2004", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("28082", "CHINASAT 20", "", "Nov-14-2003", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("28058", "CHUANG XIN 1 (CZ-1)", "", "Oct-21-2003", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("27813", "BEIDOU 1C", "", "May-24-2003", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("27431", "FENGYUN 1D", "", "May-15-2002", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("27430", "HAIYANG 1", "", "May-15-2002", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("26643", "BEIDOU 1B", "", "Dec-20-2000", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("26599", "BEIDOU 1", "", "Oct-30-2000", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("26385", "TZINGHUA 1", "", "Jun-28-2000", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("26382", "FENGYUN 2B", "", "Jun-25-2000", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("26058", "CHINASAT 22", "", "Jan-25-2000", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("25924", "ABS 1(LMI 1)", "", "Sep-26-1999", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("25731", "SJ-5", "", "May-10-1999", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("25730", "FENGYUN 1C", "", "May-10-1999", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("25404", "CHINASAT 5B (SINOSAT 1)", "", "Jul-18-1998", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("25354", "CHINASAT 5A (CHINASTAR1)", "", "May-30-1998", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("25010", "APSTAR 2R (TELSTAR 10)", "", "Oct-16-1997", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("24926", "DUMMY MASS 2", "", "Sep-1-1997", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("24925", "DUMMY MASS 1", "", "Sep-1-1997", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("24901", "ABS 3", "", "Aug-19-1997", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("24834", "FENGYUN 2A", "", "Jun-10-1997", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("24798", "DFH-3 2", "", "May-11-1997", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("24282", "CHINASAT 7", "", "Aug-18-1996", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("23943", "APSTAR 1A", "", "Jul-3-1996", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("23415", "DFH-3 1", "", "Nov-29-1994", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("23185", "APSTAR 1", "", "Jul-21-1994", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("22996", "SJ-4", "", "Feb-8-1994", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("21833", "STTW-5", "", "Dec-28-1991", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("20788", "FENGYUN 1B", "", "Sep-3-1990", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("20473", "STTW-4", "", "Feb-4-1990", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("19710", "STTW-3", "", "Dec-22-1988", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("19467", "FENGYUN 1A", "", "Sep-6-1988", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("18922", "STTW-2", "", "Mar-7-1988", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("16526", "STTW-1", "", "Feb-1-1986", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("14985", "CHINASAT 5(SPACENET 1)", "", "May-23-1984", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("14899", "STTW-T2", "", "Apr-8-1984", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("14670", "STTW-T1", "", "Jan-29-1984", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite("4382", "DFH-1", "", "Apr-24-1970", R.mipmap.ic_china_foreground));

        return CHINA_Sat_Obj;
    }

    public List<Satellite> CZECH_Satellite_List() {
        CZECH_Sat_Obj = new ArrayList<>();
        CZECH_Sat_Obj.add(new Satellite("42790", "VZLUSAT 1", "Techs,Thermospheric Research", "Jun-23-2017", R.mipmap.ic_czechia_foreground));
        CZECH_Sat_Obj.add(new Satellite("24292", "MAGION 5", "Science,Magnetosphere", "Aug-29-1996", R.mipmap.ic_czechia_foreground));
        CZECH_Sat_Obj.add(new Satellite("23646", "MAGION 4", "Science,Magnetosphere", "Aug-2-1995", R.mipmap.ic_czechia_foreground));
        return CZECH_Sat_Obj;
    }

    public List<Satellite> DENMARK_Satellite_List() {
        DENMARK_Sat_Obj = new ArrayList<>();
        DENMARK_Sat_Obj.add(new Satellite("43197", "GOMX 4A", "Technology", "Feb-2-2018", R.mipmap.ic_denmark_foreground));
        DENMARK_Sat_Obj.add(new Satellite("41460", "AAUSAT-4", "Techs,Traffic monitoring", "Apr-25-2016", R.mipmap.ic_denmark_foreground));
        DENMARK_Sat_Obj.add(new Satellite("40030", "DTUSAT-2", "Technology,Education", "Jun-19-2014", R.mipmap.ic_denmark_foreground));
        DENMARK_Sat_Obj.add(new Satellite("39430", "GOMX 1", "Techs,Traffic monitoring", "Nov-21-2013", R.mipmap.ic_denmark_foreground));
        DENMARK_Sat_Obj.add(new Satellite("39087", "AAUSAT 3", "Techs,Traffic monitoring", "Feb-25-2013", R.mipmap.ic_denmark_foreground));
        DENMARK_Sat_Obj.add(new Satellite("32788", "AAUSAT CUBESAT 2", "Technology", "Apr-28-2008", R.mipmap.ic_denmark_foreground));
        DENMARK_Sat_Obj.add(new Satellite("27846", "AAU CUBESAT", "Technology", "Jun-30-2003", R.mipmap.ic_denmark_foreground));
        DENMARK_Sat_Obj.add(new Satellite("27842", "DTUSAT", "Technology,Education", "Jun-30-2003", R.mipmap.ic_denmark_foreground));
        DENMARK_Sat_Obj.add(new Satellite("25635", "OERSTED", "Science", "Feb-23-1999", R.mipmap.ic_denmark_foreground));
        return DENMARK_Sat_Obj;
    }

    public List<Satellite> ECUADOR_Satellite_List() {
        ECUADOR_Sat_Obj = new ArrayList<>();
        ECUADOR_Sat_Obj.add(new Satellite("39441", "NEE 02 KRYSAOR", "Technology", "Nov-21-2013", R.mipmap.ic_ecuador_foreground));
        ECUADOR_Sat_Obj.add(new Satellite("39151", "NEE 01 PEGASUS", "Technology", "Apr-26-2013", R.mipmap.ic_ecuador_foreground));
        return ECUADOR_Sat_Obj;
    }

    public List<Satellite> EGYPT_Satellite_List() {
        EGYPT_Sat_Obj = new ArrayList<>();
        EGYPT_Sat_Obj.add(new Satellite("39678", "EGYPTSAT 2", "Earth Observation", "Apr-16-2014", R.mipmap.ic_egypt_foreground));
        EGYPT_Sat_Obj.add(new Satellite("36830", "NILESAT 201", "Communication", "Aug-4-2010", R.mipmap.ic_egypt_foreground));
        EGYPT_Sat_Obj.add(new Satellite("31117", "EGYPTSAT 1", "Earth Observation", "Apr-17-2007", R.mipmap.ic_egypt_foreground));
        EGYPT_Sat_Obj.add(new Satellite("26470", "NILESAT 102", "Communication", "Aug-17-2000", R.mipmap.ic_egypt_foreground));
        EGYPT_Sat_Obj.add(new Satellite("25311", "NILESAT", "Communication", "Apr-28-1998", R.mipmap.ic_egypt_foreground));
        return EGYPT_Sat_Obj;
    }

    public List<Satellite> ESTONIA_Satellite_List() {
        ESTONIA_Sat_Obj = new ArrayList<>();
        ESTONIA_Sat_Obj.add(new Satellite("39161", "ESTCUBE 1", "Technology,EO", "May-7-2013", R.mipmap.ic_estonia_foreground));
        return ESTONIA_Sat_Obj;
    }
////france///
    public List<Satellite> FRANCE_Satellite_List() {
        FRANCE_Sat_Obj = new ArrayList<>();
        FRANCE_Sat_Obj.add(new Satellite("43272", "HYLAS 4", "Communication", "Apr-5-2018", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite("43271", "SUPERBIRD 8", "Communication", "Apr-5-2018", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite("43132", "PICSAT", "Astronomy", "Jan-12-2018", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite("42792", "ROBUSTA 1B", "Technology", "Jun-23-2017", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite("42707", "XCUBESAT", "", "Nov-20-1998-", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite("41748", "INTELSAT 33E", "Communication", "Aug-24-2016", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite("41747", "INTELSAT 36", "Communication", "Aug-24-2016", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite("41461", "ASAP-S", "", "Apr-25-2016", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite("41457", "MICROSCOPE", "Science", "Apr-26-2016", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite("40053", "SPOT 7", "Earth Observing", "Jun-30-2014", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite("39019", "PLEIADES 1B", "Earth Observing", "Dec-2-2012", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite("38755", "SPOT 6", "Earth Observing", "Sep-9-2012", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite("38013", "ASAP-S", "", "Dec-17-2011", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite("38012", "PLEIADES 1", "Earth Observing", "Dec-17-2011", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite("38010", "ELISA E12", "ELINT", "Dec-17-2011", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite("38009", "ELISA W23", "ELINT", "Dec-17-2011", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite("38008", "ELISA E24", "ELINT", "Dec-17-2011", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite("38007", "ELISA W11", "ELINT", "Dec-17-2011", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite("36598", "PICARD", "Solar Science", "Jun-15-2010", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite("36124", "HELIOS 2B", "Reconnaissance,Electro-Optical", "Dec-17-2009", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite("33752", "SPIRALE B", "Early Warning", "Feb-12-2009", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite("33751", "SPIRALE A", "Early Warning", "Feb-12-2009", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite("33105", "JASON 2", "Altimetry,Radar", "Jun-20-2008", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite("29678", "COROT", "Astronomy", "Dec-27-2006", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite("29273", "SYRACUSE 3B", "Military communication", "Aug-11-2006", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite("28885", "SYRACUSE 3A", "Military communication", "Oct-3-2005", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite("28545", "MAQSAT/ARIANE 5", "", "Feb-12-2005", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite("28498", "PARASOL", "Science", "Dec-18-2004", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite("28497", "ESSAIM-4", "ELINT", "Dec-18-2004", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite("28496", "ESSAIM-3", "ELINT", "Dec-18-2004", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite("28495", "ESSAIM-2", "ELINT", "Dec-18-2004", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite("28494", "ESSAIM-1", "ELINT", "Dec-18-2004", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite("28492", "HELIOS-2A", "Reconnaissance,Electro-Optical", "Dec-18-2004", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite("28368", "DEMETER", "Science,Ionospheic,Earth Science", "Jun-29-2004", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite("27422", "IDEFIX/ARIANE 42P", "Amateur Comm", "May-4-2002", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite("27421", "SPOT 5", "Earth Observing", "May-4-2002", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite("25978", "CLEMENTINE", "ELINT,Experimental", "Dec-3-1999", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite("25977", "HELIOS 1B", "Reconnaissance,Electro-Optical", "Dec-3-1999", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite("25503", "MAQSAT/ARIANE 5", "", "Oct-21-1998", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite("25260", "SPOT 4", "Earth Observing", "Mar-24-1998", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite("24209", "TELECOM 2D", "Communication", "Aug-8-1996", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite("23730", "TELECOM 2C", "Communication", "Dec-6-1995", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite("23606", "CERISE", "ELINT", "Jul-7-1995", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite("23605", "HELIOS 1A", "Reconnaissance,Electro-Optical", "Jul-7-1995", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite("22824", "STELLA", "Geodesy", "Sep-26-1993", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite("22823", "SPOT 3", "Earth Observing", "Sep-26-1993", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite("22654", "ARSENE", "", "May-12-1993", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite("22078", "S80/T", "Comm,Experimental", "Aug-10-1992", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite("21939", "TELECOM 2B", "Communication", "Apr-15-1992", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite("21813", "TELECOM 2A", "Communication", "Dec-16-1991", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite("21578", "SARA", "Astronomy,Radio", "Jul-17-1991", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite("20705", "TDF 2", "Communication", "Jul-24-1990", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite("20436", "SPOT 2", "Earth Observing", "Jan-22-1990", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite("19621", "TDF 1", "Communication", "Oct-28-1988", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite("18952", "TELECOM 1C", "Communication", "Mar-11-1988", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite("16613", "SPOT 1", "Earth Observing", "Feb-22-1986", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite("15678", "TELECOM 1B", "Communication", "May-8-1985", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite("15159", "TELECOM 1A", "Communication", "Aug-4-1984", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite("12848", "AUREOLE 3", "Science,Magnetosphere", "Sep-21-1981", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite("7646", "STARLETTE", "Geodesy", "Feb-6-1975", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite("7003", "AUREOLE 2", "Science,Magnetosphere", "Dec-26-1973", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite("5729", "AUREOLE 1", "Science,Magnetosphere", "Dec-27-1971", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite("5435", "EOLE 1 (CAS-A)", "Data Relay", "Aug-16-1971", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite("2680", "DIADEME 2", "Geodesy", "Feb-15-1967", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite("2674", "DIADEME 1", "Geodesy", "Feb-8-1967", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite("2016", "DIAPASON (D1-A)", "Science", "Feb-17-1966", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite("1814", "FR 1", "Science,Magnetosphere,Ionosphere", "Dec-6-1965", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite("1778", "A-1(ASTERIX)", "Technology", "Nov-26-1965", R.mipmap.ic_france_foreground));
        return FRANCE_Sat_Obj;
    }

    public List<Satellite> GERMANY_Satellite_List() {
        GERMANY_Sat_Obj = new ArrayList<>();
        GERMANY_Sat_Obj.add(new Satellite("42831", "FLYING LAPTOP", "Technology", "Jul-14-2017", R.mipmap.ic_germany_foreground));
        GERMANY_Sat_Obj.add(new Satellite("42829", "TECHNOSAT", "Technology", "Jul-14-2017", R.mipmap.ic_germany_foreground));
        GERMANY_Sat_Obj.add(new Satellite("42777", "COMPASS 2", "Technology", "Jun-23-2017", R.mipmap.ic_germany_foreground));
        GERMANY_Sat_Obj.add(new Satellite("42701", "SOMP-2", "Technology", "Nov-20-1998", R.mipmap.ic_germany_foreground));
        GERMANY_Sat_Obj.add(new Satellite("41619", "BEESAT 4", "Technology", "Jun-22-2016", R.mipmap.ic_germany_foreground));
        GERMANY_Sat_Obj.add(new Satellite("41604", "BIROS", "Technology", "Jun-22-2016", R.mipmap.ic_germany_foreground));
        GERMANY_Sat_Obj.add(new Satellite("40054", "AISAT", "Tech,Traffic Monitoring", "Jun-30-2014", R.mipmap.ic_germany_foreground));
        GERMANY_Sat_Obj.add(new Satellite("39446", "UWE-3", "Technology", "Nov-21-2013", R.mipmap.ic_germany_foreground));
        GERMANY_Sat_Obj.add(new Satellite("39439", "FIRST-MOVE", "Technology", "Nov-21-2013", R.mipmap.ic_germany_foreground));
        GERMANY_Sat_Obj.add(new Satellite("39435", "WREN", "Technology", "Nov-21-2013", R.mipmap.ic_germany_foreground));
        GERMANY_Sat_Obj.add(new Satellite("39136", "BEESAT 2", "Technology", "Apr-19-2013", R.mipmap.ic_germany_foreground));
        GERMANY_Sat_Obj.add(new Satellite("39135", "BEESAT 3", "Technology", "Apr-19-2013", R.mipmap.ic_germany_foreground));
        GERMANY_Sat_Obj.add(new Satellite("39134", "SOMP", "Technology", "Apr-19-2013", R.mipmap.ic_germany_foreground));
        GERMANY_Sat_Obj.add(new Satellite("38710", "TET-1", "Technology", "Jul-22-2012", R.mipmap.ic_germany_foreground));
        GERMANY_Sat_Obj.add(new Satellite("36605", "TANDEM X", "SAR", "Jun-21-2010", R.mipmap.ic_germany_foreground));
        GERMANY_Sat_Obj.add(new Satellite("36582", "COMSATBW-2", "Military Communication", "May-21-2010", R.mipmap.ic_germany_foreground));
        GERMANY_Sat_Obj.add(new Satellite("35943", "COMSATBW-1", "Military Communication", "Sep-30-2009", R.mipmap.ic_germany_foreground));
        GERMANY_Sat_Obj.add(new Satellite("35936", "RUBIN 9.1/RUBIN 9.2/PSLV", "Tech,Traffic Monitoring", "Sep-23-2009", R.mipmap.ic_germany_foreground));
        GERMANY_Sat_Obj.add(new Satellite("35934", "UWE-2", "Technology", "Sep-23-2009", R.mipmap.ic_germany_foreground));
        GERMANY_Sat_Obj.add(new Satellite("35933", "BEESAT", "Technology", "Sep-23-2009", R.mipmap.ic_germany_foreground));
        GERMANY_Sat_Obj.add(new Satellite("33316", "RAPIDEYE 4", "Earth Observing", "Aug-29-2008", R.mipmap.ic_germany_foreground));
        GERMANY_Sat_Obj.add(new Satellite("33315", "RAPIDEYE 3", "Earth Observing", "Aug-29-2008", R.mipmap.ic_germany_foreground));
        GERMANY_Sat_Obj.add(new Satellite("33314", "RAPIDEYE 1", "Earth Observing", "Aug-29-2008", R.mipmap.ic_germany_foreground));
        GERMANY_Sat_Obj.add(new Satellite("33313", "RAPIDEYE 5", "Earth Observing", "Aug-29-2008", R.mipmap.ic_germany_foreground));
        GERMANY_Sat_Obj.add(new Satellite("33312", "RAPIDEYE 2", "Earth Observing", "Aug-29-2008", R.mipmap.ic_germany_foreground));
        GERMANY_Sat_Obj.add(new Satellite("33244", "SAR LUPE 5", "Reconnaissance,Radar", "Jul-22-2008", R.mipmap.ic_germany_foreground));
        GERMANY_Sat_Obj.add(new Satellite("32792", "RUBIN 8/PSLV", "Tech,Traffic Monitoring", "Apr-28-2008", R.mipmap.ic_germany_foreground));
        GERMANY_Sat_Obj.add(new Satellite("32787", "COMPASS 1", "Technology", "Apr-28-2008", R.mipmap.ic_germany_foreground));
        GERMANY_Sat_Obj.add(new Satellite("32750", "SAR LUPE 4", "Reconnaissance,Radar", "Mar-27-2008", R.mipmap.ic_germany_foreground));
        GERMANY_Sat_Obj.add(new Satellite("32283", "SAR LUPE 3", "Reconnaissance,Radar", "Nov-1-2007", R.mipmap.ic_germany_foreground));
        GERMANY_Sat_Obj.add(new Satellite("31797", "SAR LUPE 2", "Reconnaissance,Radar", "Jul-2-2007", R.mipmap.ic_germany_foreground));
        GERMANY_Sat_Obj.add(new Satellite("31698", "TERRA SAR X", "SAR", "Jun-15-2007", R.mipmap.ic_germany_foreground));
        GERMANY_Sat_Obj.add(new Satellite("29658", "SAR LUPE 1", "Reconnaissance,Radar", "Dec-19-2006", R.mipmap.ic_germany_foreground));
        GERMANY_Sat_Obj.add(new Satellite("28898", "MOZ.5/SAFIR/RUBIN 5/SL-8", "Technology", "Oct-27-2005", R.mipmap.ic_germany_foreground));
        GERMANY_Sat_Obj.add(new Satellite("28892", "UWE-1", "Technology", "Oct-27-2005", R.mipmap.ic_germany_foreground));
        GERMANY_Sat_Obj.add(new Satellite("27940", "RUBIN 4/SL-8", "Technology", "Sep-27-2003", R.mipmap.ic_germany_foreground));
        GERMANY_Sat_Obj.add(new Satellite("27605", "RUBIN 2", "Technology", "Dec-20-2002", R.mipmap.ic_germany_foreground));
        GERMANY_Sat_Obj.add(new Satellite("27561", "RUBIN 3/SL-8", "Technology", "Nov-28-2002", R.mipmap.ic_germany_foreground));
        GERMANY_Sat_Obj.add(new Satellite("27004", "MAROC TUBSAT", "Earth Observing", "Dec-10-2001", R.mipmap.ic_germany_foreground));
        GERMANY_Sat_Obj.add(new Satellite("26959", "BIRD 2", "Tech,EO(Infra-Red)", "Oct-22-2001", R.mipmap.ic_germany_foreground));
        GERMANY_Sat_Obj.add(new Satellite("26609", "AMSAT OSCAR 40", "Amateur Radio Comm", "Nov-16-2000", R.mipmap.ic_germany_foreground));
        GERMANY_Sat_Obj.add(new Satellite("25757", "TUBSAT", "Earth Observing", "May-26-1999", R.mipmap.ic_germany_foreground));
        GERMANY_Sat_Obj.add(new Satellite("25399", "SAFIR 2", "Communication", "Jul-10-1998", R.mipmap.ic_germany_foreground));
        GERMANY_Sat_Obj.add(new Satellite("25068", "EQUATOR S", "Science,Magnetosphere", "Dec-2-1997", R.mipmap.ic_germany_foreground));
        GERMANY_Sat_Obj.add(new Satellite("22970", "TUBSAT B", "Technology", "Jan-25-1994", R.mipmap.ic_germany_foreground));
        GERMANY_Sat_Obj.add(new Satellite("21577", "TUBSAT A", "Technology", "Jul-17-1991", R.mipmap.ic_germany_foreground));
        GERMANY_Sat_Obj.add(new Satellite("20706", "DFS 2", "Communication", "Jul-24-1990", R.mipmap.ic_germany_foreground));
        GERMANY_Sat_Obj.add(new Satellite("20168", "TVSAT 2", "", "Aug-8-1989", R.mipmap.ic_germany_foreground));
        GERMANY_Sat_Obj.add(new Satellite("20041", "DFS 1", "Communication", "Jun-5-1989", R.mipmap.ic_germany_foreground));
        GERMANY_Sat_Obj.add(new Satellite("18570", "TVSAT 1", "", "Nov-21-1987", R.mipmap.ic_germany_foreground));
        GERMANY_Sat_Obj.add(new Satellite("14129", "OSCAR 10", "Amateur Radio Comm", "Jun-16-1983", R.mipmap.ic_germany_foreground));
        GERMANY_Sat_Obj.add(new Satellite("8582", "HELIOS 2", "Solar orbiter", "Jan-15-1976", R.mipmap.ic_germany_foreground));
        GERMANY_Sat_Obj.add(new Satellite("7567", "HELIOS 1", "Solar orbiter", "Dec-10-1974", R.mipmap.ic_germany_foreground));
        GERMANY_Sat_Obj.add(new Satellite("4221", "AZUR (GRS A)", "Research,Ionosphere", "Nov-8-1969", R.mipmap.ic_germany_foreground));
        return GERMANY_Sat_Obj;
    }

    public List<Satellite> GREECE_Satellite_List() {
        GREECE_Sat_Obj = new ArrayList<>();
        GREECE_Sat_Obj.add(new Satellite("42724", "DUTHSAT", "Technology", "Nov-20-1998", R.mipmap.ic_greece_foreground));
        GREECE_Sat_Obj.add(new Satellite("42716", "UPSAT", "Technology", "Nov-20-1998", R.mipmap.ic_greece_foreground));
        GREECE_Sat_Obj.add(new Satellite("27811", "HELLAS-SAT 2", "Communication", "May-13-2003", R.mipmap.ic_greece_foreground));
        GREECE_Sat_Obj.add(new Satellite("22175", "HELLAS SAT 1 (DFS 3)", "Communication", "Oct-12-1992", R.mipmap.ic_greece_foreground));
        return GREECE_Sat_Obj;
    }
////india////
    public List<Satellite> INDIA_Satellite_List() {
        INDIA_Sat_Obj = new ArrayList<>();
        INDIA_Sat_Obj.add(new Satellite("43286", "IRNSS 1I", "", "Apr-11-2018", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite("43241", "GSAT 6A", "", "Mar-29-2018", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite("43128", "MICROSAT-TD", "", "Jan-12-2018", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite("43111", "CARTOSAT 2F", "", "Jan-12-2018", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite("42928", "IRNSS 1H/PSLV", "", "Aug-31-2017", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite("42815", "GSAT 17", "", "Jun-28-2017", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite("42767", "CARTOSAT 2E", "", "Jun-23-2017", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite("42766", "NIUSAT", "", "Jun-23-2017", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite("42747", "GSAT 19", "", "Jun-5-2017", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite("42695", "GSAT 9", "", "May-5-2017", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite("41954", "INS-1B", "", "Feb-15-2017", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite("41949", "INS-1A", "", "Feb-15-2017", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite("41948", "CARTOSAT 2D", "", "Feb-15-2017", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite("41877", "RESOURCESAT 2A", "", "Dec-7-2016", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite("41793", "GSAT 18", "", "Oct-5-2016", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite("41790", "SCATSAT 1", "", "Sep-26-2016", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite("41783", "PRATHAM", "", "Sep-26-2016", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite("41752", "INSAT 3DR", "", "Sep-8-2016", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite("41607", "SWAYAM", "", "Jun-22-2016", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite("41600", "SATHYABAMASAT", "", "Jun-22-2016", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite("41599", "CARTOSAT 2C", "", "Jun-22-2016", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite("41469", "IRNSS 1G", "", "Apr-28-2016", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite("41384", "IRNSS 1F", "", "Mar-10-2016", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite("41241", "IRNSS-1E", "", "Jan-20-2016", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite("41028", "GSAT 15", "", "Nov-10-2015", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite("40930", "ASTROSAT", "", "Sep-28-2015", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite("40880", "GSAT 6", "", "Aug-27-2015", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite("40547", "IRNSS 1D", "", "Mar-28-2015", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite("40332", "GSAT 16", "", "Dec-6-2014", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite("40269", "IRNSS 1C", "", "Oct-15-2014", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite("39635", "IRNSS 1B", "", "Apr-4-2014", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite("39498", "GSAT-14", "", "Jan-5-2014", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite("39370", "MARS ORBITER MISSION", "", "Nov-5-2013", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite("39234", "GSAT-7 (INSAT 4F)", "", "Aug-29-2013", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite("39216", "INSAT 3D", "", "Jul-25-2013", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite("39199", "IRNSS-1A", "", "Jul-1-2013", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite("39086", "SARAL", "", "Feb-25-2013", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite("38779", "GSAT 10", "", "Sep-28-2012", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite("38248", "RISAT 1", "", "Apr-26-2012", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite("37841", "SRMSAT", "", "Oct-12-2011", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite("37839", "JUGNU", "", "Oct-12-2011", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite("37838", "MEGHA-TROPIQUES", "", "Oct-12-2011", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite("37746", "GSAT 12", "", "Jul-15-2011", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite("37605", "GSAT 8", "", "May-20-2011", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite("37388", "YOUTHSAT", "", "Apr-20-2011", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite("37387", "RESOURCESAT 2", "", "Apr-20-2011", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite("36796", "STUDSAT", "", "Jul-12-2010", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite("36795", "CARTOSAT 2B", "", "Jul-12-2010", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite("35931", "OCEANSAT 2", "", "Sep-23-2009", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite("34807", "RISAT-2", "", "Apr-20-2009", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite("33405", "CHANDRAYAAN 1", "", "Oct-22-2008", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite("32786", "IMS-1", "", "Apr-28-2008", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite("32783", "CARTOSAT 2A", "", "Apr-28-2008", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite("32050", "INSAT 4CR", "", "Sept-2-2007", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite("31136", "AAM/PSLV", "", "Apr-23-2007", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite("30793", "INSAT 4B", "", "Mar-11-2007", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite("29710", "CARTOSAT 2AT", "", "Jan-10-2007", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite("28911", "INSAT 4A", "", "Dec-21-2005", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite("28650", "HAMSAT (VO-52)", "", "May-5-2005", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite("28649", "CARTOSAT-1", "", "May-5-2005", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite("28417", "GSAT 3 (EDUSAT)", "", "Sep-20-2004", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite("28051", "IRS P6", "", "Oct-17-2003", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite("27951", "INSAT 3E", "", "Sep-27-2003", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite("27807", "GSAT 2", "", "May-8-2003", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite("27714", "INSAT 3A", "", "Apr-9-2003", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite("27525", "KALPANA 1 (METSAT 1)", "", "Sep-12-2002", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite("27298", "INSAT 3C", "", "Jan-23-2002", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite("26957", "TES", "", "Oct-22-2001", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite("26745", "GSAT 1", "", "Apr-18-2001", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite("26108", "INSAT 3B", "", "Mar-21-2000", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite("25758", "IRS P4 (OCEANSAT 1)", "", "May-26-1999", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite("25666", "INSAT 2E (APR-1)", "", "Apr-2-1999", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite("24971", "IRS 1D", "", "Sep-29-1997", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite("24820", "INSAT 2D", "", "Jun-3-1997", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite("23827", "IRS B3", "", "Mar-21-1996", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite("23751", "IRS 1C", "", "Dec-28-1995", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite("23731", "INSAT 2C", "", "Dec-6-1995", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite("23323", "IRS P2", "", "Oct-15-1994", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite("22724", "INSAT 2B", "", "Jul-22-1993", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite("22027", "INSAT 2A", "", "Jul-9-1992", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite("21894", "INSAT 2R (ARABSAT 1C)", "", "Feb-26-1992", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite("21688", "IRS 1B", "", "Aug-29-1991", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite("20643", "INSAT 1D", "", "Jun-12-1990", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite("19330", "INSAT 1C", "", "Jul-21-1988", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite("18960", "IRS 1A", "", "Mar-17-1988", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite("14318", "INSAT 1B", "", "Aug-30-1983", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite("13129", "INSAT 1A", "", "Apr-10-1982", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite("12545", "APPLE", "", "Jun-19-1981", R.mipmap.ic_india_foreground));
        return INDIA_Sat_Obj;
    }

    public List<Satellite> INDONESIA_Satellite_List() {
        INDONESIA_Sat_Obj = new ArrayList<>();
        INDONESIA_Sat_Obj.add(new Satellite("41944", "TELKOM 3S", "Communication", "Feb-14-2017", R.mipmap.ic_indonesia_foreground));
        INDONESIA_Sat_Obj.add(new Satellite("41603", "LAPAN A3", "EO,Comm:,Traffic Monitoring", "Jun-22-2016", R.mipmap.ic_indonesia_foreground));
        INDONESIA_Sat_Obj.add(new Satellite("41591", "BRISAT", "Communication", "Jun-18-2016", R.mipmap.ic_indonesia_foreground));
        INDONESIA_Sat_Obj.add(new Satellite("40931", "LAPAN A2 (IO-86)", "EO,Comm:,Traffic Monitoring", "Sep-28-2015", R.mipmap.ic_indonesia_foreground));
        INDONESIA_Sat_Obj.add(new Satellite("38744", "TELKOM 3", "Communication", "Aug-6-2012", R.mipmap.ic_indonesia_foreground));
        INDONESIA_Sat_Obj.add(new Satellite("35812", "PALAPA D", "Communication", "Aug-31-2009", R.mipmap.ic_indonesia_foreground));
        INDONESIA_Sat_Obj.add(new Satellite("29709", "LAPAN-TUBSAT", "Earth Observing", "Jan-10-2007", R.mipmap.ic_indonesia_foreground));
        INDONESIA_Sat_Obj.add(new Satellite("28902", "TELKOM 2", "Communication", "Nov-16-2005", R.mipmap.ic_indonesia_foreground));
        INDONESIA_Sat_Obj.add(new Satellite("26089", "GARUDA 1", "Communication", "Feb-12-2000", R.mipmap.ic_indonesia_foreground));
        INDONESIA_Sat_Obj.add(new Satellite("25880", "TELKOM 1", "Communication", "Aug-12-1999", R.mipmap.ic_indonesia_foreground));
        INDONESIA_Sat_Obj.add(new Satellite("25050", "INDOSTAR 1", "Communication", "Nov-11-1997", R.mipmap.ic_indonesia_foreground));
        INDONESIA_Sat_Obj.add(new Satellite("23864", "PALAPA C2", "Communication", "May-16-1996", R.mipmap.ic_indonesia_foreground));
        INDONESIA_Sat_Obj.add(new Satellite("21964", "PALAPA B4", "Communication", "May-14-1992", R.mipmap.ic_indonesia_foreground));
        INDONESIA_Sat_Obj.add(new Satellite("14134", "PALAPA B1", "Communication", "Jun-18-1983", R.mipmap.ic_indonesia_foreground));
        INDONESIA_Sat_Obj.add(new Satellite("9862", "PALAPA 2", "Communication", "Mar-10-1977", R.mipmap.ic_indonesia_foreground));
        INDONESIA_Sat_Obj.add(new Satellite("9009", "PALAPA 1", "Communication", "Jul-8-1976", R.mipmap.ic_indonesia_foreground));
        return INDONESIA_Sat_Obj;
    }

    public List<Satellite> IRAQ_Satellite_List() {
        IRAQ_Sat_Obj = new ArrayList<>();
        IRAQ_Sat_Obj.add(new Satellite("40043", "TIGRISAT", "Earth observation", "Jun-19-2014", R.mipmap.ic_iraq_foreground));
        return IRAQ_Sat_Obj;
    }

    public List<Satellite> IRAN_Satellite_List() {
        IRAN_Sat_Obj = new ArrayList<>();
        IRAN_Sat_Obj.add(new Satellite("28893", "SINAH 1", "Technology", "Oct-27-2005", R.mipmap.ic_iran_foreground));
        return IRAN_Sat_Obj;
    }

    public List<Satellite> ISRAEL_Satellite_List() {
        ISRAEL_Sat_Obj = new ArrayList<>();
        ISRAEL_Sat_Obj.add(new Satellite("42901", "VENUS", "Earth Observation", "Aug-2-2017", R.mipmap.ic_israel_foreground));
        ISRAEL_Sat_Obj.add(new Satellite("42000", "DIDO 2", "Micro-Gravity Research", "Feb-15-2017", R.mipmap.ic_israel_foreground));
        ISRAEL_Sat_Obj.add(new Satellite("41999", "BGUSAT", "Technology", "Feb-15-2017", R.mipmap.ic_israel_foreground));
        ISRAEL_Sat_Obj.add(new Satellite("41759", "OFEQ 11", "Earth Observing", "Sep-13-2016", R.mipmap.ic_israel_foreground));
        ISRAEL_Sat_Obj.add(new Satellite("40021", "DUCHIFAT-1", "Science,Magnetosphere", "Jun-19-2014", R.mipmap.ic_israel_foreground));
        ISRAEL_Sat_Obj.add(new Satellite("39650", "OFEQ 10", "EO(Radar)", "Apr-9-2014", R.mipmap.ic_israel_foreground));
        ISRAEL_Sat_Obj.add(new Satellite("39237", "AMOS-4", "Communication", "Aug-31-2013", R.mipmap.ic_israel_foreground));
        ISRAEL_Sat_Obj.add(new Satellite("37950", "AMOS 5", "Communication", "Dec-11-2011", R.mipmap.ic_israel_foreground));
        ISRAEL_Sat_Obj.add(new Satellite("36608", "OFEQ 9", "Reconnaissance,Optical", "Jun-22-2010", R.mipmap.ic_israel_foreground));
        ISRAEL_Sat_Obj.add(new Satellite("32794", "AMOS 3", "Communication", "Apr-28-2008", R.mipmap.ic_israel_foreground));
        ISRAEL_Sat_Obj.add(new Satellite("32476", "TECSAR", "EO(Radar)", "Jan-21-2008", R.mipmap.ic_israel_foreground));
        ISRAEL_Sat_Obj.add(new Satellite("31601", "OFEQ 7", "Reconnaissance,Optical", "Jun-10-2007", R.mipmap.ic_israel_foreground));
        ISRAEL_Sat_Obj.add(new Satellite("29079", "EROS B", "Earth Observing", "Apr-25-2006", R.mipmap.ic_israel_foreground));
        ISRAEL_Sat_Obj.add(new Satellite("28132", "AMOS 2", "Communication", "Dec-27-2003", R.mipmap.ic_israel_foreground));
        ISRAEL_Sat_Obj.add(new Satellite("27434", "OFEQ 5", "Reconnaissance,Optical", "May-28-2002", R.mipmap.ic_israel_foreground));
        ISRAEL_Sat_Obj.add(new Satellite("25397", "TECHSAT 1B", "Amateur Radio comm:", "Jul-10-1998", R.mipmap.ic_israel_foreground));
        ISRAEL_Sat_Obj.add(new Satellite("23723", "AMOS 5I (ASIASAT 2)", "Communication", "Nov-28-1995", R.mipmap.ic_israel_foreground));
        return ISRAEL_Sat_Obj;
    }

    public List<Satellite> ITALY_Satellite_List() {
        ITALY_Sat_Obj = new ArrayList<>();
        ITALY_Sat_Obj.add(new Satellite("42900", "OPTSAT 3000", "Reconnaissance,Optical", "Aug-2-2017", R.mipmap.ic_italy_foreground));
        ITALY_Sat_Obj.add(new Satellite("42794", "DSAT", "Technology", "Jun-23-2017", R.mipmap.ic_italy_foreground));
        ITALY_Sat_Obj.add(new Satellite("42778", "MAX VALIER SAT", "Astronomy,X-Ray,Tech", "Jun-23-2017", R.mipmap.ic_italy_foreground));
        ITALY_Sat_Obj.add(new Satellite("42776", "URSA MAIOR", "Tech,Thermospheric Research", "Jun-23-2017", R.mipmap.ic_italy_foreground));
        ITALY_Sat_Obj.add(new Satellite("41459", "E-ST@R-II", "Technology", "Apr-25-2016", R.mipmap.ic_italy_foreground));
        ITALY_Sat_Obj.add(new Satellite("40012", "UNISAT 6", "Technology", "Jun-19-2014", R.mipmap.ic_italy_foreground));
        ITALY_Sat_Obj.add(new Satellite("39421", "UNISAT 5", "Technology", "Nov-21-2013", R.mipmap.ic_italy_foreground));
        ITALY_Sat_Obj.add(new Satellite("38078", "ALMASAT-1", "Technology", "Feb-13-2012", R.mipmap.ic_italy_foreground));
        ITALY_Sat_Obj.add(new Satellite("38077", "LARES", "Basic Research,Geodesy", "Feb-13-2012", R.mipmap.ic_italy_foreground));
        ITALY_Sat_Obj.add(new Satellite("37788", "EDUSAT", "Technology", "Aug-17-2011", R.mipmap.ic_italy_foreground));
        ITALY_Sat_Obj.add(new Satellite("37216", "SKYMED 4", "Earth Observing(Radar)", "Nov-6-2010", R.mipmap.ic_italy_foreground));
        ITALY_Sat_Obj.add(new Satellite("34810", "SICRAL 1B", "Military Communication", "Apr-20-2009", R.mipmap.ic_italy_foreground));
        ITALY_Sat_Obj.add(new Satellite("33412", "SKYMED 3", "Earth Observing(Radar)", "Oct-25-2008", R.mipmap.ic_italy_foreground));
        ITALY_Sat_Obj.add(new Satellite("32376", "SKYMED 2", "Earth Observing(Radar)", "Dec-9-2007", R.mipmap.ic_italy_foreground));
        ITALY_Sat_Obj.add(new Satellite("31598", "SKYMED 1", "Earth Observing(Radar)", "Jun-8-2007", R.mipmap.ic_italy_foreground));
        ITALY_Sat_Obj.add(new Satellite("31135", "AGILE", "Astronomy,Gamma", "Apr-23-2007", R.mipmap.ic_italy_foreground));
        ITALY_Sat_Obj.add(new Satellite("28373", "UNISAT 3", "Technology", "Jun-29-2004", R.mipmap.ic_italy_foreground));
        ITALY_Sat_Obj.add(new Satellite("27608", "UNISAT 2", "Technology", "Dec-20-2002", R.mipmap.ic_italy_foreground));
        ITALY_Sat_Obj.add(new Satellite("26694", "SICRAL 1", "Military Communication", "Feb-7-2001", R.mipmap.ic_italy_foreground));
        ITALY_Sat_Obj.add(new Satellite("26547", "UNISAT", "Technology", "Sep-26-2000", R.mipmap.ic_italy_foreground));
        ITALY_Sat_Obj.add(new Satellite("26546", "MEGSAT 1", "Comm:(store forward)", "Sep-26-2000", R.mipmap.ic_italy_foreground));
        ITALY_Sat_Obj.add(new Satellite("24208", "ITALSAT 2", "Communication", "Aug-8-1996", R.mipmap.ic_italy_foreground));
        ITALY_Sat_Obj.add(new Satellite("22828", "KITSAT 2", "", "Sep-26-1993", R.mipmap.ic_italy_foreground));
        ITALY_Sat_Obj.add(new Satellite("22783", "TEMISAT", "Environmental Data Collection & Relay", "Aug-31-1993", R.mipmap.ic_italy_foreground));
        ITALY_Sat_Obj.add(new Satellite("22195", "LAGEOS 2", "Geodesy", "Oct-22-1992", R.mipmap.ic_italy_foreground));
        ITALY_Sat_Obj.add(new Satellite("21055", "ITALSAT 1", "Communication", "Jan-15-1991", R.mipmap.ic_italy_foreground));
        ITALY_Sat_Obj.add(new Satellite("10294", "SIRIO", "Communication", "Aug-25-1977", R.mipmap.ic_italy_foreground));
        return ITALY_Sat_Obj;
    }
////uuuuu////
    public List<Satellite> JAPAN_Satellite_List() {
        JAPAN_Sat_Obj = new ArrayList<>();
        JAPAN_Sat_Obj.add(new Satellite("43495", "IGS R-6", "", "Jun-12-2018", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("43223", "IGS O-6", "", "Feb-27-2018", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("43201", "TRICOM-1R (TASUKI)", "", "Feb-3-2018", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("43152", "ASNARO-2", "", "Jan-17-2018", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("43066", "SLATS", "", "Dec-23-2017", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("43065", "GCOM-C", "", "Dec-23-2017", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("42965", "QZS-4(MICHIBIKI-4)", "", "Oct-9-2017", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("42951", "BSAT-4A", "", "Sep-29-2017", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("42917", "QZS-3(MICHIBIKI-3)", "", "Aug-19-2017", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("42835", "WNISAT 1R", "", "Jul-14-2017", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("42820", "BIRD JJ", "", "Nov-20-1998", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("42769", "CE-SAT 1", "", "Jun-23-2017", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("42738", "QZS-2 (MICHIBIKI-2)", "", "Jun-1-2017", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("42072", "IGS RADAR-5", "", "Mar-7-2017", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("41940", "DSN-2", "", "Jan-24-2017", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("41935", "AOBA-VELOX 3", "", "Nov-20-1998", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("41933", "WASEDA-SAT3", "", "Nov-20-1998", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("41932", "ITF-2", "", "Nov-20-1998", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("41903", "JCSAT 15", "", "Dec-21-2016", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("41896", "ARASE (ERG)", "", "Dec-20-2016", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("41836", "HIMAWARI 9", "", "Nov-2-2016", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("41729", "JCSAT 16", "", "Aug-14-2016", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("41471", "JCSAT-14", "", "May-6-2016", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("41340", "HORYU 4", "", "Feb-17-2016", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("41339", "CHUBUSAT 3", "", "Feb-17-2016", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("41338", "CHUBUSAT 2", "", "Feb-17-2016", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("41337", "ASTRO H", "", "Feb-17-2016", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("40538", "IGS OPTICAL 5", "", "Mar-26-2015", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("40381", "IGS 9A", "", "Feb-1-2015", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("40322", "PROCYON", "", "Dec-3-2014", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("40321", "DESPATCH(ARTSAT 2,FO-81)", "", "Dec-3-2014", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("40320", "SHIN EN 2", "", "Dec-3-2014", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("40319", "HAYABUSA 2", "", "Dec-3-2014", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("40302", "TSUBAME", "", "Nov-6-2014", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("40301", "QSAT-EOS", "", "Nov-6-2014", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("40300", "CHUBUSAT-1", "", "Nov-6-2014", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("40299", "HODOYOSHI-1", "", "Nov-6-2014", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("40298", "ASNARO", "", "Nov-6-2014", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("40267", "HIMAWARI 8", "", "Oct-6-2014", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("40015", "HODOYOSHI 3", "", "Jun-19-2014", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("40011", "HODOYOSHI 4", "", "Jun-19-2014", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("39770", "SPROUT", "", "May-24-2014", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("39769", "RISING 2", "", "May-24-2014", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("39768", "SOCRATES", "", "May-24-2014", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("39767", "UNIFORM 1", "", "May-24-2014", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("39766", "ALOS 2", "", "May-24-2014", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("39574", "GPM", "", "Feb-27-2014", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("39423", "WNISAT 1", "", "Nov-21-2013", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("39253", "SPRINT-A (HISAKI)", "", "Sep-14-2013", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("39062", "IGS 8B (DEMO)", "", "Jan-27-2013", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("39061", "IGS 8A", "", "Jan-27-2013", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("38756", "PROITERES", "", "Sep-9-2012", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("38340", "HORYU 2", "", "May-17-2012", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("38339", "SDS-4", "", "May-17-2012", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("38337", "GCOM W1", "", "May-17-2012", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("38331", "JCSAT 13", "", "May-15-2012", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("37954", "IGS 7A", "", "Dec-12-2011", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("37813", "IGS 6A", "", "Sep-23-2011", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("37776", "BSAT-3C", "", "Aug-6-2011", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("37207", "BSAT-3B", "", "Oct-28-2010", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("37158", "QZS-1 (MICHIBIKI)", "", "Sep-11-2010", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("36588", "SERVIS 2", "", "Jun-2-2010", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("36578", "UNITEC-1", "", "May-20-2010", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("36577", "IKAROS", "", "May-20-2010", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("36576", "AKATSUKI (PLANET-C)", "", "May-20-2010", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("36104", "IGS 5A", "", "Nov-28-2009", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("35755", "JCSAT 12", "", "Aug-21-2009", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("33499", "KKS-1 (KISEKI)", "", "Jan-23-2009", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("33498", "STARS (KUKAI)", "", "Jan-23-2009", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("33497", "SDS-1", "", "Jan-23-2009", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("33496", "SOHLA-1 (MAIDO-1)", "", "Jan-23-2009", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("33495", "KAGAYAKI", "", "Jan-23-2009", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("33494", "SPRITE-SAT (RISING)", "", "Jan-23-2009", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("33493", "PRISM (HITOMI)", "", "Jan-23-2009", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("33492", "GOSAT (IBUKI)", "", "Jan-23-2009", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("33274", "SUPERBIRD 7", "", "Aug-14-2008", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("32791", "SEEDS", "", "Apr-28-2008", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("32785", "CUTE-1.7+APD II", "", "Apr-28-2008", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("32500", "WINDS (KIZUNA)", "", "Feb-23-2008", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("32019", "BSAT-3A", "", "Aug-14-2007", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("29656", "ETS 8", "", "Dec-18-2006", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("29479", "HINODE (SOLAR B)", "", "Sep-22-2006", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("29272", "JCSAT 10", "", "Aug-11-2006", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("29045", "JCSAT 9", "", "Apr-12-2006", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("28939", "ASTRO F (AKARI)", "", "Feb-21-2006", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("28937", "MTSAT-2", "", "Feb-18-2006", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("28931", "ALOS", "", "Jan-24-2006", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("28895", "CUBESAT XI-V", "", "Oct-27-2005", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("28810", "INDEX", "", "Aug-23-2005", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("28809", "OICETS", "", "Aug-23-2005", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("28773", "ASTRO E2", "", "Jul-10-2005", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("28622", "MTSAT-1R", "", "Feb-26-2005", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("28455", "RITE TARGET 2", "", "Dec-14-2002", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("28454", "RITE TARGET 1", "", "Dec-14-2002", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("28218", "SUPERBIRD 6", "", "Apr-16-2004", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("28184", "MBSAT", "", "Mar-13-2004", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("28060", "SERVIS 1", "", "Oct-30-2003", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("27848", "CUBESAT XI-IV", "", "Jun-30-2003", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("27844", "CUTE-1", "", "Jun-30-2003", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("27830", "BSAT-2C", "", "Jun-11-2003", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("27600", "MICRO LABSAT", "", "Dec-14-2002", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("27599", "WEOS", "", "Dec-14-2002", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("27597", "ADEOS 2", "", "Dec-14-2002", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("27516", "DRTS", "", "Sep-10-2002", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("27461", "NSTAR C", "", "Jul-5-2002", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("27399", "JCSAT 8", "", "Mar-29-2002", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("27368", "DASH/VEP 3", "", "Feb-4-2002", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("27367", "MDS 1", "", "Feb-4-2002", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("26898", "LRE", "", "Aug-29-2001", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("26720", "BSAT-2A", "", "Mar-8-2001", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("26559", "NSAT 110", "", "Oct-6-2000", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("26095", "SUPERBIRD 4", "", "Feb-18-2000", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("25630", "JCSAT 6", "", "Feb-16-1999", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("25424", "ETS 7 TARGET", "", "Nov-27-1997", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("25383", "NOZOMI (PLANET-B)", "", "Jul-3-1998", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("25312", "BSAT-1B", "", "Apr-28-1998", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("25175", "COMETS", "", "Feb-21-1998", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("25067", "JCSAT 5", "", "Dec-2-1997", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("24880", "SUPERBIRD C", "", "Jul-28-1997", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("24769", "BSAT-1A", "", "Apr-16-1997", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("24720", "HALCA (MUSES B)", "", "Feb-12-1997", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("24278", "JAS 2 (FO-29)", "", "Aug-17-1996", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("24277", "ADEOS", "", "Aug-17-1996", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("23781", "NSTAR B", "", "Feb-5-1996", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("23651", "NSTAR A", "", "Aug-29-1995", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("23649", "JCSAT 3", "", "Aug-29-1995", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("23522", "HIMAWARI 5 (GMS 5)", "", "Mar-18-1995", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("23230", "ETS 6", "", "Aug-28-1994", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("23176", "BS-3N", "", "Jul-8-1994", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("22979", "VEP", "", "Feb-3-1994", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("22253", "SUPERBIRD A1", "", "Dec-1-1992", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("22049", "GEOTAIL", "", "Jul-24-1992", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("21893", "SUPERBIRD B1", "", "Feb-26-1992", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("21668", "BS-3B (YURI 3B)", "", "Aug-25-1991", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("20771", "BS-3A (YURI 3A)", "", "Aug-28-1990", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("20618", "HAGOROMO", "", "Jan-24-1990", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("20480", "JAS 1B (FUJI 2)", "", "Feb-7-1990", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("20479", "DEBUT (ORIZURU)", "", "Feb-7-1990", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("20478", "MOS 1B (MOMO 1B)", "", "Feb-7-1990", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("20402", "JCSAT 2", "", "Jan-1-1990", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("20217", "HIMAWARI 4 (GMS 4)", "", "Sep-5-1989", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("20040", "SUPERBIRD A", "", "Jun-5-1989", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("19874", "JCSAT 1", "", "Mar-6-1989", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("19822", "EXOS D (AKEBONO)", "", "Feb-21-1989", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("19508", "CS 3B", "", "Sep-16-1988", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("18877", "CS 3A", "", "Feb-19-1988", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("18316", "KIKU 5 (ETS 5)", "", "Aug-27-1987", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("17527", "MOS 1A (MOMO 1)", "", "Feb-19-1987", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("16909", "JAS 1 (FUJI 1)", "", "Aug-12-1986", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("16908", "EGS (AJISAI)", "", "Aug-12-1986", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("16597", "BS-2B (YURI 2B)", "", "Feb-12-1986", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("15967", "SUISEI", "", "Aug-18-1985", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("15464", "SAKIGAKE", "", "Jan-7-1985", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("15152", "HIMAWARI 3 (GMS 3)", "", "Aug-2-1984", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("14659", "YURI 2A (BS-2A)", "", "Jan-23-1984", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("14248", "SAKURA 2B (CS-2B)", "", "Aug-5-1983", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("13782", "SAKURA 2A (CS-2A)", "", "Feb-4-1983", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("13492", "KIKU 4 (ETS 3)", "", "Sep-3-1982", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("12677", "HIMAWARI 2 (GMS 2)", "", "Aug-10-1981", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("12295", "KIKU 3 (ETS 4)", "", "Feb-11-1981", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("11715", "AYAME 2 (ECS-2)", "", "Feb-22-1980", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("11261", "AYAME 1 (ECS 1)", "", "Feb-6-1979", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("10792", "YURI (BSE)", "", "Apr-7-1978", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("10674", "UME 2 (ISS-B)", "", "Feb-16-1978", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("10664", "KYOKKO 1 (EXOS A)", "", "Feb-4-1978", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("10516", "SAKURA 1A (CS-1A)", "", "Dec-15-1977", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("10143", "HIMAWARI 1 (GMS 1)", "", "Jul-14-1977", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("9852", "KIKU 2 (ETS 2)", "", "Feb-23-1977", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("9841", "TANSEI 3 (MS-T3)", "", "Feb-19-1977", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("8709", "UME 1 (ISS 1)", "", "Feb-29-1976", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("8197", "KIKU 1 (ETS 1)", "", "Sep-9-1975", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("5485", "SHINSEI (MS-F2)", "", "Sep-28-1971", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite("4952", "TANSEI 1 (MS-T1)", "", "Feb-16-1971", R.mipmap.ic_japan_foreground));
        return JAPAN_Sat_Obj;
    }

    public List<Satellite> KAZAKHSTAN_Satellite_List() {
        KAZAKHSTAN_Sat_Obj = new ArrayList<>();
        KAZAKHSTAN_Sat_Obj.add(new Satellite("42016", "AL-FARABI 1", "Education,Tech", "Feb-15-2017", R.mipmap.ic_kazakhstan_foreground));
        KAZAKHSTAN_Sat_Obj.add(new Satellite("40010", "KAZEOSAT 2", "Earth Observation", "Jun-19-2014", R.mipmap.ic_kazakhstan_foreground));
        KAZAKHSTAN_Sat_Obj.add(new Satellite("39731", "KAZEOSAT 1", "Earth Observation", "Apr-30-2014", R.mipmap.ic_kazakhstan_foreground));
        KAZAKHSTAN_Sat_Obj.add(new Satellite("39728", "KAZSAT 3", "Communication", "Apr-28-2014", R.mipmap.ic_kazakhstan_foreground));
        KAZAKHSTAN_Sat_Obj.add(new Satellite("37749", "KAZSAT 2", "Communication", "Jul-15-2011", R.mipmap.ic_kazakhstan_foreground));
        KAZAKHSTAN_Sat_Obj.add(new Satellite("29230", "KAZSAT 1", "Communication", "Jun-17-2006", R.mipmap.ic_kazakhstan_foreground));
        return KAZAKHSTAN_Sat_Obj;
    }

    public List<Satellite> KENIA_Satellite_List() {
        KENIA_Sat_Obj = new ArrayList<>();
        KENIA_Sat_Obj.add(new Satellite("43467", "1KUNS-PE", "Technology", "Nov-30-1998", R.mipmap.ic_kenya_foreground));
        return KENIA_Sat_Obj;
    }

    public List<Satellite> LAOS_Satellite_List() {
        LAOS_Sat_Obj = new ArrayList<>();
        LAOS_Sat_Obj.add(new Satellite("41034", "LAOSAT 1", "Communication", "Nov-20-2015", R.mipmap.ic_laos_foreground));
        return LAOS_Sat_Obj;
    }

    public List<Satellite> LATVIA_Satellite_List() {
        LATVIA_Sat_Obj = new ArrayList<>();
        LATVIA_Sat_Obj.add(new Satellite("42791", "VENTA 1", "Technology", "June-23-2017", R.mipmap.ic_latvia_foreground));
        return LATVIA_Sat_Obj;
    }

    public List<Satellite> LITHUANIA_Satellite_List() {
        LITHUANIA_Sat_Obj = new ArrayList<>();
        LITHUANIA_Sat_Obj.add(new Satellite("42768", "LITUANICASAT 2", "Technology,Education", "Jun-23-2017", R.mipmap.ic_lithuania_foreground));
        return LITHUANIA_Sat_Obj;
    }

    public List<Satellite> LUXEMBOURG_Satellite_List() {
        LUXEMBOURG_Sat_Obj = new ArrayList<>();
        LUXEMBOURG_Sat_Obj.add(new Satellite("37840", "VESSELSAT 1", "Traffic Monitoring", "Oct-12-2011", R.mipmap.ic_luxembourg_foreground));
        LUXEMBOURG_Sat_Obj.add(new Satellite("23331", "ASTRA 1D", "Communication(DB)", "Nov-1-1994", R.mipmap.ic_luxembourg_foreground));
        LUXEMBOURG_Sat_Obj.add(new Satellite("21139", "ASTRA 1B", "Communication(DB)", "Mar-2-1991", R.mipmap.ic_luxembourg_foreground));
        LUXEMBOURG_Sat_Obj.add(new Satellite("19688", "ASTRA 1A", "Communication(DB)", "Dec-11-1988", R.mipmap.ic_luxembourg_foreground));
        return LUXEMBOURG_Sat_Obj;
    }

    public List<Satellite> MALAYSIA_Satellite_List() {
        MALAYSIA_Sat_Obj = new ArrayList<>();
        MALAYSIA_Sat_Obj.add(new Satellite("40147", "MEASAT 3B", "Communication", "Sep-11-2014", R.mipmap.ic_malaysia_foreground));
        MALAYSIA_Sat_Obj.add(new Satellite("35578", "RAZAKSAT", "Earth Observation", "Jul-14-2009", R.mipmap.ic_malaysia_foreground));
        MALAYSIA_Sat_Obj.add(new Satellite("35362", "MEASAT 3A", "Communication", "Jun-21-2009", R.mipmap.ic_malaysia_foreground));
        MALAYSIA_Sat_Obj.add(new Satellite("29648", "MEASAT 3", "Communication", "Dec-11-2006", R.mipmap.ic_malaysia_foreground));
        MALAYSIA_Sat_Obj.add(new Satellite("26548", "TIUNGSAT 1", "", "Sep-26-2000", R.mipmap.ic_malaysia_foreground));
        MALAYSIA_Sat_Obj.add(new Satellite("24653", "MEASAT 2", "Communication", "Nov-13-1996", R.mipmap.ic_malaysia_foreground));
        MALAYSIA_Sat_Obj.add(new Satellite("23765", "AFRICASAT 1(MEASAT 1)", "", "Jan-12-1996", R.mipmap.ic_malaysia_foreground));
        return MALAYSIA_Sat_Obj;
    }

    public List<Satellite> MEXICO_Satellite_List() {
        MEXICO_Sat_Obj = new ArrayList<>();
        MEXICO_Sat_Obj.add(new Satellite("40946", "MORELOS 3", "Communication", "Oct-2-2015", R.mipmap.ic_mexico_foreground));
        MEXICO_Sat_Obj.add(new Satellite("40664", "SKY MEXICO-1", "Communication", "May-27-2015", R.mipmap.ic_mexico_foreground));
        MEXICO_Sat_Obj.add(new Satellite("39122", "SATMEX 8", "Communication", "Mar-26-2013", R.mipmap.ic_mexico_foreground));
        MEXICO_Sat_Obj.add(new Satellite("39035", "MEXSAT 3", "Communication", "Dec-19-2012", R.mipmap.ic_mexico_foreground));
        MEXICO_Sat_Obj.add(new Satellite("37826", "QUETZSAT 1", "Communication", "Sep-29-2011", R.mipmap.ic_mexico_foreground));
        MEXICO_Sat_Obj.add(new Satellite("29162", "SATMEX 6", "Communication", "May-27-2006", R.mipmap.ic_mexico_foreground));
        MEXICO_Sat_Obj.add(new Satellite("25558", "SATMEX 5", "Communication", "Dec-6-1998", R.mipmap.ic_mexico_foreground));
        MEXICO_Sat_Obj.add(new Satellite("24305", "UNAMSAT", "Technology", "Sep-5-1996", R.mipmap.ic_mexico_foreground));
        MEXICO_Sat_Obj.add(new Satellite("23313", "SOLIDARIDAD 2", "Communication", "Oct-8-1994", R.mipmap.ic_mexico_foreground));
        MEXICO_Sat_Obj.add(new Satellite("22911", "SOLIDARIDAD 1", "Communication", "Nov-20-1993", R.mipmap.ic_mexico_foreground));
        MEXICO_Sat_Obj.add(new Satellite("16274", "MORELOS 2", "Communication", "Nov-27-1985", R.mipmap.ic_mexico_foreground));
        MEXICO_Sat_Obj.add(new Satellite("15824", "MORELOS 1", "Communication", "Jun-17-1985", R.mipmap.ic_mexico_foreground));
        return MEXICO_Sat_Obj;
    }

    public List<Satellite> MOROCCO_Satellite_List() {
        MOROCCO_Sat_Obj = new ArrayList<>();
        MOROCCO_Sat_Obj.add(new Satellite("43005", "MOHAMMED VI-A", "Reconnaissance,Optical", "Nov-8-2017", R.mipmap.ic_morocco_foreground));
        return MOROCCO_Sat_Obj;
    }

    public List<Satellite> NETHERLANDS_Satellite_List() {
        NETHERLANDS_Sat_Obj = new ArrayList<>();
        NETHERLANDS_Sat_Obj.add(new Satellite("42015", "PEASSS", "Technology", "Feb-15-2017", R.mipmap.ic_netherlands_foreground));
        NETHERLANDS_Sat_Obj.add(new Satellite("39428", "DELFI-N3XT", "Technology", "Nov-21-2013", R.mipmap.ic_netherlands_foreground));
        NETHERLANDS_Sat_Obj.add(new Satellite("32789", "DELFI C3", "Technology", "Apr-28-2008", R.mipmap.ic_netherlands_foreground));
        NETHERLANDS_Sat_Obj.add(new Satellite("24957", "NSS 5(INTELSAT 803)", "Communication", "Sep-23-1997", R.mipmap.ic_netherlands_foreground));
        NETHERLANDS_Sat_Obj.add(new Satellite("21989", "NSS K(INTELSAT K)", "Communication", "Jun-10-1992", R.mipmap.ic_netherlands_foreground));
        NETHERLANDS_Sat_Obj.add(new Satellite("19121", "NSS 513(INTELSAT 513)", "Communication", "May-17-1988", R.mipmap.ic_netherlands_foreground));
        return NETHERLANDS_Sat_Obj;
    }

    public List<Satellite> NIGERIA_Satellite_List() {
        NIGERIA_Sat_Obj = new ArrayList<>();
        NIGERIA_Sat_Obj.add(new Satellite("42824", "BIRD NN", "Technology", "Nov-20-1998", R.mipmap.ic_nigeria_foreground));
        NIGERIA_Sat_Obj.add(new Satellite("38014", "NIGCOMSAT 1R", "Communication", "Dec-19-2011", R.mipmap.ic_nigeria_foreground));
        NIGERIA_Sat_Obj.add(new Satellite("37790", "NIGERIASAT X", "Training,EO", "Aug-17-2011", R.mipmap.ic_nigeria_foreground));
        NIGERIA_Sat_Obj.add(new Satellite("37789", "NIGERIASAT 2", "Earth Observation", "Aug-17-2011", R.mipmap.ic_nigeria_foreground));
        NIGERIA_Sat_Obj.add(new Satellite("31395", "NIGCOMSAT 1", "Communication", "May-13-2007", R.mipmap.ic_nigeria_foreground));
        NIGERIA_Sat_Obj.add(new Satellite("27941", "NIGERIASAT 1", "Earth Observation", "Sep-27-2003", R.mipmap.ic_nigeria_foreground));
        return NIGERIA_Sat_Obj;
    }

    public List<Satellite> NORTH_KOREA_Satellite_List() {
        NORTH_KOREA_Sat_Obj = new ArrayList<>();
        NORTH_KOREA_Sat_Obj.add(new Satellite("41332", "KMS-4", "Earth Observation", "Feb-7-2016", R.mipmap.ic_north_korea_foreground));
        NORTH_KOREA_Sat_Obj.add(new Satellite("39026", "KMS 3-2", "EO,Technology", "Dec-12-2012", R.mipmap.ic_north_korea_foreground));
        return NORTH_KOREA_Sat_Obj;
    }

    public List<Satellite> NORWAY_Satellite_List() {
        NORWAY_Sat_Obj = new ArrayList<>();
        NORWAY_Sat_Obj.add(new Satellite("40613", "THOR 7", "Communication", "Apr-26-2015", R.mipmap.ic_norway_foreground));
        NORWAY_Sat_Obj.add(new Satellite("40075", "AISSAT 2", "Traffic Monitoring", "Jul-8-2014", R.mipmap.ic_norway_foreground));
        NORWAY_Sat_Obj.add(new Satellite("39445", "HINCUBE", "Technology", "Nov-21-2013", R.mipmap.ic_norway_foreground));
        NORWAY_Sat_Obj.add(new Satellite("36797", "AISSAT 1", "Traffic Monitoring", "Jul-12-2010", R.mipmap.ic_norway_foreground));
        NORWAY_Sat_Obj.add(new Satellite("36033", "THOR 6", "Communication", "Oct-29-2009", R.mipmap.ic_norway_foreground));
        NORWAY_Sat_Obj.add(new Satellite("32487", "THOR 5", "Communication", "Feb-11-2008", R.mipmap.ic_norway_foreground));
        NORWAY_Sat_Obj.add(new Satellite("25358", "THOR 3", "Communication", "Jun-10-1998", R.mipmap.ic_norway_foreground));
        NORWAY_Sat_Obj.add(new Satellite("24808", "THOR 2A", "Communication", "May-20-1997", R.mipmap.ic_norway_foreground));
        NORWAY_Sat_Obj.add(new Satellite("20762", "THOR 1(MARCOPOLO 2)", "Communication(DB)", "Aug-18-1990", R.mipmap.ic_norway_foreground));
        return NORWAY_Sat_Obj;
    }

    public List<Satellite> PAKISTAN_Satellite_List() {
        PAKISTAN_Sat_Obj = new ArrayList<>();
        PAKISTAN_Sat_Obj.add(new Satellite("39432", "ICUBE 1", "Technology", "Nov-21-2013", R.mipmap.ic_pakistan_foreground));
        PAKISTAN_Sat_Obj.add(new Satellite("37779", "PAKSAT 1R", "Communication", "Aug-11-2011", R.mipmap.ic_pakistan_foreground));
        PAKISTAN_Sat_Obj.add(new Satellite("27003", "BADR B", "Technology", "Dec-10-2001", R.mipmap.ic_pakistan_foreground));
        PAKISTAN_Sat_Obj.add(new Satellite("23779", "PAKSAT 1(ANATOLIA 1)", "Communication", "Feb-1-1996", R.mipmap.ic_pakistan_foreground));
        return PAKISTAN_Sat_Obj;
    }

    public List<Satellite> PERU_Satellite_List() {
        PERU_Sat_Obj = new ArrayList<>();
        PERU_Sat_Obj.add(new Satellite("41770", "PERUSAT 1", "Earth Observation", "Sep-16-2016", R.mipmap.ic_peru_foreground));
        PERU_Sat_Obj.add(new Satellite("39442", "PUCP-SAT 1", "Technology", "Nov-21-2013", R.mipmap.ic_peru_foreground));
        return PERU_Sat_Obj;
    }

    public List<Satellite> PHILIPPINES_Satellite_List() {
        PHILIPPINES_Sat_Obj = new ArrayList<>();
        PHILIPPINES_Sat_Obj.add(new Satellite("41463", "DIWATA-1", "Earth Observation", "Nov-20-1998", R.mipmap.ic_philippines_foreground));
        PHILIPPINES_Sat_Obj.add(new Satellite("17706", "AGILA 1(PALAPA B2P)", "Communication", "Mar-20-1987", R.mipmap.ic_philippines_foreground));
        return PHILIPPINES_Sat_Obj;
    }

    public List<Satellite> POLAND_Satellite_List() {
        POLAND_Sat_Obj = new ArrayList<>();
        POLAND_Sat_Obj.add(new Satellite("40119", "BRITE-PL 2", "Astronomy", "Aug-19-2014", R.mipmap.ic_poland_foreground));
        POLAND_Sat_Obj.add(new Satellite("39431", "BRITE-PL", "", "Nov-21-2013", R.mipmap.ic_poland_foreground));
        return POLAND_Sat_Obj;
    }

    public List<Satellite> PORTUGAL_Satellite_List() {
        PORTUGAL_Sat_Obj = new ArrayList<>();
        PORTUGAL_Sat_Obj.add(new Satellite("22829", "POSAT 1", "GPS", "Sep-26-1993", R.mipmap.ic_portugal_foreground));
        PORTUGAL_Sat_Obj.add(new Satellite("22826", "ITAMSAT", "Radio", "Sep-26-1993", R.mipmap.ic_portugal_foreground));
        return PORTUGAL_Sat_Obj;
    }
///full ////
    public List<Satellite> RUSSIA_Satellite_List() {
        RUSSIA_Sat_Obj=new ArrayList<>();
        RUSSIA_Sat_Obj.add(new Satellite("43537","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("43508","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("43493","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("43432","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("43243","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("43238","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("43211","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("43181","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("43180","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("43032","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("42986","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("42939","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("42919","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("42912","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("42911","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("42910","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("42907","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("42830","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("42825","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("42798","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("42719","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("41579","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("41554","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("41466","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("41465","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("41464","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("41394","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("41386","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("41330","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("41191","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("41121","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("41105","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("41099","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("41032","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("40922","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("40921","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("40920","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("40895","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("40699","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("40555","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("40554","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("40553","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("40552","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("40505","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("40420","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("40360","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("40358","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("40355","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("40345","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("40315","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("40296","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("40277","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("40258","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("40073","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("40071","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("40070","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("40069","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("40063","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("40062","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("40061","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("40039","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("40037","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("40017","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("40001","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("39765","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("39763","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("39762","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("39761","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("39727","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("39620","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("39613","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("39612","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("39497","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("39492","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("39491","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("39490","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("39487","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("39485","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("39484","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("39483","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("39375","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("39251","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("39250","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("39249","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("39194","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("39186","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("39177","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("39155","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("39133","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("39059","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("39058","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("39057","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("39022","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("38995","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("38978","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("38977","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("38745","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("38736","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("38735","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("38734","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("38733","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("38711","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("38707","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("38101","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("37951","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("37938","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("37869","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("37868","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("37867","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("37829","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("37806","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("37794","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("37755","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("37398","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("37372","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("37344","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("37212","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("37170","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("37154","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("37153","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("37152","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("37139","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("37138","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("37137","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("36519","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("36402","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("36401","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("36400","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("36358","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("36113","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("36112","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("36111","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("36095","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("35871","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("35869","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("35868","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("35867","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("35866","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("35865","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("35636","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("35635","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("35500","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("35499","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("35498","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("35008","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("34264","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("33596","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("33595","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("33504","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("33468","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("33467","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("33466","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("33380","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("33379","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("33378","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("33272","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("33108","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("32956","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("32955","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("32954","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("32953","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("32478","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("32395","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("32394","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("32393","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("32373","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("32277","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("32276","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("32275","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("32268","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("32052","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("31792","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("29672","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("29671","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("29670","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("29668","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("29260","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("29228","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("28917","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("28916","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("28915","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("28909","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("28908","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("28822","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("28707","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("28629","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("28523","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("28521","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("28510","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("28509","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("28508","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("28463","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("28420","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("28419","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("28380","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("28352","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("28234","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("28194","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("28114","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("28113","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("28112","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("28094","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("28089","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("27944","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("27939","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("27869","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("27868","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("27840","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("27818","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("27775","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("27619","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("27618","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("27617","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("27560","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("27534","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("27470","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("27465","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("27464","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("27441","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("27436","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("27060","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("27059","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("27058","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("27057","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("27056","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("27055","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("27005","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("27002","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("27001","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("26989","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("26988","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("26987","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("26936","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("26892","","","",R.mipmap.ic_russia_foreground));
        RUSSIA_Sat_Obj.add(new Satellite("000000","","","",R.mipmap.ic_russia_foreground));
        return RUSSIA_Sat_Obj;
    }

    public List<Satellite> SAUDI_ARABIA_Satellite_List() {
        SAUDI_ARABIA_Sat_Obj = new ArrayList<>();
        SAUDI_ARABIA_Sat_Obj.add(new Satellite("40016", "SAUDISAT 4", "Technology", "Jun-19-2014", R.mipmap.ic_saudi_arabia_foreground));
        SAUDI_ARABIA_Sat_Obj.add(new Satellite("31127", "SAUDICOMSAT 4", "Technology", "Apr-17-2007", R.mipmap.ic_saudi_arabia_foreground));
        SAUDI_ARABIA_Sat_Obj.add(new Satellite("31125", "SAUDICOMSAT 3", "Technology", "Apr-17-2007", R.mipmap.ic_saudi_arabia_foreground));
        SAUDI_ARABIA_Sat_Obj.add(new Satellite("31124", "SAUDICOMSAT 5", "Technology", "Apr-17-2007", R.mipmap.ic_saudi_arabia_foreground));
        SAUDI_ARABIA_Sat_Obj.add(new Satellite("31121", "SAUDICOMSAT 6", "Technology", "Apr-17-2007", R.mipmap.ic_saudi_arabia_foreground));
        SAUDI_ARABIA_Sat_Obj.add(new Satellite("31119", "SAUDICOMSAT 7", "Technology", "Apr-17-2007", R.mipmap.ic_saudi_arabia_foreground));
        SAUDI_ARABIA_Sat_Obj.add(new Satellite("31118", "SAUDISAT 3", "Tech:,Earth Observation", "Apr-17-2007", R.mipmap.ic_saudi_arabia_foreground));
        SAUDI_ARABIA_Sat_Obj.add(new Satellite("28371", "SAUDISAT 2", "Technology", "Jun-29-2004", R.mipmap.ic_saudi_arabia_foreground));
        SAUDI_ARABIA_Sat_Obj.add(new Satellite("28370", "SAUDICOMSAT 2", "Technology", "Jun-29-2004", R.mipmap.ic_saudi_arabia_foreground));
        SAUDI_ARABIA_Sat_Obj.add(new Satellite("28369", "SAUDICOMSAT 1", "Technology", "Jun-29-2004", R.mipmap.ic_saudi_arabia_foreground));
        SAUDI_ARABIA_Sat_Obj.add(new Satellite("27607", "SAUDISAT 1C", "Technology", "Dec-20-2002", R.mipmap.ic_saudi_arabia_foreground));
        SAUDI_ARABIA_Sat_Obj.add(new Satellite("26549", "SAUDISAT 1B", "Technology", "Sep-26-2000", R.mipmap.ic_saudi_arabia_foreground));
        SAUDI_ARABIA_Sat_Obj.add(new Satellite("26545", "SAUDISAT 1A", "Technology", "Sep-26-2000", R.mipmap.ic_saudi_arabia_foreground));
        return SAUDI_ARABIA_Sat_Obj;
    }

    public List<Satellite> SINGAPORE_Satellite_List() {
        SINGAPORE_Sat_Obj = new ArrayList<>();
        SINGAPORE_Sat_Obj.add(new Satellite("41171", "VELOX 2", "Technology", "Dec-16-2015", R.mipmap.ic_singapore_foreground));
        SINGAPORE_Sat_Obj.add(new Satellite("41170", "GALASSIA", "Technology", "Dec-16-2015", R.mipmap.ic_singapore_foreground));
        SINGAPORE_Sat_Obj.add(new Satellite("41169", "TELEOS 1", "Earth Observation", "Dec-16-2015", R.mipmap.ic_singapore_foreground));
        SINGAPORE_Sat_Obj.add(new Satellite("41168", "ATHENOXAT-1", "Technology", "Dec-16-2015", R.mipmap.ic_singapore_foreground));
        SINGAPORE_Sat_Obj.add(new Satellite("41167", "KENT RIDGE 1", "Earth Observation", "Dec-16-2015", R.mipmap.ic_singapore_foreground));
        SINGAPORE_Sat_Obj.add(new Satellite("41166", "VELOX C1", "Technology", "Dec-16-2015", R.mipmap.ic_singapore_foreground));
        SINGAPORE_Sat_Obj.add(new Satellite("40057", "VELOX 1", "Technology", "Jun-30-2014", R.mipmap.ic_singapore_foreground));
        SINGAPORE_Sat_Obj.add(new Satellite("40028", "POPSAT HIP 1", "Technology", "Jun-19-2014", R.mipmap.ic_singapore_foreground));
        SINGAPORE_Sat_Obj.add(new Satellite("39438", "VELOX-P 2", "Technology", "Nov-21-2013", R.mipmap.ic_singapore_foreground));
        SINGAPORE_Sat_Obj.add(new Satellite("37389", "XSAT", "Earth Observation,Tech:", "Apr-20-2011", R.mipmap.ic_singapore_foreground));
        return SINGAPORE_Sat_Obj;
    }

    public List<Satellite> SLOVAKIA_Satellite_List() {
        SLOVAKIA_Sat_Obj = new ArrayList<>();
        SLOVAKIA_Sat_Obj.add(new Satellite("42789", "SKCUBE", "Education,Technology", "Jun-23-2017", R.mipmap.ic_slovakia_foreground));
        return SLOVAKIA_Sat_Obj;
    }

    public List<Satellite> SOUTH_AFRICA_Satellite_List() {
        SOUTH_AFRICA_Sat_Obj = new ArrayList<>();
        SOUTH_AFRICA_Sat_Obj.add(new Satellite("42726", "NSIGHT-1", "Technology,Atmosphere,EO", "Nov-20-1998", R.mipmap.ic_south_africa_foreground));
        SOUTH_AFRICA_Sat_Obj.add(new Satellite("42713", "ZA-AEROSAT", "Technology,Atmosphere", "Nov-20-1998", R.mipmap.ic_south_africa_foreground));
        SOUTH_AFRICA_Sat_Obj.add(new Satellite("40353", "KONDOR E", "Earth observation,Radar", "Dec-19-2014", R.mipmap.ic_south_africa_foreground));
        SOUTH_AFRICA_Sat_Obj.add(new Satellite("39417", "ZACUBE", "Technology", "Nov-21-2013", R.mipmap.ic_south_africa_foreground));
        SOUTH_AFRICA_Sat_Obj.add(new Satellite("35870", "SUMBANDILA", "Experimental", "Sep-17-2009", R.mipmap.ic_south_africa_foreground));
        SOUTH_AFRICA_Sat_Obj.add(new Satellite("25636", "SUNSAT", "Experimental", "Feb-23-1999", R.mipmap.ic_south_africa_foreground));
        return SOUTH_AFRICA_Sat_Obj;
    }

    public List<Satellite> SOUTH_KOREA_Satellite_List() {
        SOUTH_KOREA_Sat_Obj = new ArrayList<>();
        SOUTH_KOREA_Sat_Obj.add(new Satellite("43138", "STEP CUBE LAB", "Technology", "Jan-12-2018", R.mipmap.ic_south_korea_foreground));
        SOUTH_KOREA_Sat_Obj.add(new Satellite("42984", "KOREASAT-5A", "Communication", "Oct-30-2017", R.mipmap.ic_south_korea_foreground));
        SOUTH_KOREA_Sat_Obj.add(new Satellite("42733", "SNUSAT-1B", "Tech,Research", "Nov-20-1998", R.mipmap.ic_south_korea_foreground));
        SOUTH_KOREA_Sat_Obj.add(new Satellite("42727", "SNUSAT-1", "Tech,Research", "Nov-20-1998", R.mipmap.ic_south_korea_foreground));
        SOUTH_KOREA_Sat_Obj.add(new Satellite("42714", "LINK", "Tech,Research", "Nov-20-1998", R.mipmap.ic_south_korea_foreground));
        SOUTH_KOREA_Sat_Obj.add(new Satellite("42691", "KOREASAT 7", "Communication", "May-4-2017", R.mipmap.ic_south_korea_foreground));
        SOUTH_KOREA_Sat_Obj.add(new Satellite("40536", "KOMPSAT 3A", "Earth Observing", "Mar-25-2015", R.mipmap.ic_south_korea_foreground));
        SOUTH_KOREA_Sat_Obj.add(new Satellite("39426", "CINEMA 3", "Research,Magnetosphere", "Nov-21-2013", R.mipmap.ic_south_korea_foreground));
        SOUTH_KOREA_Sat_Obj.add(new Satellite("39422", "STSAT 3", "Tech,Astronomy,EO", "Nov-21-2013", R.mipmap.ic_south_korea_foreground));
        SOUTH_KOREA_Sat_Obj.add(new Satellite("39227", "KOMPSAT 5", "EO,Radar", "Aug-22-2013", R.mipmap.ic_south_korea_foreground));
        SOUTH_KOREA_Sat_Obj.add(new Satellite("39068", "STSAT 2C", "Tech,Astronomy", "Jan-30-2013", R.mipmap.ic_south_korea_foreground));
        SOUTH_KOREA_Sat_Obj.add(new Satellite("38338", "KOMPSAT 3", "Earth Observing", "May-17-2012", R.mipmap.ic_south_korea_foreground));
        SOUTH_KOREA_Sat_Obj.add(new Satellite("37265", "KOREASAT 6", "Communication", "Dec-29-2010", R.mipmap.ic_south_korea_foreground));
        SOUTH_KOREA_Sat_Obj.add(new Satellite("36744", "COMS 1", "Meteorology,OM,comm", "Jun-26-2010", R.mipmap.ic_south_korea_foreground));
        SOUTH_KOREA_Sat_Obj.add(new Satellite("29349", "KOREASAT 5", "Communication", "Aug-22-2006", R.mipmap.ic_south_korea_foreground));
        SOUTH_KOREA_Sat_Obj.add(new Satellite("29268", "KOMPSAT 2", "Earth Observing", "Jul-28-2006", R.mipmap.ic_south_korea_foreground));
        SOUTH_KOREA_Sat_Obj.add(new Satellite("27945", "KAISTSAT 4", "Tech,Astronomy", "Sep-27-2003", R.mipmap.ic_south_korea_foreground));
        SOUTH_KOREA_Sat_Obj.add(new Satellite("26032", "KOMPSAT", "Earth Observing", "Dec-21-1999", R.mipmap.ic_south_korea_foreground));
        SOUTH_KOREA_Sat_Obj.add(new Satellite("25894", "ABS-7(KOREASAT 3)", "Communication", "Sep-4-1999", R.mipmap.ic_south_korea_foreground));
        SOUTH_KOREA_Sat_Obj.add(new Satellite("25756", "KITSAT 3", "Technology", "May-26-1999", R.mipmap.ic_south_korea_foreground));
        SOUTH_KOREA_Sat_Obj.add(new Satellite("23768", "ABS-1A(KOREASAT 2)", "Communication", "Jan-14-1996", R.mipmap.ic_south_korea_foreground));
        SOUTH_KOREA_Sat_Obj.add(new Satellite("23639", "KOREASAT 1", "Communication", "Aug-5-1995", R.mipmap.ic_south_korea_foreground));
        SOUTH_KOREA_Sat_Obj.add(new Satellite("22825", "EYESAT-1", "Communication", "Sep-26-1993", R.mipmap.ic_south_korea_foreground));
        SOUTH_KOREA_Sat_Obj.add(new Satellite("22077", "OSCAR 23(KITSAT 1)", "EO,Technology", "Aug-10-1992", R.mipmap.ic_south_korea_foreground));
        return SOUTH_KOREA_Sat_Obj;
    }

    public List<Satellite> SPAIN_Satellite_List() {
        SPAIN_Sat_Obj = new ArrayList<>();
        SPAIN_Sat_Obj.add(new Satellite("43228", "HISPASAT 30W-6", "Communication", "Mar-6-2018", R.mipmap.ic_spain_foreground));
        SPAIN_Sat_Obj.add(new Satellite("43215", "PAZ", "SAR", "Feb-22-2018", R.mipmap.ic_spain_foreground));
        SPAIN_Sat_Obj.add(new Satellite("42934", "AMAZONAS 5", "Communication", "Sep-11-2017", R.mipmap.ic_spain_foreground));
        SPAIN_Sat_Obj.add(new Satellite("42728", "QBITO", "Tech,Research", "Nov-20-1998", R.mipmap.ic_spain_foreground));
        SPAIN_Sat_Obj.add(new Satellite("41942", "HISPASAT 36W-1", "Communication", "Jan-28-2017", R.mipmap.ic_spain_foreground));
        SPAIN_Sat_Obj.add(new Satellite("41732", "3CAT-2", "Technology", "Aug-15-2016", R.mipmap.ic_spain_foreground));
        SPAIN_Sat_Obj.add(new Satellite("40013", "DEIMOS 2", "Earth Observation", "Jun-19-2014", R.mipmap.ic_spain_foreground));
        SPAIN_Sat_Obj.add(new Satellite("39616", "AMAZONAS 4A", "Communication", "Mar-22-2014", R.mipmap.ic_spain_foreground));
        SPAIN_Sat_Obj.add(new Satellite("39433", "HUMSAT D", "Technology", "Nov-21-2013", R.mipmap.ic_spain_foreground));
        SPAIN_Sat_Obj.add(new Satellite("39420", "OPTOS", "Technology", "Nov-21-2013", R.mipmap.ic_spain_foreground));
        SPAIN_Sat_Obj.add(new Satellite("39078", "AMAZONAS 3", "Communication", "Feb-7-2013", R.mipmap.ic_spain_foreground));
        SPAIN_Sat_Obj.add(new Satellite("37264", "HISPASAT 1E", "Communication", "Dec-29-2010", R.mipmap.ic_spain_foreground));
        SPAIN_Sat_Obj.add(new Satellite("35942", "AMAZONAS 2", "Communication", "Sep-30-2009", R.mipmap.ic_spain_foreground));
        SPAIN_Sat_Obj.add(new Satellite("35685", "NANOSAT 1B", "Science", "Jul-29-2009", R.mipmap.ic_spain_foreground));
        SPAIN_Sat_Obj.add(new Satellite("35681", "DEIMOS 1", "Earth Observation", "Jul-29-2009", R.mipmap.ic_spain_foreground));
        SPAIN_Sat_Obj.add(new Satellite("28945", "SPAINSAT", "Communication", "Mar-11-2006", R.mipmap.ic_spain_foreground));
        SPAIN_Sat_Obj.add(new Satellite("28493", "NANOSAT(1)", "Science", "Dec-18-2004", R.mipmap.ic_spain_foreground));
        SPAIN_Sat_Obj.add(new Satellite("28393", "AMAZONAS", "Communication", "Aug-4-2004", R.mipmap.ic_spain_foreground));
        SPAIN_Sat_Obj.add(new Satellite("27528", "HISPASAT 1D", "Communication", "Sep-18-2002", R.mipmap.ic_spain_foreground));
        SPAIN_Sat_Obj.add(new Satellite("26071", "HISPASAT 1C", "Communication", "Feb-3-2000", R.mipmap.ic_spain_foreground));
        SPAIN_Sat_Obj.add(new Satellite("23607", "UPM/LBSAT", "Technology", "Jul-7-1995", R.mipmap.ic_spain_foreground));
        SPAIN_Sat_Obj.add(new Satellite("22723", "HISPASAT 1B", "Communication", "Jul-22-1993", R.mipmap.ic_spain_foreground));
        SPAIN_Sat_Obj.add(new Satellite("22116", "HISPASAT 1A", "Communication", "Sep-10-1992", R.mipmap.ic_spain_foreground));
        SPAIN_Sat_Obj.add(new Satellite("7531", "INTASAT", "Science,Ionosphere", "Nov-15-1974", R.mipmap.ic_spain_foreground));
        return SPAIN_Sat_Obj;
    }

    public List<Satellite> SWEDEN_Satellite_List() {
        SWEDEN_Sat_Obj = new ArrayList<>();
        SWEDEN_Sat_Obj.add(new Satellite("42708", "QBEE50-LTU-OC", "Tech:,Thermospheric Research", "Nov-20-1998", R.mipmap.ic_sweden_foreground));
        SWEDEN_Sat_Obj.add(new Satellite("36827", "PRISMA(TANGO)", "Technology", "Jun-15-2010", R.mipmap.ic_sweden_foreground));
        SWEDEN_Sat_Obj.add(new Satellite("36599", "PRISMA(MANGO)", "Technology", "Jun-15-2010", R.mipmap.ic_sweden_foreground));
        SWEDEN_Sat_Obj.add(new Satellite("26702", "ODIN", "Science,Astronomy,Aeronomy", "Feb-20-2001", R.mipmap.ic_sweden_foreground));
        SWEDEN_Sat_Obj.add(new Satellite("26621", "MUNIN", "Scientific", "Nov-21-2000", R.mipmap.ic_sweden_foreground));
        SWEDEN_Sat_Obj.add(new Satellite("25568", "ASTRID 2", "Science", "Dec-10-1998", R.mipmap.ic_sweden_foreground));
        SWEDEN_Sat_Obj.add(new Satellite("25049", "SIRIUS 2(GE-1E)", "Communication", "Nov-11-1997", R.mipmap.ic_sweden_foreground));
        SWEDEN_Sat_Obj.add(new Satellite("23464", "ASTRID", "Science", "Jan-24-1995", R.mipmap.ic_sweden_foreground));
        SWEDEN_Sat_Obj.add(new Satellite("22161", "FREJA", "Research,Magnetospheric", "Oct-6-1992", R.mipmap.ic_sweden_foreground));
        SWEDEN_Sat_Obj.add(new Satellite("20193", "SIRIUS W(MARCOPOLO 1)", "", "Aug-27-1989", R.mipmap.ic_sweden_foreground));
        SWEDEN_Sat_Obj.add(new Satellite("19919", "TELE-X", "Communication", "Apr-2-1989", R.mipmap.ic_sweden_foreground));
        SWEDEN_Sat_Obj.add(new Satellite("16614", "VIKING", "Science,Magnetosphere", "Feb-22-1986", R.mipmap.ic_sweden_foreground));
        return SWEDEN_Sat_Obj;
    }

    public List<Satellite> TAIWAN_Satellite_List() {
        TAIWAN_Sat_Obj = new ArrayList<>();
        TAIWAN_Sat_Obj.add(new Satellite("42920", "FORMOSAT-5", "Earth Observing", "Aug-24-2017", R.mipmap.ic_taiwan_foreground));
        TAIWAN_Sat_Obj.add(new Satellite("40022", "PACE", "Technology", "Jun-19-2014", R.mipmap.ic_taiwan_foreground));
        TAIWAN_Sat_Obj.add(new Satellite("29052", "FORMOSAT 3F", "Earth Observing", "Apr-15-2006", R.mipmap.ic_taiwan_foreground));
        TAIWAN_Sat_Obj.add(new Satellite("29051", "FORMOSAT 3E", "Earth Observing", "Apr-15-2006", R.mipmap.ic_taiwan_foreground));
        TAIWAN_Sat_Obj.add(new Satellite("29050", "FORMOSAT 3D", "Earth Observing", "Apr-15-2006", R.mipmap.ic_taiwan_foreground));
        TAIWAN_Sat_Obj.add(new Satellite("29049", "FORMOSAT 3C", "Earth Observing", "Apr-15-2006", R.mipmap.ic_taiwan_foreground));
        TAIWAN_Sat_Obj.add(new Satellite("29048", "FORMOSAT 3B", "Earth Observing", "Apr-15-2006", R.mipmap.ic_taiwan_foreground));
        TAIWAN_Sat_Obj.add(new Satellite("29047", "FORMOSAT 3A", "Earth Observing", "Apr-15-2006", R.mipmap.ic_taiwan_foreground));
        TAIWAN_Sat_Obj.add(new Satellite("28254", "ROCSAT 2", "Earth Observing,Science", "May-20-2004", R.mipmap.ic_taiwan_foreground));
        TAIWAN_Sat_Obj.add(new Satellite("25616", "ROCSAT 1", "Earth Observing, Science", "Jan-27-1999", R.mipmap.ic_taiwan_foreground));
        return TAIWAN_Sat_Obj;
    }

    public List<Satellite> THAILAND_Satellite_List() {
        THAILAND_Sat_Obj = new ArrayList<>();
        THAILAND_Sat_Obj.add(new Satellite("41552", "THAICOM 8", "Communication", "May-27-2016", R.mipmap.ic_thailand_foreground));
        THAILAND_Sat_Obj.add(new Satellite("39500", "THAICOM 6", "Communication", "Jan-6-2014", R.mipmap.ic_thailand_foreground));
        THAILAND_Sat_Obj.add(new Satellite("33396", "THEOS", "Earth Observing", "Oct-1-2008", R.mipmap.ic_thailand_foreground));
        THAILAND_Sat_Obj.add(new Satellite("29163", "THAICOM 5", "Communication", "May-27-2006", R.mipmap.ic_thailand_foreground));
        THAILAND_Sat_Obj.add(new Satellite("28786", "IPSTAR 1", "Communication", "Aug-11-2005", R.mipmap.ic_thailand_foreground));
        THAILAND_Sat_Obj.add(new Satellite("25396", "TMSAT", "Technology", "Jul-10-1998", R.mipmap.ic_thailand_foreground));
        THAILAND_Sat_Obj.add(new Satellite("24768", "THAICOM 3", "Communication", "Apr-16-1997", R.mipmap.ic_thailand_foreground));
        THAILAND_Sat_Obj.add(new Satellite("23314", "THAICOM 2", "Communication", "Oct-8-1994", R.mipmap.ic_thailand_foreground));
        THAILAND_Sat_Obj.add(new Satellite("22931", "THAICOM 1", "Communication", "Dec-18-1993", R.mipmap.ic_thailand_foreground));
        return THAILAND_Sat_Obj;
    }

    public List<Satellite> TURKEY_Satellite_List() {
        TURKEY_Sat_Obj = new ArrayList<>();
        TURKEY_Sat_Obj.add(new Satellite("43466", "UBAKUSAT", "Technology,Comm:", "Nov-30-1998", R.mipmap.ic_turkey_foreground));
        TURKEY_Sat_Obj.add(new Satellite("42736", "BEEAGLESAT", "Tech:,Atmospheric Science", "Nov-20-1998", R.mipmap.ic_turkey_foreground));
        TURKEY_Sat_Obj.add(new Satellite("42700", "HAVELSAT", "Tech:,Atmospheric Science", "Nov-20-1998", R.mipmap.ic_turkey_foreground));
        TURKEY_Sat_Obj.add(new Satellite("41875", "GOKTURK-1A", "Reconnaissance,Optical", "Dec-5-2016", R.mipmap.ic_turkey_foreground));
        TURKEY_Sat_Obj.add(new Satellite("40984", "TURKSAT 4B", "Communication", "Oct-16-2015", R.mipmap.ic_turkey_foreground));
        TURKEY_Sat_Obj.add(new Satellite("39522", "TURKSAT 4A", "Communication", "Feb-14-2014", R.mipmap.ic_turkey_foreground));
        TURKEY_Sat_Obj.add(new Satellite("39152", "TURKSAT 3U", "Technology,Comm:", "Apr-26-2013", R.mipmap.ic_turkey_foreground));
        TURKEY_Sat_Obj.add(new Satellite("39030", "GOKTURK 2", "Reconnaissance,Optical", "Dec-18-2012", R.mipmap.ic_turkey_foreground));
        TURKEY_Sat_Obj.add(new Satellite("37791", "RASAT", "Earth Observation", "Aug-17-2011", R.mipmap.ic_turkey_foreground));
        TURKEY_Sat_Obj.add(new Satellite("35935", "ITUPSAT 1", "Technology", "Sep-23-2009", R.mipmap.ic_turkey_foreground));
        TURKEY_Sat_Obj.add(new Satellite("33056", "TURKSAT 3A", "Communication", "Jun-12-2008", R.mipmap.ic_turkey_foreground));
        TURKEY_Sat_Obj.add(new Satellite("27943", "BILSAT 1", "Earth Observation", "Sep-27-2003", R.mipmap.ic_turkey_foreground));
        TURKEY_Sat_Obj.add(new Satellite("26666", "TURKSAT 2A", "Communication", "Jan-10-2001", R.mipmap.ic_turkey_foreground));
        TURKEY_Sat_Obj.add(new Satellite("23949", "TURKSAT 1C", "Communication", "Jul-9-1996", R.mipmap.ic_turkey_foreground));
        TURKEY_Sat_Obj.add(new Satellite("23200", "TURKSAT 1B", "Communication", "Aug-10-1994", R.mipmap.ic_turkey_foreground));
        return TURKEY_Sat_Obj;
    }

    public List<Satellite> UNITED_ARAB_EMIRATES_Satellite_List() {
        UNITED_ARAB_EMIRATES_Sat_Obj = new ArrayList<>();
        UNITED_ARAB_EMIRATES_Sat_Obj.add(new Satellite("43174", "AL YAH 3", "Communication", "Jan-25-2018", R.mipmap.ic_united_arab_emirates_foreground));
        UNITED_ARAB_EMIRATES_Sat_Obj.add(new Satellite("42017", "NAYIF (EO-88)", "Technology,Education", "Feb-15-2017", R.mipmap.ic_united_arab_emirates_foreground));
        UNITED_ARAB_EMIRATES_Sat_Obj.add(new Satellite("39419", "DUBSAISAT 2", "Earth Observation,Tech:", "Nov-21-2013", R.mipmap.ic_united_arab_emirates_foreground));
        UNITED_ARAB_EMIRATES_Sat_Obj.add(new Satellite("38245", "YAHSAT 1B", "Communication", "Apr-23-2012", R.mipmap.ic_united_arab_emirates_foreground));
        UNITED_ARAB_EMIRATES_Sat_Obj.add(new Satellite("37393", "YAHSAT 1A", "Communication", "Apr-22-2011", R.mipmap.ic_united_arab_emirates_foreground));
        UNITED_ARAB_EMIRATES_Sat_Obj.add(new Satellite("35682", "DUBAISAT 1", "Earth Observation,Tech:", "Jul-29-2009", R.mipmap.ic_united_arab_emirates_foreground));
        UNITED_ARAB_EMIRATES_Sat_Obj.add(new Satellite("32404", "THURAYA 3", "Communication", "Jan-15-2008", R.mipmap.ic_united_arab_emirates_foreground));
        UNITED_ARAB_EMIRATES_Sat_Obj.add(new Satellite("27825", "THURAYA 2", "Communication", "Jun-10-2003", R.mipmap.ic_united_arab_emirates_foreground));
        UNITED_ARAB_EMIRATES_Sat_Obj.add(new Satellite("26578", "THURAYA 1", "Communication", "Oct-21-2000", R.mipmap.ic_united_arab_emirates_foreground));
        return UNITED_ARAB_EMIRATES_Sat_Obj;
    }

    public List<Satellite> UNITED_KINGDOM_Satellite_List() {
        UNITED_KINGDOM_Sat_Obj = new ArrayList<>();
        UNITED_KINGDOM_Sat_Obj.add(new Satellite("43510", "REMOVEDEBRIS", "Technology", "Nov-20-1998", R.mipmap.ic_united_kingdom_foreground));
        UNITED_KINGDOM_Sat_Obj.add(new Satellite("43115", "CARBONITE 2", "Technology,EO", "Jan-12-2018", R.mipmap.ic_united_kingdom_foreground));
        UNITED_KINGDOM_Sat_Obj.add(new Satellite("42765", "UCLSAT", "Technology,Atmosphere", "Jun-23-2017", R.mipmap.ic_united_kingdom_foreground));
        UNITED_KINGDOM_Sat_Obj.add(new Satellite("40719", "DEORBITSAIL", "Technology", "Jul-10-2015", R.mipmap.ic_united_kingdom_foreground));
        UNITED_KINGDOM_Sat_Obj.add(new Satellite("40718", "CARBONITE 1(CBNT-1)", "Technology,EO", "Jul-10-2015", R.mipmap.ic_united_kingdom_foreground));
        UNITED_KINGDOM_Sat_Obj.add(new Satellite("40717", "DMC 3-FM3", "Earth Observation", "Jul-10-2015", R.mipmap.ic_united_kingdom_foreground));
        UNITED_KINGDOM_Sat_Obj.add(new Satellite("40716", "DMC 3-FM2", "Earth Observation", "Jul-10-2015", R.mipmap.ic_united_kingdom_foreground));
        UNITED_KINGDOM_Sat_Obj.add(new Satellite("40715", "DMC 3-FM1", "Earth Observation", "Jul-10-2015", R.mipmap.ic_united_kingdom_foreground));
        UNITED_KINGDOM_Sat_Obj.add(new Satellite("40076", "TDS 1", "Technology", "Jul-8-2014", R.mipmap.ic_united_kingdom_foreground));
        UNITED_KINGDOM_Sat_Obj.add(new Satellite("40074", "UKUBE 1", "Technology", "Jul-8-2014", R.mipmap.ic_united_kingdom_foreground));
        UNITED_KINGDOM_Sat_Obj.add(new Satellite("39444", "FUNCUBE 1(AO-73)", "Amateur Radio Comm:", "Nov-21-2013", R.mipmap.ic_united_kingdom_foreground));
        UNITED_KINGDOM_Sat_Obj.add(new Satellite("39427", "TRITON 1", "Technology", "Nov-21-2013", R.mipmap.ic_united_kingdom_foreground));
        UNITED_KINGDOM_Sat_Obj.add(new Satellite("39090", "STRAND 1", "Technology", "Feb-25-2013", R.mipmap.ic_united_kingdom_foreground));
        UNITED_KINGDOM_Sat_Obj.add(new Satellite("39034", "SKYNET 5D", "Military Communication", "Dec-19-2012", R.mipmap.ic_united_kingdom_foreground));
        UNITED_KINGDOM_Sat_Obj.add(new Satellite("38741", "HYLAS 2", "Communication", "Aug-2-2012", R.mipmap.ic_united_kingdom_foreground));
        UNITED_KINGDOM_Sat_Obj.add(new Satellite("37237", "HYLAS 1", "Communication", "Nov-26-2010", R.mipmap.ic_united_kingdom_foreground));
        UNITED_KINGDOM_Sat_Obj.add(new Satellite("35683", "DMC 2", "Earth Observation", "Jul-29-2009", R.mipmap.ic_united_kingdom_foreground));
        UNITED_KINGDOM_Sat_Obj.add(new Satellite("33055", "SKYNET 5C", "Military Communication", "Jun-12-2008", R.mipmap.ic_united_kingdom_foreground));
        UNITED_KINGDOM_Sat_Obj.add(new Satellite("32294", "SKYNET 5B", "Military Communication", "Nov-14-2007", R.mipmap.ic_united_kingdom_foreground));
        UNITED_KINGDOM_Sat_Obj.add(new Satellite("30794", "SKYNET 5A", "Military Communication", "Mar-11-2007", R.mipmap.ic_united_kingdom_foreground));
        UNITED_KINGDOM_Sat_Obj.add(new Satellite("28891", "TOPSAT", "Earth Observation", "Oct-27-2005", R.mipmap.ic_united_kingdom_foreground));
        UNITED_KINGDOM_Sat_Obj.add(new Satellite("27942", "UK-DMC", "", "Sep-27-2003", R.mipmap.ic_united_kingdom_foreground));
        UNITED_KINGDOM_Sat_Obj.add(new Satellite("26695", "SKYNET 4F", "Military Communication", "Feb-7-2001", R.mipmap.ic_united_kingdom_foreground));
        UNITED_KINGDOM_Sat_Obj.add(new Satellite("26611", "STRV 1D", "Technology", "Nov-16-2000", R.mipmap.ic_united_kingdom_foreground));
        UNITED_KINGDOM_Sat_Obj.add(new Satellite("26610", "STRV 1C", "Technology", "Nov-16-2000", R.mipmap.ic_united_kingdom_foreground));
        UNITED_KINGDOM_Sat_Obj.add(new Satellite("26386", "SNAP 1", "Technology", "Jun-28-2000", R.mipmap.ic_united_kingdom_foreground));
        UNITED_KINGDOM_Sat_Obj.add(new Satellite("25693", "OSCAR 36(UOSAT 12)", "Earth Observing,Radio Comm:", "Apr-21-1999", R.mipmap.ic_united_kingdom_foreground));
        UNITED_KINGDOM_Sat_Obj.add(new Satellite("25639", "SKYNET 4E", "Military Communication", "Feb-26-1999", R.mipmap.ic_united_kingdom_foreground));
        UNITED_KINGDOM_Sat_Obj.add(new Satellite("25134", "SKYNET 4D", "Military Communication", "Jan-10-1998", R.mipmap.ic_united_kingdom_foreground));
        UNITED_KINGDOM_Sat_Obj.add(new Satellite("23126", "STRV 1B", "", "Jun-17-1994", R.mipmap.ic_united_kingdom_foreground));
        UNITED_KINGDOM_Sat_Obj.add(new Satellite("23125", "STRV 1A", "", "Jun-17-1994", R.mipmap.ic_united_kingdom_foreground));
        UNITED_KINGDOM_Sat_Obj.add(new Satellite("21575", "OSCAR 22(UoSAT 5)", "", "Jun-17-1994", R.mipmap.ic_united_kingdom_foreground));
        UNITED_KINGDOM_Sat_Obj.add(new Satellite("20776", "SKYNET 4C", "Military Communication", "Aug-30-1990", R.mipmap.ic_united_kingdom_foreground));
        UNITED_KINGDOM_Sat_Obj.add(new Satellite("20438", "OSCAR 15(UOSAT 4)", "Radio,Comm:,Tech:", "Jan-22-1990", R.mipmap.ic_united_kingdom_foreground));
        UNITED_KINGDOM_Sat_Obj.add(new Satellite("20437", "OSCAR 14(UOSAT 3)", "Radio,Comm:,Tech:", "Jan-22-1990", R.mipmap.ic_united_kingdom_foreground));
        UNITED_KINGDOM_Sat_Obj.add(new Satellite("20401", "SKYNET 4A", "Military Communication", "Jan-1-1990", R.mipmap.ic_united_kingdom_foreground));
        UNITED_KINGDOM_Sat_Obj.add(new Satellite("19687", "SKYNET 4B", "Military Communication", "Dec-11-1988", R.mipmap.ic_united_kingdom_foreground));
        UNITED_KINGDOM_Sat_Obj.add(new Satellite("14781", "OSCAR 11(UoSAT 2)", "Radio Comm:", "Mar-1-1984", R.mipmap.ic_united_kingdom_foreground));
        UNITED_KINGDOM_Sat_Obj.add(new Satellite("7547", "SKYNET 2B", "Military Communication", "Nov-23-1974", R.mipmap.ic_united_kingdom_foreground));
        UNITED_KINGDOM_Sat_Obj.add(new Satellite("7213", "MIRANDA (X-4)", "Technology", "Mar-9-1974", R.mipmap.ic_united_kingdom_foreground));
        UNITED_KINGDOM_Sat_Obj.add(new Satellite("5580", "PROSPERO(BLACK ARROW)", "Technology", "Oct-28-1971", R.mipmap.ic_united_kingdom_foreground));
        UNITED_KINGDOM_Sat_Obj.add(new Satellite("4493", "SKYNET 1B", "Military Communication", "Aug-19-1970", R.mipmap.ic_united_kingdom_foreground));
        UNITED_KINGDOM_Sat_Obj.add(new Satellite("4250", "SKYNET 1", "Military Communication", "Nov-22-1969", R.mipmap.ic_united_kingdom_foreground));
        return UNITED_KINGDOM_Sat_Obj;
    }
////iiii////
    public List<Satellite> USA_Satellite_List() {
        USA_Sat_Obj = new ArrayList<>();
        USA_Sat_Obj.add(new Satellite("43522", "DRAGON CRS-15", "ISS Resupply", "June 29, 2018", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("43482", "IRIDIUM 162", "Comm: Traffic Monitoring", "May-22-2018", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("43481", "IRIDIUM 110", "Comm: Traffic Monitoring", "May-22-2018", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("43480", "IRIDIUM 147", "Comm: Traffic Monitoring", "May-22-2018", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("43479", "IRIDIUM 152", "Comm: Traffic Monitoring", "May-22-2018", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("43478", "IRIDIUM 161", "Comm: Traffic Monitoring", "May-22-2018", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("43477", "GRACE-FO 2", "Gravity Field Mapping", "May-22-2018", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("43476", "GRACE-FO 1", "Gravity Field Mapping", "May-22-2018", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("43474", "CYGNUS OA-9", "IIS logistic", "May-21-2018", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("43465", "USA 287", "Technology", "Apr-14-2018", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("43459", "MARCO-B", "Comm: Data relay", "May-5-2018", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("43458", "MARCO-A", "Comm: Data relay", "May-5-2018", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("43457", "INSIGHT", "", "May 5, 2018", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("43446", "USA 286", "Technology", "Apr-14-2018", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("43445", "USA 285", "Technology", "Apr-14-2018", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("43435", "TESS", "Astronomy,Visible", "Apr-18-2018", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("43340", "USA 284", "Technology", "Apr-14-2018", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("43339", "USA 283", "Communication", "Apr-14-2018", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("43258", "IRIDIUM 143", "Comm: Traffic Monitoring", "Mar-30-2018", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("43257", "IRIDIUM 150", "Comm: Traffic Monitoring", "Mar-30-2018", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("43256", "IRIDIUM 142", "Comm: Traffic Monitoring", "Mar-30-2018", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("43255", "IRIDIUM 148", "Comm: Traffic Monitoring", "Mar-30-2018", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("43254", "IRIDIUM 146", "Comm: Traffic Monitoring", "Mar-30-2018", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("43253", "IRIDIUM 145", "Comm: Traffic Monitoring", "Mar-30-2018", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("43252", "IRIDIUM 140", "Comm: Traffic Monitoring", "Mar-30-2018", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("43251", "IRIDIUM 157", "Comm: Traffic Monitoring", "Mar-30-2018", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("43250", "IRIDIUM 149", "Comm: Traffic Monitoring", "Mar-30-2018", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("43249", "IRIDIUM 144", "Comm: Traffic Monitoring", "Mar-30-2018", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("43229", "PODSAT", "Technology", "Mar-6-2018", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("43226", "GOES 17", "Meteorology", "Mar-1-2018", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("43217", "TINTIN B", "Comm: Experimental", "Feb-22-2018", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("43216", "TINTIN A", "", "Feb-22-2018", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("43205", "TESLA ROADSTER", "Vehicle evaluation", "Feb-6-2018", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("43185", "LEMUR 2 THENICKMOLO", "", "Feb-1-2018", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("43184", "LEMUR 2 KADI", "", "Feb-1-2018", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("43183", "LEMUR 2 URAMCHANSOL", "", "Feb-1-2018", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("43182", "LEMUR 2 JIN-LUEN", "", "Feb-1-2018", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("43167", "LEMUR 2 TALLHAMN-ATC", "", "Jan-21-2018", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("43165", "LEMUR 2 MARSHALL", "", "Jan-21-2018", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("43163", "DOVE PIONEER", "", "Jan-21-2018", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("43162", "SBIRS GEO 4(USA 282)", "Early Warning", "Jan-20-2018", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("43145", "USA 281", "FIA-Radar", "Jan-12-2018", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("43144", "TYVAK-61C", "Astronomy", "Jan-12-2018", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("43143", "CICERO 7", "EO,Technology", "Jan-12-2018", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("43142", "SPACEBEE-1", "Technology", "Jan-12-2018", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("43141", "SPACEBEE-2", "Technology", "Jan-12-2018", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("43140", "SPACEBEE-3", "Technology", "Jan-12-2018", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("43139", "SPACEBEE-4", "Technology", "Jan-12-2018", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("43137", "FOX-1D(AO-92)", "Radio,Comm:,Tech:", "Jan-12-2018", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("43131", "MICROMAS 2A", "EO:,Techs:", "Jan-12-2018", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("43130", "ARKYD 6A", "Technology", "Jan-12-2018", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("43127", "DEMOSAT 2", "Technology", "Jan-12-2018", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("43126", "LEMUR 2 DAVEWILSON", "", "Jan-12-2018", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("43125", "LEMUR 2 BROWNCOW", "", "Jan-12-2018", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("43124", "LEMUR 2 PETERWEBSTER", "", "Jan-12-2018", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("43123", "LEMUR 2 MCCAFFERTY", "", "Jan-12-2018", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("43122", "FLOCK 3PP 4", "Technology", "Jan-12-2018", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("43121", "FLOCK 3PP 1", "Technology", "Jan-12-2018", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("43120", "FLOCK 3PP 2", "Technology", "Jan-12-2018", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("43119", "FLOCK 3PP 3", "Technology", "Jan-12-2018", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("43118", "CORVUS BC3", "Earth Observation", "Jan-12-2018", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("43113", "LEO 1", "", "Jan-12-2018", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("43098", "USA 280", "Classified", "Jan-8-2018", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("43079", "IRIDIUM 131", "Comm:,Traffic Monitoring", "Dec-23-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("43078", "IRIDIUM 153", "Comm:,Traffic Monitoring", "Dec-23-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("43077", "IRIDIUM 141", "Comm:,Traffic Monitoring", "Dec-23-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("43076", "IRIDIUM 137", "Comm:,Traffic Monitoring", "Dec-23-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("43075", "IRIDIUM 134", "Comm:,Traffic Monitoring", "Dec-23-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("43074", "IRIDIUM 151", "Comm:,Traffic Monitoring", "Dec-23-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("43073", "IRIDIUM 130", "Comm:,Traffic Monitoring", "Dec-23-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("43072", "IRIDIUM 116", "Comm:,Traffic Monitoring", "Dec-23-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("43071", "IRIDIUM 138", "Comm:,Traffic Monitoring", "Dec-23-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("43070", "IRIDIUM 135", "Comm:,Traffic Monitoring", "Dec-23-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("43054", "LEMUR 2 LIU-POU-CHUN", "", "Nov-12-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("43053", "LEMUR 2 DUNLOP", "", "Nov-12-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("43052", "FAUNA", "Technology", "Nov-12-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("43051", "LEMUR 2 MCCULLAGH", "", "Nov-12-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("43050", "ISARA", "Technology", "Nov-12-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("43049", "ASGARDIA 1", "Comm:,Technology", "Nov-12-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("43048", "LEMUR 2 ROMACOSTE", "EO,Traffic Monitoring", "Nov-12-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("43047", "LEMUR 2 BRIANDAVIE", "EO,Traffic Monitoring", "Nov-12-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("43046", "LEMUR 2 KEVIN", "EO,Traffic Monitoring", "Nov-12-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("43045", "LEMUR 2 YONGLIN", "EO,Traffic Monitoring", "Nov-12-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("43044", "CHEFSAT", "Technology", "Nov-12-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("43043", "AEROCUBE 7C", "Technology", "Nov-12-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("43042", "AEROCUBE 7B", "Technology", "Nov-12-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("43041", "LEMUR 2 ROCKETJONAH", "EO,Traffic Monitoring", "Nov-12-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("43027", "OSIRIS-3U", "Ionosphere", "Nov-20-1998", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("43021", "DELLINGR(RBLE)", "research", "Nov-20-1998", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("43020", "ASTERIA", "Technology", "Nov-20-1998", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("43019", "ECAMSAT", "Life Sciences", "Nov-20-1998", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("43018", "EAGLESAT-1", "Education", "Nov-18-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("43017", "FOX-1B(RADFXSAT AO-91)", "Radio,Techs", "Nov-18-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("43016", "MAKERSAT-0", "Technology", "Nov-18-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("43015", "MIRATA", "EO,Techs", "Nov-18-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("43014", "BUCCANEER RMM", "Technology", "Nov-18-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("43013", "NOAA 20(JPSS 1)", "Meteorology", "Nov-18-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42998", "FLOCK 3M 2", "", "Oct-31-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42997", "FLOCK 3M 4", "", "Oct-31-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42996", "FLOCK 3M 3", "", "Oct-31-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42995", "FLOCK 3M 1", "", "Oct-31-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42992", "SKYSAT C6", "Earth Observation", "Oct-31-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42991", "SKYSAT C7", "Earth Observation", "Oct-31-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42990", "SKYSAT C8", "Earth Observation", "Oct-31-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42989", "SKYSAT C9", "Earth Observation", "Oct-31-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42988", "SKYSAT C10", "Earth Observation", "Oct-31-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42987", "SKYSAT C11", "Earth Observation", "Oct-31-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42982", "KESTREL EYE 2M", "Missile Defense", "November 20, 1998", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42964", "IRIDIUM 125", "Comm: Traffic Monitoring", "Oct-9-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42963", "IRIDIUM 139", "Comm: Traffic Monitoring", "Oct-9-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42962", "IRIDIUM 136", "Comm: Traffic Monitoring", "Oct-9-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42961", "IRIDIUM 132", "Comm: Traffic Monitoring", "Oct-9-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42960", "IRIDIUM 107", "Comm: Traffic Monitoring", "Oct-9-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42959", "IRIDIUM 119", "Comm: Traffic Monitoring", "Oct-9-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42958", "IRIDIUM 129", "Comm: Traffic Monitoring", "Oct-9-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42957", "IRIDIUM 122", "Comm: Traffic Monitoring", "Oct-9-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42956", "IRIDIUM 100", "Comm: Traffic Monitoring", "Oct-9-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42955", "IRIDIUM 133", "Comm: Traffic Monitoring", "Oct-9-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42949", "USA 279", "Reconnaissance", "October 15, 2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42941", "USA 278", "SIGINT,Early Warning", "Sep-24-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42932", "OTV 5(USA 277)", "Reusable satellite", "Sep-7-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42921", "ORS 5 SENSORSAT", "", "Aug-26-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42915", "TDRS 13", "Comm:,Data Relay", "Aug-18-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42914", "TNS 0-2", "", "Nov-20-1998", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42913", "SFERA 2", "", "Nov-20-1998", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42897", "FLOCK 2K 06", "Earth Imaging", "Jul-14-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42896", "FLOCK 2K 09", "Earth Imaging", "Jul-14-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42895", "FLOCK 2K 10", "Earth Imaging", "Jul-14-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42894", "FLOCK 2K 11", "Earth Imaging", "Jul-14-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42893", "FLOCK 2K 12", "Earth Imaging", "Jul-14-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42892", "FLOCK 2K 14", "Earth Imaging", "Jul-14-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42891", "FLOCK 2K 13", "Earth Imaging", "Jul-14-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42890", "FLOCK 2K 15", "Earth Imaging", "Jul-14-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42889", "FLOCK 2K 16", "Earth Imaging", "Jul-14-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42888", "FLOCK 2K 17", "Earth Imaging", "Jul-14-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42887", "FLOCK 2K 18", "Earth Imaging", "Jul-14-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42886", "FLOCK 2K 19", "Earth Imaging", "Jul-14-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42885", "FLOCK 2K 20", "Earth Imaging", "Jul-14-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42884", "FLOCK 2K 25", "Earth Imaging", "Jul-14-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42883", "FLOCK 2K 26", "Earth Imaging", "Jul-14-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42882", "FLOCK 2K 27", "Earth Imaging", "Jul-14-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42881", "LEMUR 2 ARTFISCHER", "Commercial", "Jul-14-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42879", "FLOCK 2K 33", "Earth Imaging", "Jul-14-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42878", "FLOCK 2K 34", "Earth Imaging", "Jul-14-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42877", "FLOCK 2K 35", "Earth Imaging", "Jul-14-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42876", "FLOCK 2K 36", "Earth Imaging", "Jul-14-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42875", "FLOCK 2K 41", "Earth Imaging", "Jul-14-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42874", "FLOCK 2K 43", "Earth Imaging", "Jul-14-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42873", "FLOCK 2K 44", "Earth Imaging", "Jul-14-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42872", "FLOCK 2K 30", "Earth Imaging", "Jul-14-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42871", "FLOCK 2K 29", "Earth Imaging", "Jul-14-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42870", "FLOCK 2K 32", "Earth Imaging", "Jul-14-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42869", "FLOCK 2K 31", "Earth Imaging", "Jul-14-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42868", "FLOCK 2K 38", "Earth Imaging", "Jul-14-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42867", "FLOCK 2K 37", "Earth Imaging", "Jul-14-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42866", "FLOCK 2K 39", "Earth Imaging", "Jul-14-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42865", "FLOCK 2K 40", "Earth Imaging", "Jul-14-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42864", "FLOCK 2K 05", "Earth Imaging", "Jul-14-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42863", "FLOCK 2K 08", "Earth Imaging", "Jul-14-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42862", "FLOCK 2K 07", "Earth Imaging", "Jul-14-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42861", "FLOCK 2K 22", "Earth Imaging", "Jul-14-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42860", "FLOCK 2K 21", "Earth Imaging", "Jul-14-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42859", "FLOCK 2K 23", "Earth Imaging", "Jul-14-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42858", "FLOCK 2K 46", "Earth Imaging", "Jul-14-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42857", "FLOCK 2K 24", "Earth Imaging", "Jul-14-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42856", "FLOCK 2K 45", "Earth Imaging", "Jul-14-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42855", "FLOCK 2K 48", "Earth Imaging", "Jul-14-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42854", "FLOCK 2K 47", "Earth Imaging", "Jul-14-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42853", "FLOCK 2K 02", "Earth Imaging", "Jul-14-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42852", "FLOCK 2K 01", "Earth Imaging", "Jul-14-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42851", "FLOCK 2K 04", "Earth Imaging", "Jul-14-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42850", "FLOCK 2K 03", "Earth Imaging", "Jul-14-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42847", "CORVUS BC1", "EO", "Jul-14-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42846", "CORVUS BC2", "EO", "Jul-14-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42845", "LEMUR 2 ZACHARY", "Commercial", "Jul-14-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42844", "NANOACE", "", "Jul-14-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42842", "LEMUR 2 DEMBITZ", "Earth Observation", "Jul-14-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42841", "LEMUR 2 PETERG", "Earth Observation", "Jul-14-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42840", "LEMUR 2 FURIAUS", "Earth Observation", "Jul-14-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42839", "LEMUR 2 MONSON", "Earth Observation", "Jul-14-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42838", "LEMUR 2 ANDIS", "Earth Observation", "Jul-14-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42837", "LEMUR 2 GREENBERG", "Earth Observation", "Jul-14-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42818", "INTELSAT 35E", "", "Jul-5-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42812", "IRIDIUM 121", "Comm: Traffic Monitoring", "Jun-25-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42811", "IRIDIUM 128", "Comm: Traffic Monitoring", "Jun-25-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42810", "IRIDIUM 124", "Comm: Traffic Monitoring", "Jun-25-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42809", "IRIDIUM 126", "Comm: Traffic Monitoring", "Jun-25-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42808", "IRIDIUM 117", "Comm: Traffic Monitoring", "Jun-25-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42807", "IRIDIUM 118", "Comm: Traffic Monitoring", "Jun-25-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42806", "IRIDIUM 115", "Comm: Traffic Monitoring", "Jun-25-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42805", "IRIDIUM 120", "Comm: Traffic Monitoring", "Jun-25-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42804", "IRIDIUM 123", "Comm: Traffic Monitoring", "Jun-25-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42803", "IRIDIUM 113", "Comm: Traffic Monitoring", "Jun-25-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42795", "TYVAK 53B", "", "Jun-23-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42793", "CICERO 6", "", "Jun-23-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42782", "LEMUR 2 MCPEAKE", "Commercial", "Jun-23-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42781", "LEMUR 2 SAM-AMELIA", "Commercial", "Jun-23-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42780", "LEMUR 2 LISASAURUS", "Commercial", "Jun-23-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42779", "LEMUR 2 LYNSEY-SYMO", "Commercial", "Jun-23-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42774", "LEMUR 2 KUNGFOO", "Commercial", "Jun-23-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42773", "LEMUR 2 LUCYBRYCE", "Commercial", "Jun-23-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42772", "LEMUR 2 XUENITERENCE", "Commercial", "Jun-23-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42771", "LEMUR 2 SHAINAJOHL", "Commercial", "Jun-23-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42755", "LEMUR 2 SPIROVISION", "Commercial", "Apr-18-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42754", "LEMUR 2 ROBMOORE", "Commercial", "Apr-18-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42753", "LEMUR 2 JENNYBARNA", "Commercial", "Apr-18-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42752", "LEMUR 2 ANGELA", "Commercial", "Apr-18-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42749", "ECHOSTAR 21", "Communication(DB)", "Jun-8-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42740", "VIASAT 2", "Communication", "Jun-1-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42723", "UNSW-ECO", "", "Nov-20-1998", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42715", "CSUNSAT1", "", "Nov-20-1998", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42712", "SHARC", "", "Nov-20-1998", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42711", "ALTAIR PATHFINDER", "", "Nov-20-1998", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42705", "ICECUBE", "", "Nov-20-1998", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42704", "CXBN-2", "", "Nov-20-1998", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42689", "USA 276", "Technology", "May-1-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42075", "WGS 9(USA 275)", "Communication", "Mar-19-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42070", "ECHOSTAR 23", "Communication(DB)", "Mar-16-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42069", "LEMUR 2 TRUTNAHD", "Commercial", "Nov-20-1998", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42068", "LEMUR 2 AUSTINTACIOUS", "Commercial", "Nov-20-1998", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42059", "LEMUR 2 REDFERN-GOES", "Commercial", "Nov-20-1998", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42058", "USA 274", "Ocean Surveillance,ELINT", "Mar-1-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42051", "FLOCK 3P 72", "Earth Imagery", "Feb-15-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42050", "FLOCK 3P 83", "Earth Imagery", "Feb-15-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42049", "FLOCK 3P 31", "Earth Imagery", "Feb-15-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42048", "FLOCK 3P 74", "Earth Imagery", "Feb-15-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42047", "FLOCK 3P 78", "Earth Imagery", "Feb-15-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42046", "FLOCK 3P 82", "Earth Imagery", "Feb-15-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42045", "FLOCK 3P 29", "Earth Imagery", "Feb-15-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42044", "FLOCK 3P 87", "Earth Imagery", "Feb-15-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42043", "FLOCK 3P 81", "Earth Imagery", "Feb-15-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42042", "FLOCK 3P 56", "Earth Imagery", "Feb-15-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42041", "FLOCK 3P 55", "Earth Imagery", "Feb-15-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42040", "FLOCK 3P 13", "Earth Imagery", "Feb-15-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42039", "FLOCK 3P 15", "Earth Imagery", "Feb-15-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42038", "FLOCK 3P 39", "Earth Imagery", "Feb-15-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42037", "FLOCK 3P 38", "Earth Imagery", "Feb-15-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42036", "FLOCK 3P 62", "Earth Imagery", "Feb-15-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42035", "FLOCK 3P 63", "Earth Imagery", "Feb-15-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42034", "FLOCK 3P 64", "Earth Imagery", "Feb-15-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42033", "FLOCK 3P 44", "Earth Imagery", "Feb-15-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42032", "FLOCK 3P 47", "Earth Imagery", "Feb-15-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42031", "FLOCK 3P 46", "Earth Imagery", "Feb-15-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42030", "FLOCK 3P 52", "Earth Imagery", "Feb-15-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42029", "FLOCK 3P 50", "Earth Imagery", "Feb-15-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42028", "FLOCK 3P 65", "Earth Imagery", "Feb-15-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42027", "FLOCK 3P 66", "Earth Imagery", "Feb-15-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42026", "FLOCK 3P 80", "Earth Imagery", "Feb-15-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42025", "FLOCK 3P 77", "Earth Imagery", "Feb-15-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42024", "FLOCK 3P 71", "Earth Imagery", "Feb-15-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42023", "FLOCK 3P 32", "Earth Imagery", "Feb-15-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42022", "FLOCK 3P 59", "Earth Imagery", "Feb-15-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42021", "FLOCK 3P 84", "Earth Imagery", "Feb-15-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42020", "FLOCK 3P 69", "Earth Imagery", "Feb-15-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42019", "FLOCK 3P 76", "Earth Imagery", "Feb-15-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42018", "FLOCK 3P 23", "Earth Imagery", "Feb-15-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42014", "FLOCK 3P 54", "Earth Imagery", "Feb-15-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42013", "FLOCK 3P 53", "Earth Imagery", "Feb-15-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42012", "FLOCK 3P 14", "Earth Imagery", "Feb-15-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42011", "FLOCK 3P 16", "Earth Imagery", "Feb-15-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42010", "FLOCK 3P 40", "Earth Imagery", "Feb-15-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42009", "FLOCK 3P 61", "Earth Imagery", "Feb-15-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42008", "FLOCK 3P 42", "Earth Imagery", "Feb-15-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42007", "FLOCK 3P 43", "Earth Imagery", "Feb-15-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42006", "FLOCK 3P 48", "Earth Imagery", "Feb-15-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42005", "FLOCK 3P 45", "Earth Imagery", "Feb-15-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42004", "FLOCK 3P 41", "Earth Imagery", "Feb-15-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42003", "FLOCK 3P 68", "Earth Imagery", "Feb-15-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42002", "FLOCK 3P 67", "Earth Imagery", "Feb-15-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("42001", "FLOCK 3P 49", "Earth Imagery", "Feb-15-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("41998", "LEMUR 2 TACHIKOMA", "Commercial", "Feb-15-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("41997", "LEMUR 2 JOBANPUTRA", "Commercial", "Feb-15-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("41996", "LEMUR 2 NOGUECORREIG", "Commercial", "Feb-15-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("41995", "LEMUR 2 RDEATON", "Commercial", "Feb-15-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("41994", "LEMUR 2 SPIRE-MINIONS", "Commercial", "Feb-15-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("41993", "LEMUR 2 SMITA-SHARAD", "Commercial", "Feb-15-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("41992", "LEMUR 2 MIA-GRACE", "Commercial", "Feb-15-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("41991", "LEMUR 2 SATCHMO", "Commercial", "Feb-15-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("41990", "FLOCK 3P 33", "Earth Imagery", "Feb-15-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("41989", "FLOCK 3P 35", "Earth Imagery", "Feb-15-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("41988", "FLOCK 3P 34", "Earth Imagery", "Feb-15-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("41987", "FLOCK 3P 30", "Earth Imagery", "Feb-15-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("41986", "FLOCK 3P 36", "Earth Imagery", "Feb-15-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("41985", "FLOCK 3P 86", "Earth Imagery", "Feb-15-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("41984", "FLOCK 3P 79", "Earth Imagery", "Feb-15-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("41983", "FLOCK 3P 85", "Earth Imagery", "Feb-15-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("41982", "FLOCK 3P 88", "Earth Imagery", "Feb-15-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("41981", "FLOCK 3P 73", "Earth Imagery", "Feb-15-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("41980", "FLOCK 3P 70", "Earth Imagery", "Feb-15-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("41979", "FLOCK 3P 75", "Earth Imagery", "Feb-15-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("41978", "FLOCK 3P 57", "Earth Imagery", "Feb-15-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("41977", "FLOCK 3P 58", "Earth Imagery", "Feb-15-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("41976", "FLOCK 3P 60", "Earth Imagery", "Feb-15-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("41975", "FLOCK 3P 11", "Earth Imagery", "Feb-15-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("41974", "FLOCK 3P 10", "Earth Imagery", "Feb-15-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("41973", "FLOCK 3P 9", "Earth Imagery", "Feb-15-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("41972", "FLOCK 3P 12", "Earth Imagery", "Feb-15-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("41971", "FLOCK 3P 5", "Earth Imagery", "Feb-15-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("41970", "FLOCK 3P 7", "Earth Imagery", "Feb-15-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("41969", "FLOCK 3P 6", "Earth Imagery", "Feb-15-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("41968", "FLOCK 3P 3", "Earth Imagery", "Feb-15-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("41967", "FLOCK 3P 1", "Earth Imagery", "Feb-15-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("41966", "FLOCK 3P 2", "Earth Imagery", "Feb-15-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("41965", "FLOCK 3P 4", "Earth Imagery", "Feb-15-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("41964", "FLOCK 3P 25", "Earth Imagery", "Feb-15-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("41963", "FLOCK 3P 27", "Earth Imagery", "Feb-15-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("41962", "FLOCK 3P 17", "Earth Imagery", "Feb-15-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("41961", "FLOCK 3P 26", "Earth Imagery", "Feb-15-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("41960", "FLOCK 3P 28", "Earth Imagery", "Feb-15-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("41959", "FLOCK 3P 21", "Earth Imagery", "Feb-15-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("41958", "FLOCK 3P 22", "Earth Imagery", "Feb-15-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("41957", "FLOCK 3P 18", "Earth Imagery", "Feb-15-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("41956", "FLOCK 3P 24", "Earth Imagery", "Feb-15-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("41955", "FLOCK 3P 19", "Earth Imagery", "Feb-15-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("41953", "FLOCK 3P 37", "Earth Imagery", "Feb-15-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("41952", "FLOCK 3P 51", "Earth Imagery", "Feb-15-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("41951", "FLOCK 3P 8", "Earth Imagery", "Feb-15-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("41950", "FLOCK 3P 20", "Earth Imagery", "Feb-15-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("41937", "SBIRS GEO 3(USA 273)", "Early Warning", "Jan-21-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("41926", "IRIDIUM 111", "Comm: Traffic Monitoring", "Jan-21-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("41925", "IRIDIUM 112", "Comm: Traffic Monitoring", "Jan-14-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("41924", "IRIDIUM 108", "Comm: Traffic Monitoring", "Jan-14-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("41923", "IRIDIUM 114", "Comm: Traffic Monitoring", "Jan-14-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("41922", "IRIDIUM 104", "Comm: Traffic Monitoring", "Jan-14-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("41921", "IRIDIUM 105", "Comm: Traffic Monitoring", "Jan-14-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("41920", "IRIDIUM 102", "Comm: Traffic Monitoring", "Jan-14-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("41919", "IRIDIUM 109", "Comm: Traffic Monitoring", "Jan-14-2017", R.mipmap.ic_united_states_of_america_foreground));
          USA_Sat_Obj.add(new Satellite("41918", "IRIDIUM 103", "Comm: Traffic Monitoring", "Jan-14-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("41917", "IRIDIUM 106", "Comm: Traffic Monitoring", "Jan-14-2017", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("41893", "ECHOSTAR 19", "Communication(DB)", "Dec-18-2016", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("41891", "CYGFM03", "Earth Sciences", "Dec-15-2016", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("41890", "CYGFM07", "Earth Sciences", "Dec-15-2016", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("41889", "CYGFM06", "Earth Sciences", "Dec-15-2016", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("41888", "CYGFM08", "Earth Sciences", "Dec-15-2016", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("41887", "CYGFM01", "Earth Sciences", "Dec-15-2016", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("41886", "CYGFM02", "Earth Sciences", "Dec-15-2016", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("41885", "CYGFM04", "Earth Sciences", "Dec-15-2016", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("41884", "CYGFM05", "Earth Sciences", "Dec-15-2016", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("41879", "WGS 8(USA 272)", "Communication", "Dec-7-2016", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("41866", "GOES 16", "Meteorology", "Nov-19-2016", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("41855", "PROMETHEUS 2-3", "Technology", "Nov-11-2016", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("41854", "PROMETHEUS 2-1", "Technology", "Nov-11-2016", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("41853", "AEROCUBE 8C", "Technology", "Nov-11-2016", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("41852", "AEROCUBE 8D", "Technology", "Nov-11-2016", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("41851", "OPTICUBE 04", "Calibration", "Nov-11-2016", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("41850", "CELTEE 1", "Calibration", "Nov-11-2016", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("41849", "RAVAN", "ES,Technology", "Nov-11-2016", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("41848", "WORLDVIEW 4", "Earth Observing", "Nov-11-2016", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("41787", "PATHFINDER 1", "Earth Observation", "Sep-26-2016", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("41782", "FLOCK 2EP 20", "Commercial", "Nov-20-1998", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("41774", "SKYSAT C3", "", "Sep-16-2016", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("41773", "SKYSAT C2", "", "Sep-16-2016", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("41772", "SKYSAT C5", "", "Sep-16-2016", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("41771", "SKYSAT C4", "", "Sep-16-2016", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("41769", "FLOCK 2EP 18", "", "Nov-20-1998", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("41764", "FLOCK 2EP 15", "", "Nov-30-1998", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("41762", "FLOCK 2EP 14", "", "Nov-30-1998", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("41745", "USA 271", "Space Surveillance", "Aug-19-2016", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("41744", "USA 270", "Space Surveillance", "Aug-19-2016", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("41724", "USA 269", "Comsat/Relay", "Jul-28-2016", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("41622", "MUOS 5", "Comsat", "Jun-24-2016", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("41618", "FLOCK 2P 3", "Earth Imagery", "Jun-22-2016", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("41617", "FLOCK 2P 1", "Earth Imagery", "Jun-22-2016", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("41616", "FLOCK 2P 5", "Earth Imagery", "Jun-22-2016", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("41615", "FLOCK 2P 7", "Earth Imagery", "Jun-22-2016", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("41614", "FLOCK 2P 12", "Earth Imagery", "Jun-22-2016", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("41613", "FLOCK 2P 8", "Earth Imagery", "Jun-22-2016", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("41612", "FLOCK 2P 10", "Earth Imagery", "Jun-22-2016", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("41611", "FLOCK 2P 4", "Earth Imagery", "Jun-22-2016", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("41610", "FLOCK 2P 9", "Earth Imagery", "Jun-22-2016", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("41609", "FLOCK 2P 2", "Earth Imagery", "Jun-22-2016", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("41608", "FLOCK 2P 11", "Earth Imagery", "Jun-22-2016", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("41601", "SKYSAT C1", "", "Jun-22-2016", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("41592", "ECHOSTAR XVIII", "", "Jun-18-2016", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("41584", "USA 268", "SIGINT,ELINT,COMINT", "Jun-11-2016", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("41564", "FLOCK 2E-5", "", "Nov-20-1998", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("41380", "SES 9", "Communication", "Mar-4-2016", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("41334", "USA 267", "FIA-Radar", "Feb-10-2016", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("41328", "NAVSTAR 76(USA 266)", "Navigation", "Feb-5-2016", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("41240", "JASON 3", "Altimetry,Radar", "Jan-17-2016", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("41189", "ORBCOMM FM116", "Comm: Traffic Monitoring", "Dec-22-2015", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("41188", "ORBCOMM FM117", "Comm: Traffic Monitoring", "Dec-22-2015", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("41187", "ORBCOMM FM108", "Comm: Traffic Monitoring", "Dec-22-2015", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("41186", "ORBCOMM FM115", "Comm: Traffic Monitoring", "Dec-22-2015", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("41185", "ORBCOMM FM113", "Comm: Traffic Monitoring", "Dec-22-2015", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("41184", "ORBCOMM FM112", "Comm: Traffic Monitoring", "Dec-22-2015", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("41183", "ORBCOMM FM118", "Comm: Traffic Monitoring", "Dec-22-2015", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("41182", "ORBCOMM FM110", "Comm: Traffic Monitoring", "Dec-22-2015", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("41181", "ORBCOMM FM105", "Comm: Traffic Monitoring", "Dec-22-2015", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("41180", "ORBCOMM FM119", "Comm: Traffic Monitoring", "Dec-22-2015", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("41179", "ORBCOMM FM114", "Comm: Traffic Monitoring", "Dec-22-2015", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("41019", "NAVSTAR 75(USA 265)", "Navigation", "Oct-31-2015", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("40977", "SINOD-D 3", "Technology", "Oct-8-2015", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("40976", "PROPCUBE 1", "Technology", "Oct-8-2015", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("40975", "SNAP-3 JIMI", "Technology", "Oct-8-2015", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("40974", "SINOD-D 1", "Technology", "Oct-8-2015", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("40973", "PROPCUBE 3", "Technology", "Oct-8-2015", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("40972", "SNAP-3 EDDIE", "Technology", "Oct-8-2015", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("40971", "LMRST-SAT", "Technology", "Oct-8-2015", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("40970", "SNAP-3 ALICE", "Technology", "Oct-8-2015", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("40969", "ARC-1", "Technology", "Oct-8-2015", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("40968", "BISONSAT", "Technology", "Oct-8-2015", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("40967", "FOX-1A(AO-85)", "Radio Comm:,Techs", "Oct-8-2015", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("40966", "AEROCUBE 7", "", "Oct-8-2015", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("40965", "AEROCUBE 5C", "Technology", "Oct-8-2015", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("40964", "USA 264", "", "Oct-8-2015", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("40935", "LEMUR-2 PETER", "Commercial", "Sep-28-2015", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("40934", "LEMUR-2 JEROEN", "Commercial", "Sep-28-2015", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("40933", "LEMUR-2 CHRIS", "Commercial", "Sep-28-2015", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("40932", "LEMUR-2 JOEL", "Commercial", "Sep-28-2015", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("40887", "MUOS 4", "Comsat", "Jul-24-2015", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("40746", "WGS F7(USA 263)", "Communication", "Jul-15-2015", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("40730", "NAVSTAR 74(USA 262)", "", "May-27-2015", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("40663", "DIRECTV 15", "Communication", "May-20-2015", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("40660", "AEROCUBE 8B", "Technology", "May-20-2015", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("40659", "AEROCUBE 8A", "Technology", "May-20-2015", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("40658", "OPTICUBE 03", "Calibration", "May-20-2015", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("40657", "GEARRS-2", "Technology", "May-20-2015", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("40656", "OPTICUBE 02", "Calibration", "May-20-2015", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("40655", "BRICSAT-P(NO-83)", "Techs,Comm:", "May-20-2015", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("40654", "PARKINSONSAT(PSAT...NO-84)", "Experimental Comm:", "May-20-2015", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("40653", "OPTICUBE 01", "Calibration", "May-20-2015", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("40652", "USS LANGLEY", "Technology", "May-20-2015", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("40534", "NAVSTAR 73(USA 260)", "Navigation", "Mar-25-2015", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("0485", "MMS 4", "Magnetospheric Research", "Mar-13-2015", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("40484", "MMS 3", "Magnetospheric Research", "Mar-13-2015", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("40483", "MMS 2", "Magnetospheric Research", "Mar-13-2015", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("40482", "MMS 1", "Magnetospheric Research", "Mar-13-2015", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("40390", "DSCOVR", "EO,Solar Science", "Feb-11-2015", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("40380", "EXOCUBE", "Science,Atmosphere", "Jan-31-2015", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("40379", "GRIFEX", "Technology", "Jan-31-2015", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("40378", "FIREBIRD 4", "Technology", "Jan-31-2015", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("40377", "FIREBIRD 3", "Technology", "Jan-31-2015", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("40376", "SMAP", "Earth Science", "Jan-31-2015", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("40374", "MUOS 3", "Comsat", "Jan-21-2015", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("40344", "USA 259", "", "Dec-13-2014", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("40333", "DIRECTV 14", "Communication", "Dec-6-2014", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("40294", "NAVSTAR 72(USA 258)", "Navigation", "Oct-29-2014", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("40208", "USA 257(CLIO)", "", "Sep-17-2014", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("40115", "WORLDVIEW 3(WV-3)", "Earth Observing", "Aug-13-2014", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("40105", "NAVSTAR 71(USA 256)", "Navigation", "Aug-2-2014", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("40101", "USA 255", "Space Surveillance", "Jul-28-2014", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("40100", "USA 254", "Space Surveillance", "Jul-28-2014", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("40099", "USA 253", "Space Surveillance", "Jul-28-2014", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("40091", "ORBCOMM FM 103", "Comm: Traffic Monitoring", "Jul-14-2014", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("40090", "ORBCOMM FM 104", "Comm: Traffic Monitoring", "Jul-14-2014", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("40089", "ORBCOMM FM 111", "Comm: Traffic Monitoring", "Jul-14-2014", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("40088", "ORBCOMM FM 106", "Comm: Traffic Monitoring", "Jul-14-2014", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("40087", "ORBCOMM FM 107", "Comm: Traffic Monitoring", "Jul-14-2014", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("40086", "ORBCOMM FM 109", "Comm: Traffic Monitoring", "Jul-14-2014", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("40072", "SKYSAT 2", "Earth Observation", "Jul-8-2014", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("40059", "OCO 2", "Earth Science", "Jul-2-2014", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("40046", "AEROCUBE 6B", "Technology", "Jul-19-2014", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("40045", "AEROCUBE 6A", "Technology", "Jul-19-2014", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("40044", "LEMUR 1", "", "Jul-19-2014", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("40041", "FLOCK 1C 3", "Technology", "Jul-19-2014", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("40040", "FLOCK 1C 8", "Technology", "Jul-19-2014", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("40038", "FLOCK 1C 5", "Technology", "Jul-19-2014", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("40036", "FLOCK 1C 6", "Technology", "Jul-19-2014", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("40035", "FLOCK 1C 9", "Technology", "Jul-19-2014", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("40033", "FLOCK 1C 11", "Technology", "Jul-19-2014", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("40031", "FLOCK 1C 4", "Technology", "Jul-19-2014", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("40029", "FLOCK 1C 2", "Technology", "Jul-19-2014", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("40027", "FLOCK 1C 1", "Technology", "Jul-19-2014", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("40026", "FLOCK 1C 7", "Technology", "Jul-19-2014", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("40023", "FLOCK 1C 10", "Technology", "Jul-19-2014", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("40019", "APRIZESAT 10", "Technology", "Jul-19-2014", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("40018", "APRIZESAT 9", "Technology", "Jul-19-2014", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("39751", "USA 252", "", "May-22-2014", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("39741", "NAVSTAR 70(USA 251)", "Navigation", "May-17-2014", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("39652", "USA 250(NROL-67)", "", "Apr-10-2014", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("39630", "DMSP 5D-3 F19 (USA 249)", "", "Apr-3-2014", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("39533", "NAVSTAR 69(USA 248)", "Navigation", "Apr-3-2014", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("39504", "TDRS 12", "", "Jan-23-2014", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("39474", "SMDC ONE 2.3", "Communications", "Dec-6-2013", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("39473", "TACSAT-6", "Technology", "Dec-6-2013", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("39472", "SMDC ONE 2.4", "Communications", "Dec-6-2013", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("39471", "IPEX", "Technology", "Dec-6-2013", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("39470", "CUNYSAT-1", "Science,Ionosphere", "Dec-6-2013", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("39469", "MCUBED-2", "Technology", "Dec-6-2013", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("39468", "SNAP-3", "Technology", "Dec-6-2013", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("39467", "ALICE", "Technology", "Dec-6-2013", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("39466", "AEROCUBE 5B", "Technology", "Dec-6-2013", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("39465", "AEROCUBE 5A", "Technology", "Dec-6-2013", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("39464", "FIREBIRD B", "Technology", "Dec-6-2013", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("39463", "FIREBIRD A", "Technology", "Dec-6-2013", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("39462", "USA 247(NROL-39)", "FIA-Radar", "Dec-6-2013", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("39460", "SES-8", "", "Dec-3-2013", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("39443", "QUBESCOUT-S1", "Technology", "Nov-21-2013", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("39437", "BEAKERSAT 1", "Technology", "Nov-21-2013", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("39434", "DOVE 4", "Technology", "Nov-21-2013", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("39429", "DOVE 3", "Technology", "Nov-21-2013", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("39425", "APRIZESAT 8", "Technology", "Nov-21-2013", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("39424", "CINEMA 2", "Research,Magnetosphere", "Nov-21-2013", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("39418", "SKYSAT 1", "Earth Observation", "Nov-21-2013", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("39416", "APRIZESAT 7", "Technology", "Nov-21-2013", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("39403", "HO OPONOPONO 2", "Radar Calibration", "Nov-20-2013", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("39392", "SENSE SV2", "Experimental", "Nov-20-2013", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("39380", "STPSAT 3", "Technology", "Nov-20-2013", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("39378", "MAVEN", "Mars orbiter", "Nov-18-2013", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("39360", "SIRIUS FM-6", "Radio Broadcasting", "Oct-25-2013", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("39271", "CUSAT 2/FALCON 9", "Technology", "Sep-29-2013", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("39270", "POPACS 3", "Atmospheric density(R)", "Sep-29-2013", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("39269", "POPACS 2", "Atmospheric density(R)", "Sep-29-2013", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("39268", "POPACS 1", "Atmospheric density(R)", "Sep-29-2013", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("39267", "DANDE", "Aeronomy", "Sep-29-2013", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("39266", "CUSAT", "Technology", "Sep-29-2013", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("39256", "AEHF-3(USA 246)", "Comsat", "Sep-18-2013", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("39232", "NROL-65(USA 245)", "Reconnaissance,Electro optical", "Aug-28-2013", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("39222", "WGS F6(USA 244)", "Communication", "Aug-8-2013", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("39206", "MUOS 2", "Comsat", "Jul-19-2013", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("39197", "IRIS", "Particle Imaging", "Jun-28-2013", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("39168", "WGS F5(USA 243)", "Communication", "May-25-2013", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("39166", "NAVSTAR 68(USA 242)", "Navigation", "May-15-2013", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("39132", "DOVE 2", "Technology", "Apr-19-2013", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("39120", "SBIRS GEO 2(USA 241)", "Early Warning", "Mar-19-2013", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("39084", "LANDSAT 8", "Earth Observing", "Feb-11-2013", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("39070", "TDRS 11", "Comm:,Data Relay", "Jan-31-2013", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("39008", "ECHOSTAR 16", "", "Nov-20-2012", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("38833", "NAVSTAR 67(USA 239)", "Navigation", "Oct-4-2012", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("38769", "AEROCUBE 4", "Technology", "Sep-13-2012", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("38768", "AEROCUBE 4.5B", "Technology", "Sep-13-2012", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("38767", "AEROCUBE 4.5A", "Technology", "Sep-13-2012", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("38766", "SMDC ONE 1.1", "Technology", "Sep-13-2012", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("38765", "RE", "", "Sep-13-2012", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("38764", "CINEMA", "", "Sep-13-2012", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("38763", "CP5", "", "Sep-13-2012", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("38762", "CXBN", "", "Sep-13-2012", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("38761", "CSSWE", "", "Sep-13-2012", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("38760", "AENEAS", "", "Sep-13-2012", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("38759", "SMDC ONE 1.2", "", "Sep-13-2012", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("38758", "USA 238", "", "Sep-13-2012", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("38753", "RBSP B", "", "Aug-30-2012", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("38752", "RBSP A", "", "Aug-30-2012", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("38551", "ECHOSTAR 17", "", "Jul-5-2012", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("38528", "USA 237", "", "Jun-29-2012", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("38466", "USA 236", "", "Jun-20-2012", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("38358", "NUSTAR", "", "Jun-13-2012", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("38254", "AEHF 2(USA 235)", "", "May-4-2012", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("38109", "USA 234", "FIA-Radar", "Apr-3-2012", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("38093", "MUOS", "Comsat", "Feb-24-2012", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("38070", "WGS F4(USA 233)", "Communication", "Jan-20-2012", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("37855", "M-CUBED/EXP-1 PRIME", "", "Oct-28-2011", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("37854", "AUBIESAT-1", "", "Oct-28-2011", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("37853", "RAX-2", "", "Oct-28-2011", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("37852", "DICE 2", "", "Oct-28-2011", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("37851", "DICE 1", "", "Oct-28-2011", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("37849", "SUOMI NPP", "", "Oct-28-2011", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("37843", "VIASAT 1", "", "Oct-19-2011", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("37818", "TACSAT 4", "", "Sep-27-2011", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("37793", "APRIZESAT 6", "Technology", "Aug-17-2011", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("37792", "APRIZESAT 5", "Technology", "Aug-17-2011", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("37773", "JUNO", "", "Aug-5-2011", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("37753", "NAVSTAR 66(USA 232)", "Navigation", "Jul-16-2011", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("37748", "SES 3", "", "Jul-15-2011", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("37481", "SBIRS GEO 1(USA 230)", "Early Warning", "May-7-2011", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("37386", "USA 229", "", "Apr-15-2011", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("37380", "FAST 2(USA 228)", "", "Nov-20-2010", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("37377", "USA 227", "", "Mar-11-2011", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("37364", "USA 225", "", "Feb-6-2011", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("37348", "USA 224", "", "Jan-20-2011", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("37232", "USA 223", "", "Nov-21-2010", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("37231", "BALLAST B", "", "Nov-20-2010", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("37230", "BALLAST A", "", "Nov-20-2010", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("37227", "FAST 1(USA 222)", "", "Nov-20-2010", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("37226", "FALCONSAT 5(USA 221)", "", "Nov-20-2010", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("37225", "FASTSAT-HSV01(USA 220)", "", "Nov-20-2010", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("37224", "O/OREOS(USA 219)", "", "Nov-20-2010", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("37223", "RAX (USA 218)", "", "Nov-20-2010", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("37222", "STPSAT 2(USA 217)", "", "Nov-20-2010", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("37218", "SKYTERRA 1", "", "Nov-14-2010", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("37185", "XM-5", "", "Oct-14-2010", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("37168", "SBSS (USA 216)", "", "Sep-26-2010", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("37162", "USA 215", "FIA-Radar", "Sep-21-2010", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("36868", "AEHF 1(USA 214)", "", "Aug-14-2010", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("36792", "ECHOSTAR 15", "Communication(DB)", "Jul-10-2010", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("36585", "NAVSTAR 65(USA 213)", "Navigation", "May-28-2010", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("36499", "ECHOSTAR 14", "Communication(DB)", "Mar-20-2010", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("36411", "GOES 15", "Meteorology", "Mar-4-2010", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("36395", "SDO", "", "Feb-11-2010", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("36131", "DIRECTV 12", "Communication", "Dec-29-2009", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("36119", "WISE", "", "Dec-14-2009", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("36108", "WGS F3(USA 211)", "Communication", "Dec-6-2009", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("35951", "DMSP 5D-3 F18(USA 210)", "Meteorology", "Oct-18-2009", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("35946", "WORLDVIEW 2", "Earth Observing", "Oct-8-2009", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("35938", "STSS DEMO 2(USA 209)", "", "Sep-25-2009", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("35937", "STSS DEMO 1(USA 208)", "", "Sep-25-2009", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("35815", "USA 207", "", "Sep-8-2009", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("35752", "NAVSTAR 64(USA 206)", "Navigation", "Aug-17-2009", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("35686", "APRIZESAT 3", "Technology", "Jul-29-2009", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("35684", "APRIZESAT 4", "Technology", "Jul-29-2009", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("35496", "TERRESTAR 1", "", "Jul-1-2009", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("35493", "SIRIUS FM-5", "", "Jun-30-2009", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("35491", "GOES 14", "Meteorology", "Jun-27-2009", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("35315", "LRO", "", "Jun-18-2009", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("34903", "STSS ATRR(USA 205)", "", "May-5-2009", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("34713", "WGS F2(USA 204)", "Communication", "Apr-4-2009", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("34661", "NAVSTAR 63(USA 203)", "Navigation", "Mar-24, 2009", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("34380", "KEPLER", "", "Mar-7-2009", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("33591", "NOAA 19", "", "Feb-6-2009", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("33490", "USA 202", "", "Jan-18-2009", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("33401", "IBEX", "", "Oct-19-2008", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("33393", "DEMOSAT/FALCON 1", "", "Sep-28-2008", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("33376", "GALAXY 19", "", "Sep-24-2008", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("33331", "GEOEYE 1", "", "Sep-6-2008", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("33207", "ECHOSTAR 11", "Communication(DB)", "Jul-16-2008", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("33053", "GLAST", "", "Jun-11-2008", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("32951", "GALAXY 18", "", "May-21-2008", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("32763", "ICO G-1", "", "Apr-14-2008", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("32729", "DIRECTV 11", "Communication", "Mar-19-2008", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("32711", "NAVSTAR 62(USA 201)", "Navigation", "Mar-15-2008", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("32708", "AMC-14", "", "Mar-14-2008", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("32706", "USA 200", "", "Mar-13-2008", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("32384", "NAVSTAR 61(USA 199)", "Navigation", "Dec-20-2007", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("32378", "USA 198", "", "Dec-20-2007", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("32287", "USA 197", "", "Nov-11-2007", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("32260", "NAVSTAR 60(USA 196)", "Navigation", "Oct-17-2007", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("32258", "WGS F1(USA 195)", "Communication", "Oct-11-2007", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("32249", "DAWN", "", "Sep-27-2007", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("32060", "WORLDVIEW 1", "Earth Observing", "Sep-18-2007", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("32018", "SPACEWAY 3", "", "Aug-14-2007", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("31862", "DIRECTV 10", "Communication", "Jul-7-2007", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("31789", "GENESIS 2", "", "Jun-28-2007", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("31701", "USA 194", "", "Jun-15-2007", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("31307", "GALAXY 17", "", "May-4-2007", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("31304", "AIM", "", "Apr-25-2007", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("31133", "AEROCUBE 2", "Technology", "Apr-17-2007", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("31132", "CP4", "", "Apr-17-2007", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("31130", "CAPE 1", "", "Apr-17-2007", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("31129", "CP3", "", "Apr-17-2007", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("31126", "MAST", "", "Apr-17-2007", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("31122", "CSTB 1", "", "Apr-17-2007", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("30798", "THEMIS E", "", "Feb-17-2007", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("30797", "THEMIS D", "", "Feb-17-2007", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("30777", "CFESAT", "", "Mar-9-2007", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("30776", "FALCONSAT 3", "", "Mar-9-2007", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("30775", "STPSAT 1", "", "Mar-9-2007", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("30774", "OE (NEXTSAT)", "", "Mar-9-2007", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("30773", "MIDSTAR 1", "", "Mar-9-2007", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("30582", "ARTEMIS P2(THEMIS C)", "", "Feb-17-2007", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("30581", "ARTEMIS P1(THEMIS B)", "", "Feb-17-2007", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("30580", "THEMIS A", "", "Feb-17-2007", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("29643", "WILDBLUE 1", "", "Dec-8-2006", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("29601", "NAVSTAR 59 (USA 192)", "Navigation", "Nov-17-2006", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("29522", "DMSP 5D-3 F17(USA 191)", "", "Nov-4-2006", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("29520", "XM-4", "", "Oct-30-2006", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("29511", "STEREO B", "", "Oct-26-2006", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("29510", "STEREO A", "", "Oct-26-2006", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("29494", "DIRECTV 9S", "", "Oct-13-2006", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("29486", "NAVSTAR 58(USA 190)", "Navigation", "Sep-25-2006", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("29252", "GENESIS 1", "", "Jul-12-2006", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("29249", "USA 184", "", "Jun-28-2006", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("29242", "USA 189", "", "Jun-21-2006", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("29241", "USA 188", "", "Jun-21-2006", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("29240", "USA 187", "", "Jun-21-2006", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("29236", "GALAXY 16", "", "Jun-18-2006", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("29155", "GOES 13", "Meteorology", "May-24-2006", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("29108", "CALIPSO", "", "Apr-28-2006", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("29107", "CLOUDSAT", "", "Apr-28-2006", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("28982", "ST5-C", "", "Mar-22-2006", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("28981", "ST5-B", "", "Mar-22-2006", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("28980", "ST5-A", "", "Mar-22-2006", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("28935", "ECHOSTAR 10", "Communication(DB)", "Feb-15-2006", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("28928", "NEW HORIZONS", "", "Jan-19-2006", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("28903", "SPACEWAY 2", "", "Nov-16-2005", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("28888", "USA 186", "", "Oct-19-2005", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("28874", "NAVSTAR 57(USA 183)", "Navigation", "Sep-26-2005", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("28790", "GALAXY 14", "", "Aug-13-2005", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("28788", "MRO", "", "Aug-12-2005", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("28659", "DIRECTV 8", "Communication", "May-22-2005", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("28654", "NOAA 18", "", "May-20-2005", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("28646", "USA 182", "", "Apr-30-2005", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("28644", "SPACEWAY 1", "", "Apr-26-2005", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("28626", "XM-3", "", "Mar-1-2005", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("28542", "XTAR-EUR", "", "Feb-12-2005", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("28537", "USA 181", "", "Feb-3-2005", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("28517", "EPOXI (DEEP IMPACT)", "", "Jan-12-2005", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("28500", "DELTA 4 DEMO SPACECRAFT", "", "Dec-21-2004", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("28485", "SWIFT", "", "Nov-20-2004", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("28474", "NAVSTAR 56(USA 180)", "Navigation", "Nov-6-2004", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("28384", "USA 179", "", "Aug-31-2004", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("28376", "AURA", "", "Jul-15-2004", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("28375", "AMSAT ECHO", "", "Jun-29-2004", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("28372", "APRIZESAT 1", "Technology", "Jun-29-2004", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("28366", "APRIZESAT 2", "Technology", "Jun-29-2004", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("28361", "NAVSTAR 55(USA 178)", "Navigation", "Jun-23-2004", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("28238", "DIRECTV 7S", "Communication", "May-4-2004", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("28230", "GP-B", "", "Apr-20-2004", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("28190", "NAVSTAR 54(USA 177)", "Navigation", "Mar-20-2004", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("28158", "USA 176", "", "Feb-14-2004", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("28129", "NAVSTAR 53(USA 175)", "Navigation", "Dec-21-2003", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("28117", "UFO 11(USA 174)", "", "Dec-18-2003", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("28095", "USA 173", "", "Dec-2-2003", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("28054", "DMSP 5D-3 F16(USA 172)", "", "Oct-18-2003", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("27954", "HORIZONS 1(GALAXY 13)", "", "Oct-1-2003", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("27937", "USA 171", "", "Sep-9-2003", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("27875", "USA 170", "", "Aug-29-2003", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("27871", "SIRTF", "", "Aug-25-2003", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("27854", "GALAXY 23(TELSTAR 13)", "", "Aug-8-2003", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("27852", "ECHOSTAR 12(RAINBOW 1)", "", "Jul-17-2003", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("27845", "QUAKESAT", "", "Jun-30-2003", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("27783", "GALEX", "", "Apr-28-2003", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("27715", "GALAXY 12", "", "Apr-9-2003", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("27711", "USA 169", "", "Apr-8-2003", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("27704", "NAVSTAR 52(USA 168)", "Navigation", "Mar-31-2003", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("27691", "USA 167", "", "Mar-11-2003", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("27664", "XSS 10", "", "Jan-29-2003", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("27663", "NAVSTAR 51(USA 166)", "Navigation", "Jan-29-2003", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("27651", "SORCE", "", "Jan-25-2003", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("27643", "CHIPSAT", "", "Jan-13-2003", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("27640", "CORIOLIS", "", "Jan-6-2003", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("27609", "TRAILBLAZER 2", "", "Dec-20-2002", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("27566", "TDRS 10", "", "Dec-5-2002", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("27501", "ECHOSTAR 8", "Communication(DB)", "Aug-22-2002", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("27457", "CONTOUR", "", "Jul-3-2002", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("27453", "NOAA 17", "", "Jun-24-2002", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("27451", "IRIDIUM 98", "Communication", "Jun-20-2002", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("27450", "IRIDIUM 97", "Communication", "Jun-20-2002", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("27445", "GALAXY 3C", "", "Jun-15-2002", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("27426", "DIRECTV 5(TEMPO 1)", "Communication", "May-7-2002", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("27424", "AQUA", "", "May-4-2002", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("27389", "TDRS 9", "", "Mar-8-2002", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("27378", "ECHOSTAR 7", "Communication(DB)", "Feb-21-2002", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("27376", "IRIDIUM 96", "Communication", "Feb-11-2002", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("27375", "IRIDIUM 95", "Communication", "Feb-11-2002", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("27373", "IRIDIUM 90", "Communication", "Feb-11-2002", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("27372", "IRIDIUM 91", "Communication", "Feb-11-2002", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("27370", "HESSI", "", "Feb-5-2002", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("27168", "USA 164", "", "Jan-14-2002", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("26998", "TIMED", "", "Dec-7-2001", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("26997", "JASON", "Altimetry, Radar", "Dec-7-2001", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("26985", "DIRECTV 4S", "Communication", "Nov-27-2001", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("26948", "USA 162", "", "Oct-11-2001", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("26934", "USA 161", "", "Oct-5-2001", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("26932", "SAPPHIRE", "", "Sep-30-2001", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("26931", "PCSAT", "", "Sep-30-2001", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("26930", "PICOSAT 9", "", "Sep-30-2001", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("26905", "USA 160", "", "Sep-8-2001", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("26884", "GENESIS", "", "Aug-8-2001", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("26880", "USA 159", "", "Aug-6-2001", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("26871", "GOES 12", "Meteorology", "Jul-23-2001", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("26859", "MAP", "", "Jun-30-2001", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("26770", "USA 158", "", "May-18-2001", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("26766", "INTELSAT 10(PAS 10)", "", "May-15-2001", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("26761", "XM-1", "", "May-8-2001", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("26734", "MARS ODYSSEY", "", "Apr-7-2001", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("26724", "XM-2", "", "Mar-18-2001", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("26715", "USA 157", "", "Feb-27-2001", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("26690", "NAVSTAR 50(USA 156)", "Navigation", "Jan-30-2001", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("26635", "USA 155", "", "Dec-6-2000", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("26626", "SIRIUS 3", "", "Nov-30-2000", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("26619", "EO 1", "", "Nov-21-2000", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("26608", "INTELSAT 1R(PAS 1R)", "", "Nov-16-2000", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("26605", "NAVSTAR 49(USA 154)", "Navigation", "Nov-10-2000", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("26575", "USA 153", "", "Oct-20-2000", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("26561", "HETE 2", "", "Oct-9-2000", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("26536", "NOAA 16", "", "Sep-21-2000", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("26483", "SIRIUS 2", "", "Sep-5-2000", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("26476", "DM-F3", "", "Aug-23-2000", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("26473", "USA 152", "", "Aug-17-2000", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("26451", "INTELSAT 9(PAS 9)", "", "Jul-28-2000", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("26407", "NAVSTAR 48(USA 151)", "Navigation", "Jul-16-2000", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("26402", "ECHOSTAR 6", "Communication(DB)", "Jul-14-2000", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("26390", "SIRIUS 1", "", "Jun-30-2000", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("26388", "TDRS 8", "", "Jun-30-2000", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("26374", "TSX-5", "", "Jun-7-2000", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("26360", "NAVSTAR 47(USA 150)", "Navigation", "May-11-2000", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("26356", "USA 149", "", "May-8-2000", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("26352", "GOES 11", "Meteorology", "May-3-2000", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("26298", "GALAXY 4R", "", "Apr-19-2000", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("26113", "IMAGE", "", "Mar-25-2000", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("26107", "ASIASTAR", "", "Mar-21-2000", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("26102", "MTI", "", "Mar-12-2000", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("26094", "PICOSAT 6", "", "Jan-27-2000", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("26093", "PICOSAT 5", "", "Jan-27-2000", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("26092", "PICOSAT 4", "", "Jan-27-2000", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("26091", "PICOSAT 3", "", "Jan-27-2000", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("26080", "PICOSAT 1&2(TETHERED)", "", "Jan-27-2000", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("26065", "ASUSAT", "", "Jan-27-2000", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("26064", "FALCONSAT", "", "Jan-27-2000", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("26063", "OPAL", "", "Jan-27-2000", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("26061", "JAWSAT", "", "Jan-27-2000", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("26056", "GALAXY 10R", "", "Jan-25-2000", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("26052", "USA 148", "", "Jan-21-2000", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("26038", "GALAXY 11", "", "Dec-22-1999", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("26033", "ACRIMSAT", "", "Dec-21-1999", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("25994", "TERRA", "", "Dec-18-1999", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("25991", "DMSP 5D-2 F15(USA 147)", "", "Dec-12-1999", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("25967", "UFO 10(USA 146)", "", "Nov-23-1999", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("25949", "TELSTAR 12(ORION 2)", "", "Oct-19-1999", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("25937", "DIRECTV 1R", "", "Oct-10-1999", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("25933", "NAVSTAR 46(USA 145)", "Navigation", "Oct-7-1999", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("25919", "IKONOS 2", "", "Sep-24-1999", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("25913", "ECHOSTAR 5", "Communication(DB)", "Sep-23-1999", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("25867", "CXO", "", "Jul-23-1999", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("25791", "FUSE 1", "", "Jun-24-1999", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("25789", "QUIKSCAT", "", "Jun-20-1999", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("25777", "IRIDIUM 14", "", "Jun-11-1999", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("25744", "USA 144", "", "May-22-1999", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("25736", "MUBLCOM", "", "May-18-1999", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("25735", "TERRIERS", "", "May-18-1999", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("25727", "ORION 3", "", "May-5-1999", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("25724", "USA 143", "", "Apr-30-1999", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("25682", "LANDSAT 7", "", "Apr-15-1999", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("25669", "USA 142", "", "Apr-9-1999", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("25634", "ARGOS", "", "Feb-23-1999", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("25626", "GALAXY 26(TELSTAR 6)", "", "Feb-15-1999", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("25618", "STARDUST", "", "Feb-7-1999", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("25615", "USA 141", "", "Oct-3-1998", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("25585", "INTELSAT 6B(PAS 6B)", "", "Dec-22-1998", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("25578", "IRIDIUM 11", "", "Dec-19-1998", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("25577", "IRIDIUM 20", "", "Dec-19-1998", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("25560", "SWAS", "", "Dec-6-1998", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("25531", "IRIDIUM 83", "", "Nov-6-1998", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("25530", "IRIDIUM 84", "", "Nov-6-1998", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("25528", "IRIDIUM 86", "", "Nov-6-1998", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("25527", "IRIDIUM 2", "", "Nov-6-1998", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("25522", "INTELSAT 8(PAS 8)", "", "Nov-4-1998", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("25520", "PAN SAT", "", "Oct-29-1998", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("25515", "AFRISTAR", "", "Oct-28-1998", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("25509", "SEDSAT 1", "", "Oct-24-1998", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("25508", "DEEP SPACE 1", "", "Oct-24-1998", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("25501", "UFO 9(USA 140)", "", "Oct-20-1998", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("25489", "STEX", "", "Oct-3-1998", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("25473", "INTELSAT 7(PAS 7)", "", "Sep-16-1998", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("25469", "IRIDIUM 80", "", "Sep-8-1998", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("25468", "IRIDIUM 81", "", "Sep-8-1998", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("25467", "IRIDIUM 82", "", "Sep-8-1998", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("25432", "IRIDIUM 76", "", "Aug-19-1998", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("25344", "IRIDIUM 73", "", "May-17-1998", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("25342", "IRIDIUM 70", "", "May-17-1998", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("25338", "NOAA 15", "", "May-13-1998", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("25336", "USA 139", "", "May-9-1998", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("25331", "ECHOSTAR 4", "Communication(DB)", "May-7-1998", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("25320", "IRIDIUM 71", "", "May-2-1998", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("25319", "IRIDIUM 69", "", "May-2-1998", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("25289", "IRIDIUM 66", "", "Apr-7-1998", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("25288", "IRIDIUM 65", "", "Apr-7-1998", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("25287", "IRIDIUM 64", "", "Apr-7-1998", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("25286", "IRIDIUM 63", "", "Apr-7-1998", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("25285", "IRIDIUM 62", "", "Apr-7-1998", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("25280", "TRACE", "", "April 2, 1998", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("25276", "IRIDIUM 60", "", "Mar-30-1998", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("25275", "IRIDIUM 59", "", "Mar-30-1998", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("25274", "IRIDIUM 58", "", "Mar-30-1998", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("25273", "IRIDIUM 57", "", "Mar-30-1998", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("25272", "IRIDIUM 55", "", "Mar-30-1998", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("25263", "IRIDIUM 61", "", "Mar-25-1998", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("25262", "IRIDIUM 51", "", "Mar-25-1998", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("25258", "UFO 8(USA 138)", "", "Mar-16-1998", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("25173", "IRIDIUM 53", "", "Feb-18-1998", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("25172", "IRIDIUM 50", "", "Feb-18-1998", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("25171", "IRIDIUM 54", "", "Feb-18-1998", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("25170", "IRIDIUM 56", "", "Feb-18-1998", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("25169", "IRIDIUM 52", "", "Feb-18-1998", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("25157", "GFO", "", "Feb-10-1998", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("25148", "USA 137", "", "Jan-29-1998", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("25126", "HGS-1(ASIASAT 3)", "", "Dec-24-1997", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("25106", "IRIDIUM 47", "", "Dec-20-1997", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("25105", "IRIDIUM 24", "", "Dec-20-1997", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("25104", "IRIDIUM 45", "", "Dec-20-1997", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("25086", "GALAXY 8", "", "Dec-8-1997", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("25078", "IRIDIUM 44", "", "Dec-8-1997", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("25077", "IRIDIUM 42", "", "Dec-8-1997", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("25043", "IRIDIUM 38", "", "Nov-9-1997", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("25042", "IRIDIUM 39", "", "Nov-9-1997", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("25041", "IRIDIUM 40", "", "Nov-9-1997", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("25040", "IRIDIUM 41", "", "Nov-9-1997", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("25034", "USA 136", "", "Nov-8-1997", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("25030", "NAVSTAR 44(USA 135)", "Navigation", "Nov-6-1997", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("25019", "USA 134", "", "Oct-25-1997", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("25017", "USA 133", "", "Oct-24-1997", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("25004", "ECHOSTAR 3", "Communication(DB)", "Oct-5-1997", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("24967", "IRIDIUM 36", "", "Sep-27-1997", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("24966", "IRIDIUM 35", "", "Sep-27-1997", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("24954", "FAISAT 2V", "", "Sep-23-1997", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("24950", "IRIDIUM 31", "", "Sep-14-1997", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("24948", "IRIDIUM 28", "", "Sep-14-1997", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("24946", "IRIDIUM 33", "", "Sep-14-1997", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("24945", "IRIDIUM 32", "", "Sep-14-1997", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("24944", "IRIDIUM 29", "", "Sep-14-1997", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("24920", "FORTE", "", "Aug-29-1997", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("24916", "INTELSAT 5(PAS 5)", "", "Aug-28-1997", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("24912", "ACE", "", "Aug-25-1997", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("24907", "IRIDIUM 22", "", "Aug-21-1997", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("24905", "IRIDIUM 46", "", "Aug-21-1997", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("24903", "IRIDIUM 26", "", "Aug-21-1997", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("24891", "PAS 6", "", "Aug-8-1997", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("24883", "ORBVIEW 2(SEASTAR)", "", "Aug-1-1997", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("24876", "NAVSTAR 43(USA 132)", "Navigation", "Jul-23-1997", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("24873", "IRIDIUM 921", "", "Jul-9-1997", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("24872", "IRIDIUM 18", "", "Jul-9-1997", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("24871", "IRIDIUM 920", "", "Jul-9-1997", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("24870", "IRIDIUM 17", "", "Jul-9-1997", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("24869", "IRIDIUM 15", "", "Jul-9-1997", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("24842", "IRIDIUM 911", "", "Jun-18-1997", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("24841", "IRIDIUM 16", "", "Jun-18-1997", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("24839", "IRIDIUM 10", "", "Jun-18-1997", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("24837", "IRIDIUM 12", "", "Jun-18-1997", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("24836", "IRIDIUM 914", "", "Jun-18-1997", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("24812", "GALAXY 25(TELSTAR 5)", "", "May-24-1997", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("24796", "IRIDIUM 4", "", "May-5-1997", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("24795", "IRIDIUM 5", "", "May-5-1997", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("24793", "IRIDIUM 7", "", "May-5-1997", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("24786", "GOES 10", "Meteorology", "Apr-25-1997", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("24753", "DMSP 5D-2 F14(USA 131)", "", "Apr-4-1997", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("24748", "DIRECTV 6(TEMPO 2)", "Communication", "Mar-8-1997", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("24737", "USA 130", "", "Feb-23-1997", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("24680", "USA 129", "", "Dec-20-1996", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("24648", "MGS", "", "Nov-7-1996", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("24320", "NAVSTAR 39(USA 128)", "Navigation", "Sep-12-1996", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("24313", "ECHOSTAR 2", "", "Sep-11-1996", R.mipmap.united_states_of_america));
        USA_Sat_Obj.add(new Satellite("24285", "FAST", "", "Aug-21-1996", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("23967", "UFO 7(USA 127)", "", "Jul-25-1996", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("23953", "NAVSTAR 38(USA 126)", "Navigation", "Jul-16-1996", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("23945", "USA 125", "", "Jul-3-1996", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("23940", "TOMS EP", "", "Jul-2-1996", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("23937", "USA 124", "", "May-12-1996", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("23936", "USA 123", "", "May-12-1996", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("23908", "USA 121", "", "May-12-1996", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("23907", "USA 120", "", "May-12-1996", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("23893", "USA 119", "", "May-12-1996", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("23877", "GALAXY 9", "", "May-24-1996", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("23862", "USA 122", "", "May-12-1996", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("23855", "USA 118", "", "Apr-24-1996", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("23851", "MSX", "", "Apr-24-1996", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("23833", "NAVSTAR 37(USA 117)", "Navigation", "Mar-28-1996", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("23814", "REX 2", "", "Mar-9-1996", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("23802", "POLAR", "", "Feb-24-1996", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("23764", "INTELSAT 3R(PAS 3R)", "", "Jan-12-1996", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("23754", "ECHOSTAR 1", "Communication(DB)", "Dec-28-1995", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("23752", "SKIPPER", "", "Dec-28-1995", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("23741", "GALAXY 3R", "", "Dec-15-1995", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("23712", "USA 115", "", "Nov-6-1995", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("23711", "SURFSAT", "", "Nov-4-1995", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("23696", "UFO 6(USA 114)", "", "Oct-22-1995", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("23670", "TELSTAR 4(TELSTAR 402R)", "", "Sep-24-1995", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("23628", "USA 113", "", "Jul-31-1995", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("23613", "TDRS 7", "", "Jul-13-1995", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("23609", "USA 112", "", "Jul-10-1995", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("23598", "DIRECTV 3(DBS/NIMIQ 3)", "Communication", "Jul-10-1995", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("23589", "UFO 5(USA 111)", "", "May-31-1995", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("23581", "GOES 9", "Meteorology", "May-23-1995", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("23567", "USA 110", "", "May-14-1995", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("23553", "AMSC 1", "", "Apr-7-1995", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("23547", "ORBVIEW 1(MICROLAB)", "", "Apr-3-1995", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("23533", "DMSP 5D-2 F13(USA 109)", "", "Mar-24-1995", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("23473", "ODERACS 2C", "", "Feb-3-1995", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("23467", "UFO 4(USA 108)", "", "Jan-29-1995", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("23465", "FAISAT", "", "Jan-24-1995", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("23455", "NOAA 14", "", "Dec-30-1994", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("23435", "USA 107", "", "Dec-22-1994", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("23413", "TELSTAR 11(ORION 1)", "", "Nov-29-1994", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("23333", "WIND", "", "Nov-1-1994", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("23233", "DMSP 5D-2 F12(USA 106)", "", "Aug-29-1994", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("23223", "USA 105", "", "Aug-27-1994", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("23192", "DIRECTV 2(DBS 2)", "Communication", "Aug-3-1994", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("23191", "APEX", "", "Aug-3-1994", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("23175", "INTELSAT 2(PAS 2)", "", "Jul-8-1994", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("23132", "UFO 3(USA 104)", "", "Jun-24-1994", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("23105", "STEP 2", "", "May-19-1994", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("23097", "USA 103", "", "May-3-1994", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("23051", "GOES 8", "Meteorology", "Apr-13-1994", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("23031", "USA 102", "", "Mar-13-1994", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("23030", "USA 101", "", "Mar-13-1994", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("23027", "NAVSTAR 36(USA 100)", "Navigation", "Mar-10-1994", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("23016", "GALAXY 1R", "", "Feb-19-1994", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("22993", "ODERACS D", "", "Feb-3-1994", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("22992", "ODERACS C", "", "Feb-3-1994", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("22988", "USA 99", "", "Feb-7-1994", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("22973", "CLEMENTINE 1(DSPSE)", "", "Jan-25-1994", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("22930", "DIRECTV 1(DBS 1)", "", "Dec-18-1993", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("22927", "TELSTAR 401", "", "Dec-16-1993", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("22915", "USA 97", "", "Nov-28-1993", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("22877", "NAVSTAR 35(USA 96)", "Navigation", "Oct-26-1993", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("22827", "HEALTHSAT 2", "", "Oct-26-1993", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("22796", "ACTS", "", "Sep-12-1993", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("22787", "UFO 2(USA 95)", "", "Sep-3-1993", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("22779", "NAVSTAR 34(USA 94)", "Navigation", "Aug-30, 1993", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("22739", "NOAA 13", "", "Aug-9-993", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("22719", "USA 93", "", "Jul-19-1993", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("22700", "NAVSTAR 33(USA 92)", "Navigation", "Jun-26-1993", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("22698", "RADCAL", "", "Jun-25-1993", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("22694", "HGS 4(GALAXY 4)", "", "Jun-25-1993", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("22657", "NAVSTAR 32(USA 91)", "Navigation", "May-13-1993", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("22638", "ALEXIS", "", "Apr-25-1993", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("22581", "NAVSTAR 31(USA 90)", "Navigation", "Mar-30-1993", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("22563", "UFO 1(USA 98)", "", "Mar-25-1993", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("22518", "USA 89", "", "Dec-2-1992", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("22489", "OXP 1", "", "Feb-9-1993", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("22446", "NAVSTAR 30(USA 88)", "Navigation", "Feb-3-1993", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("22314", "TDRS 6", "", "Jan-13-1993", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("22275", "NAVSTAR 29(USA 87)", "Navigation", "Dec-18-1992", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("22231", "NAVSTAR 28(USA 85)", "Navigation", "Nov-22-1992", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("22205", "GALAXY 7", "", "Oct-28-1992", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("22136", "MARS OBSERVER", "", "Sep-25-1992", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("22117", "SATCOM C3", "", "Sep-10-1992", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("22108", "NAVSTAR 27(USA 84)", "Navigation", "Sep-9-1992", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("22096", "SATCOM C4", "", "Aug-31-1992", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("22076", "TOPEX/POSEIDON", "", "Aug-10-1992", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("22014", "NAVSTAR 26(USA 83)", "Navigation", "Jul-7-1992", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("22009", "USA 82", "", "Jul-2-1992", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("21949", "USA 81", "", "Apr-25, 1992", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("21930", "NAVSTAR 25(USA 80)", "Navigation", "Apr-10, 1992", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("21906", "GALAXY 5", "", "Mar-14-1992", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("21890", "NAVSTAR 24(USA 79)", "Navigation", "Feb-23-1992", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("21873", "USA 78", "", "Feb-11-1992", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("21809", "USA 77", "", "Nov-8-1991", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("21808", "USA 76", "", "Nov-8-1991", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("21805", "USA 75", "", "Nov-24-1991", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("21799", "USA 74", "", "Nov-8-1991", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("21798", "DMSP 5D-2 F11(USA 73)", "", "Nov-28-1991", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("21775", "USA 72", "", "Nov-8-1991", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("21660", "WESTFORD NEEDLES", "", "May-9-1963", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("21639", "TDRS 5", "", "Aug-2-1991", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("21576", "ORBCOMM-X", "", "Jul-17-1991", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("21552", "NAVSTAR 23(USA 71)", "Navigation", "Jul-4-1991", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("21527", "REX", "", "Jun-29-1991", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("21392", "AURORA 2", "", "May-29-1991", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("21263", "NOAA 12", "", "May-14-1991", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("21262", "USA 70", "", "Apr-28-1991", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("21227", "SPACENET 4(ASC 2)", "", "Apr-13-1991", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("21147", "USA 69", "", "Mar-8-1991", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("20978", "DMSP 5D-2 F10(USA 68)", "", "Dec-1-1990", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("20963", "USA 67", "", "Nov-15-1990", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("20959", "NAVSTAR 22(USA 66)", "Navigation", "Nov-26-1990", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("20946", "GSTAR 4", "", "Nov-20-1990", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("20945", "SATCOM C1", "", "Nov-20-1990", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("20929", "USA 65", "", "Nov-13-1990", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("20873", "GALAXY 6", "", "Oct-12-1990", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("20872", "SBS 6", "", "Oct-12-1990", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("20842", "ULYSSES", "", "Oct-6-1990", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("20830", "NAVSTAR 21(USA 64)", "Navigation", "Oct-1-1990", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("20724", "NAVSTAR 20(USA 63)", "Navigation", "Aug-2-1990", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("20712", "CRRES", "", "Jul-25-1990", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("20692", "USA 62", "", "Jun-8-1990", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("20691", "USA 61", "", "Jun-8-1990", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("20682", "USA 60", "", "Jun-8-1990", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("20641", "USA 59", "", "Jun-8-1990", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("20608", "MACSAT 2(M 2)", "", "May-9-1990", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("20607", "MACSAT 1(M 1)", "", "May-9-1990", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("20580", "HST", "", "Apr-4-1990", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("20570", "NEWSAT-1(PALAPA B2R)", "", "Apr-13-1990", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("20562", "USA 58", "", "Apr-11-1990", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("20561", "USA 57", "", "Apr-11-1990", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("20560", "USA 56", "", "Apr-11-1990", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("20547", "USA 55", "", "Apr-5-1990", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("20533", "NAVSTAR 19(USA 54)", "Navigation", "Mar-26-1990", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("20516", "USA 53", "", "Febr-28-1990", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("20504", "WESTFORD NEEDLES", "", "May-9-1963", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("20452", "NAVSTAR 18(USA 50)", "Navigation", "Jan-24-1990", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("20441", "OSCAR 18(WEBERSAT)", "", "Janu-22-1990", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("20439", "OSCAR 16(PACSAT)", "", "Jan-22-1990", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("20410", "LEASAT 5", "", "Jan-9-1990", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("20361", "NAVSTAR 17(USA 49)", "Navigation", "Dec-11-1989", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("20355", "USA 48", "", "Nov-23-1989", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("20322", "COBE", "", "Nov-18-1989", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("20302", "NAVSTAR 16(USA 47)", "Navigation", "Oct-21-1989", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("20253", "FLTSATCOM 8(USA 46)", "", "Sep-25-1989", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("20220", "USA 45", "", "Sep-6-1989", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("20203", "USA 44", "", "Sep-4-1989", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("20202", "USA 43", "", "Sep-4-1989", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("20185", "NAVSTAR 15(USA 42)", "Navigation", "Aug-18-1989", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("20167", "USA 40", "", "Aug-8-1989", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("20066", "USA 39", "", "Jun-14-1989", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("20061", "NAVSTAR 14(USA 38)", "Navigation", "Jun-10-1989", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("20023", "WESTFORD NEEDLES", "", "May-9-1963", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("20005", "WESTFORD NEEDLES", "", "May-9-1963", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("19976", "USA 37", "", "May-10-1989", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("19946", "WESTFORD NEEDLES", "", "May-9-1963", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("19891", "WESTFORD NEEDLES", "", "May-9-1963", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("19883", "TDRS 4", "", "Mar-13-1989", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("19802", "NAVSTAR 13(USA 35)", "Navigation", "Feb-14-1989", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("19671", "USA 34", "", "Dec-2-1988", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("19548", "TDRS 3", "", "Sep-29-1988", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("19531", "NOAA 11", "", "Sep-24-1988", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("19484", "SBS 5", "", "Sep-8-1988", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("19483", "GSTAR 3", "", "Sep-8-1988", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("19460", "USA 32", "", "Sep-5-1988", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("19458", "USA 31", "", "Sep-2-1988", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("19420", "OSCAR 31", "", "Aug-25-1988", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("19419", "OSCAR 25", "", "Aug-25-1988", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("19299", "WESTFORD NEEDLES", "", "May-9-1963", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("19223", "NOVA 2", "", "Jun-16-1988", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("19217", "PAS 1", "", "Jun-15-1988", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("19109", "WESTFORD NEEDLES", "", "May-9-1963", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("19071", "OSCAR 32", "", "Apr-26-1988", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("19070", "OSCAR 23", "", "Apr-26-1988", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("19059", "WESTFORD NEEDLES", "", "May-9-1963", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("19051", "WESTFORD NEEDLES", "", "May-9-1963", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("19030", "WESTFORD NEEDLES", "", "May-9-1963", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("18962", "WESTFORD NEEDLES", "", "May-9-1963", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("18951", "SPACENET 3R", "", "Mar-11-1988", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("18822", "DMSP 5D-2 F9(USA 29)", "", "Feb-3-1988", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("18688", "WESTFORD NEEDLES", "", "May-9-1963", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("18615", "WESTFORD NEEDLES", "", "May-9-1963", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("18583", "USA 28", "", "Nov-29-1987", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("18543", "WESTFORD NEEDLES", "", "May-9-1963", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("18362", "OSCAR 29", "", "Sep-16-1987", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("18361", "OSCAR 27", "", "Sep-16-1987", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("18123", "DMSP 5D-2 F8(USA 26)", "", "Jun-20-1987", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("18025", "USA 25", "", "May-15-1987", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("18010", "USA 24", "", "May-15-1987", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("18009", "USA 23", "", "May-15-1987", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("17997", "USA 22", "", "May-15-1987", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("17561", "GOES 7", "Meteorology", "Feb-26-1987", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("17506", "USA 21", "", "Feb-12-1987", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("17181", "FLTSATCOM 7(USA 20)", "", "Dec-5-1986", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("17070", "POLAR BEAR", "", "Nov-14-1986", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("16969", "NOAA 10", "", "Sep-17-1986", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("16649", "GSTAR 2", "", "Mar-28-1986", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("16631", "USA 18", "", "Feb-9-1986", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("16625", "USA 17", "", "Feb-9-1986", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("16624", "USA 16", "", "Feb-9-1986", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("16591", "USA 15", "", "Feb-9-1986", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("16482", "SATCOM K1", "", "Jan-12-1986", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("16276", "SATCOM K2", "", "Nov-27-1985", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("16129", "NAVSTAR 11(USA 10)", "Navigation", "Oct-9-1985", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("16117", "USA 12", "", "Oct-3-1985", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("16116", "USA 11", "", "Oct-3-1985", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("15995", "LEASAT 4", "", "Aug-27-1985", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("15994", "ASC 1", "", "Aug-27-1985", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("15936", "OSCAR 24", "", "Aug-3-1985", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("15935", "OSCAR 30", "", "Aug-3-1985", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("15826", "TELSTAR 303", "", "Jun-17-1985", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("15677", "GSTAR 1", "", "May-8-1985", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("15643", "LEASAT 3", "", "Apr-12-1985", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("15595", "GEOSAT", "", "Mar-13-1985", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("15546", "USA 9", "", "Feb-8-1985", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("15543", "USA 8", "", "Jan-24-1985", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("15453", "USA 7", "", "Dec-22-1984", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("15427", "NOAA 9", "", "Dec-12-1984", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("15385", "SPACENET 2", "", "Nov-10-1984", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("15384", "LEASAT 1", "", "Nov-8-1984", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("15362", "NOVA 3", "", "Oct-12-1984", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("15354", "ERBS", "", "Oct-5-1984", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("15308", "GALAXY 3", "", "Sep-21-1984", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("15271", "NAVSTAR 10(USA 5)", "Navigation", "Sep-8-1984", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("15237", "TELSTAR 302", "", "Aug-30-1984", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("15236", "LEASAT 2", "", "Aug-30-1984", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("15235", "SBS 4", "", "Aug-30-1984", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("15226", "USA 4", "", "Aug-28-1984", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("15199", "CCE 1(AMPTE)", "", "Aug-16-1984", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("15071", "USA 3", "", "Jun-25-1984", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("15039", "NAVSTAR 9(USA 1)", "Navigation", "Jun-13-1984", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("14930", "OPS 7641", "", "Apr-14-1984", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("14795", "JD 3", "", "Feb-5-1984", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("14780", "LANDSAT 5", "", "Mar-1-1984", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("14729", "JD 2", "", "Feb-5-1984", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("14728", "JD 1", "", "Feb-5-1984", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("14690", "OPS 8737", "", "Feb-5-1984", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("14675", "OPS 0441", "", "Jan-31-1984", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("14506", "OPS 1294(DMSP 5D-2 F7)", "", "Nov-18-1983", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("14365", "GALAXY 2", "", "Sep-22-1983", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("14328", "SATCOM 2R", "", "Sep-8-1983", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("14237", "OPS 7304", "", "Jul-31-1983", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("14189", "OPS 9794(NAVSTAR 8)", "Navigation", "Jul-14-1983", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("14180", "GB 3", "", "Jun-9-1983", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("14158", "GALAXY 1", "", "Jun-28-1983", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("14154", "HILAT", "", "Jun-27-1983", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("14144", "GB 2", "", "Jun-9-1983", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("14143", "GB 1", "", "Jun-9-1983", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("14139", "OPS 3899", "", "Jun-20-1983", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("14112", "OPS 6432", "", "Jun-9-1983", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("14050", "GOES 6", "Meteorology", "Apr-28-1983", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("13984", "SATCOM 1R", "", "Apr-11-1983", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("13969", "TDRS 1", "", "Apr-4-1983", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("13923", "NOAA 8", "", "Mar-28-1983", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("13912", "OV2-3", "", "Dec-21-1965", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("13874", "SSC", "", "Feb-9-1983", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("13845", "SSB", "", "Feb-9-1983", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("13844", "SSA", "", "Feb-9-1983", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("13792", "SSD", "", "Feb-9-1983", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("13791", "OPS 0252", "", "Feb-9-1983", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("13777", "IRAS", "", "Jan-26-1983", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("13736", "OPS 9845(DMSP 5D-2 F6)", "", "Dec-21-1982", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("13651", "SBS 3", "", "Nov-11-1982", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("13637", "DSCS 3-1", "", "Oct-30-1982", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("13636", "DSCS 2-15", "", "Oct-30-1982", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("13631", "SATCOM C5", "", "Oct-28-1982", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("13367", "LANDSAT 4", "", "Jul-16-1982", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("13269", "WESTAR 5", "", "Jun-9-1982", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("13172", "OPS 6553", "", "May-11-1982", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("13086", "OPS 8701", "", "Mar-6-1982", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("13069", "WESTAR 4", "", "Feb-26-1982", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("13035", "SATCOM 4", "", "Jan-16-1982", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("12967", "SATCOM 3R", "", "Nov-20-1981", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("12930", "OPS 4029", "", "Oct-31-1981", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("12855", "SBS 2", "", "Sept-24-1981", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("12635", "FLTSATCOM 5", "", "Aug-6-1981", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("12624", "DYNAMICS EXPLORER 1", "", "Aug-3-1981", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("12553", "NOAA 7", "", "Jun-23-1981", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("12472", "GOES 5", "Meteorology", "May-22-1981", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("12458", "NOVA 1", "", "May-15-1981", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("12418", "OPS 7225", "", "Apr-24-1981", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("12339", "OPS 7350", "", "Mar-16-1981", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("12309", "ESIAFI 1(COMSTAR 4)", "", "Feb-21-1981", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("12093", "OPS 5805", "", "Dec-13-1980", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("12065", "SBS 1", "", "Nov-15-1980", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("12046", "OPS 6394(FLTSATCOM 4)", "", "Oct-31-1980", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("11964", "GOES 4", "Meteorology", "Sep-9-1980", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("11852", "OPS 1292", "", "Jun-18-1980", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("11783", "OPS 5118(NAVSTAR 6)", "Navigation", "Apr-26-1980", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("11745", "EP 3", "", "Mar-3-1980", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("11732", "EP 2", "", "Mar-3-1980", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("11731", "EP 1", "", "Mar-3-1980", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("11720", "OPS 7245", "", "Mar-3-1980", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("11690", "OPS 5117(NAVSTAR 5)", "Navigation", "Feb-9-1980", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("11669", "OPS 6393(FLTSATCOM 3)", "", "Jan-18-1980", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("11635", "SATCOM 3", "", "Dec-7-1979", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("11622", "OPS 9444(DSCS 2-14)", "", "Nov-21-1979", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("11621", "OPS 9443(DSCS 2-13)", "", "Nov-21-1979", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("11558", "OPS 1948", "", "Oct-1-1979", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("11484", "WESTAR 3", "", "Aug-10, 1979", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("11416", "NOAA 6", "", "Jun-27-1979", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("11397", "OPS 7484", "", "Jun-10-1979", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("11389", "OPS 5390", "", "Jun-6-1979", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("11353", "OPS 6392(FLTSATCOM 2)", "", "May-4-1979", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("11306", "OPS 6675", "", "Mar-16-1979", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("11256", "SCATHA", "", "Jan-30-1979", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("11145", "OPS 9442(DSCS 2-12)", "", "Dec-14-1978", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("11144", "OPS 9441(DSCS 2-11)", "", "Dec-14-1978", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("11141", "OPS 5114(NAVSTAR 4)", "Navigation", "Dec-14-1978", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("11080", "NIMBUS 7", "", "Oct-24-1978", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("11060", "TIROS N", "", "Oct-13-1978", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("11054", "OPS 5113(NAVSTAR 3)", "Navigation", "Oct-7-1978", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("11004", "ISEE 3(ICE)", "", "Aug-12-1978", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("10975", "COMSTAR 3", "", "Jun-29-1978", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("10967", "SEASAT 1", "", "Jun-27-1978", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("10953", "GOES 3", "Meteorology", "Jun-16-1978", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("10941", "OPS 9454", "", "Jun-10-1978", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("10893", "OPS 5112(NAVSTAR 2)", "Navigation", "May-13-1978", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("10820", "OPS 6182(DMSP 5D-1 F2)", "", "May-1-1978", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("10787", "OPS 8790", "", "Apr-7-1978", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("10734", "OPS 7858", "", "Mar-16-1978", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("10703", "OSCAR 8", "", "Mar-5-1978", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("10702", "LANDSAT 3", "", "Mar-5-1978", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("10688", "OPS 6031", "", "Feb-25-1978", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("10684", "OPS 5111(NAVSTAR 1)", "Navigation", "Feb-22-1978", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("10669", "OPS 6391(FLTSATCOM 1)", "", "Feb-9-1978", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("10637", "IUE", "", "Jan-26-1978", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("10594", "SS 3", "", "Dec-8-1977", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("10544", "SS 2", "", "Dec-8-1977", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("10529", "SS 1", "", "Dec-8-1977", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("10508", "OPS 4258", "", "Dec-11-1977", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("10502", "OPS 8781", "", "Dec-8-1977", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("10457", "TRANSAT", "", "Dec-28-1977", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("10321", "VOYAGER 1", "", "Sep-5-1977", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("10271", "VOYAGER 2", "", "Aug-20-1977", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("10091", "NTS 2", "", "Jun-23-1977", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("10061", "GOES 2", "", "Jun-16-1977", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("10033", "OPS 5644", "", "Jun-5-1977", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("10016", "OPS 9751", "", "May-23-1977", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("10001", "OPS 9438(DSCS 2-8)", "", "May-12-1977", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("10000", "OPS 9437(DSCS 2-7)", "", "May-12-1977", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("9803", "OPS 3151", "", "Feb-6-1977", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("9478", "MARISAT 2", "", "Oct-14-1976", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("9415", "OPS 5721", "", "Sep-11-1976", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("9270", "OPS 7940", "", "Aug-6-1976", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("9057", "NOAA 5", "", "Jul-29-1976", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("9047", "COMSTAR 2", "", "Jul-22-1976", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("9008", "OPS 5366", "", "Jul-8-1976", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("8916", "OPS 2112", "", "Jun-26-1976", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("8884", "SSU 3", "", "Apr-30-1976", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("8882", "MARISAT 3", "", "Jun-10-1976", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("8871", "OPS 7837", "", "Jun-2-1976", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("8860", "P 76-5", "", "May-22-1976", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("8838", "COMSTAR 1", "", "May-13-1976", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("8836", "SSU 2", "", "Apr-30-1976", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("8835", "SSU 1", "", "Apr-30-1976", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("8820", "LAGEOS 1", "Geodesy", "May-4-1976", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("8818", "OPS 6431", "", "Apr-30-1976", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("8774", "SATCOM 2", "", "Mar-26-1976", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("8749", "SOLRAD 11B", "", "Mar-15-1976", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("8748", "SOLRAD 11A", "", "Mar-15-1976", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("8747", "LES 9", "", "Mar-15-1976", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("8746", "LES 8", "", "Mar-15-1976", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("8697", "MARISAT 1", "", "Feb-19-1976", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("8482", "OPS 3165", "", "Dec-14-1975", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("8476", "SATCOM 1", "", "Dec-13-1975", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("8366", "GOES 1(SMS-C)", "Meteorology", "Oct-16-1975", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("8199", "VIKING 2 ORBITER", "", "Sep-9-1975", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("8108", "VIKING 1 ORBITER", "", "Aug-20-1975", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("7963", "OPS 4966", "", "Jun-18-1975", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("7937", "OPS 6381(SSU 1)", "", "Jun-8-1975", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("7924", "NIMBUS 6", "", "Jun-12-1975", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("7816", "OPS 6226", "", "May-24-1975", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("7734", "GEOS 3", "", "Apr-9-1975", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("7687", "OPS 2439", "", "Mar-10-1975", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("7648", "SMS 2", "", "Feb-6-1975", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("7615", "LANDSAT 2", "", "Jan-22-1975", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("7530", "OSCAR 7", "", "Nov-15-1974", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("7529", "NOAA 4", "", "Nov-15-1974", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("7466", "WESTAR 2", "", "Oct-10-1974", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("7411", "OPS 6983(DMSP 5C F1)", "", "Aug-9-1974", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("7369", "OPS 7518(NTS 1)", "", "Jul-14-1974", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("7318", "ATS 6", "", "May-30-1974", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("7298", "SMS 1", "", "May-17-1974", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("7250", "WESTAR 1", "", "Apr-13-1974", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("7244", "OPS 4547", "", "Apr-10-1974", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("7218", "OPS 8579(DMSP 5B F5)", "", "Mar-16-1974", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("6974", "OPS 9434(DSCS 2-4)", "", "Dec-13-1973", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("6973", "OPS 9433(DSCS 2-3)", "", "Dec-13-1973", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("6938", "OPS 6630(2)", "", "Nov-10-1973", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("6920", "NOAA 3", "", "Nov-6-1973", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("6919", "MARINER 10(MVM-73)", "", "Nov-3-1973", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("6909", "NNSS 20(TRANSIT 20)", "", "Oct-30-1973", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("6893", "EXPLORER 50(IMP-8)", "", "Oct-26-1973", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("6822", "OPS 8314(2)", "", "Oct-10-1972", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("6791", "OPS 7724", "", "Aug-21-1973", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("6787", "OPS 8364(DMSP 4)", "", "Aug-17-1973", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("6691", "OPS 6157", "", "Jun-12-1973", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("6686", "EXPLORER 49(RAE-2)", "", "Jun-10-1973", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("6421", "PIONEER 11", "", "Apr-6-1973", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("6380", "OPS 6063", "", "Mar-6-1973", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("6317", "OPS 9390", "", "Dec-20-1972", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("6305", "NIMBUS 5", "", "Dec-11-1972", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("6275", "OPS 7323(DMSP 5B F3)", "", "Nov-9-1972", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("6236", "OSCAR 6", "", "Oct-15-1972", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("6235", "NOAA 2(ITOS-D)", "", "Oct-15-1972", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("6217", "OPS 8180(STP RADSAT)", "", "Oct-2-1972", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("6197", "EXPLORER 47(IMP-7)", "", "Sep-23-1972", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("6173", "TRIAD 1", "", "Sep-2-1972", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("6153", "OAO 3(COPERNICUS)", "", "Aug-21-1972", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("6126", "LANDSAT 1(ERTS 1)", "", "Jul-23-1972", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("6005", "APOLLO 16 LM(ORION)", "", "Apr-16-1972", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("5903", "OPS 5058(DMSP 5B F2)", "", "Mar-24-1972", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("5860", "PIONEER 10", "", "Mar-3-1972", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("5851", "OPS 1570", "", "Mar-1-1972", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("5702", "WESTFORD NEEDLES", "", "May-9-1963", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("5682", "OPS 7898(P/L 4)", "", "Dec-14-1971", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("5681", "OPS 7898(P/L 3)", "", "Dec-14-1971", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("5680", "OPS 7898(P/L 2)", "", "Dec-14-1971", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("5678", "OPS 7898(P/L 1)", "", "Dec-14-1971", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("5588", "OPS 9432(DSCS 2-2)", "", "Nov-3-1971", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("5587", "OPS 9431(DSCS 2-1)", "", "Nov-3-1971", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("5560", "ASTEX 1", "", "Oct-17-1971", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("5557", "OPS 4311(DMSP 5B F1)", "", "Oct-14-1971", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("5398", "RIGIDSPHERE 2(LCS 4)", "", "Aug-7-1971", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("5397", "OV1-21", "", "Aug-7-1971", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("5377", "APOLLO 15(IRW PL)", "", "Jul-26-1971", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("5261", "MARINER 9(MARS)", "", "May-30-1971", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("5204", "OPS 3811", "", "May-5-1971", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("5053", "OPS 4788", "", "Mar-21-1971", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("4953", "OPS 5268(DMSP 5A F3)", "", "Feb-17-1971", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("4793", "NOAA 1", "", "Dec-11-1970", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("4630", "OPS 5960", "", "Nov-6-1970", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("4512", "OPS 0203(DMSP 5A F2)", "", "Sep-3-1970", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("4510", "OPS 7329", "", "Sep-1-1970", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("4507", "NNSS 19(TRANSIT 19)", "", "Aug-27-1970", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("4418", "OPS 5346", "", "Jun-19-1970", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("4368", "OPS 7033(VELA 11)", "", "Apr-8-1970", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("4366", "OPS 7044(VELA 12)", "", "Apr-8-1970", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("4363", "TOPO 1", "", "Apr-8-1970", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("4331", "OPS 0054(DMSP 5A F1)", "", "Feb-11-1970", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("4327", "SERT 2", "", "Feb-4-1970", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("4320", "ITOS 1 (TIROS M)", "", "Jan-23-1970", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("4295", "OPS 7613(P/L 6)", "", "Sep-30-1969", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("4259", "OPS 7613(P/L 3)", "", "Sep-30-1969", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("4257", "TIMATION 2", "", "Sep-30-1969", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("4256", "OPS 7613(P/L 1)", "", "Sep-30-1969", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("4247", "OPS 7613(P/L 5)", "", "Sep-30-1969", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("4237", "OPS 7613(P/L 4)", "", "Sep-30-1969", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("4168", "TEMPSAT 2", "", "Sep-30-1969", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("4166", "SOICAL (CYLINDER)", "", "Sep-30-1969", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("4132", "SOICAL (CONE)", "", "Sep-30-1969", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("4068", "ATS 5", "", "Aug-12-1969", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("4047", "OPS 1127(DMSP 4B F3)", "", "Jul-23-1969", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("4041", "APOLLO 11 LM (APS)", "", "Jul-16-1969", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("3955", "OPS 6911(VELA 10)", "", "May-23-1969", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("3954", "OPS 6909(VELA 9)", "", "May-23-1969", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("3952", "OV5-9", "", "May-23-1969", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("3951", "ERS 26(OV5-6)", "", "May-23-1969", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("3950", "ERS 29(OV5-5)", "", "May-23-1969", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("3949", "APOLLO 10 LM (APS)", "", "May-18-1969", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("3948", "APOLLO 10 LM (DPS)", "", "May-18-1969", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("3891", "SECOR 13(EGRS 13)", "", "Apr-14-1969", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("3889", "OPS 3148", "", "Apr-13-1969", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("3837", "MARINER 7(MARS)", "", "Mar-27-1969", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("3825", "OV1-19", "", "Mar-18-1969", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("3764", "ESSA 9(TOS-G)", "", "Feb-26-1969", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("3759", "MARINER 6(MARS)", "", "Feb-25-1969", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("3691", "OPS 0757(TACSAT)", "", "Feb-9-1969", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("3673", "OPS 2644", "", "Feb-5-1969", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("3615", "ESSA 8 (TOS-F)", "", "Dec-15-1968", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("3605", "OPS 7684", "", "Dec-12-1968", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("3597", "OAO 2", "", "Dec-7-1968", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("3533", "PIONEER 9", "", "Nov-8-1968", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("3510", "OPS 4078(DMSP 4B F2)", "", "Oct-23-1968", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("3431", "LES 6", "", "Sep-26-1968", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("3430", "ERS 21(OV5-4)", "", "Sep-26-1968", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("3428", "OV2-5", "", "Sep-26-1968", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("3345", "ESSA 7(TOS-E)", "", "Aug-16-1968", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("3338", "EXPLORER 40(INJUN-5)", "", "Aug-8-1968", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("3334", "OPS 2222", "", "Aug-6-1968", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("3307", "EXPLORER 38(RAE-A)", "", "Jul-4-1968", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("3291", "OPS 9348(IDSCS 27)", "", "Jun-13-1968", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("3290", "OPS 9347(IDSCS 26)", "", "Jun-13-1968", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("3289", "OPS 9346(IDSCS 25)", "", "Jun-13-1968", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("3288", "OPS 9345(IDSCS 24)", "", "Jun-13-1968", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("3287", "OPS 9344(IDSCS 23)", "", "Jun-13-1968", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("3286", "OPS 9343(IDSCS 22)", "", "Jun-13-1968", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("3285", "OPS 9342(IDSCS 21)", "", "Jun-13-1968", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("3284", "OPS 9341(IDSCS 20)", "", "Jun-13-1968", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("3267", "WESTFORD NEEDLES", "", "May 9, 1963", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("3266", "OPS 7869(DMSP 4B F1)", "", "May 23, 1968", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("3257", "WESTFORD NEEDLES", "", "May-9-1963", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("3255", "WESTFORD NEEDLES", "", "May-9-1963", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("3244", "WESTFORD NEEDLES", "", "May-9-1963", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("3239", "WESTFORD NEEDLES", "", "May-9-1963", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("3174", "OV1-14", "", "Apr-6-1968", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("3173", "OV1-13", "", "Apr-6-1968", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("3133", "OPS 7034(TRANSIT 18)", "", "Mar-2-1968", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("3093", "EXPLORER 36(GEOS 2)", "", "Jan-11-1968", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("3066", "PIONEER 8", "", "Dec-13-967", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("3035", "ESSA 6(TOS-D)", "", "Nov-10-1967", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("3029", "ATS 3", "", "Nov-5-1967", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("2997", "WESTFORD NEEDLES", "", "May-9-1963", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("2980", "OPS 1264(DMSP 4A F4)", "", "Oct-11-1967", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("2965", "OPS 4947(TRANSIT 17)", "", "Sep-25-1967", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("2949", "WESTFORD NEEDLES", "", "May-9-1963", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("2933", "WESTFORD NEEDLES", "", "May-9-1963", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("2920", "OPS 7202(DMSP 4A F3)", "", "Aug-23-1967", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("2909", "SURCAL 150B", "", "May-31-1967", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("2884", "EXPLORER 35(AIMP-E)", "", "Jul-19-1967", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("2876", "AURORA 1", "", "Jun-29-1967", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("2874", "OPS 5712(P/L 153)", "", "May-31-1967", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("2873", "OPS 5712(P/L 152)", "", "May-31-1967", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("2872", "SURCAL 159", "", "May-31-1967", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("2867", "DODGE 1", "", "Jul-1-1967", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("2866", "LES 5", "", "Jul-1-1967", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("2865", "OPS 9334(IDSCS 19)", "", "Jul-1-1967", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("2864", "OPS 9333(IDSCS 18)", "", "Jul-1-1967", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("2863", "OPS 9332(IDSCS 17)", "", "Jul-1-1967", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("2862", "OPS 9331(IDSCS 16)", "", "Jul-1-1967", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("2861", "SECOR 9(EGRS 9)", "", "Jun-29-1967", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("2847", "TIMATION 1", "", "May-31-1967", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("2845", "MARINER 5(VENUS)", "", "Jun-14-1967", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("2834", "GGSE 5", "", "May-31-1967", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("2828", "GGSE 4", "", "May-31-1967", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("2826", "OPS 5712(P/L 160)", "", "May-31-1967", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("2807", "OPS 7218(TRANSIT 16)", "", "May-18-1967", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("2796", "WESTFORD NEEDLES", "", "May-9-1963", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("2769", "ERS 27(OV5-1)", "", "Apr-28-1967", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("2768", "ERS 20(OV5-3)", "", "Apr-28-1967", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("2767", "ERS 18", "", "Apr-28-1967", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("2766", "OPS 6679(VELA 8)", "", "Apr-28-1967", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("2765", "OPS 6638(VELA 7)", "", "Apr-28-1967", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("2757", "ESSA 5", "", "Apr-20-1967", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("2754", "OPS 0100(TRANSIT 15)", "", "Apr-14-1967", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("2669", "OPS 6073(DMSP 4A F2)", "", "Feb-8-1967", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("2657", "ESSA 4(TOS-B)", "", "Jan-26-1967", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("2655", "OPS 9328(IDSCS 15)", "", "Jan-18-1967", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("2654", "OPS 9327(IDSCS 14)", "", "Jan-18-1967", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("2653", "OPS 9326(IDSCS 13)", "", "Jan-18-1967", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("2652", "OPS 9325(IDSCS 12)", "", "Jan-18-1967", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("2651", "OPS 9324(IDSCS 11)", "", "Jan-18-1967", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("2650", "OPS 9323(IDSCS 10)", "", "Jan-18-1967", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("2649", "OPS 9322(IDSCS 9)", "", "Jan-18-1967", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("2645", "OPS 9321(IDSCS 8)", "", "Jan-18-1967", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("2610", "OV1-9", "", "Dec-11-1966", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("2608", "ATS 1", "", "Dec-7-1966", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("2532", "WESTFORD NEEDLES", "", "May-9-1963", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("2531", "WESTFORD NEEDLES", "", "May-9-1963", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("2530", "WESTFORD NEEDLES", "", "May-9-1963", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("2520", "SECOR 8(EGRS 8)", "", "Oct-5-1966", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("2481", "OPS 1920", "", "Oct-5-1966", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("2435", "ESSA 3(TOS-A)", "", "Oct-2-1966", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("2431", "WESTFORD NEEDLES", "", "May-9-1963", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("2418", "OPS 6026(DMSP 4A F1)", "", "Sep-16-1966", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("2412", "ERS 15", "", "Aug-19-1966", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("2411", "SECOR 7(EGRS 7)", "", "Aug-19-1966", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("2403", "OPS 0856", "", "Aug-19-1966", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("2403", "OPS 0856", "", "Aug-19-1966", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("2401", "OPS 2366(TRANSIT 14)", "", "Aug-18-1966", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("2398", "PIONEER 7", "", "Aug-17-1966", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("2389", "OV3-3", "", "Aug-4-1966", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("2381", "WESTFORD NEEDLES", "", "May-9-1963", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("2380", "WESTFORD NEEDLES", "", "May-9-1963", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("2379", "WESTFORD NEEDLES", "", "May-9-1963", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("2378", "WESTFORD NEEDLES", "", "May-9-1963", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("2377", "WESTFORD NEEDLES", "", "May-9-1963", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("2375", "WESTFORD NEEDLES", "", "May-9-1963", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("2372", "WESTFORD NEEDLES", "", "May-9-1963", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("2367", "WESTFORD NEEDLES", "", "May-9-1963", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("2366", "WESTFORD NEEDLES", "", "May-9-1963", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("2365", "WESTFORD NEEDLES", "", "May-9-1963", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("2364", "WESTFORD NEEDLES", "", "May-9-1963", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("2362", "WESTFORD NEEDLES", "", "May-9-1963", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("2361", "WESTFORD NEEDLES", "", "May-9-1963", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("2359", "WESTFORD NEEDLES", "", "May-9-1963", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("2258", "EXPLORER 33 (AIMP-D)", "", "Jul-1-1966", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("2221", "OPS 9317(IDSCS 7)", "", "Jun-16-1966", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("2220", "OPS 9316(IDSCS 6)", "", "Jun-16-1966", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("2219", "OPS 9315(IDSCS 5)", "", "Jun-16-1966", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("2218", "OPS 9314(IDSCS 4)", "", "Jun-16-1966", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("2217", "OPS 9313(IDSCS 3)", "", "Jun-16-1966", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("2216", "OPS 9312(IDSCS 2)", "", "Jun-16-1966", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("2215", "OPS 9311(IDSCS 1)", "", "Jun-16-1966", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("2207", "OPS 9381(GGTS)", "", "Jun-16-1966", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("2201", "OPS 1427(OV3-4)", "", "Jun-10-1966", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("2176", "OPS 0082(TRANSIT 13)", "", "May-19-1966", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("2150", "OPS 1527(OV3-1)", "", "Apr-22-1966", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("2142", "OAO 1", "", "Apr-8-1966", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("2125", "OPS 0340", "", "Mar-31-1966", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("2122", "OV1-5", "", "Mar-30-1966", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("2121", "OV1-4", "", "Mar-30-1966", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("2119", "OPS 1117(TRANSIT 12)", "", "Mar-26-1966", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("2091", "ESSA 2(OT-2)", "", "Feb-28-1966", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("1982", "ESSA 1(OT-3)", "", "Feb-3-1966", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("1952", "OPS 1593(TRANSIT 11)", "", "Jan-28-1966", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("1864", "OPS 1509(TRANSIT 10)", "", "Dec-22-1965", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("1841", "PIONEER 6", "", "Dec-16-1965", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("1806", "EXPLORER 31(ISIS-X)", "", "Nov-29-1965", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("1738", "EXPLORER 30", "", "Nov-19-1965", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("1726", "EXPLORER 29(GEOS 1)", "", "Nov-6-1965", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("1641", "OV2-1", "", "Oct-15-1965", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("1613", "OV1-2", "", "Oct-5-1965", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("1580", "OPS 8068", "", "Sep-10-1965", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("1577", "PORCUPINE 2", "", "Aug-13-1965", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("1520", "CALSPHERE 4(A)", "", "Aug-13-1965", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("1515", "NAVSPASUR ROD 1", "", "Aug-13-1965", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("1514", "OPS 8464(TRANSIT 5B-7)", "", "Aug-13-1965", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("1512", "TEMPSAT 1", "", "Aug-13-1965", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("1510", "DODECAPOLE 2", "", "Aug-13-1965", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("1506", "SECOR 5(EGRS 5)", "", "Aug-10-1965", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("1503", "SURVEYOR MODEL 1", "", "Aug-11-1965", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("1459", "OPS 6564(VELA 6)", "", "Jul-20-1965", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("1458", "OPS 6577(VELA 5)", "", "Jul-20-1965", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("1430", "TIROS 10", "", "Jul-2-1965", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("1420", "OPS 8480(TRANSIT 5B-6)", "", "Jun-24-1965", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("1361", "LCS 1", "", "May-6-1965", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("1360", "LES 2", "", "May-6-1965", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("1328", "EXPLORER 27", "", "Apr-29-1965", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("1315", "SECOR 4(EGRS 4)", "", "Apr-3-1965", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("1314", "OPS 4682(SNAPSHOT)", "", "Apr-3-1965", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("1293", "OSCAR 3", "", "Mar-9-1965", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("1292", "GGSE 3", "", "Mar-9-1965", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("1291", "SOLRAD 7B", "", "Mar-9-1965", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("1272", "PORCUPINE 1", "", "Mar-9-1965", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("1271", "OPS 4988(GREB 6)", "", "Mar-9-1965", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("1244", "GGSE 2", "", "Mar-9-1965", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("1208", "SECOR 3", "", "Mar-9-1965", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("1002", "LES 1", "", "Feb-11-1965", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("1001", "TITAN 3A(TRUSS)", "", "Feb-11-1965", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("978", "TIROS 9", "", "Jan-22-1965", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("965", "OPS 6582(TRANSIT 5B-5)", "", "Dec-13-1964", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("963", "EXPLORER 26(EPE-D)", "", "Dec-21-1964", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("959", "OPS 6582(TRANSIT 5E-5)", "", "Dec-13-1964", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("938", "MARINER 4 (MARS)", "", "Nov-28-1964", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("932", "EXPLORER 25(INJUN-4)", "", "Nov-21-1964", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("923", "MARINER 3(MARS)", "", "Nov-5-1964", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("902", "CALSPHERE 2", "", "Oct-6-1964", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("900", "CALSPHERE 1", "", "Oct-6-1964", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("899", "EXPLORER 22", "", "Oct-10-1964", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("897", "OPS 5798 (TRANSIT 5B-4)", "", "Oct-6-1964", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("879", "OGO 1", "", "Sep-5-1964", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("870", "EXPLORER 20", "", "Aug-25-1964", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("858", "SYNCOM 3", "", "Aug-19-1964", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("837", "OPS 3674(VELA 4)", "", "Jul-17-1964", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("836", "OPS 3662(VELA 3)", "", "Jul-17-1964", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("813", "OPS 4467 B", "", "Jun-18-1964", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("812", "OPS 4467 A", "", "Jun-18-1964", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("801", "OPS 4412(TRANSIT 9)", "", "Jun-4-1964", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("737", "RELAY 2", "", "Jan-21-1964", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("735", "OPS 3367 B", "", "Jan-19-1964", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("734", "OPS 3367 A", "", "Jan-19-1964", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("731", "GREB", "", "Jan-11-1964", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("730", "SOLRAD 7A", "", "Jan-11-1964", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("729", "SECOR 1B", "", "Jan-11-1964", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("728", "GGSE 1(GGRS)", "", "Jan-11-1964", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("716", "TIROS 8", "", "Dec-21-1963", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("705", "TRANSIT 5E 3", "", "Dec-5-1963", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("704", "TRANSIT 5B-2", "", "Dec-5-1963", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("702", "WESTFORD NEEDLES", "", "May-9-1963", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("692", "VELA 1", "", "Oct-17-1963", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("674", "VELA 2", "", "Oct-17-1963", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("671", "RADIATION SAT (5E 1)", "", "Sep-28-1963", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("670", "TRANSIT 5B-1", "", "Sep-28-1963", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("635", "ERS 9", "", "Jul-19-1963", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("634", "SYNCOM 2(A 26)", "", "Jul-26-1963", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("629", "WESTFORD NEEDLES", "", "May-9-1963", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("628", "WESTFORD NEEDLES", "", "May-9-1963", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("622", "MIDAS 7 / ERS 10", "", "Jul-19-1963", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("614", "HITCH HIKER 1", "", "Jun-27-1963", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("608", "ERS 6", "", "May-9-1963", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("602", "WESTFORD NEEDLES", "", "May-9-1963", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("589", "DASH 1", "", "May-9-1963", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("574", "MIDAS 6(FTV 1169)", "", "May-9-1963", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("573", "TELSTAR 2(A-41)", "", "May-7-1963", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("553", "SYNCOM 1", "", "Feb-14-1963", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("506", "EXPLORER 16", "", "Dec-16-1962", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("503", "RELAY 1(A-15)", "", "Dec-13-1962", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("446", "ANNA 1B", "", "Oct-31-1962", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("439", "RANGER 5", "", "Oct-18-1962", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("397", "TIROS 6", "", "Oct-18-1962", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("374", "MARINER 2(VENUS)", "", "Aug-27-1962", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("369", "FTV 3502", "", "Aug-23-1962", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("340", "TELSTAR 1", "", "Jul-10-1962", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("309", "TIROS 5", "", "Jun-19-1962", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("271", "MIDAS 5(STRONGBACK)", "", "Apr-9-1962", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("226", "TIROS 4", "", "Feb-8-1962", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("221", "RANGER 3", "", "Jan-26-1962", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("205", "TRAAC", "", "Nov-15-1961", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("202", "TRANSIT 4B", "", "Nov-15-1961", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("192", "MIDAS 4", "", "Oct-21-1961", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("163", "MIDAS 3", "", "Jul-12-1961", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("162", "TIROS 3", "", "Jul-12-1961", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("117", "SOLRAD 3/INJUN 1", "", "Jun-29-1961", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("116", "TRANSIT 4A", "", "Jun-29-1961", R.mipmap.ic_united_states_of_america_foreground));
//        USA_Sat_Obj.add(new Satellite("113", "PIONEER 4", "", "Mar-3-1959", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("107", "EXPLORER 11", "", "Apr-27-1961", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("58", "COURIER 1B", "", "Oct-4-1960", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("46", "SOLRAD 1(GREB)", "", "Jun-22-1960", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("45", "TRANSIT 2A", "", "Jun-22-1960", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("29", "TIROS 1", "", "Apr-1-1960", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("27", "PIONEER 5", "", "Mar-11-1960", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("22", "EXPLORER 7", "", "Oct-13-1959", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("20", "VANGUARD 3", "", "Sep-18-1959", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("11", "VANGUARD 2", "", "Feb-17-1959", R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite("5", "VANGUARD 1", "", "Mar-17-1958", R.mipmap.ic_united_states_of_america_foreground));
        return USA_Sat_Obj;
    }

    public List<Satellite> URUGUAY_Satellite_List() {
        URUGUAY_Sat_Obj = new ArrayList<>();
        URUGUAY_Sat_Obj.add(new Satellite("40034", "ANTELSAT", "Technology", "Jun-19-2014", R.mipmap.ic_uruguay_foreground));
        return URUGUAY_Sat_Obj;
    }

    public List<Satellite> VENEZUELA_Satellite_List() {
        VENEZUELA_Sat_Obj = new ArrayList<>();
        VENEZUELA_Sat_Obj.add(new Satellite("42954", "VRSS-2", "Observation", "Oct-9-2017", R.mipmap.ic_venezuela_foreground));
        VENEZUELA_Sat_Obj.add(new Satellite("38782", "VRSS-1", "Observation", "Sep-29-2012", R.mipmap.ic_venezuela_foreground));
        VENEZUELA_Sat_Obj.add(new Satellite("33414", "VENESAT-1", "Communication", "Oct-29-2008", R.mipmap.ic_venezuela_foreground));
        return VENEZUELA_Sat_Obj;
    }

    public List<Satellite> VIETNAM_Satellite_List() {
        VIETNAM_Sat_Obj = new ArrayList<>();
        VIETNAM_Sat_Obj.add(new Satellite("39160", "VNREDSAT 1", "Observation", "May-7-2013", R.mipmap.ic_vietnam_foreground));
        VIETNAM_Sat_Obj.add(new Satellite("38332", "VINASAT 2", "Communications", "May-15-2012-", R.mipmap.ic_vietnam_foreground));
        VIETNAM_Sat_Obj.add(new Satellite("32767", "VINASAT 1", "Communications", "Apr-18-2008", R.mipmap.ic_vietnam_foreground));
        return VIETNAM_Sat_Obj;
    }

    public List<Satellite> FORMER_CZECHOSLOVAKIA_List() {
        FORMER_CZECHOSLOVAKIA_Sat_Obj = new ArrayList<>();
        FORMER_CZECHOSLOVAKIA_Sat_Obj.add(new Satellite("21835", "MAGION 3", "Science,Magnetosphere", "Dec-18-1991", R.mipmap.ic_czechia_foreground));
        FORMER_CZECHOSLOVAKIA_Sat_Obj.add(new Satellite("20281", "MAGION 2", "Science,Magnetosphere", "Sep-28-1989", R.mipmap.ic_czechia_foreground));
        return FORMER_CZECHOSLOVAKIA_Sat_Obj;
    }

    public List<Satellite> CHINA_BRAZIL_List() {
        CHINA_BRAZIL_Sat_Obj = new ArrayList<>();
        CHINA_BRAZIL_Sat_Obj.add(new Satellite("32062", "CBERS 2B", "Earth Observation", "Sep-19-2007", R.mipmap.ic_china_brazil_foreground));
        CHINA_BRAZIL_Sat_Obj.add(new Satellite("28057", "CBERS 2", "Earth Observation", "Oct-21-2003", R.mipmap.ic_china_brazil_foreground));
        CHINA_BRAZIL_Sat_Obj.add(new Satellite("25940", "CBERS 1", "Earth Observation", "Oct-14-1999", R.mipmap.ic_china_brazil_foreground));
        return CHINA_BRAZIL_Sat_Obj;
    }

    public List<Satellite> FRANCE_GERMANY_List() {
        FRANCE_GERMANY_Sat_Obj = new ArrayList<>();
        FRANCE_GERMANY_Sat_Obj.add(new Satellite("8132", "SYMPHONIE 2", "Communication", "Aug-27-1975", R.mipmap.ic_france_germany_foreground));
        FRANCE_GERMANY_Sat_Obj.add(new Satellite("7578", "SYMPHONIE 1", "Communication", "Dec-19-1974", R.mipmap.ic_france_germany_foreground));
        return FRANCE_GERMANY_Sat_Obj;
    }

    public List<Satellite> FRANCE_ITALY_List() {
        FRANCE_ITALY_Sat_Obj = new ArrayList<>();
        FRANCE_ITALY_Sat_Obj.add(new Satellite("40614", "SICRAL 2", "Military Communication", "Apr-26-2015", R.mipmap.ic_franc_italy_foreground));
        FRANCE_ITALY_Sat_Obj.add(new Satellite("39509", "ATHENA-FIDUS", "Military Communication", "Feb-6-2014", R.mipmap.ic_franc_italy_foreground));
        return FRANCE_ITALY_Sat_Obj;
    }

    public List<Satellite> SINGAPORE_TAIWAN_List() {
        SINGAPORE_TAIWAN_Sat_Obj = new ArrayList<>();
        SINGAPORE_TAIWAN_Sat_Obj.add(new Satellite("37606", "ST 2", "Communication", "May-20-2011", R.mipmap.ic_singapore_taiwan_foreground));
        SINGAPORE_TAIWAN_Sat_Obj.add(new Satellite("25460", "ST 1", "Communication", "Aug-25-1998", R.mipmap.ic_singapore_taiwan_foreground));
        return SINGAPORE_TAIWAN_Sat_Obj;
    }

    public List<Satellite> TURKMENISTAN_MONACO_List() {
        TURKMENISTAN_MONACO = new ArrayList<>();
        TURKMENISTAN_MONACO.add(new Satellite("40617", "TURKMENALEM52E/MONACOSAT", "Communication", "Apr-27-2015", R.mipmap.ic_turkmenistan_monaco_foreground));
        return TURKMENISTAN_MONACO;
    }

    public List<Satellite> UNITED_STATES_BRAZIL_List() {
        UNITED_STATES_BRAZIL_Sat_Obj = new ArrayList<>();
        UNITED_STATES_BRAZIL_Sat_Obj.add(new Satellite("28137", "ESTRELA DU SOL-TELSTAR14", "Communication", "Jan-11-2004", R.mipmap.ic_usa_brazil_foreground));
        return UNITED_STATES_BRAZIL_Sat_Obj;
    }

    public List<Satellite> ARAB_SATELLITE_COMMUNICATIONS_ORGANIZATION_ARABSAT_List() {
        ARAB_SAT_COMM_ORG_Sat_Obj = new ArrayList<>();
        ARAB_SAT_COMM_ORG_Sat_Obj.add(new Satellite("41029", "BADR 7(ARABSAT-6B)", "Communication", "Nov-10-2015", R.mipmap.ic_arabsat_foreground));
        ARAB_SAT_COMM_ORG_Sat_Obj.add(new Satellite("37810", "ARABSAT 5C", "Communication", "Sep-21-2011", R.mipmap.ic_arabsat_foreground));
        ARAB_SAT_COMM_ORG_Sat_Obj.add(new Satellite("36745", "ARABSAT 5A", "Communication", "Jun-26-2010", R.mipmap.ic_arabsat_foreground));
        ARAB_SAT_COMM_ORG_Sat_Obj.add(new Satellite("36592", "BADR-5(ARABSAT 5B)", "Communication", "Jun-3-2010", R.mipmap.ic_arabsat_foreground));
        ARAB_SAT_COMM_ORG_Sat_Obj.add(new Satellite("33154", "BADR 6", "Communication", "Jul-7-2008", R.mipmap.ic_arabsat_foreground));
        ARAB_SAT_COMM_ORG_Sat_Obj.add(new Satellite("29526", "ARABSAT 4B", "Communication", "Nov-8-2006", R.mipmap.ic_arabsat_foreground));
        ARAB_SAT_COMM_ORG_Sat_Obj.add(new Satellite("25638", "ARABSAT 3A", "Communication", "Feb-26-1999", R.mipmap.ic_arabsat_foreground));
        ARAB_SAT_COMM_ORG_Sat_Obj.add(new Satellite("24652", "ARABSAT 2B", "Communication", "Nov-13-1996", R.mipmap.ic_arabsat_foreground));
        ARAB_SAT_COMM_ORG_Sat_Obj.add(new Satellite("23948", "ARABSAT 2A", "Communication", "Jul-9-1996", R.mipmap.ic_arabsat_foreground));
        ARAB_SAT_COMM_ORG_Sat_Obj.add(new Satellite("15825", "ARABSAT 1B", "Communication", "Jun-17-1985", R.mipmap.ic_arabsat_foreground));
        ARAB_SAT_COMM_ORG_Sat_Obj.add(new Satellite("15560", "ARABSAT 1A", "Communication", "Feb-8-1985", R.mipmap.ic_arabsat_foreground));
        ARAB_SAT_COMM_ORG_Sat_Obj.add(new Satellite("15383", "ARABSAT 1D(ANIK D2)", "Communication", "Nov-8-1984", R.mipmap.ic_arabsat_foreground));
        ARAB_SAT_COMM_ORG_Sat_Obj.add(new Satellite("14234", "ARABSAT 1DR(TELSTAR 3A)", "Communication", "Jul-28-1983", R.mipmap.ic_arabsat_foreground));
        return ARAB_SAT_COMM_ORG_Sat_Obj;
    }

    public List<Satellite> ASIA_SATELLITE_TELECOMMUNICATIONS_COMPANY_ASIASAT_List() {
        ASIASAT_Sat_Obj = new ArrayList<>();
        ASIASAT_Sat_Obj.add(new Satellite("42942", "ASIASAT 9", "Communication", "Sep-28-2017", R.mipmap.ic_asiasat_foreground));
        ASIASAT_Sat_Obj.add(new Satellite("40141", "ASIASAT 6", "Communication", "Sep-7-2014", R.mipmap.ic_asiasat_foreground));
        ASIASAT_Sat_Obj.add(new Satellite("40107", "ASIASAT 8", "Communication", "Aug-5-2014", R.mipmap.ic_asiasat_foreground));
        ASIASAT_Sat_Obj.add(new Satellite("37933", "ASIASAT 7", "Communication", "Nov-25-2011", R.mipmap.ic_asiasat_foreground));
        ASIASAT_Sat_Obj.add(new Satellite("35696", "ASIASAT 5", "Communication", "Aug-11-2009", R.mipmap.ic_asiasat_foreground));
        ASIASAT_Sat_Obj.add(new Satellite("27718", "ASIASAT 4", "Communication", "Apr-12-2003", R.mipmap.ic_asiasat_foreground));
        ASIASAT_Sat_Obj.add(new Satellite("25657", "ASIASAT 3S", "Communication", "Mar-2-1999", R.mipmap.ic_asiasat_foreground));
        ASIASAT_Sat_Obj.add(new Satellite("20558", "ASIASAT 1", "Communication", "Apr-7-1990", R.mipmap.ic_asiasat_foreground));
        return ASIASAT_Sat_Obj;
    }

    public List<Satellite> EUROPEAN_ORGANISATION_FOR_THE_EXPLOITATION_EUMETSAT_List() {
        EUMETSAT_Sat_Obj = new ArrayList<>();
        EUMETSAT_Sat_Obj.add(new Satellite("40732", "MSG 4", "Meteorology", "Jul-15-2015", R.mipmap.eumetsat_round));
        EUMETSAT_Sat_Obj.add(new Satellite("38771", "METOP-B", "Meteorology", "Sep-17-2012", R.mipmap.eumetsat_round));
        EUMETSAT_Sat_Obj.add(new Satellite("38552", "METEOSAT 10(MSG 3)", "Meteorology", "Jul-5-2012", R.mipmap.eumetsat_round));
        EUMETSAT_Sat_Obj.add(new Satellite("29499", "METOP-A", "Meteorology", "Oct-19-2006", R.mipmap.eumetsat_round));
        EUMETSAT_Sat_Obj.add(new Satellite("28912", "METEOSAT 9(MSG 2)", "Meteorology", "Dec-21-2005", R.mipmap.eumetsat_round));
        EUMETSAT_Sat_Obj.add(new Satellite("27509", "METEOSAT 8(MSG 1)", "Meteorology", "Aug-28-2002", R.mipmap.eumetsat_round));
        EUMETSAT_Sat_Obj.add(new Satellite("24932", "METEOSAT 7", "Meteorology", "Sep-2-1997", R.mipmap.eumetsat_round));
        EUMETSAT_Sat_Obj.add(new Satellite("22912", "METEOSAT 6", "Meteorology", "Nov-20-1993", R.mipmap.eumetsat_round));
        return EUMETSAT_Sat_Obj;
    }

    public List<Satellite> EUROPEAN_SPACE_AGENCY_ESA_List() {
        EUROPEAN_SPACE_AGENCY_Sat_Obj = new ArrayList<>();
        EUROPEAN_SPACE_AGENCY_Sat_Obj.add(new Satellite("43437", "SENTINEL 3B", "Earth Observing (Ocean)", "Apr-25-2018", R.mipmap.ic_esa_foreground));
        EUROPEAN_SPACE_AGENCY_Sat_Obj.add(new Satellite("43196", "GOMX4-B", "Technology", "Feb-2-2018", R.mipmap.ic_esa_foreground));
        EUROPEAN_SPACE_AGENCY_Sat_Obj.add(new Satellite("43058", "GALILEO 22 (2C8)", "Navigation", "Dec-12-2017", R.mipmap.ic_esa_foreground));
        EUROPEAN_SPACE_AGENCY_Sat_Obj.add(new Satellite("43057", "GALILEO 21 (2C7)", "Navigation", "Dec-12-2017", R.mipmap.ic_esa_foreground));
        EUROPEAN_SPACE_AGENCY_Sat_Obj.add(new Satellite("43056", "GALILEO 20 (2C6)", "Navigation", "Dec-12-2017", R.mipmap.ic_esa_foreground));
        EUROPEAN_SPACE_AGENCY_Sat_Obj.add(new Satellite("43055", "GALILEO 19 (2C5)", "Navigation", "Dec-12-2017", R.mipmap.ic_esa_foreground));
        EUROPEAN_SPACE_AGENCY_Sat_Obj.add(new Satellite("42969", "SENTINEL 5P", "Earth Observing", "Oct-13-2017", R.mipmap.ic_esa_foreground));
        EUROPEAN_SPACE_AGENCY_Sat_Obj.add(new Satellite("42814", "HELLAS-SAT 3", "Communication", "Jun-28-2017", R.mipmap.ic_esa_foreground));
        EUROPEAN_SPACE_AGENCY_Sat_Obj.add(new Satellite("42063", "SENTINEL 2B", "Earth Observing(Ocean)", "Mar-7-2017", R.mipmap.ic_esa_foreground));
        EUROPEAN_SPACE_AGENCY_Sat_Obj.add(new Satellite("41862", "GALILEO 18 (26E)", "Navigation", "Nov-17-2016", R.mipmap.ic_esa_foreground));
        EUROPEAN_SPACE_AGENCY_Sat_Obj.add(new Satellite("41861", "GALILEO 17 (26D)", "Navigation", "Nov-17-2016", R.mipmap.ic_esa_foreground));
        EUROPEAN_SPACE_AGENCY_Sat_Obj.add(new Satellite("41860", "GALILEO 16 (26C)", "Navigation", "Nov-17-2016", R.mipmap.ic_esa_foreground));
        EUROPEAN_SPACE_AGENCY_Sat_Obj.add(new Satellite("41859", "GALILEO 15 (267)", "Navigation", "Nov-17-2016", R.mipmap.ic_esa_foreground));
        EUROPEAN_SPACE_AGENCY_Sat_Obj.add(new Satellite("41550", "GALILEO 13 (26A)", "Navigation", "Nov-17-2016", R.mipmap.ic_esa_foreground));
        EUROPEAN_SPACE_AGENCY_Sat_Obj.add(new Satellite("41549", "GALILEO 14 (26B)", "Navigation", "May-24-2016", R.mipmap.ic_esa_foreground));
        EUROPEAN_SPACE_AGENCY_Sat_Obj.add(new Satellite("41456", "SENTINEL 1B", "Earth Observing(Radar)", "Apr-25-2016", R.mipmap.ic_esa_foreground));
        EUROPEAN_SPACE_AGENCY_Sat_Obj.add(new Satellite("41388", "EXOMARS", "Mars Orbiter", "Mar-14-2016", R.mipmap.ic_esa_foreground));
        EUROPEAN_SPACE_AGENCY_Sat_Obj.add(new Satellite("41335", "SENTINEL-3A", "Earth Observing(Ocean)", "Feb-16-2016", R.mipmap.ic_esa_foreground));
        EUROPEAN_SPACE_AGENCY_Sat_Obj.add(new Satellite("41175", "GALILEO 11 (268)", "Navigation", "Dec-17-2015", R.mipmap.ic_esa_foreground));
        EUROPEAN_SPACE_AGENCY_Sat_Obj.add(new Satellite("41174", "GALILEO 12 (269)", "Navigation", "Dec-17-2015", R.mipmap.ic_esa_foreground));
        EUROPEAN_SPACE_AGENCY_Sat_Obj.add(new Satellite("41043", "LISA PATHFINDER", "Technology Experiments", "Dec-3-2015", R.mipmap.ic_esa_foreground));
        EUROPEAN_SPACE_AGENCY_Sat_Obj.add(new Satellite("40890", "GALILEO 10 (206)", "Navigation", "Sep-11-2015", R.mipmap.ic_esa_foreground));
        EUROPEAN_SPACE_AGENCY_Sat_Obj.add(new Satellite("40889", "GALILEO 9 (205)", "Navigation", "Sep-11-2015", R.mipmap.ic_esa_foreground));
        EUROPEAN_SPACE_AGENCY_Sat_Obj.add(new Satellite("40697", "SENTINEL 2A", "Earth Observing(Ocean)", "Jun-23-2015", R.mipmap.ic_esa_foreground));
        EUROPEAN_SPACE_AGENCY_Sat_Obj.add(new Satellite("40545", "GSAT0204", "Navigation", "Mar-27-2015", R.mipmap.ic_esa_foreground));
        EUROPEAN_SPACE_AGENCY_Sat_Obj.add(new Satellite("40544", "GSAT0203", "Navigation", "Mar-27-2015", R.mipmap.ic_esa_foreground));
        EUROPEAN_SPACE_AGENCY_Sat_Obj.add(new Satellite("40129", "GALILEO 6 (262)", "Navigation", "Aug-22-2014", R.mipmap.ic_esa_foreground));
        EUROPEAN_SPACE_AGENCY_Sat_Obj.add(new Satellite("40128", "GALILEO 5 (261)", "Navigation", "Aug-22-2014", R.mipmap.ic_esa_foreground));
        EUROPEAN_SPACE_AGENCY_Sat_Obj.add(new Satellite("39634", "SENTINEL 1A", "Earth Observing(Radar)", "Apr-3-2014", R.mipmap.ic_esa_foreground));
        EUROPEAN_SPACE_AGENCY_Sat_Obj.add(new Satellite("39479", "GAIA", "Astrometry", "Dec-19-2013", R.mipmap.ic_esa_foreground));
        EUROPEAN_SPACE_AGENCY_Sat_Obj.add(new Satellite("39453", "SWARM C", "Earth Science", "Nov-22-2013", R.mipmap.ic_esa_foreground));
        EUROPEAN_SPACE_AGENCY_Sat_Obj.add(new Satellite("39452", "SWARM A", "Earth Science", "Nov-22-2013", R.mipmap.ic_esa_foreground));
        EUROPEAN_SPACE_AGENCY_Sat_Obj.add(new Satellite("39451", "SWARM B", "Earth Science", "Nov-22-2013", R.mipmap.ic_esa_foreground));
        EUROPEAN_SPACE_AGENCY_Sat_Obj.add(new Satellite("39159", "PROBA V", "Technology", "May-7-2013", R.mipmap.ic_esa_foreground));
        EUROPEAN_SPACE_AGENCY_Sat_Obj.add(new Satellite("38858", "GALILEO-FM4", "Navigation", "Oct-12-2012", R.mipmap.ic_esa_foreground));
        EUROPEAN_SPACE_AGENCY_Sat_Obj.add(new Satellite("38857", "GALILEO-FM3", "Navigation", "Oct-12-2012", R.mipmap.ic_esa_foreground));
        EUROPEAN_SPACE_AGENCY_Sat_Obj.add(new Satellite("37847", "GALILEO-FM2", "Navigation", "Oct-21-2011", R.mipmap.ic_esa_foreground));
        EUROPEAN_SPACE_AGENCY_Sat_Obj.add(new Satellite("37846", "GALILEO-PFM", "Navigation", "Oct-21-2011", R.mipmap.ic_esa_foreground));
        EUROPEAN_SPACE_AGENCY_Sat_Obj.add(new Satellite("36508", "CRYOSAT 2", "Radar Altimetry Mission", "Apr-8-2010", R.mipmap.ic_esa_foreground));
        EUROPEAN_SPACE_AGENCY_Sat_Obj.add(new Satellite("36037", "PROBA 2", "Technology", "Nov-2-2009", R.mipmap.ic_esa_foreground));
        EUROPEAN_SPACE_AGENCY_Sat_Obj.add(new Satellite("36036", "SMOS", "Earth Science", "Nov-2-2009", R.mipmap.ic_esa_foreground));
        EUROPEAN_SPACE_AGENCY_Sat_Obj.add(new Satellite("34938", "PLANCK", "Cosmic Background", "May-14-2009", R.mipmap.ic_esa_foreground));
        EUROPEAN_SPACE_AGENCY_Sat_Obj.add(new Satellite("34937", "HERSCHEL", "Astronomy", "May-14-2009", R.mipmap.ic_esa_foreground));
        EUROPEAN_SPACE_AGENCY_Sat_Obj.add(new Satellite("32781", "GIOVE-B", "Navigation", "Apr-27-2008", R.mipmap.ic_esa_foreground));
        EUROPEAN_SPACE_AGENCY_Sat_Obj.add(new Satellite("28922", "GIOVE-A", "Navigation", "Dec-28-2005", R.mipmap.ic_esa_foreground));
        EUROPEAN_SPACE_AGENCY_Sat_Obj.add(new Satellite("28901", "VENUS EXPRESS", "Venus Orbiter", "Nov-9-2005", R.mipmap.ic_esa_foreground));
        EUROPEAN_SPACE_AGENCY_Sat_Obj.add(new Satellite("28894", "SSETI-EXPRESS", "Technology", "Oct-27-2005", R.mipmap.ic_esa_foreground));
        EUROPEAN_SPACE_AGENCY_Sat_Obj.add(new Satellite("28544", "SLOSHSAT", "Tech: Fluids In Weightlessness", "Feb-12-2005", R.mipmap.ic_esa_foreground));
        EUROPEAN_SPACE_AGENCY_Sat_Obj.add(new Satellite("28169", "ROSETTA", "Comet Orbiter", "Mar-2-2004", R.mipmap.ic_esa_foreground));
        EUROPEAN_SPACE_AGENCY_Sat_Obj.add(new Satellite("27816", "MARS EXPRESS", "Mars Orbiter", "Jun-2-2003", R.mipmap.ic_esa_foreground));
        EUROPEAN_SPACE_AGENCY_Sat_Obj.add(new Satellite("27540", "INTEGRAL", "Astronomy,Gamma", "Oct-17-2002", R.mipmap.ic_esa_foreground));
        EUROPEAN_SPACE_AGENCY_Sat_Obj.add(new Satellite("27386", "ENVISAT", "Earth Observation", "Mar-1-2002", R.mipmap.ic_esa_foreground));
        EUROPEAN_SPACE_AGENCY_Sat_Obj.add(new Satellite("26958", "PROBA 1", "Technology", "Oct-22-2001", R.mipmap.ic_esa_foreground));
        EUROPEAN_SPACE_AGENCY_Sat_Obj.add(new Satellite("26863", "ARTEMIS", "Experimental comm:", "Jul-12-2001", R.mipmap.ic_esa_foreground));
        EUROPEAN_SPACE_AGENCY_Sat_Obj.add(new Satellite("26590", "INTELSAT 12 (PAS 12)", "Communication", "Oct-29-2000", R.mipmap.ic_esa_foreground));
        EUROPEAN_SPACE_AGENCY_Sat_Obj.add(new Satellite("26464", "CLUSTER II-FM8", "Magnetospheric Research", "Aug-9-2000", R.mipmap.ic_esa_foreground));
        EUROPEAN_SPACE_AGENCY_Sat_Obj.add(new Satellite("26463", "CLUSTER II-FM5", "Magnetospheric Research", "Aug-9-2000", R.mipmap.ic_esa_foreground));
        EUROPEAN_SPACE_AGENCY_Sat_Obj.add(new Satellite("26411", "CLUSTER II-FM7", "Magnetospheric Research", "Jul-16-2000", R.mipmap.ic_esa_foreground));
        EUROPEAN_SPACE_AGENCY_Sat_Obj.add(new Satellite("26410", "CLUSTER II-FM6", "Magnetospheric Research", "Jul-16-2000", R.mipmap.ic_esa_foreground));
        EUROPEAN_SPACE_AGENCY_Sat_Obj.add(new Satellite("25989", "XMM", "Astronomy,X-Ray", "Dec-10-1999", R.mipmap.ic_esa_foreground));
        EUROPEAN_SPACE_AGENCY_Sat_Obj.add(new Satellite("25025", "TEAMSAT", "", "Oct-30-1997", R.mipmap.ic_esa_foreground));
        EUROPEAN_SPACE_AGENCY_Sat_Obj.add(new Satellite("25024", "MAQSAT B", "Vehicle evaluation", "Oct-30-1997", R.mipmap.ic_esa_foreground));
        EUROPEAN_SPACE_AGENCY_Sat_Obj.add(new Satellite("25023", "MAQSAT H", "Vehicle evaluation", "Oct-30-1997", R.mipmap.ic_esa_foreground));
        EUROPEAN_SPACE_AGENCY_Sat_Obj.add(new Satellite("23726", "SOHO", "Solar Observatory", "Dec-2-1995", R.mipmap.ic_esa_foreground));
        EUROPEAN_SPACE_AGENCY_Sat_Obj.add(new Satellite("23715", "ISO", "Astronomy,Infra-Red", "Nov-17-1995", R.mipmap.ic_esa_foreground));
        EUROPEAN_SPACE_AGENCY_Sat_Obj.add(new Satellite("23560", "ERS 2", "Earth Observing", "Apr-21-1995", R.mipmap.ic_esa_foreground));
        EUROPEAN_SPACE_AGENCY_Sat_Obj.add(new Satellite("21574", "ERS 1", "Earth Observing", "Jul-17, 1991", R.mipmap.ic_esa_foreground));
        EUROPEAN_SPACE_AGENCY_Sat_Obj.add(new Satellite("21140", "METEOSAT 5 (MOP 2)", "Meteorology", "Mar-2-1991", R.mipmap.ic_esa_foreground));
        EUROPEAN_SPACE_AGENCY_Sat_Obj.add(new Satellite("20169", "HIPPARCOS", "Astrometry", "Aug-8-1989", R.mipmap.ic_esa_foreground));
        EUROPEAN_SPACE_AGENCY_Sat_Obj.add(new Satellite("20122", "OLYMPUS 1", "", "Jul-12-1989", R.mipmap.ic_esa_foreground));
        EUROPEAN_SPACE_AGENCY_Sat_Obj.add(new Satellite("19876", "METEOSAT 4 (MOP 1)", "Meteorology", "Mar-6-1989", R.mipmap.ic_esa_foreground));
        EUROPEAN_SPACE_AGENCY_Sat_Obj.add(new Satellite("19215", "METEOSAT 3", "Meteorology", "Jun-15-1988", R.mipmap.ic_esa_foreground));
        EUROPEAN_SPACE_AGENCY_Sat_Obj.add(new Satellite("15875", "GIOTTO", "Comet Flyby", "Jul-2-1985", R.mipmap.ic_esa_foreground));
        EUROPEAN_SPACE_AGENCY_Sat_Obj.add(new Satellite("15386", "MARECS B2", "Communication", "Nov-10-1984", R.mipmap.ic_esa_foreground));
        EUROPEAN_SPACE_AGENCY_Sat_Obj.add(new Satellite("13011", "CAT 4", "Vehicle Evaluation", "Dec-20-1981", R.mipmap.ic_esa_foreground));
        EUROPEAN_SPACE_AGENCY_Sat_Obj.add(new Satellite("13010", "MARECS A", "Communication", "Dec-20-1981", R.mipmap.ic_esa_foreground));
        EUROPEAN_SPACE_AGENCY_Sat_Obj.add(new Satellite("12546", "CAT 3", "Vehicle Evaluation", "Jun-19-1981", R.mipmap.ic_esa_foreground));
        EUROPEAN_SPACE_AGENCY_Sat_Obj.add(new Satellite("12544", "METEOSAT 2", "Meteorology", "Jun-19-1981", R.mipmap.ic_esa_foreground));
        EUROPEAN_SPACE_AGENCY_Sat_Obj.add(new Satellite("10981", "GEOS 2", "Research", "Jul-14-1978", R.mipmap.ic_esa_foreground));
        EUROPEAN_SPACE_AGENCY_Sat_Obj.add(new Satellite("10855", "OTS 2", "Communication", "May-11-1978", R.mipmap.ic_esa_foreground));
        EUROPEAN_SPACE_AGENCY_Sat_Obj.add(new Satellite("10489", "METEOSAT 1", "Meteorology", "Nov-23-1977", R.mipmap.ic_esa_foreground));
        EUROPEAN_SPACE_AGENCY_Sat_Obj.add(new Satellite("9931", "ESA/GOES", "Research", "Apr-20-1977", R.mipmap.ic_esa_foreground));
        return EUROPEAN_SPACE_AGENCY_Sat_Obj;
    }

    public List<Satellite> EUROPEAN_TELECOMMUNICATIONS_SATELLITE_ORGANIZATION_EUTELSAT_List() {
        EUTELSAT_Sat_Obj = new ArrayList<>();
        EUTELSAT_Sat_Obj.add(new Satellite("42741", "EUTELSAT 172B", "Communication", "Jun-1-2017", R.mipmap.ic_eutelsat_foreground));
        EUTELSAT_Sat_Obj.add(new Satellite("41589", "EUTELSAT 117W B", "Communication", "Jun-15-2016", R.mipmap.ic_eutelsat_foreground));
        EUTELSAT_Sat_Obj.add(new Satellite("41382", "EUTE 65W", "Communication", "Mar-9-2016", R.mipmap.ic_eutelsat_foreground));
        EUTELSAT_Sat_Obj.add(new Satellite("41310", "EUTELSAT 9B", "Communication", "Jan-29-2016", R.mipmap.ic_eutelsat_foreground));
        EUTELSAT_Sat_Obj.add(new Satellite("40875", "EUTELSAT 8 WEST B", "Communication", "Aug-20-2015", R.mipmap.ic_eutelsat_foreground));
        EUTELSAT_Sat_Obj.add(new Satellite("40425", "EUTE 115 WEST B(SATMEX 7", "Communication", "Mar-2-2015", R.mipmap.ic_eutelsat_foreground));
        EUTELSAT_Sat_Obj.add(new Satellite("39773", "EUTE 3B", "Communication", "May-26-2014", R.mipmap.ic_eutelsat_foreground));
        EUTELSAT_Sat_Obj.add(new Satellite("39233", "EUTELSAT 25B", "Communication", "Aug-29-2013", R.mipmap.ic_eutelsat_foreground));
        EUTELSAT_Sat_Obj.add(new Satellite("39163", "EUTE 3D", "Communication", "May-14-2013", R.mipmap.ic_eutelsat_foreground));
        EUTELSAT_Sat_Obj.add(new Satellite("39020", "EUTE 70B", "Communication", "Dec-3-2012", R.mipmap.ic_eutelsat_foreground));
        EUTELSAT_Sat_Obj.add(new Satellite("38992", "EUTE 21B", "Communication", "Nov-10-2012", R.mipmap.ic_eutelsat_foreground));
        EUTELSAT_Sat_Obj.add(new Satellite("37836", "EUTE 16A (EUTE W3C)", "Communication", "Oct-7-2011", R.mipmap.ic_eutelsat_foreground));
        EUTELSAT_Sat_Obj.add(new Satellite("37816", "EUTE 7 WEST A(AB 7)", "Communication", "Sep-24-2011", R.mipmap.ic_eutelsat_foreground));
        EUTELSAT_Sat_Obj.add(new Satellite("37258", "EUTE KA SAT 9A(KA SAT)", "Communication", "Dec-26-2010", R.mipmap.ic_eutelsat_foreground));
        EUTELSAT_Sat_Obj.add(new Satellite("37206", "EUTELSAT W3B", "Communication", "Oct-28-2010", R.mipmap.ic_eutelsat_foreground));
        EUTELSAT_Sat_Obj.add(new Satellite("36101", "EUTE 36B(EUTE W7)", "Communication", "Nov-24-2009", R.mipmap.ic_eutelsat_foreground));
        EUTELSAT_Sat_Obj.add(new Satellite("34710", "EUTE 10A (EUTE W2A)", "Communication", "Apr-3-2009", R.mipmap.ic_eutelsat_foreground));
        EUTELSAT_Sat_Obj.add(new Satellite("33750", "EUTE 3C(HB 10)", "Communication", "Feb-12-2009", R.mipmap.ic_eutelsat_foreground));
        EUTELSAT_Sat_Obj.add(new Satellite("33460", "EUTE 28B(EUTE W2M)", "Communication", "Dec-20-2008", R.mipmap.ic_eutelsat_foreground));
        EUTELSAT_Sat_Obj.add(new Satellite("33459", "EUTE HOT BIRD 13C (HB 9)", "Communication", "Dec-20-2008", R.mipmap.ic_eutelsat_foreground));
        EUTELSAT_Sat_Obj.add(new Satellite("31577", "EUTE 3A(SINOSAT 3)", "Communication", "May-31-2007", R.mipmap.ic_eutelsat_foreground));
        EUTELSAT_Sat_Obj.add(new Satellite("29270", "EUTE HOT BIRD 13B (HB 8)", "Communication", "Aug-4-2006", R.mipmap.ic_eutelsat_foreground));
        EUTELSAT_Sat_Obj.add(new Satellite("28946", "EUTE 9A(HB 7A)", "Communication", "Mar-11-2006", R.mipmap.ic_eutelsat_foreground));
        EUTELSAT_Sat_Obj.add(new Satellite("28924", "GE-23", "Communication", "Dec-29-2005", R.mipmap.ic_eutelsat_foreground));
        EUTELSAT_Sat_Obj.add(new Satellite("28187", "EUTE 7A(EUTE W3A)", "Communication", "Mar-15-2004", R.mipmap.ic_eutelsat_foreground));
        EUTELSAT_Sat_Obj.add(new Satellite("28134", "SESAT 2(EXPRESS AM-22)", "Communication", "Dec-28-2003", R.mipmap.ic_eutelsat_foreground));
        EUTELSAT_Sat_Obj.add(new Satellite("27948", "EUTE 33A(EB 3)", "Communication", "Sep-27-2003", R.mipmap.ic_eutelsat_foreground));
        EUTELSAT_Sat_Obj.add(new Satellite("27554", "EUTE 25C(EUTE W5)", "Communication", "Nov-20-2002", R.mipmap.ic_eutelsat_foreground));
        EUTELSAT_Sat_Obj.add(new Satellite("27508", "EUTE 12 WEST A(AB 1)", "Communication", "Aug-28-2002", R.mipmap.ic_eutelsat_foreground));
        EUTELSAT_Sat_Obj.add(new Satellite("27499", "EUTE HOT BIRD 13A(HB 6)", "Communication", "Aug-21-2002", R.mipmap.ic_eutelsat_foreground));
        EUTELSAT_Sat_Obj.add(new Satellite("27460", "EUTE 5 WEST A(STELLAT5)", "Communication", "Jul-5-2002", R.mipmap.ic_eutelsat_foreground));
        EUTELSAT_Sat_Obj.add(new Satellite("26927", "EUTE 8 WEST A(AB 2)", "Communication", "Sep-25-2001", R.mipmap.ic_eutelsat_foreground));
        EUTELSAT_Sat_Obj.add(new Satellite("26719", "EUTE 28A(EB 1)", "Communication", "Mar-8-2001", R.mipmap.ic_eutelsat_foreground));
        EUTELSAT_Sat_Obj.add(new Satellite("26487", "EUROBIRD 4A(EUTELSAT W1)", "Communication", "Sep-6-2000", R.mipmap.ic_eutelsat_foreground));
        EUTELSAT_Sat_Obj.add(new Satellite("26369", "EUTE 36A(EUTE W4)", "Communication", "May-24-2000", R.mipmap.ic_eutelsat_foreground));
        EUTELSAT_Sat_Obj.add(new Satellite("26243", "EUTE 16C(SESAT 1)", "Communication", "Apr-17-2000", R.mipmap.ic_eutelsat_foreground));
        EUTELSAT_Sat_Obj.add(new Satellite("25673", "EUTE 21A(EUTE W3)", "Communication", "Apr-12-1999", R.mipmap.ic_eutelsat_foreground));
        EUTELSAT_Sat_Obj.add(new Satellite("25495", "EUTE 25A(HB 5)", "Communication", "Oct-9-1998", R.mipmap.ic_eutelsat_foreground));
        EUTELSAT_Sat_Obj.add(new Satellite("25491", "EUTELSAT W2", "Communication", "Oct-5-1998", R.mipmap.ic_eutelsat_foreground));
        EUTELSAT_Sat_Obj.add(new Satellite("25237", "EUTE 16B(HB 4)", "Communication", "Feb-27-1998", R.mipmap.ic_eutelsat_foreground));
        EUTELSAT_Sat_Obj.add(new Satellite("24931", "W75/ABS-1B(HOT BIRD 3)", "Communication", "Sep-2-1997", R.mipmap.ic_eutelsat_foreground));
        EUTELSAT_Sat_Obj.add(new Satellite("24665", "EUTE 48A(HB2)", "Communication", "Nov-21-1996", R.mipmap.ic_eutelsat_foreground));
        EUTELSAT_Sat_Obj.add(new Satellite("23537", "HOT BIRD 1", "Communication", "Mar-28-1995", R.mipmap.ic_eutelsat_foreground));
        EUTELSAT_Sat_Obj.add(new Satellite("22028", "EUTELSAT 2-F4", "Communication", "Jul-9-1992", R.mipmap.ic_eutelsat_foreground));
        EUTELSAT_Sat_Obj.add(new Satellite("21803", "EUTELSAT 2-F3", "Communication", "Dec-7-1991", R.mipmap.ic_eutelsat_foreground));
        EUTELSAT_Sat_Obj.add(new Satellite("21056", "EUTELSAT 2-F2", "Communication", "Jan-15-1991", R.mipmap.ic_eutelsat_foreground));
        EUTELSAT_Sat_Obj.add(new Satellite("20777", "EUTELSAT 2-F1", "Communication", "Aug-30-1990", R.mipmap.ic_eutelsat_foreground));
        EUTELSAT_Sat_Obj.add(new Satellite("19331", "EUTELSAT 1-F5(ECS 5)", "Communication", "Jul-21-1988", R.mipmap.ic_eutelsat_foreground));
        EUTELSAT_Sat_Obj.add(new Satellite("18351", "EUTELSAT 1-F4(ECS 4)", "Communication", "Sep-16-1987", R.mipmap.ic_eutelsat_foreground));
        EUTELSAT_Sat_Obj.add(new Satellite("15158", "EUTELSAT 1-F2(ECS 2)", "Communication", "Aug-4-1984", R.mipmap.ic_eutelsat_foreground));
        EUTELSAT_Sat_Obj.add(new Satellite("14128", "EUTELSAT 1-F1(ECS 1)", "Communication", "Jun-16-1983", R.mipmap.ic_eutelsat_foreground));
        return EUTELSAT_Sat_Obj;
    }

    public List<Satellite> INTERNATIONAL_MOBILE_SATELLITE_ORGANIZATION_INMARSAT_List() {
        INMARSAT_Sat_Obj = new ArrayList<>();
        INMARSAT_Sat_Obj.add(new Satellite("42698", "INMARSAT 5-F4", "Communication", "May-15-2017", R.mipmap.ic_inmarsat_foreground));
        INMARSAT_Sat_Obj.add(new Satellite("40882", "INMARSAT 5-F3", "Communication", "Aug-28-2015", R.mipmap.ic_inmarsat_foreground));
        INMARSAT_Sat_Obj.add(new Satellite("40384", "INMARSAT 5-F2", "Communication", "Feb-1-2015", R.mipmap.ic_inmarsat_foreground));
        INMARSAT_Sat_Obj.add(new Satellite("39476", "INMARSAT 5-F1", "Communication", "Dec-8-2013", R.mipmap.ic_inmarsat_foreground));
        INMARSAT_Sat_Obj.add(new Satellite("39215", "ALPHASAT(INMARSAT 4A-F4)","Communication", "Jul-25-2013", R.mipmap.ic_inmarsat_foreground));
        INMARSAT_Sat_Obj.add(new Satellite("33278", "INMARSAT 4-F3", "Communication", "Aug-18-2008", R.mipmap.ic_inmarsat_foreground));
        INMARSAT_Sat_Obj.add(new Satellite("28899", "INMARSAT 4-F2", "Communication", "Nov-8-2005", R.mipmap.ic_inmarsat_foreground));
        INMARSAT_Sat_Obj.add(new Satellite("28628", "INMARSAT 4-F1", "Communication", "Mar-11-2005", R.mipmap.ic_inmarsat_foreground));
        INMARSAT_Sat_Obj.add(new Satellite("25153", "INMARSAT 3-F5", "Communication", "Feb-4-1998", R.mipmap.ic_inmarsat_foreground));
        INMARSAT_Sat_Obj.add(new Satellite("24819", "INMARSAT 3-F4", "Communication", "Jun-3-1997", R.mipmap.ic_inmarsat_foreground));
        INMARSAT_Sat_Obj.add(new Satellite("24674", "INMARSAT 3-F3", "Communication", "Dec-18-1996", R.mipmap.ic_inmarsat_foreground));
        INMARSAT_Sat_Obj.add(new Satellite("24307", "INMARSAT 3-F2", "Communication", "Sep-6-1996", R.mipmap.ic_inmarsat_foreground));
        INMARSAT_Sat_Obj.add(new Satellite("23839", "INMARSAT 3-F1", "Communication", "Apr-3-1996", R.mipmap.ic_inmarsat_foreground));
        INMARSAT_Sat_Obj.add(new Satellite("21940", "INMARSAT 2-F4", "Communication", "Apr-15-1992", R.mipmap.ic_inmarsat_foreground));
        INMARSAT_Sat_Obj.add(new Satellite("21814", "INMARSAT 2-F3", "Communication", "Dec-16-1991", R.mipmap.ic_inmarsat_foreground));
        INMARSAT_Sat_Obj.add(new Satellite("21149", "INMARSAT 2-F2", "Communication", "Mar-8-1991", R.mipmap.ic_inmarsat_foreground));
        INMARSAT_Sat_Obj.add(new Satellite("20918", "INMARSAT 2-F1", "Communication", "Oct-30-1990", R.mipmap.ic_inmarsat_foreground));
        return INMARSAT_Sat_Obj;
    }

    public List<Satellite> INTERNATIONAL_TELECOMMUNICATIONS_SATELLITE_ORGANIZATION_ITSO_List() {
        ITSO_Sat_Obj=new ArrayList<>();
        ITSO_Sat_Obj.add(new Satellite("42950","INTELSAT-37E","Communication","Sep-29-2017",R.mipmap.ic_itso_foreground));
        ITSO_Sat_Obj.add(new Satellite("41945","INTELSAT 32E (SKY BRASIL 1)","Communication","Feb-14-2017",R.mipmap.ic_itso_foreground));
        ITSO_Sat_Obj.add(new Satellite("41581","INTELSAT 31","Communication","Jun-9-2016",R.mipmap.ic_itso_foreground));
        ITSO_Sat_Obj.add(new Satellite("41308","INTELSAT 29E","Communication","Jan-27-2016",R.mipmap.ic_itso_foreground));
        ITSO_Sat_Obj.add(new Satellite("40874","INTELSAT 34","Communication","Aug-20-2015",R.mipmap.ic_itso_foreground));
        ITSO_Sat_Obj.add(new Satellite("40271","INTELSAT 30 (IS-30)","Communication","Oct-16-2014",R.mipmap.ic_itso_foreground));
        ITSO_Sat_Obj.add(new Satellite("38867","INTELSAT 23","Communication","Oct-14-2012",R.mipmap.ic_itso_foreground));
        ITSO_Sat_Obj.add(new Satellite("38749","INTELSAT 21","Communication","Aug-19-2012",R.mipmap.ic_itso_foreground));
        ITSO_Sat_Obj.add(new Satellite("38740","INTELSAT 20","Communication","Aug-2-2012",R.mipmap.ic_itso_foreground));
        ITSO_Sat_Obj.add(new Satellite("38356","INTELSAT 19","Communication","Jun-1-2012",R.mipmap.ic_itso_foreground));
        ITSO_Sat_Obj.add(new Satellite("38098","INTELSAT 22","Communication","Mar-25-2012",R.mipmap.ic_itso_foreground));
        ITSO_Sat_Obj.add(new Satellite("37834","INTELSAT 18","Communication","Oct-5-2011",R.mipmap.ic_itso_foreground));
        ITSO_Sat_Obj.add(new Satellite("37392","INTELSAT NEW DAWN","","Apr-22-2011",R.mipmap.ic_itso_foreground));
        ITSO_Sat_Obj.add(new Satellite("37238","INTELSAT 17","Communication","Nov-26-2010",R.mipmap.ic_itso_foreground));
        ITSO_Sat_Obj.add(new Satellite("36397","INTELSAT 16","Communication","Feb-12-2010",R.mipmap.ic_itso_foreground));
        ITSO_Sat_Obj.add(new Satellite("36106","INTELSAT 15","Communication","Nov-30-2009",R.mipmap.ic_itso_foreground));
        ITSO_Sat_Obj.add(new Satellite("36097","INTELSAT 14","Communication","Nov-23-2009",R.mipmap.ic_itso_foreground));
        ITSO_Sat_Obj.add(new Satellite("33153","INTELSAT 25(PROTOSTAR 1)","Communication","Jul-7-2008",R.mipmap.ic_itso_foreground));
        ITSO_Sat_Obj.add(new Satellite("32388","HORIZONS 2","","Dec-21-2007",R.mipmap.ic_itso_foreground));
        ITSO_Sat_Obj.add(new Satellite("32253","INTELSAT 11 (PAS 11)","Communication","Oct-5-2007",R.mipmap.ic_itso_foreground));
        ITSO_Sat_Obj.add(new Satellite("28884","GALAXY 15","Communication","Oct-13-2005",R.mipmap.ic_itso_foreground));
        ITSO_Sat_Obj.add(new Satellite("28702","GALAXY 28 (IA 8)","Communication","Jun-23-2005",R.mipmap.ic_itso_foreground));
        ITSO_Sat_Obj.add(new Satellite("28358","INTELSAT 10-02","Communication","Jun-16-2004",R.mipmap.ic_itso_foreground));
        ITSO_Sat_Obj.add(new Satellite("27683","INTELSAT 907","Communication","Feb-15-2003",R.mipmap.ic_itso_foreground));
        ITSO_Sat_Obj.add(new Satellite("27513","INTELSAT 906","Communication","Sep-6-2002",R.mipmap.ic_itso_foreground));
        ITSO_Sat_Obj.add(new Satellite("27438","INTELSAT 905","Communication","Jun-5-2002",R.mipmap.ic_itso_foreground));
        ITSO_Sat_Obj.add(new Satellite("27403","INTELSAT 903","Communication","Mar-30-2002",R.mipmap.ic_itso_foreground));
        ITSO_Sat_Obj.add(new Satellite("27380","INTELSAT 904","Communication","Feb-23-2002",R.mipmap.ic_itso_foreground));
        ITSO_Sat_Obj.add(new Satellite("26900","INTELSAT 902","Communication","Aug-30-2001",R.mipmap.ic_itso_foreground));
        ITSO_Sat_Obj.add(new Satellite("26824","INTELSAT 901","Communication","Jun-9-2001",R.mipmap.ic_itso_foreground));
        ITSO_Sat_Obj.add(new Satellite("25922","GALAXY 27 (TELSTAR 7)","Communication","Sep-25-1999",R.mipmap.ic_itso_foreground));
        ITSO_Sat_Obj.add(new Satellite("25371","INTELSAT 805","Communication","Jun-18-1998",R.mipmap.ic_itso_foreground));
        ITSO_Sat_Obj.add(new Satellite("25110","INTELSAT 804","Communication","Dec-21-1997",R.mipmap.ic_itso_foreground));
        ITSO_Sat_Obj.add(new Satellite("24846","INTELSAT 802","Communication","Jun-25-1997",R.mipmap.ic_itso_foreground));
        ITSO_Sat_Obj.add(new Satellite("24742","INTELSAT 801","Communication","Mar-1-1997",R.mipmap.ic_itso_foreground));
        ITSO_Sat_Obj.add(new Satellite("24732","INTELSAT 26 (JCSAT 4)","Communication","Feb-17-1997",R.mipmap.ic_itso_foreground));
        ITSO_Sat_Obj.add(new Satellite("23915","INTELSAT 709","Communication","Jun-15-1996",R.mipmap.ic_itso_foreground));
        ITSO_Sat_Obj.add(new Satellite("23865","INTELSAT 24 (AMOS 1)","Communication","May-16-1996",R.mipmap.ic_itso_foreground));
        ITSO_Sat_Obj.add(new Satellite("23816","INTELSAT 707","Communication","Mar-14-1996",R.mipmap.ic_itso_foreground));
        ITSO_Sat_Obj.add(new Satellite("23636","INTELSAT 4 (PAS 4)","Communication","Aug-3-1995",R.mipmap.ic_itso_foreground));
        ITSO_Sat_Obj.add(new Satellite("23571","INTELSAT 706","Communication","May-17-1995",R.mipmap.ic_itso_foreground));
        ITSO_Sat_Obj.add(new Satellite("23528","INTELSAT 705","Communication","Mar-22-1995",R.mipmap.ic_itso_foreground));
        ITSO_Sat_Obj.add(new Satellite("23461","INTELSAT 704","Communication","Jan-10-1995",R.mipmap.ic_itso_foreground));
        ITSO_Sat_Obj.add(new Satellite("23124","INTELSAT 702","Communication","Jun-17-1994",R.mipmap.ic_itso_foreground));
        ITSO_Sat_Obj.add(new Satellite("22871","INTELSAT 701","Communication","Oct-22-1993",R.mipmap.ic_itso_foreground));
        ITSO_Sat_Obj.add(new Satellite("21765","INTELSAT 601","Communication","Oct-29-1991",R.mipmap.ic_itso_foreground));
        ITSO_Sat_Obj.add(new Satellite("21653","INTELSAT 605","Communication","Aug-14-1991",R.mipmap.ic_itso_foreground));
        ITSO_Sat_Obj.add(new Satellite("20667","INTELSAT 604","Communication","Jun-23-1990",R.mipmap.ic_itso_foreground));
        ITSO_Sat_Obj.add(new Satellite("20523","INTELSAT 603","Communication","Mar-14-1990",R.mipmap.ic_itso_foreground));
        ITSO_Sat_Obj.add(new Satellite("20315","INTELSAT 602","Communication","Oct-27-1989",R.mipmap.ic_itso_foreground));
        ITSO_Sat_Obj.add(new Satellite("19772","INTELSAT 515","Communication","Jan-27-1989",R.mipmap.ic_itso_foreground));
        ITSO_Sat_Obj.add(new Satellite("16101","INTELSAT 512","Communication","Sep-28-1985",R.mipmap.ic_itso_foreground));
        ITSO_Sat_Obj.add(new Satellite("15873","INTELSAT 511","Communication","Jun-30-1985",R.mipmap.ic_itso_foreground));
        ITSO_Sat_Obj.add(new Satellite("15629","INTELSAT 510","Communication","Mar-22-1985",R.mipmap.ic_itso_foreground));
        ITSO_Sat_Obj.add(new Satellite("14786","INTELSAT 508","Communication","Mar-5-1984",R.mipmap.ic_itso_foreground));
        ITSO_Sat_Obj.add(new Satellite("14421","INTELSAT 507","Communication","Oct-19-1983",R.mipmap.ic_itso_foreground));
        ITSO_Sat_Obj.add(new Satellite("14077","INTELSAT 506","Communication","May-19-1983",R.mipmap.ic_itso_foreground));
        ITSO_Sat_Obj.add(new Satellite("13595","INTELSAT 505","Communication","Sep-28-1982",R.mipmap.ic_itso_foreground));
        ITSO_Sat_Obj.add(new Satellite("13083","INTELSAT 504","Communication","Mar-5-1982",R.mipmap.ic_itso_foreground));
        ITSO_Sat_Obj.add(new Satellite("12994","INTELSAT 503","Communication","Dec-15-1981",R.mipmap.ic_itso_foreground));
        ITSO_Sat_Obj.add(new Satellite("12474","INTELSAT 501","Communication","May-23-1981",R.mipmap.ic_itso_foreground));
        ITSO_Sat_Obj.add(new Satellite("12089","INTELSAT 502","Communication","Dec-6-1980",R.mipmap.ic_itso_foreground));
        ITSO_Sat_Obj.add(new Satellite("10778","INTELSAT 4A-F6","Communication","Mar-31-1978",R.mipmap.ic_itso_foreground));
        ITSO_Sat_Obj.add(new Satellite("10557","INTELSAT 4A-F3","Communication","Jan-7-1978",R.mipmap.ic_itso_foreground));
        ITSO_Sat_Obj.add(new Satellite("10024","INTELSAT 4A-F4","Communication","May-26-1977",R.mipmap.ic_itso_foreground));
        ITSO_Sat_Obj.add(new Satellite("8620","INTELSAT 4A-F2","Communication","Jan-29-1976",R.mipmap.ic_itso_foreground));
        ITSO_Sat_Obj.add(new Satellite("8330","INTELSAT 4A-F1","Communication","Sep-26-1975",R.mipmap.ic_itso_foreground));
        ITSO_Sat_Obj.add(new Satellite("7815","INTELSAT 4-F1","Communication","May-22-1975",R.mipmap.ic_itso_foreground));
        ITSO_Sat_Obj.add(new Satellite("7544","INTELSAT 4-F8","Communication","Nov-21-1974",R.mipmap.ic_itso_foreground));
        ITSO_Sat_Obj.add(new Satellite("6796","INTELSAT 4-F7","Communication","Aug-23-1973",R.mipmap.ic_itso_foreground));
        ITSO_Sat_Obj.add(new Satellite("6052","INTELSAT 4-F5","Communication","Jun-13-1972",R.mipmap.ic_itso_foreground));
        ITSO_Sat_Obj.add(new Satellite("5775","INTELSAT 4-F4","Communication","Jan-23-1972",R.mipmap.ic_itso_foreground));
        ITSO_Sat_Obj.add(new Satellite("5709","INTELSAT 4-F3","Communication","Dec-20-1971",R.mipmap.ic_itso_foreground));
        ITSO_Sat_Obj.add(new Satellite("4881","INTELSAT 4-F2","Communication","Jan-26-1971",R.mipmap.ic_itso_foreground));
        ITSO_Sat_Obj.add(new Satellite("4478","INTELSAT 3-F8","Communication","Jul-23-1970",R.mipmap.ic_itso_foreground));
        ITSO_Sat_Obj.add(new Satellite("4376","INTELSAT 3-F7","Communication","Apr-23-1970",R.mipmap.ic_itso_foreground));
        ITSO_Sat_Obj.add(new Satellite("4297","INTELSAT 3-F6","Communication","Jan-15-1970",R.mipmap.ic_itso_foreground));
        ITSO_Sat_Obj.add(new Satellite("3947","INTELSAT 3-F4","Communication","May-22-1969",R.mipmap.ic_itso_foreground));
        ITSO_Sat_Obj.add(new Satellite("3674","INTELSAT 3-F3","Communication","Feb-6-1969",R.mipmap.ic_itso_foreground));
        ITSO_Sat_Obj.add(new Satellite("3623","INTELSAT 3-F2","Communication","Dec-19-1968",R.mipmap.ic_itso_foreground));
        ITSO_Sat_Obj.add(new Satellite("2969","INTELSAT 2-F4","Communication","Sep-28-1967",R.mipmap.ic_itso_foreground));
        ITSO_Sat_Obj.add(new Satellite("2717","INTELSAT 2-F3","Communication","Mar-23-1967",R.mipmap.ic_itso_foreground));
        ITSO_Sat_Obj.add(new Satellite("2639","INTELSAT 2-F2","Communication","Jan-11-1967",R.mipmap.ic_itso_foreground));
        ITSO_Sat_Obj.add(new Satellite("2514","INTELSAT 2-F1","Communication","Oct-26-1966",R.mipmap.ic_itso_foreground));
        ITSO_Sat_Obj.add(new Satellite("1317","INTELSAT 1-F1","Communication","Apr-6-1965",R.mipmap.ic_itso_foreground));
        return ITSO_Sat_Obj;
    }

    public List<Satellite> NEW_ICO_List() {
        NEW_ICO_Sat_Obj = new ArrayList<>();
        NEW_ICO_Sat_Obj.add(new Satellite("26857", "ICO F2", "Communication", "Jun-19-2001", R.mipmap.ic_new_ico_foreground));
        return NEW_ICO_Sat_Obj;
    }

    public List<Satellite> GLOBALSTAR_List() {
        GLOBALSTAR_Sat_Obj=new ArrayList<>();
        GLOBALSTAR_Sat_Obj.add(new Satellite("39077","GLOBALSTAR M095","Communication","Feb-6-2013",R.mipmap.ic_globalstar_foreground));
        GLOBALSTAR_Sat_Obj.add(new Satellite("39076","GLOBALSTAR M078","Communication","Feb-6-2013",R.mipmap.ic_globalstar_foreground));
        GLOBALSTAR_Sat_Obj.add(new Satellite("39075","GLOBALSTAR M096","Communication","Feb-6-2013",R.mipmap.ic_globalstar_foreground));
        GLOBALSTAR_Sat_Obj.add(new Satellite("39074","GLOBALSTAR M094","Communication","Feb-6-2013",R.mipmap.ic_globalstar_foreground));
        GLOBALSTAR_Sat_Obj.add(new Satellite("39073","GLOBALSTAR M093","Communication","Feb-6-2013",R.mipmap.ic_globalstar_foreground));
        GLOBALSTAR_Sat_Obj.add(new Satellite("39072","GLOBALSTAR M097","Communication","Feb-6-2013",R.mipmap.ic_globalstar_foreground));
        GLOBALSTAR_Sat_Obj.add(new Satellite("38045","GLOBALSTAR M086","Communication","Dec-28-2011",R.mipmap.ic_globalstar_foreground));
        GLOBALSTAR_Sat_Obj.add(new Satellite("38044","GLOBALSTAR M090","Communication","Dec-28-2011",R.mipmap.ic_globalstar_foreground));
        GLOBALSTAR_Sat_Obj.add(new Satellite("38043","GLOBALSTAR M092","Communication","Dec-28-2011",R.mipmap.ic_globalstar_foreground));
        GLOBALSTAR_Sat_Obj.add(new Satellite("38042","GLOBALSTAR M082","Communication","Dec-28-2011",R.mipmap.ic_globalstar_foreground));
        GLOBALSTAR_Sat_Obj.add(new Satellite("38041","GLOBALSTAR M080","Communication","Dec-28-2011",R.mipmap.ic_globalstar_foreground));
        GLOBALSTAR_Sat_Obj.add(new Satellite("38040","GLOBALSTAR M084","Communication","Dec-28-2011",R.mipmap.ic_globalstar_foreground));
        GLOBALSTAR_Sat_Obj.add(new Satellite("37744","GLOBALSTAR M089","Communication","Jul-13-2011",R.mipmap.ic_globalstar_foreground));
        GLOBALSTAR_Sat_Obj.add(new Satellite("37743","GLOBALSTAR M081","Communication","Jul-13-2011",R.mipmap.ic_globalstar_foreground));
        GLOBALSTAR_Sat_Obj.add(new Satellite("37742","GLOBALSTAR M085","Communication","Jul-13-2011",R.mipmap.ic_globalstar_foreground));
        GLOBALSTAR_Sat_Obj.add(new Satellite("37741","GLOBALSTAR M091","Communication","Jul-13-2011",R.mipmap.ic_globalstar_foreground));
        GLOBALSTAR_Sat_Obj.add(new Satellite("37740","GLOBALSTAR M088","Communication","Jul-13-2011",R.mipmap.ic_globalstar_foreground));
        GLOBALSTAR_Sat_Obj.add(new Satellite("37739","GLOBALSTAR M083","Communication","Jul-13-2011",R.mipmap.ic_globalstar_foreground));
        GLOBALSTAR_Sat_Obj.add(new Satellite("37193","GLOBALSTAR M073","Communication","Oct-19-2010",R.mipmap.ic_globalstar_foreground));
        GLOBALSTAR_Sat_Obj.add(new Satellite("37192","GLOBALSTAR M075","Communication","Oct-19-2010",R.mipmap.ic_globalstar_foreground));
        GLOBALSTAR_Sat_Obj.add(new Satellite("37191","GLOBALSTAR M077","Communication","Oct-19-2010",R.mipmap.ic_globalstar_foreground));
        GLOBALSTAR_Sat_Obj.add(new Satellite("37190","GLOBALSTAR M076","Communication","Oct-19-2010",R.mipmap.ic_globalstar_foreground));
        GLOBALSTAR_Sat_Obj.add(new Satellite("37189","GLOBALSTAR M074","Communication","Oct-19-2010",R.mipmap.ic_globalstar_foreground));
        GLOBALSTAR_Sat_Obj.add(new Satellite("37188","GLOBALSTAR M079","Communication","Oct-19-2010",R.mipmap.ic_globalstar_foreground));
        GLOBALSTAR_Sat_Obj.add(new Satellite("32266","GLOBALSTAR M068","Communication","Oct-20-2007",R.mipmap.ic_globalstar_foreground));
        GLOBALSTAR_Sat_Obj.add(new Satellite("32265","GLOBALSTAR M066","Communication","Oct-20-2007",R.mipmap.ic_globalstar_foreground));
        GLOBALSTAR_Sat_Obj.add(new Satellite("32264","GLOBALSTAR M070","Communication","Oct-20-2007",R.mipmap.ic_globalstar_foreground));
        GLOBALSTAR_Sat_Obj.add(new Satellite("32263","GLOBALSTAR M067","Communication","Oct-20-2007",R.mipmap.ic_globalstar_foreground));
        GLOBALSTAR_Sat_Obj.add(new Satellite("31576","GLOBALSTAR M071","Communication","May-29-2007",R.mipmap.ic_globalstar_foreground));
        GLOBALSTAR_Sat_Obj.add(new Satellite("31574","GLOBALSTAR M072","Communication","May-29-2007",R.mipmap.ic_globalstar_foreground));
        GLOBALSTAR_Sat_Obj.add(new Satellite("31573","GLOBALSTAR M069","Communication","May-29-2007",R.mipmap.ic_globalstar_foreground));
        GLOBALSTAR_Sat_Obj.add(new Satellite("31571","GLOBALSTAR M065","Communication","May-29-2007",R.mipmap.ic_globalstar_foreground));
        GLOBALSTAR_Sat_Obj.add(new Satellite("26084","GLOBALSTAR M064","Communication","Feb-8-2000",R.mipmap.ic_globalstar_foreground));
        GLOBALSTAR_Sat_Obj.add(new Satellite("26083","GLOBALSTAR M060","Communication","Feb-8-2000",R.mipmap.ic_globalstar_foreground));
        GLOBALSTAR_Sat_Obj.add(new Satellite("26082","GLOBALSTAR M062","Communication","Feb-8-2000",R.mipmap.ic_globalstar_foreground));
        GLOBALSTAR_Sat_Obj.add(new Satellite("26081","GLOBALSTAR M063","Communication","Feb-8-2000",R.mipmap.ic_globalstar_foreground));
        GLOBALSTAR_Sat_Obj.add(new Satellite("25964","GLOBALSTAR M061","Communication","Nov-22-1999",R.mipmap.ic_globalstar_foreground));
        GLOBALSTAR_Sat_Obj.add(new Satellite("25963","GLOBALSTAR M029","Communication","Nov-22-1999",R.mipmap.ic_globalstar_foreground));
        GLOBALSTAR_Sat_Obj.add(new Satellite("25962","GLOBALSTAR M034","Communication","Nov-22-1999",R.mipmap.ic_globalstar_foreground));
        GLOBALSTAR_Sat_Obj.add(new Satellite("25961","GLOBALSTAR M039","Communication","Nov-22-1999",R.mipmap.ic_globalstar_foreground));
        GLOBALSTAR_Sat_Obj.add(new Satellite("25946","GLOBALSTAR M031","Communication","Oct-18-1999",R.mipmap.ic_globalstar_foreground));
        GLOBALSTAR_Sat_Obj.add(new Satellite("25945","GLOBALSTAR M056","Communication","Oct-18-1999",R.mipmap.ic_globalstar_foreground));
        GLOBALSTAR_Sat_Obj.add(new Satellite("25944","GLOBALSTAR M059","Communication","Oct-18-1999",R.mipmap.ic_globalstar_foreground));
        GLOBALSTAR_Sat_Obj.add(new Satellite("25943","GLOBALSTAR M057","Communication","Oct-18-1999",R.mipmap.ic_globalstar_foreground));
        GLOBALSTAR_Sat_Obj.add(new Satellite("25910","GLOBALSTAR M055","Communication","Sep-22-1999",R.mipmap.ic_globalstar_foreground));
        GLOBALSTAR_Sat_Obj.add(new Satellite("25909","GLOBALSTAR M033","Communication","Sep-22-1999",R.mipmap.ic_globalstar_foreground));
        GLOBALSTAR_Sat_Obj.add(new Satellite("25908","GLOBALSTAR M050","Communication","Sep-22-1999",R.mipmap.ic_globalstar_foreground));
        GLOBALSTAR_Sat_Obj.add(new Satellite("25907","GLOBALSTAR M058","Communication","Sep-22-1999",R.mipmap.ic_globalstar_foreground));
        GLOBALSTAR_Sat_Obj.add(new Satellite("25886","GLOBALSTAR M053","Communication","Aug-17-1999",R.mipmap.ic_globalstar_foreground));
        GLOBALSTAR_Sat_Obj.add(new Satellite("25885","GLOBALSTAR M054","Communication","Aug-17-1999",R.mipmap.ic_globalstar_foreground));
        GLOBALSTAR_Sat_Obj.add(new Satellite("25884","GLOBALSTAR M027","Communication","Aug-17-1999",R.mipmap.ic_globalstar_foreground));
        GLOBALSTAR_Sat_Obj.add(new Satellite("25883","GLOBALSTAR M024","Communication","Aug-17-1999",R.mipmap.ic_globalstar_foreground));
        GLOBALSTAR_Sat_Obj.add(new Satellite("25875","GLOBALSTAR M028","Communication","Jul-25-1999",R.mipmap.ic_globalstar_foreground));
        GLOBALSTAR_Sat_Obj.add(new Satellite("25874","GLOBALSTAR M043","Communication","Jul-25-1999",R.mipmap.ic_globalstar_foreground));
        GLOBALSTAR_Sat_Obj.add(new Satellite("25873","GLOBALSTAR M026","Communication","Jul-25-1999",R.mipmap.ic_globalstar_foreground));
        GLOBALSTAR_Sat_Obj.add(new Satellite("25872","GLOBALSTAR M048","Communication","Jul-25-1999",R.mipmap.ic_globalstar_foreground));
        GLOBALSTAR_Sat_Obj.add(new Satellite("25854","GLOBALSTAR M030","Communication","Jul-10-1999",R.mipmap.ic_globalstar_foreground));
        GLOBALSTAR_Sat_Obj.add(new Satellite("25853","GLOBALSTAR M051","Communication","Jul-10-1999",R.mipmap.ic_globalstar_foreground));
        GLOBALSTAR_Sat_Obj.add(new Satellite("25852","GLOBALSTAR M032","Communication","Jul-10-1999",R.mipmap.ic_globalstar_foreground));
        GLOBALSTAR_Sat_Obj.add(new Satellite("25851","GLOBALSTAR M035","Communication","Jul-10-1999",R.mipmap.ic_globalstar_foreground));
        GLOBALSTAR_Sat_Obj.add(new Satellite("25773","GLOBALSTAR M052","Communication","Jul-10-1999",R.mipmap.ic_globalstar_foreground));
        GLOBALSTAR_Sat_Obj.add(new Satellite("25772","GLOBALSTAR M047","Communication","Jul-10-1999",R.mipmap.ic_globalstar_foreground));
        GLOBALSTAR_Sat_Obj.add(new Satellite("25771","GLOBALSTAR M049","Communication","Jul-10-1999",R.mipmap.ic_globalstar_foreground));
        GLOBALSTAR_Sat_Obj.add(new Satellite("25770","GLOBALSTAR M025","Communication","Jul-10-1999",R.mipmap.ic_globalstar_foreground));
        GLOBALSTAR_Sat_Obj.add(new Satellite("25679","GLOBALSTAR M042","Communication","Apr-15-1999",R.mipmap.ic_globalstar_foreground));
        GLOBALSTAR_Sat_Obj.add(new Satellite("25678","GLOBALSTAR M044","Communication","Apr-15-1999",R.mipmap.ic_globalstar_foreground));
        GLOBALSTAR_Sat_Obj.add(new Satellite("25677","GLOBALSTAR M019","Communication","Apr-15-1999",R.mipmap.ic_globalstar_foreground));
        GLOBALSTAR_Sat_Obj.add(new Satellite("25676","GLOBALSTAR M045","Communication","Apr-15-1999",R.mipmap.ic_globalstar_foreground));
        GLOBALSTAR_Sat_Obj.add(new Satellite("25652","GLOBALSTAR M037","Communication","Mar-15-1999",R.mipmap.ic_globalstar_foreground));
        GLOBALSTAR_Sat_Obj.add(new Satellite("25651","GLOBALSTAR M046","Communication","Mar-15-1999",R.mipmap.ic_globalstar_foreground));
        GLOBALSTAR_Sat_Obj.add(new Satellite("25650","GLOBALSTAR M041","Communication","Mar-15-1999",R.mipmap.ic_globalstar_foreground));
        GLOBALSTAR_Sat_Obj.add(new Satellite("25649","GLOBALSTAR M022","Communication","Mar-15-1999",R.mipmap.ic_globalstar_foreground));
        GLOBALSTAR_Sat_Obj.add(new Satellite("25624","GLOBALSTAR M038","Communication","Feb-9-1999",R.mipmap.ic_globalstar_foreground));
        GLOBALSTAR_Sat_Obj.add(new Satellite("25623","GLOBALSTAR M036","Communication","Feb-9-1999",R.mipmap.ic_globalstar_foreground));
        GLOBALSTAR_Sat_Obj.add(new Satellite("25622","GLOBALSTAR M040","Communication","Feb-9-1999",R.mipmap.ic_globalstar_foreground));
        GLOBALSTAR_Sat_Obj.add(new Satellite("25621","GLOBALSTAR M023","Communication","Feb-9-1999",R.mipmap.ic_globalstar_foreground));
        GLOBALSTAR_Sat_Obj.add(new Satellite("25309","GLOBALSTAR M008","Communication","Apr-24-1998",R.mipmap.ic_globalstar_foreground));
        GLOBALSTAR_Sat_Obj.add(new Satellite("25308","GLOBALSTAR M015","Communication","Apr-24-1998",R.mipmap.ic_globalstar_foreground));
        GLOBALSTAR_Sat_Obj.add(new Satellite("25307","GLOBALSTAR M006","Communication","Apr-24-1998",R.mipmap.ic_globalstar_foreground));
        GLOBALSTAR_Sat_Obj.add(new Satellite("25306","GLOBALSTAR M014","Communication","Apr-24-1998",R.mipmap.ic_globalstar_foreground));
        GLOBALSTAR_Sat_Obj.add(new Satellite("25165","GLOBALSTAR M003","Communication","Feb-14-1998",R.mipmap.ic_globalstar_foreground));
        GLOBALSTAR_Sat_Obj.add(new Satellite("25164","GLOBALSTAR M002","Communication","Feb-14-1998",R.mipmap.ic_globalstar_foreground));
        GLOBALSTAR_Sat_Obj.add(new Satellite("25163","GLOBALSTAR M004","Communication","Feb-14-1998",R.mipmap.ic_globalstar_foreground));
        GLOBALSTAR_Sat_Obj.add(new Satellite("25162","GLOBALSTAR M001","Communication","Feb-14-1998",R.mipmap.ic_globalstar_foreground));
        return GLOBALSTAR_Sat_Obj;
    }

    public List<Satellite> NORTH_ATLANTIC_TREATY_ORGANIZATION_NATO_List() {
        NORTH_ATLANTIC_TREATY_ORGANIZATION_Sat_Obj=new ArrayList<>();
        NORTH_ATLANTIC_TREATY_ORGANIZATION_Sat_Obj.add(new Satellite("22921","NATO 4B","Military comm:","Dec-8-1993",R.mipmap.ic_nato_foreground));
        NORTH_ATLANTIC_TREATY_ORGANIZATION_Sat_Obj.add(new Satellite("21047","NATO 4A","Military comm:","Jan-8-1991",R.mipmap.ic_nato_foreground));
        NORTH_ATLANTIC_TREATY_ORGANIZATION_Sat_Obj.add(new Satellite("15391","NATO 3D","Military comm:","Nov-14-1984",R.mipmap.ic_nato_foreground));
        NORTH_ATLANTIC_TREATY_ORGANIZATION_Sat_Obj.add(new Satellite("11115","NATO 3C","Military comm:","Nov-19-1978",R.mipmap.ic_nato_foreground));
        NORTH_ATLANTIC_TREATY_ORGANIZATION_Sat_Obj.add(new Satellite("9785","NATO 3B","Military comm:","Jan-28-1977",R.mipmap.ic_nato_foreground));
        NORTH_ATLANTIC_TREATY_ORGANIZATION_Sat_Obj.add(new Satellite("8808","NATO 3A","Military comm:","Apr-22-1976",R.mipmap.ic_nato_foreground));
        NORTH_ATLANTIC_TREATY_ORGANIZATION_Sat_Obj.add(new Satellite("4902","NATO 2B","Military comm:","Feb-3-1971",R.mipmap.ic_nato_foreground));
        NORTH_ATLANTIC_TREATY_ORGANIZATION_Sat_Obj.add(new Satellite("4353","NATO 2A","Military comm:","Mar-20-1970",R.mipmap.ic_nato_foreground));
        return NORTH_ATLANTIC_TREATY_ORGANIZATION_Sat_Obj;
    }

    public List<Satellite> O3B_NETWORKS_List() {
        O3B_NETWORKS_Sat_Obj=new ArrayList<>();
        O3B_NETWORKS_Sat_Obj.add(new Satellite("43234","O3B FM13","Communication","Mar-9-2018",R.mipmap.ic_o_3_b_network_foreground));
        O3B_NETWORKS_Sat_Obj.add(new Satellite("43233","O3B FM14","Communication","Mar-9-2018",R.mipmap.ic_o_3_b_network_foreground));
        O3B_NETWORKS_Sat_Obj.add(new Satellite("43232","O3B FM16","Communication","Mar-9-2018",R.mipmap.ic_o_3_b_network_foreground));
        O3B_NETWORKS_Sat_Obj.add(new Satellite("43231","O3B FM15","Communication","Mar-9-2018",R.mipmap.ic_o_3_b_network_foreground));
        O3B_NETWORKS_Sat_Obj.add(new Satellite("40351","O3B FM9","Communication","Dec-18-2014",R.mipmap.ic_o_3_b_network_foreground));
        O3B_NETWORKS_Sat_Obj.add(new Satellite("40350","O3B FM12","Communication","Dec-18-2014",R.mipmap.ic_o_3_b_network_foreground));
        O3B_NETWORKS_Sat_Obj.add(new Satellite("40349","O3B FM11","Communication","Dec-18-2014",R.mipmap.ic_o_3_b_network_foreground));
        O3B_NETWORKS_Sat_Obj.add(new Satellite("40348","O3B FM10","Communication","Dec-18-2014",R.mipmap.ic_o_3_b_network_foreground));
        O3B_NETWORKS_Sat_Obj.add(new Satellite("40082","O3B FM3","Communication","Jul-10-2014",R.mipmap.ic_o_3_b_network_foreground));
        O3B_NETWORKS_Sat_Obj.add(new Satellite("40081","O3B FM7","Communication","Jul-10-2014",R.mipmap.ic_o_3_b_network_foreground));
        O3B_NETWORKS_Sat_Obj.add(new Satellite("40080","O3B FM6","Communication","Jul-10-2014",R.mipmap.ic_o_3_b_network_foreground));
        O3B_NETWORKS_Sat_Obj.add(new Satellite("40079","O3B FM8","Communication","Jul-10-2014",R.mipmap.ic_o_3_b_network_foreground));
        O3B_NETWORKS_Sat_Obj.add(new Satellite("39191","O3B FM1","Communication","Jun-25-2013",R.mipmap.ic_o_3_b_network_foreground));
        O3B_NETWORKS_Sat_Obj.add(new Satellite("39190","O3B FM2","Communication","Jun-25-2013",R.mipmap.ic_o_3_b_network_foreground));
        O3B_NETWORKS_Sat_Obj.add(new Satellite("39189","O3B FM4","Communication","Jun-25-2013",R.mipmap.ic_o_3_b_network_foreground));
        O3B_NETWORKS_Sat_Obj.add(new Satellite("39188","O3B FM5","Communication","Jun-25-2013",R.mipmap.ic_o_3_b_network_foreground));
        return O3B_NETWORKS_Sat_Obj;
    }

    public List<Satellite> ORBCOMM_List() {
        ORBCOMM_Sat_Obj=new ArrayList<>();
        ORBCOMM_Sat_Obj.add(new Satellite("33065","ORBCOMM FM 40","Comm:,Traffic Monitoring","Jun-19-2008",R.mipmap.ic_orbcomm_foreground));
        ORBCOMM_Sat_Obj.add(new Satellite("33064","ORBCOMM FM 37","Comm:,Traffic Monitoring","Jun-19-2008",R.mipmap.ic_orbcomm_foreground));
        ORBCOMM_Sat_Obj.add(new Satellite("33063","ORBCOMM FM 39","Comm:,Traffic Monitoring","Jun-19-2008",R.mipmap.ic_orbcomm_foreground));
        ORBCOMM_Sat_Obj.add(new Satellite("33062","ORBCOMM FM 29","Experimental Comm:,Traffic Monitoring","Jun-19-2008",R.mipmap.ic_orbcomm_foreground));
        ORBCOMM_Sat_Obj.add(new Satellite("33061","ORBCOMM FM 41","Comm:,Traffic Monitoring","Jun-19-2008",R.mipmap.ic_orbcomm_foreground));
        ORBCOMM_Sat_Obj.add(new Satellite("33060","ORBCOMM FM 38","Comm:,Traffic Monitoring","Jun-19-2008",R.mipmap.ic_orbcomm_foreground));
        ORBCOMM_Sat_Obj.add(new Satellite("25986","ORBCOMM FM 34","Communication(Data)","Dec-4-1999",R.mipmap.ic_orbcomm_foreground));
        ORBCOMM_Sat_Obj.add(new Satellite("25985","ORBCOMM FM 35","Communication(Data)","Dec-4-1999",R.mipmap.ic_orbcomm_foreground));
        ORBCOMM_Sat_Obj.add(new Satellite("25984","ORBCOMM FM 36","Communication(Data)","Dec-4-1999",R.mipmap.ic_orbcomm_foreground));
        ORBCOMM_Sat_Obj.add(new Satellite("25983","ORBCOMM FM 33","Communication(Data)","Dec-4-1999",R.mipmap.ic_orbcomm_foreground));
        ORBCOMM_Sat_Obj.add(new Satellite("25982","ORBCOMM FM 32","Communication(Data)","Dec-4-1999",R.mipmap.ic_orbcomm_foreground));
        ORBCOMM_Sat_Obj.add(new Satellite("25981","ORBCOMM FM 31","Communication(Data)","Dec-4-1999",R.mipmap.ic_orbcomm_foreground));
        ORBCOMM_Sat_Obj.add(new Satellite("25980","ORBCOMM FM 30","Communication(Data)","Dec-4-1999",R.mipmap.ic_orbcomm_foreground));
        ORBCOMM_Sat_Obj.add(new Satellite("25482","ORBCOMM FM 28","Communication(Data)","Sep-23-1998",R.mipmap.ic_orbcomm_foreground));
        ORBCOMM_Sat_Obj.add(new Satellite("25481","ORBCOMM FM 27","Communication(Data)","Sep-23-1998",R.mipmap.ic_orbcomm_foreground));
        ORBCOMM_Sat_Obj.add(new Satellite("25480","ORBCOMM FM 26","Communication(Data)","Sep-23-1998",R.mipmap.ic_orbcomm_foreground));
        ORBCOMM_Sat_Obj.add(new Satellite("25479","ORBCOMM FM 25","Communication(Data)","Sep-23-1998",R.mipmap.ic_orbcomm_foreground));
        ORBCOMM_Sat_Obj.add(new Satellite("25478","ORBCOMM FM 24","Communication(Data)","Sep-23-1998",R.mipmap.ic_orbcomm_foreground));
        ORBCOMM_Sat_Obj.add(new Satellite("25477","ORBCOMM FM 23","Communication(Data)","Sep-23-1998",R.mipmap.ic_orbcomm_foreground));
        ORBCOMM_Sat_Obj.add(new Satellite("25476","ORBCOMM FM 22","Communication(Data)","Sep-23-1998",R.mipmap.ic_orbcomm_foreground));
        ORBCOMM_Sat_Obj.add(new Satellite("25475","ORBCOMM FM 21","Communication(Data)","Sep-23-1998",R.mipmap.ic_orbcomm_foreground));
        ORBCOMM_Sat_Obj.add(new Satellite("25420","ORBCOMM FM 13","Communication(Data)","Aug-2-1998",R.mipmap.ic_orbcomm_foreground));
        ORBCOMM_Sat_Obj.add(new Satellite("25419","ORBCOMM FM 14","Communication(Data)","Aug-2-1998",R.mipmap.ic_orbcomm_foreground));
        ORBCOMM_Sat_Obj.add(new Satellite("25418","ORBCOMM FM 15","Communication(Data)","Aug-2-1998",R.mipmap.ic_orbcomm_foreground));
        ORBCOMM_Sat_Obj.add(new Satellite("25417","ORBCOMM FM 16","Communication(Data)","Aug-2-1998",R.mipmap.ic_orbcomm_foreground));
        ORBCOMM_Sat_Obj.add(new Satellite("25416","ORBCOMM FM 20","Communication(Data)","Aug-2-1998",R.mipmap.ic_orbcomm_foreground));
        ORBCOMM_Sat_Obj.add(new Satellite("25415","ORBCOMM FM 19","Communication(Data)","Aug-2-1998",R.mipmap.ic_orbcomm_foreground));
        ORBCOMM_Sat_Obj.add(new Satellite("25414","ORBCOMM FM 18","Communication(Data)","Aug-2-1998",R.mipmap.ic_orbcomm_foreground));
        ORBCOMM_Sat_Obj.add(new Satellite("25413","ORBCOMM FM 17","Communication(Data)","Aug-2-1998",R.mipmap.ic_orbcomm_foreground));
        ORBCOMM_Sat_Obj.add(new Satellite("25159","ORBCOMM FM 4","Communication(Data)","Feb-10-1998",R.mipmap.ic_orbcomm_foreground));
        ORBCOMM_Sat_Obj.add(new Satellite("25158","ORBCOMM FM 3","Communication(Data)","Feb-10-1998",R.mipmap.ic_orbcomm_foreground));
        ORBCOMM_Sat_Obj.add(new Satellite("25119","ORBCOMM FM 7","Communication(Data)","Dec-23-1997",R.mipmap.ic_orbcomm_foreground));
        ORBCOMM_Sat_Obj.add(new Satellite("25118","ORBCOMM FM 6","Communication(Data)","Dec-23-1997",R.mipmap.ic_orbcomm_foreground));
        ORBCOMM_Sat_Obj.add(new Satellite("25117","ORBCOMM FM 5","Communication(Data)","Dec-23-1997",R.mipmap.ic_orbcomm_foreground));
        ORBCOMM_Sat_Obj.add(new Satellite("25116","ORBCOMM FM 9","Communication(Data)","Dec-23-1997",R.mipmap.ic_orbcomm_foreground));
        ORBCOMM_Sat_Obj.add(new Satellite("25115","ORBCOMM FM 12","Communication(Data)","Dec-23-1997",R.mipmap.ic_orbcomm_foreground));
        ORBCOMM_Sat_Obj.add(new Satellite("25114","ORBCOMM FM 11","Communication(Data)","Dec-23-1997",R.mipmap.ic_orbcomm_foreground));
        ORBCOMM_Sat_Obj.add(new Satellite("25113","ORBCOMM FM 12","Communication(Data)","Dec-23-1997",R.mipmap.ic_orbcomm_foreground));
        ORBCOMM_Sat_Obj.add(new Satellite("25112","ORBCOMM FM 8","Communication(Data)","Dec-23-1997",R.mipmap.ic_orbcomm_foreground));
        ORBCOMM_Sat_Obj.add(new Satellite("23546","ORBCOMM FM 2","Communication(Data)","Apr-3-1995",R.mipmap.ic_orbcomm_foreground));
        ORBCOMM_Sat_Obj.add(new Satellite("23545","ORBCOMM FM 1","Communication(Data)","Apr-3-1995",R.mipmap.ic_orbcomm_foreground));
        return ORBCOMM_Sat_Obj;
    }

    public List<Satellite> REGIONAL_AFRICAN_SATELLITE_COMMUNICATIONS_ORGANIZATION_RASCOM_List() {
        RASCO_Sat_Obj=new ArrayList<>();
        RASCO_Sat_Obj.add(new Satellite("36831","RASCOM QAF 1R","Communication","Aug-4-2010",R.mipmap.ic_rascom_foreground));
        RASCO_Sat_Obj.add(new Satellite("32387","RASCOM 1","Communication","Dec-21-2007",R.mipmap.ic_rascom_foreground));
        return RASCO_Sat_Obj;
    }

    public List<Satellite> SEA_LAUNCH_List() {
        SEA_LAUNCH_Sat_Obj=new ArrayList<>();
        SEA_LAUNCH_Sat_Obj.add(new Satellite("25661","SEA LAUNCH DEMO","","Mar-28-1999",R.mipmap.ic_sea_launch_foreground));
        return SEA_LAUNCH_Sat_Obj;
    }
    //ssss//
    public List<Satellite> SOCIETE_EUROPEENNE_DES_SATELLITES_SES_List() {
        SOCIETE_EUROPEENNE_DES_SATELLITES_Sat_Obj=new ArrayList<>();
        SOCIETE_EUROPEENNE_DES_SATELLITES_Sat_Obj.add(new Satellite("43488","SES-12","Communication","Jun-4-2018",R.mipmap.ic_ses_foreground));
        SOCIETE_EUROPEENNE_DES_SATELLITES_Sat_Obj.add(new Satellite("43178","SES-16/GOVSAT-1","Communication","Jan-31-2018",R.mipmap.ic_ses_foreground));
        SOCIETE_EUROPEENNE_DES_SATELLITES_Sat_Obj.add(new Satellite("43175","SES 14","Communication,EO","Jan-25-2018",R.mipmap.ic_ses_foreground));
        SOCIETE_EUROPEENNE_DES_SATELLITES_Sat_Obj.add(new Satellite("42967","ECHOSTAR 105/SES 11","Communication","Oct-11-2017",R.mipmap.ic_ses_foreground));
        SOCIETE_EUROPEENNE_DES_SATELLITES_Sat_Obj.add(new Satellite("42709","SES-15","Communication","May-18-2017",R.mipmap.ic_ses_foreground));
        SOCIETE_EUROPEENNE_DES_SATELLITES_Sat_Obj.add(new Satellite("42432","SES-10","Communication","Mar-30-2017",R.mipmap.ic_ses_foreground));
        SOCIETE_EUROPEENNE_DES_SATELLITES_Sat_Obj.add(new Satellite("40364","ASTRA 2G","Communication(DB)","Dec-27-2014",R.mipmap.ic_ses_foreground));
        SOCIETE_EUROPEENNE_DES_SATELLITES_Sat_Obj.add(new Satellite("39617","ASTRA 5B","Communication(DB)","Mar-22-2014",R.mipmap.ic_ses_foreground));
        SOCIETE_EUROPEENNE_DES_SATELLITES_Sat_Obj.add(new Satellite("39285","ASTRA 2E","Communication(DB)","Sep-29-2013",R.mipmap.ic_ses_foreground));
        SOCIETE_EUROPEENNE_DES_SATELLITES_Sat_Obj.add(new Satellite("39172","SES-6","Communication","Jun-3-2013",R.mipmap.ic_ses_foreground));
        SOCIETE_EUROPEENNE_DES_SATELLITES_Sat_Obj.add(new Satellite("38778","ASTRA 2F","Communication(DB)","Sep-28-2012",R.mipmap.ic_ses_foreground));
        SOCIETE_EUROPEENNE_DES_SATELLITES_Sat_Obj.add(new Satellite("38652","SES 5","Communication","Jul-9-2012",R.mipmap.ic_ses_foreground));
        SOCIETE_EUROPEENNE_DES_SATELLITES_Sat_Obj.add(new Satellite("38087","SES 4","Communication","Feb-14-2012",R.mipmap.ic_ses_foreground));
        SOCIETE_EUROPEENNE_DES_SATELLITES_Sat_Obj.add(new Satellite("37809","SES 2","Communication","Sep-21-2011",R.mipmap.ic_ses_foreground));
        SOCIETE_EUROPEENNE_DES_SATELLITES_Sat_Obj.add(new Satellite("37775","ASTRA 1N","Communication(DB)","Aug-6-2011",R.mipmap.ic_ses_foreground));
        SOCIETE_EUROPEENNE_DES_SATELLITES_Sat_Obj.add(new Satellite("36581","ASTRA 3B","Communication(DB)","May-21-2010",R.mipmap.ic_ses_foreground));
        SOCIETE_EUROPEENNE_DES_SATELLITES_Sat_Obj.add(new Satellite("36516","SES 1","Communication","Apr-24-2010",R.mipmap.ic_ses_foreground));
        SOCIETE_EUROPEENNE_DES_SATELLITES_Sat_Obj.add(new Satellite("36032","NSS 12","Communication","Oct-29-2009",R.mipmap.ic_ses_foreground));
        SOCIETE_EUROPEENNE_DES_SATELLITES_Sat_Obj.add(new Satellite("34941","SES 7(PROTOSTAR 2)","Communication","May-16-2009",R.mipmap.ic_ses_foreground));
        SOCIETE_EUROPEENNE_DES_SATELLITES_Sat_Obj.add(new Satellite("33749","NSS 9","Communication","Feb-12-2009",R.mipmap.ic_ses_foreground));
        SOCIETE_EUROPEENNE_DES_SATELLITES_Sat_Obj.add(new Satellite("33436","ASTRA 1M","Communication(DB)","Nov-5-2008",R.mipmap.ic_ses_foreground));
        SOCIETE_EUROPEENNE_DES_SATELLITES_Sat_Obj.add(new Satellite("33275","AMC-21","Communication","Aug-14-2008",R.mipmap.ic_ses_foreground));
        SOCIETE_EUROPEENNE_DES_SATELLITES_Sat_Obj.add(new Satellite("32299","ASTRA 4A(SIRIUS 4)","Communication(DB)","Nov-17-2007",R.mipmap.ic_ses_foreground));
        SOCIETE_EUROPEENNE_DES_SATELLITES_Sat_Obj.add(new Satellite("31306","ASTRA 1L","Communication(DB)","May-4-2007",R.mipmap.ic_ses_foreground));
        SOCIETE_EUROPEENNE_DES_SATELLITES_Sat_Obj.add(new Satellite("29644","AMC-18","Communication","Dec-8-2006",R.mipmap.ic_ses_foreground));
        SOCIETE_EUROPEENNE_DES_SATELLITES_Sat_Obj.add(new Satellite("29055","ASTRA 1KR","Communication(DB)","Apr-20-2006",R.mipmap.ic_ses_foreground));
        SOCIETE_EUROPEENNE_DES_SATELLITES_Sat_Obj.add(new Satellite("28526","NSS 10(AMC-12)","Communication","Feb-3-2005",R.mipmap.ic_ses_foreground));
        SOCIETE_EUROPEENNE_DES_SATELLITES_Sat_Obj.add(new Satellite("28472","AMC-16","Communication","Dec-17-2004",R.mipmap.ic_ses_foreground));
        SOCIETE_EUROPEENNE_DES_SATELLITES_Sat_Obj.add(new Satellite("28446","AMC-15","Communication","Oct-14-2004",R.mipmap.ic_ses_foreground));
        SOCIETE_EUROPEENNE_DES_SATELLITES_Sat_Obj.add(new Satellite("28252","AMC-11(GE-11)","Communication","May-19-2004",R.mipmap.ic_ses_foreground));
        SOCIETE_EUROPEENNE_DES_SATELLITES_Sat_Obj.add(new Satellite("28154","AMC-10(GE-10)","Communication","Feb-5-2004",R.mipmap.ic_ses_foreground));
        SOCIETE_EUROPEENNE_DES_SATELLITES_Sat_Obj.add(new Satellite("27820","AMC-9(GE-12)","Communication","Jun-6-2003",R.mipmap.ic_ses_foreground));
        SOCIETE_EUROPEENNE_DES_SATELLITES_Sat_Obj.add(new Satellite("27603","NSS 6","Communication","Dec-17-2002",R.mipmap.ic_ses_foreground));
        SOCIETE_EUROPEENNE_DES_SATELLITES_Sat_Obj.add(new Satellite("27414","NSS 7","Communication","Apr-16-2002",R.mipmap.ic_ses_foreground));
        SOCIETE_EUROPEENNE_DES_SATELLITES_Sat_Obj.add(new Satellite("27400","ASTRA 3A","Communication(DB)","Mar-29-2002",R.mipmap.ic_ses_foreground));
        SOCIETE_EUROPEENNE_DES_SATELLITES_Sat_Obj.add(new Satellite("26853","ASTRA 2C","Communication(DB)","Jun-16-2001",R.mipmap.ic_ses_foreground));
        SOCIETE_EUROPEENNE_DES_SATELLITES_Sat_Obj.add(new Satellite("26639","AMC-8(GE-8)","Communication","Dec-20-2000",R.mipmap.ic_ses_foreground));
        SOCIETE_EUROPEENNE_DES_SATELLITES_Sat_Obj.add(new Satellite("26638","ASTRA 2D","Communication(DB)","Dec-20-2000",R.mipmap.ic_ses_foreground));
        SOCIETE_EUROPEENNE_DES_SATELLITES_Sat_Obj.add(new Satellite("26580","AMC-6(GE-6)","Communication","Oct-21-2000",R.mipmap.ic_ses_foreground));
        SOCIETE_EUROPEENNE_DES_SATELLITES_Sat_Obj.add(new Satellite("26554","NSS 11(AAP-1)","Communication","Oct-1-2000",R.mipmap.ic_ses_foreground));
        SOCIETE_EUROPEENNE_DES_SATELLITES_Sat_Obj.add(new Satellite("26495","AMC-7(GE-7)","Communication","Sep-14-2000",R.mipmap.ic_ses_foreground));
        SOCIETE_EUROPEENNE_DES_SATELLITES_Sat_Obj.add(new Satellite("26494","ASTRA 2B","Communication(DB)","Sep-14-2000",R.mipmap.ic_ses_foreground));
        SOCIETE_EUROPEENNE_DES_SATELLITES_Sat_Obj.add(new Satellite("25954","AMC-4(GE-4)","Communication","Nov-13-1999",R.mipmap.ic_ses_foreground));
        SOCIETE_EUROPEENNE_DES_SATELLITES_Sat_Obj.add(new Satellite("25785","ASTRA 1H","Communication(DB)","Jun-18-1999",R.mipmap.ic_ses_foreground));
        SOCIETE_EUROPEENNE_DES_SATELLITES_Sat_Obj.add(new Satellite("25516","AMC-5(GE-5)","Communication","Oct-28-1998",R.mipmap.ic_ses_foreground));
        SOCIETE_EUROPEENNE_DES_SATELLITES_Sat_Obj.add(new Satellite("25492","SIRIUS 3","Communication","Oct-5-1998",R.mipmap.ic_ses_foreground));
        SOCIETE_EUROPEENNE_DES_SATELLITES_Sat_Obj.add(new Satellite("25462","ASTRA 2A","Communication(DB)","Aug-30-1998",R.mipmap.ic_ses_foreground));
        SOCIETE_EUROPEENNE_DES_SATELLITES_Sat_Obj.add(new Satellite("25239","NSS 806(INTELSAT 806)","Communication","Feb-28-1998",R.mipmap.ic_ses_foreground));
        SOCIETE_EUROPEENNE_DES_SATELLITES_Sat_Obj.add(new Satellite("25071","ASTRA 1G","Communication(DB)","Dec-2-1997",R.mipmap.ic_ses_foreground));
        SOCIETE_EUROPEENNE_DES_SATELLITES_Sat_Obj.add(new Satellite("24936","AMC-3(GE-3)","Communication","Sep-4-1997",R.mipmap.ic_ses_foreground));
        SOCIETE_EUROPEENNE_DES_SATELLITES_Sat_Obj.add(new Satellite("24713","AMC-2(GE-2)","Communication","Jan-30-1997",R.mipmap.ic_ses_foreground));
        SOCIETE_EUROPEENNE_DES_SATELLITES_Sat_Obj.add(new Satellite("24315","AMC-1(GE-1)","Communication","Sep-8-1996",R.mipmap.ic_ses_foreground));
        SOCIETE_EUROPEENNE_DES_SATELLITES_Sat_Obj.add(new Satellite("23842","ASTRA 1F","Communication(DB)","Apr-8-1996",R.mipmap.ic_ses_foreground));
        SOCIETE_EUROPEENNE_DES_SATELLITES_Sat_Obj.add(new Satellite("23686","ASTRA 1E","Communication(DB)","Oct-19-1995",R.mipmap.ic_ses_foreground));
        SOCIETE_EUROPEENNE_DES_SATELLITES_Sat_Obj.add(new Satellite("23305","NSS 703(INTELSAT 703)","Communication","Oct-6-1994",R.mipmap.ic_ses_foreground));
        SOCIETE_EUROPEENNE_DES_SATELLITES_Sat_Obj.add(new Satellite("22653","ASTRA 1C","Communication(DB)","May-12-1993",R.mipmap.ic_ses_foreground));
        return SOCIETE_EUROPEENNE_DES_SATELLITES_Sat_Obj;
    }

    public void inClickEvent(Country country) {

        Intent intent = new Intent(getApplicationContext(), SatelliteListActivity.class);

        switch (country.getCountryName()) {
            case "ALGERIA":
                intent.putExtra("savedUser", (Serializable) ALGERIA_Satellite_List());
                startActivity(intent);
                break;
            case "AUSTRALIA":
                intent.putExtra("savedUser", (Serializable) AUSTRALIA_Satellite_List());
                startActivity(intent);
                break;
            case "ARGENTINA":
                intent.putExtra("savedUser", (Serializable) ARGENTINA_Satellite_List());
                startActivity(intent);
                break;
            case "AZERBAIJAN":
                intent.putExtra("savedUser", (Serializable) AZERBAIJAN_Satellite_List());
                startActivity(intent);
                break;
            case "BELARUS":
                intent.putExtra("savedUser", (Serializable) BELARUS_Satellite_List());
                startActivity(intent);
                break;
            case "BOLIVIA":
                intent.putExtra("savedUser", (Serializable) BOLIVIA_Satellite_List());
                startActivity(intent);
                break;
            case "BRAZIL":
                intent.putExtra("savedUser", (Serializable) BRAZIL_Satellite_List());
                startActivity(intent);
                break;
            case "BULGARIA":
                intent.putExtra("savedUser", (Serializable) BULGARIA_Satellite_List());
                startActivity(intent);
                break;
            case "CANADA":
                intent.putExtra("savedUser", (Serializable) CANADA_Satellite_List());
                startActivity(intent);
                break;
            case "CHILE":
                intent.putExtra("savedUser", (Serializable) CHILE_Satellite_List());
                startActivity(intent);
                break;
            case "CHINA":
                intent.putExtra("savedUser", (Serializable) CHINA_Satellite_List());
                startActivity(intent);
                break;
            case "CZECH":
                intent.putExtra("savedUser", (Serializable) CZECH_Satellite_List());
                startActivity(intent);
                break;
            case "DENMARK":
                intent.putExtra("savedUser", (Serializable) DENMARK_Satellite_List());
                startActivity(intent);
                break;
            case "ECUADOR":
                intent.putExtra("savedUser", (Serializable) ECUADOR_Satellite_List());
                startActivity(intent);
                break;
            case "EGYPT":
                intent.putExtra("savedUser", (Serializable) EGYPT_Satellite_List());
                startActivity(intent);
                break;
            case "ESTONIA":
                intent.putExtra("savedUser", (Serializable) ESTONIA_Satellite_List());
                startActivity(intent);
                break;
            case "FRANCE":
                intent.putExtra("savedUser", (Serializable) FRANCE_Satellite_List());
                startActivity(intent);
                break;
            case "GERMANY":
                intent.putExtra("savedUser", (Serializable) GERMANY_Satellite_List());
                startActivity(intent);
                break;
            case "GREECE":
                intent.putExtra("savedUser", (Serializable) GREECE_Satellite_List());
                startActivity(intent);
                break;
            case "INDIA":
                intent.putExtra("savedUser", (Serializable) INDIA_Satellite_List());
                startActivity(intent);
                break;
            case "INDONESIA":
                intent.putExtra("savedUser", (Serializable) INDONESIA_Satellite_List());
                startActivity(intent);
                break;
            case "IRAN":
                intent.putExtra("savedUser", (Serializable) IRAN_Satellite_List());
                startActivity(intent);
                break;
            case "IRAQ":
                intent.putExtra("savedUser", (Serializable) IRAQ_Satellite_List());
                startActivity(intent);
                break;
            case "ISRAEL":
                intent.putExtra("savedUser", (Serializable) ISRAEL_Satellite_List());
                startActivity(intent);
                break;
            case "ITALY":
                intent.putExtra("savedUser", (Serializable) ITALY_Satellite_List());
                startActivity(intent);
                break;
            case "JAPAN":
                intent.putExtra("savedUser", (Serializable) JAPAN_Satellite_List());
                startActivity(intent);
                break;
            case "KAZAKHSTAN":
                intent.putExtra("savedUser", (Serializable) KAZAKHSTAN_Satellite_List());
                startActivity(intent);
                break;
            case "LAOS":
                intent.putExtra("savedUser", (Serializable) LAOS_Satellite_List());
                startActivity(intent);
                break;
            case "LATVIA":
                intent.putExtra("savedUser", (Serializable) LATVIA_Satellite_List());
                startActivity(intent);
                break;
            case "LITHUANIA":
                intent.putExtra("savedUser", (Serializable) LITHUANIA_Satellite_List());
                startActivity(intent);
                break;
            case "LUXEMBOURG":
                intent.putExtra("savedUser", (Serializable) LUXEMBOURG_Satellite_List());
                startActivity(intent);
                break;
            case "MALAYSIA":
                intent.putExtra("savedUser", (Serializable) MALAYSIA_Satellite_List());
                startActivity(intent);
                break;
            case "MEXICO":
                intent.putExtra("savedUser", (Serializable) MEXICO_Satellite_List());
                startActivity(intent);
                break;
            case "MOROCCO":
                intent.putExtra("savedUser", (Serializable) MOROCCO_Satellite_List());
                startActivity(intent);
                break;
            case "NETHERLANDS":
                intent.putExtra("savedUser", (Serializable) NETHERLANDS_Satellite_List());
                startActivity(intent);
                break;
            case "NIGERIA":
                intent.putExtra("savedUser", (Serializable) NIGERIA_Satellite_List());
                startActivity(intent);
                break;
            case "NORTH KOREA":
                intent.putExtra("savedUser", (Serializable) NORTH_KOREA_Satellite_List());
                startActivity(intent);
                break;
            case "NORWAY":
                intent.putExtra("savedUser", (Serializable) NORWAY_Satellite_List());
                startActivity(intent);
                break;
            case "PAKISTAN":
                intent.putExtra("savedUser", (Serializable) PAKISTAN_Satellite_List());
                startActivity(intent);
                break;
            case "PERU":
                intent.putExtra("savedUser", (Serializable) PERU_Satellite_List());
                startActivity(intent);
                break;
            case "PHILIPPINES":
                intent.putExtra("savedUser", (Serializable) PHILIPPINES_Satellite_List());
                startActivity(intent);
                break;
            case "POLAND":
                intent.putExtra("savedUser", (Serializable) POLAND_Satellite_List());
                startActivity(intent);
                break;
            case "PORTUGAL":
                intent.putExtra("savedUser", (Serializable) PORTUGAL_Satellite_List());
                startActivity(intent);
                break;
            case "RUSSIA":
                intent.putExtra("savedUser", (Serializable) RUSSIA_Satellite_List());
                startActivity(intent);
                break;
            case "SAUDI ARABIA":
                intent.putExtra("savedUser", (Serializable) SAUDI_ARABIA_Satellite_List());
                startActivity(intent);
                break;
            case "SINGAPORE":
                intent.putExtra("savedUser", (Serializable) SINGAPORE_Satellite_List());
                startActivity(intent);
                break;
            case "SLOVAKIA":
                intent.putExtra("savedUser", (Serializable) SLOVAKIA_Satellite_List());
                startActivity(intent);
                break;
            case "SOUTH AFRICA":
                intent.putExtra("savedUser", (Serializable) SOUTH_AFRICA_Satellite_List());
                startActivity(intent);
                break;
            case "SOUTH KOREA":
                intent.putExtra("savedUser", (Serializable) SOUTH_KOREA_Satellite_List());
                startActivity(intent);
                break;
            case "SPAIN":
                intent.putExtra("savedUser", (Serializable) SPAIN_Satellite_List());
                startActivity(intent);
                break;
            case "SWEDEN":
                intent.putExtra("savedUser", (Serializable) SWEDEN_Satellite_List());
                startActivity(intent);
                break;
            case "TAIWAN":
                intent.putExtra("savedUser", (Serializable) TAIWAN_Satellite_List());
                startActivity(intent);
                break;
            case "THAILAND_":
                intent.putExtra("savedUser", (Serializable) THAILAND_Satellite_List());
                startActivity(intent);
                break;
            case "TURKEY":
                intent.putExtra("savedUser",(Serializable) TURKEY_Satellite_List());
                startActivity(intent);
                break;
            case "UNITED ARAB EMIRATES":
                intent.putExtra("savedUser", (Serializable) UNITED_ARAB_EMIRATES_Satellite_List());
                startActivity(intent);
                break;
            case "UNITED KINGDOM":
                intent.putExtra("savedUser", (Serializable) UNITED_KINGDOM_Satellite_List());
                startActivity(intent);
                break;
            case "USA":
                intent.putExtra("savedUser", (Serializable) USA_Satellite_List());
                startActivity(intent);
                break;
            case "URUGUAY":
                intent.putExtra("savedUser", (Serializable) URUGUAY_Satellite_List());
                startActivity(intent);
                break;
            case "VENEZUELA":
                intent.putExtra("savedUser", (Serializable) VENEZUELA_Satellite_List());
                startActivity(intent);
                break;
            case "VIETNAM":
                intent.putExtra("savedUser", (Serializable) VIETNAM_Satellite_List());
                startActivity(intent);
                break;
            case "KENIA":
                intent.putExtra("savedUser", (Serializable) KENIA_Satellite_List());
                startActivity(intent);
                break;
            case "BANGLADESH":
                intent.putExtra("savedUser", (Serializable) BANGLADESH_Satellite_List());
                startActivity(intent);
                break;
            case "FORMER CZECHOSLOVAKIA":
                intent.putExtra("savedUser", (Serializable) FORMER_CZECHOSLOVAKIA_List());
                startActivity(intent);
                break;
            case "CHINA/BRAZIL":
                intent.putExtra("savedUser", (Serializable) CHINA_BRAZIL_List());
                startActivity(intent);
                break;
            case "FRANCE/GERMANY":
                intent.putExtra("savedUser", (Serializable) FRANCE_GERMANY_List());
                startActivity(intent);
                break;
            case "FRANCE/ITALY":
                intent.putExtra("savedUser", (Serializable) FRANCE_ITALY_List());
                startActivity(intent);
                break;
            case "SINGAPORE/TAIWAN":
                intent.putExtra("savedUser", (Serializable) SINGAPORE_TAIWAN_List());
                startActivity(intent);
                break;
            case "TURKMENISTAN/MONACO":
                intent.putExtra("savedUser", (Serializable) TURKMENISTAN_MONACO_List());
                startActivity(intent);
                break;
            case "UNITED STATES/BRAZIL":
                intent.putExtra("savedUser", (Serializable) UNITED_STATES_BRAZIL_List());
                startActivity(intent);
                break;
            case "NATO":
                intent.putExtra("savedUser", (Serializable) NORTH_ATLANTIC_TREATY_ORGANIZATION_NATO_List());
                startActivity(intent);
                break;
            case "ARABSAT":
                intent.putExtra("savedUser", (Serializable) ARAB_SATELLITE_COMMUNICATIONS_ORGANIZATION_ARABSAT_List());
                startActivity(intent);
                break;
            case "ASIASAT":
                intent.putExtra("savedUser", (Serializable) ASIA_SATELLITE_TELECOMMUNICATIONS_COMPANY_ASIASAT_List());
                startActivity(intent);
                break;
            case "EUMETSAT":
                intent.putExtra("savedUser", (Serializable) EUROPEAN_ORGANISATION_FOR_THE_EXPLOITATION_EUMETSAT_List());
                startActivity(intent);
                break;
            case "GLOBALSTAR":
                intent.putExtra("savedUser", (Serializable) GLOBALSTAR_List());
                startActivity(intent);
                break;
            case "INMARSAT":
                intent.putExtra("savedUser", (Serializable) INTERNATIONAL_MOBILE_SATELLITE_ORGANIZATION_INMARSAT_List());
                startActivity(intent);
                break;
            case "ITSO":
                intent.putExtra("savedUser", (Serializable) INTERNATIONAL_TELECOMMUNICATIONS_SATELLITE_ORGANIZATION_ITSO_List());
                startActivity(intent);
                break;
            case "O3B NETWORK":
                intent.putExtra("savedUser", (Serializable) O3B_NETWORKS_List());
                startActivity(intent);
                break;
            case "ORBCOMM":
                intent.putExtra("savedUser", (Serializable) ORBCOMM_List());
                startActivity(intent);
                break;
            case "RASCOOM":
                intent.putExtra("savedUser", (Serializable) REGIONAL_AFRICAN_SATELLITE_COMMUNICATIONS_ORGANIZATION_RASCOM_List());
                startActivity(intent);
                break;
            case "SEA LAUNCH":
                intent.putExtra("savedUser", (Serializable) SEA_LAUNCH_List());
                startActivity(intent);
                break;
            case "SES":
                intent.putExtra("savedUser", (Serializable) SOCIETE_EUROPEENNE_DES_SATELLITES_SES_List());
                startActivity(intent);
                break;
            case "NEW ICO":
                intent.putExtra("savedUser", (Serializable) NEW_ICO_List());
                startActivity(intent);
                break;
            case "ESA":
                intent.putExtra("savedUser", (Serializable) EUROPEAN_SPACE_AGENCY_ESA_List());
                startActivity(intent);
                break;
            case "EUTELSAT":
                intent.putExtra("savedUser", (Serializable) EUROPEAN_TELECOMMUNICATIONS_SATELLITE_ORGANIZATION_EUTELSAT_List());
                startActivity(intent);
                break;

        }
    }
}
