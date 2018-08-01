package inc.machine_code.world_orbit_list.List;

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
import inc.machine_code.world_orbit_list.R;
import inc.machine_code.world_orbit_list.WebPage.SatelliteWebViewActivity;

public class SatelliteListActivity extends AppCompatActivity implements SatelliteAdapter.InterfaceCallback {


    List<Satellite> _sat_lite_List_Array = new ArrayList<>();
    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_satellite_list);

        mRecyclerView = findViewById(R.id.rv_country_name_flag);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        Intent intent = getIntent();

        List<Satellite> _sat_lite_List_Seri_able = (List<Satellite>) intent.getSerializableExtra("savedUser");

        _sat_lite_List_Array = _sat_lite_List_Seri_able;


        SatelliteAdapter adapter = new SatelliteAdapter(this, _sat_lite_List_Array);
        mRecyclerView.setAdapter(adapter);
    }

    @Override
    public void inClickEvent(Satellite satellite) {
        Intent intent = new Intent(getApplicationContext(), SatelliteWebViewActivity.class);

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
}
