package inc.machine_code.world_orbit_list.List;

import android.content.Intent;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ImageView;

import java.util.ArrayList;

import inc.machine_code.world_orbit_list.Adapter.SatelliteAdapter;
import inc.machine_code.world_orbit_list.Country.Satellite;
import inc.machine_code.world_orbit_list.R;
import inc.machine_code.world_orbit_list.WebPage.SatelliteWebViewActivity;

public class SatelliteListActivity extends AppCompatActivity implements SatelliteAdapter.InterfaceCallback {

    SatelliteAdapter adapter;
    ArrayList<Satellite> _sat_lite_List_Array = new ArrayList<>();
    private RecyclerView mRecyclerView;
    String NAME_ID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_satellite_list);

        mRecyclerView = findViewById(R.id.rv_country_name_flag);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        Intent intent = getIntent();

        ArrayList<Satellite> _sat_lite_List_Seri_able = (ArrayList<Satellite>) intent.getSerializableExtra("savedUser");
        NAME_ID = intent.getStringExtra("LIST_NAME_ID");
        _sat_lite_List_Array = _sat_lite_List_Seri_able;


        adapter = new SatelliteAdapter(this, _sat_lite_List_Array);
        mRecyclerView.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.searching_menu_bar, menu);
        Search(menu);
        return true;
    }

    public boolean Search(Menu menu) {
        MenuItem searchViewMenuItem = menu.findItem(R.id.menu_search_bar_satellite);
        //SearchManager searchManager = (SearchManager) getSystemService(Context.SEARCH_SERVICE);
        SearchView _search_view;
        _search_view = (SearchView) MenuItemCompat.getActionView(searchViewMenuItem);
        int searchImgId = android.support.v7.appcompat.R.id.search_button;
        ImageView _image_view = _search_view.findViewById(searchImgId);
        _image_view.setImageResource(R.drawable.ic_search_item_icon);
        _search_view.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String get_customer_text) {
                adapter.getFilter().filter(get_customer_text);
                return false;
            }
        });
        return true;
    }

    @Override
    public void inClickEvent(Satellite satellite, String Sat_Code_No) {
        Intent intent = new Intent(getApplicationContext(), SatelliteWebViewActivity.class);

        if (satellite.getSatCat_No() == Sat_Code_No) {
            intent.putExtra("WEB_LINK", Sat_Code_No);
            startActivity(intent);
        }
//        //*----ALGERIA----*//
//        if (NAME_ID.equals("ALGERIA")) {
//            switch (satellite.getSatCat_No()) {
//                case "43039":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "41789":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "41786":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "41785":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "36798":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "27559":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//            }
//        }
//        //*----ARGENTINA----*//
//        if (NAME_ID.equals("ARGENTINA")) {
//            switch (satellite.getSatCat_No()) {
//                case "43204":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "43195":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "42760":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "41558":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "41557":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "40941":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "40272":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "40014":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "39440":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "39153":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "37673":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "29712":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "27612":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "27606":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "26620":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "24714":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "20442":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "15642":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "14133":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//            }
//        }
//        //*----AUSTRALIA----*//
//        if (NAME_ID.equals("AUSTRALIA")) {
//            switch (satellite.getSatCat_No()) {
//                case "42786":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "42785":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "42783":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "42731":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "42730":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "42721":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "41794":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "40940":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "40146":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "35756":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "32252":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "29495":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "27831":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "27598":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "25398":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "23227":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "22087":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "18350":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "16275":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "15993":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "4321":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//            }
//        }
//        //*----AZERBAIJAN----*//
//        else if (NAME_ID.equals("AZERBAIJAN")) {
//            switch (satellite.getSatCat_No()) {
//                case "39079":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//            }
//        }
//        //*----BANGLADESH----*//
//        else if (NAME_ID.equals("BANGLADESH")) {
//            switch (satellite.getSatCat_No()) {
//                case "43463":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//            }
//        }
//        //*----BELARUS----*//
//        else if (NAME_ID.equals("BELARUS")) {
//            switch (satellite.getSatCat_No()) {
//                case "41238":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "38708":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//            }
//        }
//        //*----BOLIVIA----*//
//        else if (NAME_ID.equals("BOLIVIA")) {
//            switch (satellite.getSatCat_No()) {
//                case "39481":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//            }
//        }
//        //*----BRAZIL----*//
//        if (NAME_ID.equals("BRAZIL")) {
//            switch (satellite.getSatCat_No()) {
//                case "42692":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "41904":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "40733":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "40024":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "38991":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "32768":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "32293":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "26469":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "25941":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "25504":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "25152":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "23536":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "23199":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "22490":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "20440":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "16650":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "15561":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//            }
//        }
//
//        //*----BULGARIA----*//
//        else if (NAME_ID.equals("BULGARIA")) {
//            switch (satellite.getSatCat_No()) {
//                case "42801":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//            }
//        }
//        //*----CANADA----*//
//        if (NAME_ID.equals("CANADA")) {
//            switch (satellite.getSatCat_No()) {
//                case "43157":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "42734":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "41788":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "41605":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "41602":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "41036":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "40936":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "40056":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "40055":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "40020":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "39265":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "39127":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "39089":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "39088":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "38709":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "38342":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "37602":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "35873":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "34111":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "33453":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "33373":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "32790":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "32784":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "32382":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "31102":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "28868":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "28378":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "27858":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "27847":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "27843":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "27632":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "26624":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "25740":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "23846":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "23710":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "21726":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "21222":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "13652":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "13431":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "11153":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "8585":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "7790":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "6437":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "6278":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "5104":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "3669":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "1804":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "424":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//            }
//        }
//
//        //*----CHILE----*//
//        else if (NAME_ID.equals("CHILE")) {
//            switch (satellite.getSatCat_No()) {
//                case "42788":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "38011":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "25395":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//            }
//        }
//
//        //*----CHINA----*//
//        else if (NAME_ID.equals("CHINA")) {
//            switch (satellite.getSatCat_No()) {
//                case "43519":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "43518":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "43491":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "43485":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "43484":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "43472":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "43471":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "43470":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "43461":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "43450":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "43443":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "43442":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "43441":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "43440":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "43439":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "43279":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "43277":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "43276":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "43275":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "43262":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "43260":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "43259":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "43246":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "43245":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "43236":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "43208":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "43207":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "43199":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "43194":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "43192":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "43172":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "43171":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "43170":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "43169":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "43160":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "43159":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "43158":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "43156":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "43155":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "43146":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "43108":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "43107":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "43100":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "43099":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "43083":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "43082":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "43081":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "43080":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "43034":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "43030":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "43029":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "43028":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "43024":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "43023":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "43022":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "43011":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "43010":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "43002":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "43001":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "42947":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "42946":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "42945":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "42903":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "42787":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "42763":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "42761":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "42759":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "42758":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "42662":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "42061":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "41915":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "41914":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "41913":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "41911":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "41908":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "41907":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "41901":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "41900":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "41899":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "41898":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "41882":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "41869":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "41868":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "41857":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "41845":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "41844":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "41843":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "41842":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "41841":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "41838":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "41834":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "41765":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "41731":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "41727":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "41725":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "41634":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "41586":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "41556":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "41473":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "41434":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "41315":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "41194":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "41173":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "41103":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "41038":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "41026":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "41021":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "40988":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "40982":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "40961":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "40960":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "40959":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "40958":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "40938":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "40928":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "40927":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "40926":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "40925":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "40912":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "40911":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "40910":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "40909":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "40908":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "40907":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "40906":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "40904":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "40903":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "40902":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "40901":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "40900":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "40894":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "40892":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "40878":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "40749":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "40748":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "40701":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "40549":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "40424":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "40367":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "40362":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "40340":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "40339":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "40338":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "40336":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "40310":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "40305":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "40286":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "40275":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "40261":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "40144":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "40143":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "40137":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "40136":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "40118":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "40111":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "40110":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "40109":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "39624":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "39508":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "39455":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "39410":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "39363":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "39358":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "39260":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "39241":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "39240":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "39239":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "39210":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "39209":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "39208":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "39202":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "39157":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "39150":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "39017":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "39013":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "39012":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "39011":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "38999":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "38998":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "38997":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "38953":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "38861":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "38860":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "38775":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "38774":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "38730":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "38354":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "38352":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "38257":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "38256":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "38251":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "38250":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "38107":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "38091":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "38049":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "38046":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "38038":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "37948":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "37941":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "37931":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "37930":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "37875":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "37804":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "37781":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "37765":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "37763":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "37737":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "37730":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "37677":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "37384":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "37256":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "37234":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "37214":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "37210":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "37180":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "37179":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "37174":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "37167":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "37166":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "37165":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "37150":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "36985":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "36834":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "36828":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "36596":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "36590":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "36415":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "36414":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "36413":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "36287":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "36122":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "36121":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "36110":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "36088":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "34839":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "34779":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "33463":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "33446":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "33434":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "33433":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "33409":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "33408":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "33321":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "33320":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "33051":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "32958":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "32779":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "32289":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "31800":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "31490":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "31115":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "31113":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "30323":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "29640":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "29516":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "29506":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "29505":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "29398":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "29092":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "28890":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "28737":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "28638":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "28479":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "28470":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "28451":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "28414":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "28413":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "28382":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "28364":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "28221":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "28220":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "28082":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "28058":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "27813":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "27431":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "27430":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "26643":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "26599":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "26385":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "26382":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "26058":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "25924":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "25731":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "25730":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "42735":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "42725":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "42722":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "25404":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "25354":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "25010":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "24926":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "24925":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "24901":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "24834":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "24798":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "24282":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "23943":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "23415":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "23185":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "22996":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "21833":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "20788":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "20473":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "19710":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "19467":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "18922":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "16526":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "14985":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "14899":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "14670":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "4382":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//            }
//        }
//
//        //*----CZECH----*//
//        else if (NAME_ID.equals("CZECH")) {
//            switch (satellite.getSatCat_No()) {
//                case "42790":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "24292":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "23646":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//            }
//        }
//
//        //*----FORMER CZECHOSLOVAKIA----*//
//        else if (NAME_ID.equals("FORMER CZECHOSLOVAKIA")) {
//            switch (satellite.getSatCat_No()) {
//                case "21835":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "20281":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//            }
//        }
//        //*----DENMARK----*//
//        if (NAME_ID.equals("DENMARK")) {
//            switch (satellite.getSatCat_No()) {
//                case "43197":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "41460":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "40030":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "39430":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "39087":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "32788":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "27846":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "27842":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "25635":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//            }
//        }
//        //*----ECUADOR----*//
//        else if (NAME_ID.equals("ECUADOR")) {
//            switch (satellite.getSatCat_No()) {
//                case "39441":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "39151":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//            }
//        }
//
//        //*----EGYPT----*//
//        else if (NAME_ID.equals("EGYPT")) {
//            switch (satellite.getSatCat_No()) {
//                case "39678":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "36830":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "31117":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "26470":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "25311":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//            }
//        }
//
//        //*----ESTONIA----*//
//        else if (NAME_ID.equals("ESTONIA")) {
//            switch (satellite.getSatCat_No()) {
//                case "39161":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//            }
//        }
//        //*----FRANCE----*//
//        if (NAME_ID.equals("FRANCE")) {
//            switch (satellite.getSatCat_No()) {
//                case "43272":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "43271":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "43132":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "42792":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "42707":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "41748":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "41747":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "41461":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "41457":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "40053":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "39019":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "38755":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "38013":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "38012":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "38010":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "38009":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "38008":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "38007":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "36598":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "36124":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "33752":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "33751":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "33105":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "29678":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "29273":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "28885":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "28545":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "28498":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "28497":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "28496":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "28495":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "28494":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "28492":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "28368":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "27422":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "27421":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "25978":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "25977":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "25503":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "25260":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "24209":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "23730":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "23606":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "23605":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "22824":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "22823":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "22654":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "22078":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "21939":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "21813":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "21578":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "20705":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "20436":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "19621":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "18952":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "16613":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "15678":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "15159":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "12848":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "7646":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "7003":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "5729":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "5435":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "2680":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "2674":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "2016":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "1814":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "1778":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//            }
//        }
//        //*----GERMANY----*//
//        if (NAME_ID.equals("GERMANY")) {
//            switch (satellite.getSatCat_No()) {
//                case "42831":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "42829":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "42777":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "42701":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "41619":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "41604":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "40054":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "39446":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "39439":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "39435":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "39136":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "39135":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "39134":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "38710":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "36605":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "36582":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "35943":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "35936":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "35934":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "35933":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "33316":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "33315":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "33314":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "33313":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "33312":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "33244":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "32792":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "32787":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "32750":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "32283":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "31797":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "31698":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "29658":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "28898":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "28892":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "27940":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "27605":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "27561":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "27004":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "26959":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "26609":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "25757":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "25399":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "25068":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "22970":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "21577":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "20706":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "20168":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "20041":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "18570":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "14129":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "8582":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "7567":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "4221":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//            }
//        }
//        //*----GREECE----*//
//        else if (NAME_ID.equals("GREECE")) {
//            switch (satellite.getSatCat_No()) {
//                case "42724":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "42716":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "27811":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "22175":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//            }
//        }
//        //*----INDIA----*//
//        if (NAME_ID.equals("INDIA")) {
//            switch (satellite.getSatCat_No()) {
//                case "43039":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//            }
//        }
//        //*----INDONESIA----*//
//        else if (NAME_ID.equals("INDONESIA")) {
//            switch (satellite.getSatCat_No()) {
//                case "41944":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "41603":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "41591":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "40931":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "38744":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "35812":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "29709":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "28902":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "26089":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "25880":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "25050":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "23864":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "21964":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "14134":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "9862":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "9009":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//
//
//            }
//        }
//
//        //*----IRAQ----*//
//        else if (NAME_ID.equals("IRAQ")) {
//            switch (satellite.getSatCat_No()) {
//                case "40043":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//            }
//        }
//        //*----IRAN----*//
//        else if (NAME_ID.equals("IRAN")) {
//            switch (satellite.getSatCat_No()) {
//                case "28893":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//            }
//        }
//        //*----ISRAEL----*//
//        else if (NAME_ID.equals("ISRAEL")) {
//            switch (satellite.getSatCat_No()) {
//                case "42901":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "42000":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "41999":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "41759":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "40021":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "39650":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "39237":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "37950":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "36608":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "32794":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "32476":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "31601":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "29079":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "28132":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "27434":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "25397":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "23723":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//            }
//        }
//        //*----ITALY----*//
//        else if (NAME_ID.equals("ITALY")) {
//            switch (satellite.getSatCat_No()) {
//                case "42900":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "42794":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "42778":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "42776":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "41459":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "40012":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "39421":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "38078":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "38077":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "37788":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "37216":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "34810":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "33412":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "32376":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "31598":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "31135":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "28373":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "27608":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "26694":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "26547":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "26546":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "24208":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "22828":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "22783":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "22195":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "21055":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "10294":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//
//            }
//        }
//        //*----JAPAN----*//
//        else if (NAME_ID.equals("JAPAN")) {
//            switch (satellite.getSatCat_No()) {
//                case "37673":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//            }
//        }
//        //*----KAZAKHSTAN----*//
//        else if (NAME_ID.equals("KAZAKHSTAN")) {
//            switch (satellite.getSatCat_No()) {
//                case "42016":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "40010":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "39731":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "39728":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "37749":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "29230":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//            }
//        }
//        //*----KENIA----*//
//        else if (NAME_ID.equals("KENIA")) {
//            switch (satellite.getSatCat_No()) {
//                case "43467":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//            }
//        }
//        //*----LAOS----*//
//        else if (NAME_ID.equals("LAOS")) {
//            switch (satellite.getSatCat_No()) {
//                case "41034":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//            }
//        }
//        //*----LATVIA----*//
//        else if (NAME_ID.equals("LATVIA")) {
//            switch (satellite.getSatCat_No()) {
//                case "42791":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//            }
//        }
//        //*----LITHUANIA----*//
//        else if (NAME_ID.equals("LITHUANIA")) {
//            switch (satellite.getSatCat_No()) {
//                case "42768":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//            }
//        }
//        //*----LUXEMBOURG----*//
//        else if (NAME_ID.equals("LUXEMBOURG")) {
//            switch (satellite.getSatCat_No()) {
//                case "37840":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "23331":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "21139":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "19688":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//            }
//        }
//        //*----MALAYSIA----*//
//        else if (NAME_ID.equals("MALAYSIA")) {
//            switch (satellite.getSatCat_No()) {
//                case "40147":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "35578":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "35362":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "29648":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "26548":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "24653":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "23765":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//            }
//        }
//        //*----MEXICO----*//
//        else if (NAME_ID.equals("MEXICO")) {
//            switch (satellite.getSatCat_No()) {
//                case "40946":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "40664":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "39122":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "39035":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "37826":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "29162":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "25558":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "24305":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "23313":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "22911":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "16274":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "15824":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//            }
//        }
//        //*----MOROCCO----*//
//        else if (NAME_ID.equals("MOROCCO")) {
//            switch (satellite.getSatCat_No()) {
//                case "43005":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//            }
//        }
//        //*----NETHERLANDS----*//
//        else if (NAME_ID.equals("NETHERLANDS")) {
//            switch (satellite.getSatCat_No()) {
//                case "42015":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "39428":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "32789":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "24957":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "21989":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "19121":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//            }
//        }
//        //*----NIGERIA----*//
//        else if (NAME_ID.equals("NIGERIA")) {
//            switch (satellite.getSatCat_No()) {
//                case "42824":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "38014":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "37790":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "37789":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "31395":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "27941":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//            }
//        }
//        //*----NORTH KOREA----*//
//        else if (NAME_ID.equals("NORTH KOREA")) {
//            switch (satellite.getSatCat_No()) {
//                case "41332":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "39026":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//            }
//        }
//        //*----NORWAY----*//
//        else if (NAME_ID.equals("NORWAY")) {
//            switch (satellite.getSatCat_No()) {
//                case "40613":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "40075":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "39445":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "36797":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "36033":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "32487":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "25358":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "24808":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "20762":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//            }
//        }
//        //*----PAKISTAN----*//
//        else if (NAME_ID.equals("PAKISTAN")) {
//            switch (satellite.getSatCat_No()) {
//                case "39432":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "37779":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "27003":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "23779":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//            }
//        }
//        //*----PERU----*//
//        else if (NAME_ID.equals("PERU")) {
//            switch (satellite.getSatCat_No()) {
//                case "41770":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "39442":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//            }
//        }
//        //*----PHILIPPINES----*//
//        else if (NAME_ID.equals("PHILIPPINES")) {
//            switch (satellite.getSatCat_No()) {
//                case "41463":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "17706":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//            }
//        }
//        //*----POLAND----*//
//        else if (NAME_ID.equals("POLAND")) {
//            switch (satellite.getSatCat_No()) {
//                case "40119":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "39431":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//            }
//        }
//        //*----PORTUGAL----*//
//        else if (NAME_ID.equals("PORTUGAL")) {
//            switch (satellite.getSatCat_No()) {
//                case "22829":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "22826":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//            }
//        }
//        //*----RUSSIA----*//
//        else if (NAME_ID.equals("RUSSIA")) {
//            switch (satellite.getSatCat_No()) {
//                case "37673":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//            }
//        }
//        //*----SAUDI ARABIA----*//
//        else if (NAME_ID.equals("SAUDI ARABIA")) {
//            switch (satellite.getSatCat_No()) {
//                case "40016":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "31127":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "31125":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "31124":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "31121":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "31119":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "31118":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "28371":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "28370":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "28369":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "27607":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "26549":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "26545":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//            }
//        }
//        //*----SINGAPORE----*//
//        else if (NAME_ID.equals("SINGAPORE")) {
//            switch (satellite.getSatCat_No()) {
//                case "41171":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "41170":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "41169":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "41168":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "41167":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "41166":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "40057":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "40028":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "39438":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "37389":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//
//            }
//        }
//        //*----SLOVAKIA----*//
//        else if (NAME_ID.equals("SLOVAKIA")) {
//            switch (satellite.getSatCat_No()) {
//                case "42789":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//            }
//        }
//        //*----SOUTH AFRICA----*//
//        else if (NAME_ID.equals("SOUTH AFRICA")) {
//            switch (satellite.getSatCat_No()) {
//                case "42726":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "42713":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "40353":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "39417":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "35870":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "25636":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//            }
//        }
//        //*----SOUTH KOREA----*//
//        else if (NAME_ID.equals("SOUTH KOREA")) {
//            switch (satellite.getSatCat_No()) {
//                case "43138":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "42984":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "42727":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "42714":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "42691":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "40536":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "39426":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "39422":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "39227":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "39068":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "38338":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "37265":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "36744":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "29349":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "29268":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "27945":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "26032":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "25894":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "25756":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "23768":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "23639":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "22825":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "22077":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//
//
//            }
//        }
//        //*----SPAIN----*//
//        else if (NAME_ID.equals("SPAIN")) {
//            switch (satellite.getSatCat_No()) {
//                case "43228":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "43215":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "42934":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "42728":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "41942":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "41732":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "40013":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "39616":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "39433":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "39420":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "39078":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "37264":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "35942":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "35685":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "35681":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "28945":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "28493":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "28393":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "27528":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "26071":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "23607":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "22723":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "22116":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "7531":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//
//            }
//        }
//        //*----SWEDEN----*//
//        else if (NAME_ID.equals("SWEDEN")) {
//            switch (satellite.getSatCat_No()) {
//                case "42708":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "36827":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "36599":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "26702":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "26621":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "25568":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "25049":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "23464":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "22161":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "20193":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "19919":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "16614":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//
//            }
//        }
//        //*----TAIWAN----*//
//        else if (NAME_ID.equals("TAIWAN")) {
//            switch (satellite.getSatCat_No()) {
//                case "42920":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "40022":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "29052":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "29051":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "29050":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "29049":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "29048":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "29047":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "28254":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "25616":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//            }
//        }
//        //*----THAILAND----*//
//        else if (NAME_ID.equals("THAILAND")) {
//            switch (satellite.getSatCat_No()) {
//                case "41552":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "39500":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "33396":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "29163":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "28786":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "25396":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "24768":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "23314":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "22931":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//            }
//        }
//        //*----TURKEY----*//
//        else if (NAME_ID.equals("TURKEY")) {
//            switch (satellite.getSatCat_No()) {
//                case "43466":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "42736":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "42700":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "41875":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "40984":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "39522":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "39152":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "39030":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "37791":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "35935":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "33056":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "27943":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "26666":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "23949":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "23200":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//            }
//        }
//        //*----UNITED ARAB EMIRATES----*//
//        else if (NAME_ID.equals("UNITED ARAB EMIRATES")) {
//            switch (satellite.getSatCat_No()) {
//                case "43174":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "42017":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "39419":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "38245":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "37393":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "35682":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "32404":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "27825":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "26578":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//
//            }
//        }
//        //*----UNITED KINGDOM----*//
//        else if (NAME_ID.equals("UNITED KINGDOM")) {
//            switch (satellite.getSatCat_No()) {
//                case "43510":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "43115":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "42765":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "40719":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "40718":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "40717":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "40716":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "40715":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "40076":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "40074":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "39444":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "39427":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "39090":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "39034":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "38741":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "37237":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "35683":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "33055":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "32294":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "30794":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "28891":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "27942":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "26695":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "26611":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "26610":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "26386":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "25693":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "25639":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "25134":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "23126":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "23125":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "21575":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "20776":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "20438":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "20437":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "20401":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "19687":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "14781":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "7547":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "7213":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "5580":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "4493":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "4250":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//            }
//        }
//        //*----USA----*//
//        else if (NAME_ID.equals("USA")) {
//            switch (satellite.getSatCat_No()) {
//                case "37673":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//            }
//        }
//        //*----URUGUAY----*//
//        else if (NAME_ID.equals("URUGUAY")) {
//            switch (satellite.getSatCat_No()) {
//                case "40034":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//            }
//        }
//        //*----VENEZUELA----*//
//        else if (NAME_ID.equals("VENEZUELA")) {
//            switch (satellite.getSatCat_No()) {
//                case "42954":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "38782":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "33414":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//            }
//        }
//        //*----VIETNAM----*//
//        else if (NAME_ID.equals("VIETNAM")) {
//            switch (satellite.getSatCat_No()) {
//                case "39160":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "38332":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "32767":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//            }
//        }
//        //*----NATO----*//
//        else if (NAME_ID.equals("NATO")) {
//            switch (satellite.getSatCat_No()) {
//                case "22921":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "21047":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "15391":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "11115":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "9785":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "8808":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "4902":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "4353":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//            }
//        }
//        //*----CHINA/BRAZIL----*//
//        else if (NAME_ID.equals("CHINA/BRAZIL")) {
//            switch (satellite.getSatCat_No()) {
//                case "32062":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "28057":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "25940":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//            }
//        }
//
//        //*----FRANCE/GERMANY----*//
//        else if (NAME_ID.equals("FRANCE/GERMANY")) {
//            switch (satellite.getSatCat_No()) {
//                case "8132":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "7578":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//            }
//        }
//
//        //*----FRANCE/ITALY----*//
//        else if (NAME_ID.equals("FRANCE/ITALY")) {
//            switch (satellite.getSatCat_No()) {
//                case "40614":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "39509":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//            }
//        }
//        //*----SINGAPORE/TAIWAN----*//
//        else if (NAME_ID.equals("SINGAPORE/TAIWAN")) {
//            switch (satellite.getSatCat_No()) {
//                case "37606":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "25460":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//            }
//        }
//        //*----TURKMENISTAN/MONACO----*//
//        else if (NAME_ID.equals("TURKMENISTAN/MONACO")) {
//            switch (satellite.getSatCat_No()) {
//                case "40617":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//            }
//        }
//        //*----UNITED STATES/BRAZIL----*//
//        else if (NAME_ID.equals("UNITED STATES/BRAZIL")) {
//            switch (satellite.getSatCat_No()) {
//                case "28137":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//            }
//        }
//        //*----ARABSAT----*//
//        else if (NAME_ID.equals("ARABSAT")) {
//            switch (satellite.getSatCat_No()) {
//                case "41029":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "37810":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "36745":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "36592":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "33154":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "29526":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "25638":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "24652":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "23948":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "15825":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "15560":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "15383":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "14234":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//
//
//            }
//        }
//        //*----ASIASAT----*//
//        else if (NAME_ID.equals("ASIASAT")) {
//            switch (satellite.getSatCat_No()) {
//                case "42942":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "40141":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "40107":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "37933":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "35696":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "27718":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "25657":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "20558":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//            }
//        }
//        //*----EUMETSAT----*//
//        else if (NAME_ID.equals("EUMETSAT")) {
//            switch (satellite.getSatCat_No()) {
//                case "40732":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "38771":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "38552":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "29499":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "28912":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "27509":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "24932":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "22912":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//            }
//        }
//        //*----ESA----*//
//        else if (NAME_ID.equals("ESA")) {
//            switch (satellite.getSatCat_No()) {
//                case "43437":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "43196":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "43058":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "43057":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "43056":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "43055":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "42969":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "42814":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "42063":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "41862":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "41861":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "41860":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "41859":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "41550":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "41549":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "41456":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "41388":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "41335":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "41175":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "41174":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "41043":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "40890":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "40889":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "40697":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "40545":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "40544":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "40129":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "40128":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "39634":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "39479":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "39453":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "39452":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "39451":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "39159":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "38858":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "38857":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "37847":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "37846":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "36508":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "36037":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "36036":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "34938":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "34937":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "32781":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "28922":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "28901":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "28894":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "28544":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "28169":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "27816":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "27540":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "27386":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "26958":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//                case "26863":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//            }
//        }
//        //*----EUTELSAT----*//
//        else if (NAME_ID.equals("EUTELSAT")) {
//            switch (satellite.getSatCat_No()) {
//                case "000":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//            }
//        }
//        //*----GLOBALSTAR----*//
//        else if (NAME_ID.equals("GLOBALSTAR")) {
//            switch (satellite.getSatCat_No()) {
//                case "000":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//            }
//        }
//        //*----INMARSAT----*//
//        else if (NAME_ID.equals("INMARSAT")) {
//            switch (satellite.getSatCat_No()) {
//                case "000":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//            }
//        }
//        //*----ITSO----*//
//        else if (NAME_ID.equals("ITSO")) {
//            switch (satellite.getSatCat_No()) {
//                case "000":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//            }
//        }
//        //*----O3B NETWORK----*//
//        else if (NAME_ID.equals("O3B NETWORK")) {
//            switch (satellite.getSatCat_No()) {
//                case "000":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//            }
//        }
//        //*----ORBCOMM----*//
//        else if (NAME_ID.equals("ORBCOMM")) {
//            switch (satellite.getSatCat_No()) {
//                case "000":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//            }
//        }
//        //*----RASCOOM----*//
//        else if (NAME_ID.equals("RASCOOM")) {
//            switch (satellite.getSatCat_No()) {
//                case "000":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//            }
//        }
//        //*----SEA LAUNCH----*//
//        else if (NAME_ID.equals("SEA LAUNCH")) {
//            switch (satellite.getSatCat_No()) {
//                case "000":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//            }
//        }
//
//        //*----SES----*//
//        else if (NAME_ID.equals("SES")) {
//            switch (satellite.getSatCat_No()) {
//                case "000":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//            }
//        }
//
//        //*----NEW ICO----*//
//        else if (NAME_ID.equals("NEW ICO")) {
//            switch (satellite.getSatCat_No()) {
//                case "000":
//                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                    startActivity(intent);
//                    break;
//            }
//        }
//
//
////        switch (satellite.getSatCat_No()) {
////            case "43039":
////                intent.putExtra("WEB_LINK", satellite.getSatCat_No());
////                startActivity(intent);
////                break;
////            case "41789":
////                intent.putExtra("WEB_LINK", satellite.getSatCat_No());
////                startActivity(intent);
////                break;
////            case "41786":
////                intent.putExtra("WEB_LINK", satellite.getSatCat_No());
////                startActivity(intent);
////                break;
////            case "41785":
////                intent.putExtra("WEB_LINK", satellite.getSatCat_No());
////                startActivity(intent);
////                break;
////            case "36798":
////                intent.putExtra("WEB_LINK", satellite.getSatCat_No());
////                startActivity(intent);
////                break;
////            case "27559":
////                intent.putExtra("WEB_LINK", satellite.getSatCat_No());
////                startActivity(intent);
////                break;
////            case "43204":
////                intent.putExtra("WEB_LINK", satellite.getSatCat_No());
////                startActivity(intent);
////                break;
////            case "43195":
////                intent.putExtra("WEB_LINK", satellite.getSatCat_No());
////                startActivity(intent);
////                break;
////            case "42760":
////                intent.putExtra("WEB_LINK", satellite.getSatCat_No());
////                startActivity(intent);
////                break;
////            case "41558":
////                intent.putExtra("WEB_LINK", satellite.getSatCat_No());
////                startActivity(intent);
////                break;
////            case "41557":
////                intent.putExtra("WEB_LINK", satellite.getSatCat_No());
////                startActivity(intent);
////                break;
////            case "40941":
////                intent.putExtra("WEB_LINK", satellite.getSatCat_No());
////                startActivity(intent);
////                break;
////            case "40272":
////                intent.putExtra("WEB_LINK", satellite.getSatCat_No());
////                startActivity(intent);
////                break;
////            case "40014":
////                intent.putExtra("WEB_LINK", satellite.getSatCat_No());
////                startActivity(intent);
////                break;
////            case "39440":
////                intent.putExtra("WEB_LINK", satellite.getSatCat_No());
////                startActivity(intent);
////                break;
////            case "39153":
////                intent.putExtra("WEB_LINK", satellite.getSatCat_No());
////                startActivity(intent);
////                break;
////            case "37673":
////                intent.putExtra("WEB_LINK", satellite.getSatCat_No());
////                startActivity(intent);
////                break;
////            case "29712":
////                intent.putExtra("WEB_LINK", satellite.getSatCat_No());
////                startActivity(intent);
////                break;
////            case "27612":
////                intent.putExtra("WEB_LINK", satellite.getSatCat_No());
////                startActivity(intent);
////                break;
////            case "27606":
////                intent.putExtra("WEB_LINK", satellite.getSatCat_No());
////                startActivity(intent);
////                break;
////            case "26620":
////                intent.putExtra("WEB_LINK", satellite.getSatCat_No());
////                startActivity(intent);
////                break;
////            case "24714":
////                intent.putExtra("WEB_LINK", satellite.getSatCat_No());
////                startActivity(intent);
////                break;
////            case "20442":
////                intent.putExtra("WEB_LINK", satellite.getSatCat_No());
////                startActivity(intent);
////                break;
////            case "15642":
////                intent.putExtra("WEB_LINK", satellite.getSatCat_No());
////                startActivity(intent);
////                break;
////            case "14133":
////                intent.putExtra("WEB_LINK", satellite.getSatCat_No());
////                startActivity(intent);
////                break;
////            case "42786":
////                intent.putExtra("WEB_LINK", satellite.getSatCat_No());
////                startActivity(intent);
////                break;
////            case "42785":
////                intent.putExtra("WEB_LINK", satellite.getSatCat_No());
////                startActivity(intent);
////                break;
////            case "42783":
////                intent.putExtra("WEB_LINK", satellite.getSatCat_No());
////                startActivity(intent);
////                break;
////            case "42731":
////                intent.putExtra("WEB_LINK", satellite.getSatCat_No());
////                startActivity(intent);
////                break;
////            case "42730":
////                intent.putExtra("WEB_LINK", satellite.getSatCat_No());
////                startActivity(intent);
////                break;
////            case "42721":
////                intent.putExtra("WEB_LINK", satellite.getSatCat_No());
////                startActivity(intent);
////                break;
////            case "41794":
////                intent.putExtra("WEB_LINK", satellite.getSatCat_No());
////                startActivity(intent);
////                break;
////            case "40940":
////                intent.putExtra("WEB_LINK", satellite.getSatCat_No());
////                startActivity(intent);
////                break;
////            case "40146":
////                intent.putExtra("WEB_LINK", satellite.getSatCat_No());
////                startActivity(intent);
////                break;
////            case "35756":
////                intent.putExtra("WEB_LINK", satellite.getSatCat_No());
////                startActivity(intent);
////                break;
////            case "32252":
////                intent.putExtra("WEB_LINK", satellite.getSatCat_No());
////                startActivity(intent);
////                break;
////            case "29495":
////                intent.putExtra("WEB_LINK", satellite.getSatCat_No());
////                startActivity(intent);
////                break;
////            case "27831":
////                intent.putExtra("WEB_LINK", satellite.getSatCat_No());
////                startActivity(intent);
////                break;
////            case "27598":
////                intent.putExtra("WEB_LINK", satellite.getSatCat_No());
////                startActivity(intent);
////                break;
////            case "25398":
////                intent.putExtra("WEB_LINK", satellite.getSatCat_No());
////                startActivity(intent);
////                break;
////            case "23227":
////                intent.putExtra("WEB_LINK", satellite.getSatCat_No());
////                startActivity(intent);
////                break;
////            case "22087":
////                intent.putExtra("WEB_LINK", satellite.getSatCat_No());
////                startActivity(intent);
////                break;
////            case "18350":
////                intent.putExtra("WEB_LINK", satellite.getSatCat_No());
////                startActivity(intent);
////                break;
////            case "16275":
////                intent.putExtra("WEB_LINK", satellite.getSatCat_No());
////                startActivity(intent);
////                break;
////            case "15993":
////                intent.putExtra("WEB_LINK", satellite.getSatCat_No());
////                startActivity(intent);
////                break;
////            case "4321":
////                intent.putExtra("WEB_LINK", satellite.getSatCat_No());
////                startActivity(intent);
////                break;
//
//        //  }
    }
}
