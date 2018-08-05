package inc.machine_code.world_orbit_list.Adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import inc.machine_code.world_orbit_list.Country.Country;
import inc.machine_code.world_orbit_list.CountrySearching.CountryFilter;
import inc.machine_code.world_orbit_list.R;

public class CountryAdapter extends RecyclerView.Adapter<CountryAdapter.ViewHolder> implements Filterable {
    private ICallback callback;

    public ArrayList<Country> countryList, countryList_filter;

    CountryFilter countryFilter;

    public CountryAdapter(ICallback callback, ArrayList<Country> countryList) {
        this.callback = callback;
        this.countryList = countryList;
        this.countryList_filter = countryList;
    }


    public interface ICallback {
        void inClickEvent(Country country);

    }

    public class EmptyHolder extends CountryViewHolder {

        public EmptyHolder(View view) {
            super(view);
        }
    }


    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.country_item_fragment, parent, false));

    }


    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {

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


    class CountryViewHolder extends RecyclerView.ViewHolder {
        ImageView p_country_flag;
        TextView p_country_name,
                p_satellite_count;


        public CountryViewHolder(View view) {
            super(view);

            p_country_flag = view.findViewById(R.id.iv_country_flag);
            p_country_name = view.findViewById(R.id.tv_country_name);
            p_satellite_count = view.findViewById(R.id.tv_count_satellite_number);
        }
    }

    public class ViewHolder extends CountryViewHolder {

        TextView tv_countryName,
                tv_countryCount;
        ImageView imageView;
        LinearLayout linearLayout;


        public ViewHolder(View v) {
            super(v);
            tv_countryName = v.findViewById(R.id.tv_country_name);
            tv_countryCount = v.findViewById(R.id.tv_count_satellite_number);
            imageView = v.findViewById(R.id.iv_country_flag);
            //linearLayout.findViewById(R.id.linearLayout);
        }

        public void onBind(int position) {


            Country country = countryList.get(position);

            imageView.setImageResource(countryList.get(position).getImage());
            tv_countryName.setText(String.valueOf(country.getCountryName()));
            tv_countryCount.setText(String.valueOf(country.getSatelliteCount()));
        }

    }
}
