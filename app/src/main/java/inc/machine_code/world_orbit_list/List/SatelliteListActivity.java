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
        if (satellite.getSatCat_No().equals(Sat_Code_No)) {
            intent.putExtra("WEB_LINK", Sat_Code_No);
            startActivity(intent);
        }
    }
}
