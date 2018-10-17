package inc.machine_code.world_orbit_list.SatelliteSearching;

import android.widget.Filter;

import java.util.ArrayList;

import inc.machine_code.world_orbit_list.Adapter.SatelliteAdapter;
import inc.machine_code.world_orbit_list.Country.Satellite;

public class SatelliteFilter extends Filter {
    private final ArrayList<Satellite> satelliteArrayList;
    SatelliteAdapter adapter;

    public SatelliteFilter(ArrayList<Satellite> satelliteArrayList, SatelliteAdapter adapter) {
        this.satelliteArrayList = satelliteArrayList;
        this.adapter = adapter;
    }

    @Override
    protected FilterResults performFiltering(CharSequence constraint) {
        FilterResults results = new FilterResults();

        if (constraint != null && constraint.length() > 0) {
            //CHANGE TO UPPER
            constraint = constraint.toString().toUpperCase();
            //STORE OUR FILTERED PLAYERS
            ArrayList<Satellite> filteredPlayers = new ArrayList<>();

            for (int i = 0; i < satelliteArrayList.size(); i++) {
                //CHECK
                if (satelliteArrayList.get(i).getName().toUpperCase().contains(constraint)) {
                    //ADD PLAYER TO FILTERED PLAYERS
                    filteredPlayers.add(satelliteArrayList.get(i));
                }
                if (satelliteArrayList.get(i).getSatellite_Type().toUpperCase().contains(constraint)) {
                    filteredPlayers.add(satelliteArrayList.get(i));
                }
                if (satelliteArrayList.get(i).getDate().toUpperCase().contains(constraint)) {
                    filteredPlayers.add(satelliteArrayList.get(i));
                }
                if (satelliteArrayList.get(i).getSatCat_No().toUpperCase().contains(constraint)) {
                    filteredPlayers.add(satelliteArrayList.get(i));
                }
            }
            results.count = filteredPlayers.size();
            results.values = filteredPlayers;
        } else {
            results.count = satelliteArrayList.size();
            results.values = satelliteArrayList;
        }
        return results;
    }

    @Override
    protected void publishResults(CharSequence constraint, FilterResults results) {
        adapter.SatelliteList = (ArrayList<Satellite>) results.values;
        adapter.notifyDataSetChanged();
    }
}
