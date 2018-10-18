package inc.machine_code.world_orbit_list.Adapter;

import android.annotation.SuppressLint;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import inc.machine_code.world_orbit_list.Country.Country;
import inc.machine_code.world_orbit_list.CountrySearching.CountryFilter;
import inc.machine_code.world_orbit_list.R;
import inc.machine_code.world_orbit_list.ViewHolder.CountryViewHolder;

public class CountryAdapter extends RecyclerView.Adapter<CountryAdapter.ViewHolder> implements Filterable {
    private final ICallback callback;

    public ArrayList<Country> countryList;
    private final ArrayList<Country> countryList_filter;

    private CountryFilter countryFilter;

    public CountryAdapter(ICallback callback, ArrayList<Country> countryList) {
        this.callback = callback;
        this.countryList = countryList;
        this.countryList_filter = countryList;
    }

    public interface ICallback {
        void inClickEvent(Country country);

    }

    @NonNull
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.country_item_fragment, parent, false));

    }

    public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView") final int position) {

        holder.onBind(position);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Country country = countryList.get(position);
                callback.inClickEvent(country);

            }
        });
    }

    public int getItemCount() {

        return countryList.size();
    }

    @Override
    public Filter getFilter() {
        if (countryFilter == null) {
            countryFilter = new CountryFilter(countryList_filter, this);
        }
        return countryFilter;
    }

    public class ViewHolder extends CountryViewHolder {

        final TextView tv_countryName;
        final TextView tv_countryCount;
        ImageView imageView;


        ViewHolder(View v) {
            super(v);
            tv_countryName = v.findViewById(R.id.tv_country_name);
            tv_countryCount = v.findViewById(R.id.tv_count_satellite_number);
            imageView = v.findViewById(R.id.iv_country_flag);
        }

        public void onBind(int position) {


            Country country = countryList.get(position);

            imageView.setImageResource(countryList.get(position).getImage());
            tv_countryName.setText(String.valueOf(country.getCountryName()));
            tv_countryCount.setText(String.valueOf(country.getSatelliteCount()));
        }

    }
}
