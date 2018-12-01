package inc.machine_code.world_orbit_list.List;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.MenuItemCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

import inc.machine_code.world_orbit_list.Adapter.SatelliteAdapter;
import inc.machine_code.world_orbit_list.Country.Satellite;
import inc.machine_code.world_orbit_list.R;
import inc.machine_code.world_orbit_list.WebPage.SatelliteWebViewActivity;

public class SatelliteListActivity extends AppCompatActivity implements Serializable {

    // private SatelliteAdapter adapter;
    DrawerLayout mDrawerLayout;
    private Toolbar toolbar;
    private NavigationView navigationView;
    ArrayList<String> list = new ArrayList<>();
    ArrayList<Satellite> Serializable_To_ArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_satellite_list);

        initViews();
        setToolbar();
        setNavItemSelectedListener();
        setDrawerLayoutListener();
//        RecyclerView mRecyclerView = findViewById(R.id.rv_country_name_flag);
//        mRecyclerView.setHasFixedSize(true);
//        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        Intent intent = getIntent();
//
        Serializable_To_ArrayList = (ArrayList<Satellite>) intent.getSerializableExtra("savedUser");
//
//        adapter = new SatelliteAdapter(this, Serializable_To_ArrayList);
//        mRecyclerView.setAdapter(adapter);
    }

    private void initViews() {
        mDrawerLayout = findViewById(R.id.drawer_layout_id);
        toolbar = findViewById(R.id.toolbar);
        navigationView = findViewById(R.id.navigation_view_id);
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//
//        MenuInflater inflater = getMenuInflater();
//        inflater.inflate(R.menu.searching_menu_bar, menu);
//        Search(menu);
//        return true;
//    }

//    private void Search(Menu menu) {
//        MenuItem searchViewMenuItem = menu.findItem(R.id.menu_search_bar_satellite);
//        //SearchManager searchManager = (SearchManager) getSystemService(Context.SEARCH_SERVICE);
//        SearchView _search_view;
//        _search_view = (SearchView) MenuItemCompat.getActionView(searchViewMenuItem);
//        int searchImgId = android.support.v7.appcompat.R.id.search_button;
//        ImageView _image_view = _search_view.findViewById(searchImgId);
//        _image_view.setImageResource(R.drawable.ic_search_item_icon);
//        _search_view.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
//            @Override
//            public boolean onQueryTextSubmit(String query) {
//                return false;
//            }
//
//            @Override
//            public boolean onQueryTextChange(String get_customer_text) {
//                adapter.getFilter().filter(get_customer_text);
//                return false;
//            }
//        });
//    }

//    @Override
//    public void inClickEvent(Satellite satellite, String Sat_Code_No) {
//        ConnectivityManager conMgr = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
//        // ARE WE CONNECTED TO THE NET
//        try {
//            if (isConnection_stable()) {
//                if (conMgr.getActiveNetworkInfo() != null && conMgr.getActiveNetworkInfo().isAvailable() && conMgr.getActiveNetworkInfo().isConnected()) {
//                    Intent intent = new Intent(getApplicationContext(), SatelliteWebViewActivity.class);
//                    if (satellite.getSatCat_No().equals(Sat_Code_No)) {
//                        intent.putExtra("WEB_LINK", Sat_Code_No);
//                        startActivity(intent);
//                    }
//                }
//            } else {
//                Toast.makeText(this, "Connection Not Stable...\n Connect To Internet...", Toast.LENGTH_SHORT).show();
//            }
//        } catch (InterruptedException ignored) {
//        } catch (IOException ignored) {
//        }
//    }

//    public boolean isConnection_stable() throws InterruptedException, IOException {
//        final String command = "ping -c 1 google.com";
//        return Runtime.getRuntime().exec(command).waitFor() == 0;
//    }

    public void setToolbar() {
        setSupportActionBar(toolbar);
        ActionBar actionbar = getSupportActionBar();
        assert actionbar != null;
        actionbar.setDisplayHomeAsUpEnabled(true);
        actionbar.setHomeAsUpIndicator(R.drawable.ic_about_item_icon);
    }

    public void setDrawerLayoutListener() {
        mDrawerLayout.addDrawerListener(
                new DrawerLayout.DrawerListener() {
                    @Override
                    public void onDrawerSlide(@NonNull View drawerView, float slideOffset) {
                        // Respond when the drawer's position changes
//                        Toast.makeText(MainActivity.this, "Slide", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onDrawerOpened(@NonNull View drawerView) {

                        // Respond when the drawer is opened
                        Toast.makeText(SatelliteListActivity.this, "OPEN", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onDrawerClosed(@NonNull View drawerView) {
                        // Respond when the drawer is closed
                        Toast.makeText(SatelliteListActivity.this, "CLOSE", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onDrawerStateChanged(int newState) {
                        // Respond when the drawer motion state changes
//                        Toast.makeText(MainActivity.this, "StateChange", Toast.LENGTH_SHORT).show();
                    }
                }
        );
    }

    public void setNavItemSelectedListener() {
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                menuItem.setChecked(true);
                mDrawerLayout.closeDrawers();

                //   android.support.v4.app.Fragment selectedFragment = null;
                switch (menuItem.getItemId()) {

                    case R.id.item_camera:

                        list.add("ggggggggggg");
                        list.add("ggggggggggg");
                        list.add("ggggggggggg");
                        list.add("ggggggggggg");
                        list.add("ggggggggggg");
                        list.add("ggggggggggg");
                        Bundle bundle=new Bundle();
                      //  bundle=(ArrayList<Satellite>) Serializable_To_ArrayList;
                        // selectedFragment = new InterGalactic();
                        //   replaceFragment(new InterGalactic(list));
                        // android.support.v4.app.FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                        //  assert selectedFragment != null;
                        // transaction.replace(R.id.frame, selectedFragment);
                        //  transaction.commit();
                      //  replaceFragment(new SatelliteListFragmment(list));
                        Log.e("aaa", "onNavigationItemSelected: " + "item_camera");
                        break;
                    case R.id.item_gallery:
                        Log.e("111", "onNavigationItemSelected: ");
                        break;
                }
                return true;
            }
        });
    }

    private void replaceFragment(android.support.v4.app.Fragment fragment) {
        getFragmentManager().popBackStack();
        android.support.v4.app.FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame, fragment, "HomeDairy");
        transaction.addToBackStack(null);
        transaction.commit();
        Toast.makeText(this, "" + fragment.getClass(), Toast.LENGTH_SHORT).show();

    }

}
