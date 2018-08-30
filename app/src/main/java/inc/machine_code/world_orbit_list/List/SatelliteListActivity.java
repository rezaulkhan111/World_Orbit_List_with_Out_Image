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
    public void inClickEvent(Satellite satellite) {
        Intent intent = new Intent(getApplicationContext(), SatelliteWebViewActivity.class);

        //*----ALGERIA----*//
        if (NAME_ID.equals("ALGERIA")) {
            switch (satellite.getSatCat_No()) {
                case "43039":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
                case "41789":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
                case "41786":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
                case "41785":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
                case "36798":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
                case "27559":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
            }
        }
        //*----ARGENTINA----*//
        if (NAME_ID.equals("ARGENTINA")) {
            switch (satellite.getSatCat_No()) {
                case "43204":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
                case "43195":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
                case "42760":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
                case "41558":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
                case "41557":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
                case "40941":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
                case "40272":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
                case "40014":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
                case "39440":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
                case "39153":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
                case "37673":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
                case "29712":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
                case "27612":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
                case "27606":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
                case "26620":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
                case "24714":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
                case "20442":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
                case "15642":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
                case "14133":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
            }
        }
        //*----AUSTRALIA----*//
        if (NAME_ID.equals("AUSTRALIA")) {
            switch (satellite.getSatCat_No()) {
                case "42786":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
                case "42785":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
                case "42783":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
                case "42731":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
                case "42730":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
                case "42721":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
                case "41794":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
                case "40940":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
                case "40146":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
                case "35756":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
                case "32252":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
                case "29495":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
                case "27831":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
                case "27598":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
                case "25398":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
                case "23227":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
                case "22087":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
                case "18350":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
                case "16275":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
                case "15993":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
                case "4321":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
            }
        }
        //*----AZERBAIJAN----*//
        else if (NAME_ID.equals("AZERBAIJAN")) {
            switch (satellite.getSatCat_No()) {
                case "39079":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
            }
        }
        //*----BANGLADESH----*//
        else if (NAME_ID.equals("BANGLADESH")) {
            switch (satellite.getSatCat_No()) {
                case "43463":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
            }
        }
        //*----BELARUS----*//
        else if (NAME_ID.equals("BELARUS")) {
            switch (satellite.getSatCat_No()) {
                case "41238":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
                case "38708":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
            }
        }
        //*----BOLIVIA----*//
        else if (NAME_ID.equals("BOLIVIA")) {
            switch (satellite.getSatCat_No()) {
                case "39481":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
            }
        }
        //*----BRAZIL----*//
        if (NAME_ID.equals("BRAZIL")) {
            switch (satellite.getSatCat_No()) {
                case "42692":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
                case "41904":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
                case "40733":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
                case "40024":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
                case "38991":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
                case "32768":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
                case "32293":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
                case "26469":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
                case "25941":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
                case "25504":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
                case "25152":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
                case "23536":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
                case "23199":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
                case "22490":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
                case "20440":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
                case "16650":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
                case "15561":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
            }
        }

        //*----BULGARIA----*//
        else if (NAME_ID.equals("BULGARIA")) {
            switch (satellite.getSatCat_No()) {
                case "42801":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
            }
        }
        //*----CANADA----*//
        if (NAME_ID.equals("CANADA")) {
            switch (satellite.getSatCat_No()) {
                case "43157":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
                case "42734":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
                case "41788":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
                case "41605":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
                case "41602":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
                case "41036":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
                case "40936":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
                case "40056":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
                case "40055":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
                case "40020":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
                case "39265":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
                case "39127":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
                case "39089":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
                case "39088":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
                case "38709":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
                case "38342":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
                case "37602":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
                case "35873":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
                case "34111":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
                case "33453":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
                case "33373":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
                case "32790":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
                case "32784":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
                case "32382":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
                case "31102":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
                case "28868":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
                case "28378":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
                case "27858":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
                case "27847":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
                case "27843":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
                case "27632":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
                case "26624":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
                case "25740":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
                case "23846":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
                case "23710":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
                case "21726":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
                case "21222":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
                case "13652":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
                case "13431":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
                case "11153":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
                case "8585":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
                case "7790":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
                case "6437":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
                case "6278":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
                case "5104":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
                case "3669":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
                case "1804":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
                case "424":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
            }
        }

        //*----CHILE----*//
        else if (NAME_ID.equals("CHILE")) {
            switch (satellite.getSatCat_No()) {
                case "42788":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
                case "38011":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
                case "25395":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
            }
        }

        //*----CHINA----*//
        else if (NAME_ID.equals("CHINA")) {
            switch (satellite.getSatCat_No()) {
                case "000":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
            }
        }

        //*----CZECH----*//
        else if (NAME_ID.equals("CZECH")) {
            switch (satellite.getSatCat_No()) {
                case "000":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
            }
        }

        //*----FORMER CZECHOSLOVAKIA----*//
        else if (NAME_ID.equals("FORMER CZECHOSLOVAKIA")) {
            switch (satellite.getSatCat_No()) {
                case "000":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
            }
        }
        //*----DENMARK----*//
        if (NAME_ID.equals("DENMARK")) {
            switch (satellite.getSatCat_No()) {
                case "43039":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
            }
        }
        //*----ECUADOR----*//
        else if (NAME_ID.equals("ECUADOR")) {
            switch (satellite.getSatCat_No()) {
                case "000":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
            }
        }

        //*----EGYPT----*//
        else if (NAME_ID.equals("EGYPT")) {
            switch (satellite.getSatCat_No()) {
                case "000":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
            }
        }

        //*----ESTONIA----*//
        else if (NAME_ID.equals("ESTONIA")) {
            switch (satellite.getSatCat_No()) {
                case "000":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
            }
        }
        //*----FRANCE----*//
        if (NAME_ID.equals("FRANCE")) {
            switch (satellite.getSatCat_No()) {
                case "43039":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
            }
        }
        //*----GERMANY----*//
        if (NAME_ID.equals("GERMANY")) {
            switch (satellite.getSatCat_No()) {
                case "43039":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
            }
        }
        //*----GREECE----*//
        else if (NAME_ID.equals("GREECE")) {
            switch (satellite.getSatCat_No()) {
                case "000":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
            }
        }
        //*----INDIA----*//
        if (NAME_ID.equals("INDIA")) {
            switch (satellite.getSatCat_No()) {
                case "43039":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
            }
        }
        //*----INDONESIA----*//
        else if (NAME_ID.equals("INDONESIA")) {
            switch (satellite.getSatCat_No()) {
                case "37673":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
            }
        }
        //*----IRAN----*//
        else if (NAME_ID.equals("IRAN")) {
            switch (satellite.getSatCat_No()) {
                case "000":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
            }
        }
        //*----IRAQ----*//
        else if (NAME_ID.equals("IRAQ")) {
            switch (satellite.getSatCat_No()) {
                case "000":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
            }
        }
        //*----ISRAEL----*//
        else if (NAME_ID.equals("ISRAEL")) {
            switch (satellite.getSatCat_No()) {
                case "37673":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
            }
        }
        //*----ITALY----*//
        else if (NAME_ID.equals("ITALY")) {
            switch (satellite.getSatCat_No()) {
                case "37673":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
            }
        }
        //*----JAPAN----*//
        else if (NAME_ID.equals("JAPAN")) {
            switch (satellite.getSatCat_No()) {
                case "37673":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
            }
        }
        //*----KAZAKHSTAN----*//
        else if (NAME_ID.equals("KAZAKHSTAN")) {
            switch (satellite.getSatCat_No()) {
                case "000":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
            }
        }

        //*----LAOS----*//
        else if (NAME_ID.equals("LAOS")) {
            switch (satellite.getSatCat_No()) {
                case "000":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
            }
        }
        //*----LATVIA----*//
        else if (NAME_ID.equals("LATVIA")) {
            switch (satellite.getSatCat_No()) {
                case "000":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
            }
        }
        //*----LITHUANIA----*//
        else if (NAME_ID.equals("LITHUANIA")) {
            switch (satellite.getSatCat_No()) {
                case "000":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
            }
        }
        //*----LUXEMBOURG----*//
        else if (NAME_ID.equals("LUXEMBOURG")) {
            switch (satellite.getSatCat_No()) {
                case "000":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
            }
        }
        //*----MALAYSIA----*//
        else if (NAME_ID.equals("MALAYSIA")) {
            switch (satellite.getSatCat_No()) {
                case "37673":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
            }
        }
        //*----MEXICO----*//
        else if (NAME_ID.equals("MEXICO")) {
            switch (satellite.getSatCat_No()) {
                case "37673":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
            }
        }
        //*----MOROCCO----*//
        else if (NAME_ID.equals("MOROCCO")) {
            switch (satellite.getSatCat_No()) {
                case "000":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
            }
        }
        //*----NETHERLANDS----*//
        else if (NAME_ID.equals("NETHERLANDS")) {
            switch (satellite.getSatCat_No()) {
                case "000":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
            }
        }
        //*----NIGERIA----*//
        else if (NAME_ID.equals("NIGERIA")) {
            switch (satellite.getSatCat_No()) {
                case "000":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
            }
        }
        //*----NORTH KOREA----*//
        else if (NAME_ID.equals("NORTH KOREA")) {
            switch (satellite.getSatCat_No()) {
                case "000":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
            }
        }
        //*----NORWAY----*//
        else if (NAME_ID.equals("NORWAY")) {
            switch (satellite.getSatCat_No()) {
                case "000":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
            }
        }
        //*----PAKISTAN----*//
        else if (NAME_ID.equals("PAKISTAN")) {
            switch (satellite.getSatCat_No()) {
                case "000":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
            }
        }
        //*----PERU----*//
        else if (NAME_ID.equals("PERU")) {
            switch (satellite.getSatCat_No()) {
                case "000":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
            }
        }
        //*----PHILIPPINES----*//
        else if (NAME_ID.equals("PHILIPPINES")) {
            switch (satellite.getSatCat_No()) {
                case "000":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
            }
        }
        //*----POLAND----*//
        else if (NAME_ID.equals("POLAND")) {
            switch (satellite.getSatCat_No()) {
                case "000":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
            }
        }
        //*----PORTUGAL----*//
        else if (NAME_ID.equals("PORTUGAL")) {
            switch (satellite.getSatCat_No()) {
                case "000":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
            }
        }
        //*----RUSSIA----*//
        else if (NAME_ID.equals("RUSSIA")) {
            switch (satellite.getSatCat_No()) {
                case "37673":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
            }
        }
        //*----SAUDI ARABIA----*//
        else if (NAME_ID.equals("SAUDI ARABIA")) {
            switch (satellite.getSatCat_No()) {
                case "37673":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
            }
        }
        //*----SINGAPORE----*//
        else if (NAME_ID.equals("SINGAPORE")) {
            switch (satellite.getSatCat_No()) {
                case "000":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
            }
        }
        //*----SLOVAKIA----*//
        else if (NAME_ID.equals("SLOVAKIA")) {
            switch (satellite.getSatCat_No()) {
                case "000":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
            }
        }
        //*----SOUTH AFRICA----*//
        else if (NAME_ID.equals("SOUTH AFRICA")) {
            switch (satellite.getSatCat_No()) {
                case "000":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
            }
        }
        //*----SOUTH KOREA----*//
        else if (NAME_ID.equals("SOUTH KOREA")) {
            switch (satellite.getSatCat_No()) {
                case "37673":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
            }
        }
        //*----SPAIN----*//
        else if (NAME_ID.equals("SPAIN")) {
            switch (satellite.getSatCat_No()) {
                case "37673":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
            }
        }
        //*----SWEDEN----*//
        else if (NAME_ID.equals("SWEDEN")) {
            switch (satellite.getSatCat_No()) {
                case "37673":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
            }
        }
        //*----TAIWAN----*//
        else if (NAME_ID.equals("TAIWAN")) {
            switch (satellite.getSatCat_No()) {
                case "37673":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
            }
        }
        //*----THAILAND----*//
        else if (NAME_ID.equals("THAILAND")) {
            switch (satellite.getSatCat_No()) {
                case "37673":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
            }
        }
        //*----TURKEY----*//
        else if (NAME_ID.equals("TURKEY")) {
            switch (satellite.getSatCat_No()) {
                case "37673":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
            }
        }
        //*----UNITED ARAB EMIRATES----*//
        else if (NAME_ID.equals("UNITED ARAB EMIRATES")) {
            switch (satellite.getSatCat_No()) {
                case "37673":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
            }
        }
        //*----UNITED KINGDOM----*//
        else if (NAME_ID.equals("UNITED KINGDOM")) {
            switch (satellite.getSatCat_No()) {
                case "37673":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
            }
        }
        //*----USA----*//
        else if (NAME_ID.equals("USA")) {
            switch (satellite.getSatCat_No()) {
                case "37673":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
            }
        }
        //*----URUGUAY----*//
        else if (NAME_ID.equals("URUGUAY")) {
            switch (satellite.getSatCat_No()) {
                case "37673":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
            }
        }
        //*----VENEZUELA----*//
        else if (NAME_ID.equals("VENEZUELA")) {
            switch (satellite.getSatCat_No()) {
                case "37673":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
            }
        }
        //*----VIETNAM----*//
        else if (NAME_ID.equals("VIETNAM")) {
            switch (satellite.getSatCat_No()) {
                case "37673":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
            }
        }
        //*----NATO----*//
        else if (NAME_ID.equals("NATO")) {
            switch (satellite.getSatCat_No()) {
                case "000":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
            }
        }
        //*----CHINA/BRAZIL----*//
        else if (NAME_ID.equals("CHINA/BRAZIL")) {
            switch (satellite.getSatCat_No()) {
                case "000":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
            }
        }

        //*----FRANCE/GERMANY----*//
        else if (NAME_ID.equals("FRANCE/GERMANY")) {
            switch (satellite.getSatCat_No()) {
                case "000":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
            }
        }

        //*----FRANCE/ITALY----*//
        else if (NAME_ID.equals("FRANCE/ITALY")) {
            switch (satellite.getSatCat_No()) {
                case "000":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
            }
        }
        //*----SINGAPORE/TAIWAN----*//
        else if (NAME_ID.equals("SINGAPORE/TAIWAN")) {
            switch (satellite.getSatCat_No()) {
                case "000":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
            }
        }
        //*----TURKMENISTAN/MONACO----*//
        else if (NAME_ID.equals("TURKMENISTAN/MONACO")) {
            switch (satellite.getSatCat_No()) {
                case "000":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
            }
        }
        //*----UNITED STATES/BRAZIL----*//
        else if (NAME_ID.equals("UNITED STATES/BRAZIL")) {
            switch (satellite.getSatCat_No()) {
                case "000":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
            }
        }
        //*----ARABSAT----*//
        else if (NAME_ID.equals("ARABSAT")) {
            switch (satellite.getSatCat_No()) {
                case "000":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
            }
        }
        //*----ASIASAT----*//
        else if (NAME_ID.equals("ASIASAT")) {
            switch (satellite.getSatCat_No()) {
                case "000":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
            }
        }
        //*----EUMETSAT----*//
        else if (NAME_ID.equals("EUMETSAT")) {
            switch (satellite.getSatCat_No()) {
                case "000":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
            }
        }
        //*----ESA----*//
        else if (NAME_ID.equals("ESA")) {
            switch (satellite.getSatCat_No()) {
                case "000":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
            }
        }
        //*----EUTELSAT----*//
        else if (NAME_ID.equals("EUTELSAT")) {
            switch (satellite.getSatCat_No()) {
                case "000":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
            }
        }
        //*----GLOBALSTAR----*//
        else if (NAME_ID.equals("GLOBALSTAR")) {
            switch (satellite.getSatCat_No()) {
                case "000":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
            }
        }
        //*----INMARSAT----*//
        else if (NAME_ID.equals("INMARSAT")) {
            switch (satellite.getSatCat_No()) {
                case "000":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
            }
        }
        //*----ITSO----*//
        else if (NAME_ID.equals("ITSO")) {
            switch (satellite.getSatCat_No()) {
                case "000":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
            }
        }
        //*----O3B NETWORK----*//
        else if (NAME_ID.equals("O3B NETWORK")) {
            switch (satellite.getSatCat_No()) {
                case "000":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
            }
        }
        //*----ORBCOMM----*//
        else if (NAME_ID.equals("ORBCOMM")) {
            switch (satellite.getSatCat_No()) {
                case "000":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
            }
        }
        //*----RASCOOM----*//
        else if (NAME_ID.equals("RASCOOM")) {
            switch (satellite.getSatCat_No()) {
                case "000":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
            }
        }
        //*----SEA LAUNCH----*//
        else if (NAME_ID.equals("SEA LAUNCH")) {
            switch (satellite.getSatCat_No()) {
                case "000":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
            }
        }

        //*----SES----*//
        else if (NAME_ID.equals("SES")) {
            switch (satellite.getSatCat_No()) {
                case "000":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
            }
        }

        //*----NEW ICO----*//
        else if (NAME_ID.equals("NEW ICO")) {
            switch (satellite.getSatCat_No()) {
                case "000":
                    intent.putExtra("WEB_LINK", satellite.getSatCat_No());
                    startActivity(intent);
                    break;
            }
        }


//        switch (satellite.getSatCat_No()) {
//            case "43039":
//                intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                startActivity(intent);
//                break;
//            case "41789":
//                intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                startActivity(intent);
//                break;
//            case "41786":
//                intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                startActivity(intent);
//                break;
//            case "41785":
//                intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                startActivity(intent);
//                break;
//            case "36798":
//                intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                startActivity(intent);
//                break;
//            case "27559":
//                intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                startActivity(intent);
//                break;
//            case "43204":
//                intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                startActivity(intent);
//                break;
//            case "43195":
//                intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                startActivity(intent);
//                break;
//            case "42760":
//                intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                startActivity(intent);
//                break;
//            case "41558":
//                intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                startActivity(intent);
//                break;
//            case "41557":
//                intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                startActivity(intent);
//                break;
//            case "40941":
//                intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                startActivity(intent);
//                break;
//            case "40272":
//                intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                startActivity(intent);
//                break;
//            case "40014":
//                intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                startActivity(intent);
//                break;
//            case "39440":
//                intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                startActivity(intent);
//                break;
//            case "39153":
//                intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                startActivity(intent);
//                break;
//            case "37673":
//                intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                startActivity(intent);
//                break;
//            case "29712":
//                intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                startActivity(intent);
//                break;
//            case "27612":
//                intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                startActivity(intent);
//                break;
//            case "27606":
//                intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                startActivity(intent);
//                break;
//            case "26620":
//                intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                startActivity(intent);
//                break;
//            case "24714":
//                intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                startActivity(intent);
//                break;
//            case "20442":
//                intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                startActivity(intent);
//                break;
//            case "15642":
//                intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                startActivity(intent);
//                break;
//            case "14133":
//                intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                startActivity(intent);
//                break;
//            case "42786":
//                intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                startActivity(intent);
//                break;
//            case "42785":
//                intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                startActivity(intent);
//                break;
//            case "42783":
//                intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                startActivity(intent);
//                break;
//            case "42731":
//                intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                startActivity(intent);
//                break;
//            case "42730":
//                intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                startActivity(intent);
//                break;
//            case "42721":
//                intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                startActivity(intent);
//                break;
//            case "41794":
//                intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                startActivity(intent);
//                break;
//            case "40940":
//                intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                startActivity(intent);
//                break;
//            case "40146":
//                intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                startActivity(intent);
//                break;
//            case "35756":
//                intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                startActivity(intent);
//                break;
//            case "32252":
//                intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                startActivity(intent);
//                break;
//            case "29495":
//                intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                startActivity(intent);
//                break;
//            case "27831":
//                intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                startActivity(intent);
//                break;
//            case "27598":
//                intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                startActivity(intent);
//                break;
//            case "25398":
//                intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                startActivity(intent);
//                break;
//            case "23227":
//                intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                startActivity(intent);
//                break;
//            case "22087":
//                intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                startActivity(intent);
//                break;
//            case "18350":
//                intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                startActivity(intent);
//                break;
//            case "16275":
//                intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                startActivity(intent);
//                break;
//            case "15993":
//                intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                startActivity(intent);
//                break;
//            case "4321":
//                intent.putExtra("WEB_LINK", satellite.getSatCat_No());
//                startActivity(intent);
//                break;

        //  }
    }
}
