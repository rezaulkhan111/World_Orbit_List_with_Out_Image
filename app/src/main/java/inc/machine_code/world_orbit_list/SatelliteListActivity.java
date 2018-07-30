package inc.machine_code.world_orbit_list;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import inc.machine_code.world_orbit_list.Adapter.SatelliteAdapter;
import inc.machine_code.world_orbit_list.Country.Satellite;

public class SatelliteListActivity extends AppCompatActivity implements SatelliteAdapter.InterfaceCallback {
    List<Satellite> satellieList = new ArrayList<>();


    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_satellite_list);

        mRecyclerView = findViewById(R.id.rv_country_name_flag);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        Intent intent = getIntent();
        List<Satellite> satelli = (List<Satellite>) intent.getSerializableExtra("savedUser");
        satellieList = satelli;

        SatelliteAdapter adapter = new SatelliteAdapter(this, satellieList);
        mRecyclerView.setAdapter(adapter);
    }

    @Override
    public void inClickEvent(Satellite satellite) {
        Intent intent = new Intent(getApplicationContext(), SatelliteWebViewActivity.class);

        switch (satellite.getName()) {
            case "ALCOMSAT-1":
                intent.putExtra("WEB_LINK", "google");
                startActivity(intent);
                break;
            case "ALSAT 1N":
                intent.putExtra("WEB_LINK", "yahoo");
                startActivity(intent);
                break;

        }
    }
}
