package com.ghdolsen.arkai;

import static com.ghdolsen.arkai.R.id.fragment_container;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import com.ghdolsen.arkai.databinding.ActivityMainBinding;
import com.ghdolsen.arkai.prefs.MySettingsFragment;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        com.ghdolsen.arkai.databinding.ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ViewPager viewPager = binding.viewPager;
        FloatingActionButton fab = binding.fab;

        fab.setOnClickListener(view -> {
            // Display the fragment as a preference panel
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(fragment_container, new MySettingsFragment());
            fragmentTransaction.commit();
        });
    }
}