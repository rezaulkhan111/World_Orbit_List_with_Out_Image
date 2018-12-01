package inc.machine_code.world_orbit_list.List;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.io.Serializable;
import java.util.ArrayList;

import inc.machine_code.world_orbit_list.Adapter.SatelliteAdapter;
import inc.machine_code.world_orbit_list.Country.Satellite;
import inc.machine_code.world_orbit_list.R;

@SuppressLint("ValidFragment")
public class SatelliteListFragmment extends Fragment implements SatelliteAdapter.InterfaceCallback, Serializable {
    private RecyclerView recyclerView;
    private ArrayList<Satellite> satelliteList;
    //   SatelliteAdapter adapter;
    Context context;

    public SatelliteListFragmment(ArrayList<Satellite> satelliteList) {
        this.satelliteList = satelliteList;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.satellite_fragment, container, false);
        recyclerView = rootView.findViewById(R.id.recycler_view_id);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        //   adapter=new SatelliteAdapter(this,satelliteList);
        recyclerView.setAdapter(new SatelliteAdapter(this, satelliteList));
        return rootView;
    }

    @Override
    public void inClickEvent(Satellite satellite, String Sat_Code_No) {

    }
}
