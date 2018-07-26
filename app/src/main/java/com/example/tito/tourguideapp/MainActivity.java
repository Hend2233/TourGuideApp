package com.example.tito.tourguideapp;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.content_frame,
                    new HomeFragment()).commit();
        }

        toolbar = (Toolbar) findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);

        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_view);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar,
                R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        final NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.nav_home:
                        getSupportFragmentManager().beginTransaction()
                                .replace(R.id.content_frame, new HomeFragment())
                                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE).commit();
                        break;
                    case R.id.nav_hotels:
                        getSupportFragmentManager().beginTransaction()
                                .replace(R.id.content_frame, new HotelsFragment())
                                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE).commit();
                        break;
                    case R.id.nav_parks:
                        getSupportFragmentManager().beginTransaction()
                                .replace(R.id.content_frame, new ParksFragment())
                                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE).commit();
                        break;
                    case R.id.nav_restaurants:
                        getSupportFragmentManager().beginTransaction()
                                .replace(R.id.content_frame, new RestaurantsFragment())
                                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE).commit();
                        break;
                    case R.id.nav_historical_places:
                        getSupportFragmentManager().beginTransaction()
                                .replace(R.id.content_frame, new HistoricalPlacesFragment())
                                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE).commit();
                        break;
                }
                drawerLayout.closeDrawer(GravityCompat.START);
                return true;
            }
        });
    }

    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
}