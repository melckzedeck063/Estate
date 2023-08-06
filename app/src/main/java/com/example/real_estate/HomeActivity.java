package com.example.real_estate;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.example.real_estate.databinding.ActivityHomeBinding;

public class HomeActivity extends AppCompatActivity {

   @NonNull ActivityHomeBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityHomeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        replaceFragment(new HomeFragment());
//        binding.bottomNav.setBackground();

        binding.bottomNav.setOnNavigationItemSelectedListener(item -> {
            switch (item.getItemId()){
                case  R.id.navigation_home:
                    replaceFragment(new HomeFragment());
                    return true;
                case R.id.navigation_dashboard:
                    replaceFragment(new DashboardFragmment());
                    return true;
                case R.id.navigation_notifications:
                    replaceFragment(new NotificationsFragment());
                    return true;
                case R.id.navigation_settings:
                    replaceFragment(new SettingsFragmment());
                    return true;
            }

            return false;
        });


    }

    public void replaceFragment(Fragment fragment){
        FragmentManager fragmentManager  =  getSupportFragmentManager();
       FragmentTransaction fragmentTransaction =   fragmentManager.beginTransaction();

       fragmentTransaction.replace(R.id.frameLayout, fragment);
       fragmentTransaction.commit();
    }
}