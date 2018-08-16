package inc.machine_code.world_orbit_list.Adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import inc.machine_code.world_orbit_list.Country.Satellite;
import inc.machine_code.world_orbit_list.R;
import inc.machine_code.world_orbit_list.SatelliteSearching.SatelliteFilter;

public class SatelliteAdapter extends RecyclerView.Adapter<SatelliteAdapter.ViewHolder> implements Filterable {

    private InterfaceCallback callback;
    SatelliteFilter satelliteFilter;
    public ArrayList<Satellite> SatelliteList,satellitefilterList;

    Satellite satelliteObj;

    public SatelliteAdapter(InterfaceCallback callback, ArrayList<Satellite> satelliteList) {
        this.callback = callback;
        this.SatelliteList = satelliteList;
        this.satellitefilterList = satelliteList;

    }

    public interface InterfaceCallback {
        void inClickEvent(Satellite satellite);

    }

    public class EmptyHolder extends SatelliteViewHolder {

        public EmptyHolder(View view) {
            super(view);
        }
    }

    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.satellite_photo_fragment, parent, false));

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        try {
            holder.onBind(position);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                satelliteObj = new Satellite();
                Satellite satellite = SatelliteList.get(position);
                callback.inClickEvent(satellite);
            }
        });
    }

    @Override
    public int getItemCount() {

        return SatelliteList.size();
    }

    @Override
    public Filter getFilter() {
        if (satelliteFilter == null) {
            satelliteFilter = new SatelliteFilter(satellitefilterList, this);
        }
        return satelliteFilter;
    }

    class SatelliteViewHolder extends RecyclerView.ViewHolder {
        ImageView p_satellite_photo;
        TextView p_satellite_name,
                p_launch_date,
                p_satellite_type;


        public SatelliteViewHolder(View view) {
            super(view);

            p_satellite_photo = view.findViewById(R.id.iv_satellite_photo);
            p_satellite_name = view.findViewById(R.id.tv_satellite_name);
            p_launch_date = view.findViewById(R.id.tv_launch_date);
            p_satellite_type = view.findViewById(R.id.tv_satellite_type);
        }
    }

    public class ViewHolder extends SatelliteViewHolder {
        ImageView satellite_photo;

        TextView satellite_name,
                launch_date,
                satellite_type;

        public ViewHolder(View v) {
            super(v);
            satellite_photo = v.findViewById(R.id.iv_satellite_photo);
            satellite_name = v.findViewById(R.id.tv_satellite_name);
            launch_date = v.findViewById(R.id.tv_launch_date);
            satellite_type = v.findViewById(R.id.tv_satellite_type);

        }

        public void onBind(int position) {

            try {
                Satellite satellite = SatelliteList.get(position);
                satellite_photo.setImageResource(SatelliteList.get(position).getImage());
                satellite_name.setText(String.valueOf(satellite.getName()));
                launch_date.setText(String.valueOf(satellite.getDate()));
                satellite_type.setText(String.valueOf(satellite.getSatellite_Type()));

            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }
}
