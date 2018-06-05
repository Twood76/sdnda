package com.apress.gerber.dnd;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class AddWeaponActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_weapon);
        Spinner weaponTypeSpinner = (Spinner) findViewById(R.id.weaponTypeSpinner);
        ArrayAdapter<CharSequence> adapter1 =ArrayAdapter.createFromResource(this, R.array.weapon_types, android.R.layout.simple_spinner_item);
    }
}
