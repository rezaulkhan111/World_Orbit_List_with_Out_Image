package inc.machine_code.world_orbit_list.WebPage;



import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import inc.machine_code.world_orbit_list.R;

public class SatelliteWebViewActivity extends AppCompatActivity {

    WebView _Satellite_Show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_satellite_web_view);
        Bundle bundle = getIntent().getExtras();
        String a = String.valueOf(bundle.get("WEB_LINK"));

        _Satellite_Show = findViewById(R.id.wb_satellite_show);

        _Satellite_Show.loadUrl("http://www."+a+".com");
        _Satellite_Show.setWebViewClient(new WebViewClient());
    }
}
