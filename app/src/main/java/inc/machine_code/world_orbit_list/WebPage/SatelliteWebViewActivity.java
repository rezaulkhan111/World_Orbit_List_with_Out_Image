package inc.machine_code.world_orbit_list.WebPage;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
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
        String SatCodeNumber = String.valueOf(bundle.get("WEB_LINK"));

        _Satellite_Show = findViewById(R.id.wb_satellite_show);
        WebSettings webSettings = _Satellite_Show.getSettings();
        webSettings.setJavaScriptEnabled(true);

        _Satellite_Show.loadUrl("https://www.n2yo.com/widgets/widget-tracker.php?s=" + SatCodeNumber + "&amp;size=small&amp;all=1&amp;me=10&amp;map=2");
        _Satellite_Show.setWebViewClient(new WebViewClient());
    }
}
