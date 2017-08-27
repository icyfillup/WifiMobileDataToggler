package com.example.icyfillup.wifimobiledatatoggler;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private ToggleButton WifiToggle;
    private TextView WifiToggleMessageTextView;
    private WifiManager wifiManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WifiToggle = (ToggleButton) findViewById(R.id.wifi_toggle);
        WifiToggleMessageTextView = (TextView) findViewById(R.id.wifi_toggle_message);
        wifiManager = (WifiManager) this.getSystemService(Context.WIFI_SERVICE);

        WifiToggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean checked) {
                if (checked) {
                    wifiManager.setWifiEnabled(true);
                    WifiToggleMessageTextView.setText("On");
                }
                else {
                    wifiManager.setWifiEnabled(false);
                    WifiToggleMessageTextView.setText("Off");
                }
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();

        if (wifiManager.isWifiEnabled()) {
            WifiToggleMessageTextView.setText("On");
            WifiToggle.setChecked(true);
        }
        else {
            WifiToggleMessageTextView.setText("Off");
            WifiToggle.setChecked(false);
        }

    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

}
