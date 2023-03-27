package com.ghdolsen.arkai.prefs;

import android.os.Bundle;

import androidx.preference.PreferenceFragmentCompat;

import com.ghdolsen.arkai.R;

public class MySettingsFragment extends PreferenceFragmentCompat {
    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        setPreferencesFromResource(R.xml.mysetting_preferences, rootKey);
    }
}
