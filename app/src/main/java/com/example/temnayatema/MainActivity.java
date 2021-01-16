package com.example.temnayatema;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    static boolean Dark = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        if(Dark)
        {
            setTheme(R.style.Dark);
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SwitchCompat switchCompat=findViewById(R.id.Compat);
        switchCompat.setChecked(Dark);
        TextView mode = findViewById(R.id.mode);
        if(Dark) mode.setText("DARK");
        else mode.setText("LIGHT");
        switchCompat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Dark=!Dark;
                recreate();
            }
        });
    }
}