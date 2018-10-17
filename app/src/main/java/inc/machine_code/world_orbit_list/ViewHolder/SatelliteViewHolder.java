package inc.machine_code.world_orbit_list.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;

public abstract class SatelliteViewHolder extends RecyclerView.ViewHolder {
    protected SatelliteViewHolder(View itemView) {
        super(itemView);
    }
    public void onBind(int position){}
}
