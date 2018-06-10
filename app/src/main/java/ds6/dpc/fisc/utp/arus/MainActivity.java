package ds6.dpc.fisc.utp.arus;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity

        implements NavigationView.OnNavigationItemSelectedListener {
        FragmentManager fragmentManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        fragmentManager = getSupportFragmentManager();
        // Fragmento Home se encuentra la info principal de la app
        fragmentManager.beginTransaction().replace(R.id.contenedor , new Fragment6()).commit();

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        fragmentManager = getSupportFragmentManager();
        if(id == R.id.nav_home){
            fragmentManager.beginTransaction().replace(R.id.contenedor , new Fragment6()).commit();
        } else if (id == R.id.nav_conoce) {
            fragmentManager.beginTransaction().replace(R.id.contenedor , new Fragment1()).commit();
        } else if (id == R.id.nav_normal) {
            fragmentManager.beginTransaction().replace(R.id.contenedor , new Fragment2()).commit();
        } else if (id == R.id.nav_especial) {
            fragmentManager.beginTransaction().replace(R.id.contenedor , new Fragment3()).commit();
        } else if (id == R.id.nav_zona) {
            fragmentManager.beginTransaction().replace(R.id.contenedor , new Fragment4()).commit();
        } else if (id == R.id.nav_ubicacion) {
            fragmentManager.beginTransaction().replace(R.id.contenedor , new Fragment5()).commit();
        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

}
