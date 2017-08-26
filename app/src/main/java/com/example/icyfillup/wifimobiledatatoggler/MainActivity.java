package com.example.icyfillup.wifimobiledatatoggler;

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WifiToggle = (ToggleButton)findViewById(R.id.wifi_toggle);
        WifiToggleMessageTextView = (TextView) findViewById(R.id.wifi_toggle_message);


        WifiToggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean checked) {
                if(checked)
                {
                    WifiToggleMessageTextView.setText("On");
                }
                else
                {
                    WifiToggleMessageTextView.setText("Off");
                }
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();

        if(WifiToggle.isChecked())
        {
            WifiToggleMessageTextView.setText("On");
        }
        else
        {
            WifiToggleMessageTextView.setText("Off");
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
