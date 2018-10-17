package inc.machine_code.world_orbit_list.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;

public abstract class CountryViewHolder extends RecyclerView.ViewHolder {
    private int mCurrentPosition;

    protected CountryViewHolder(View itemView) {
        super(itemView);
    }

    public void onBind(int position) {
        mCurrentPosition = position;
    }

    public int getCurrentPosition() {
        return mCurrentPosition;
    }
}
