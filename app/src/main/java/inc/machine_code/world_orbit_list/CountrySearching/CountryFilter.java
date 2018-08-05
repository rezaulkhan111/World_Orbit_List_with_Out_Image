package inc.machine_code.world_orbit_list.CountrySearching;

import android.widget.Filter;

import java.util.ArrayList;

import inc.machine_code.world_orbit_list.Adapter.CountryAdapter;
import inc.machine_code.world_orbit_list.Country.Country;

public class CountryFilter extends Filter {
    ArrayList<Country> country_Array_List_Filter;
    CountryAdapter adapter;

    public CountryFilter(ArrayList<Country> country_Array_List_Filter, CountryAdapter adapter) {
        this.country_Array_List_Filter = country_Array_List_Filter;
        this.adapter = adapter;
    }

    @Override
    protected FilterResults performFiltering(CharSequence constraint) {
        FilterResults results = new FilterResults();

        if (constraint != null && constraint.length() > 0) {
            //CHANGE TO UPPER
            constraint = constraint.toString().toUpperCase();
            //STORE OUR FILTERED PLAYERS
            ArrayList<Country> filteredPlayers = new ArrayList<>();

            for (int i = 0; i < country_Array_List_Filter.size(); i++) {
                //CHECK
                if (country_Array_List_Filter.get(i).getCountryName().toUpperCase().contains(constraint)) {
                    //ADD PLAYER TO FILTERED PLAYERS
                    filteredPlayers.add(country_Array_List_Filter.get(i));
                }
                if (country_Array_List_Filter.get(i).getSatelliteCount().toUpperCase().contains(constraint)) {
                    filteredPlayers.add(country_Array_List_Filter.get(i));
                }
            }

            results.count = filteredPlayers.size();
            results.values = filteredPlayers;
        } else {
            results.count = country_Array_List_Filter.size();
            results.values = country_Array_List_Filter;

        }

        return results;
    }

    @Override
    protected void publishResults(CharSequence constraint, FilterResults results) {
        adapter.countryList = (ArrayList<Country>) results.values;
        adapter.notifyDataSetChanged();
    }
}
