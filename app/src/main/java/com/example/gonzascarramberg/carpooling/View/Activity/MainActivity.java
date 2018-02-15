package com.example.gonzascarramberg.carpooling.View.Activity;

import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
import android.widget.Toolbar;



import com.aurelhubert.ahbottomnavigation.AHBottomNavigation;
import com.aurelhubert.ahbottomnavigation.AHBottomNavigationItem;
import com.example.gonzascarramberg.carpooling.R;
import com.example.gonzascarramberg.carpooling.View.Fragment.FragmentChat;
import com.example.gonzascarramberg.carpooling.View.Fragment.FragmentGrupos;
import com.example.gonzascarramberg.carpooling.View.Fragment.FragmentMisViajes;
import com.example.gonzascarramberg.carpooling.View.Fragment.FragmentObjetivos;


public class MainActivity extends AppCompatActivity {

    private FragmentMisViajes fragmentMisViajes;
    private AHBottomNavigation bottomNavigationViewEx;
    private DrawerLayout drawerLayout;
    private android.support.v7.widget.Toolbar toolbar;
    private NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         android.support.v7.widget.Toolbar toolbar= (android.support.v7.widget.Toolbar) findViewById(R.id.toolbar_main);

        bottomNavigationViewEx= (AHBottomNavigation) findViewById(R.id.bottomNav_main_bottomNav);
        drawerLayout= (DrawerLayout) findViewById(R.id.drawer);

        prepararBottomNavigationNav();

        // SETEO EL BOTON HAMBURGUESA
        ActionBarDrawerToggle actionBarDrawerToggle= new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.drawer_open,R.string.drawer_close);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();

    }


    public void prepararBottomNavigationNav(){

        AHBottomNavigationItem itemMisViajes= new AHBottomNavigationItem("Mis Viajes",R.drawable.ic_directions_car_black_24dp);
        AHBottomNavigationItem itemChat= new AHBottomNavigationItem("Chat",R.drawable.ic_chat_black_24dp);
        AHBottomNavigationItem itemObjetivos= new AHBottomNavigationItem("Objetivos",R.drawable.ic_star_black_24dp);
        AHBottomNavigationItem itemMisGrupos= new AHBottomNavigationItem("Mis Grupos",R.drawable.ic_people_black_24dp);
        AHBottomNavigationItem itemAgregarViaje= new AHBottomNavigationItem("Agregar Viaje",R.drawable.ic_add_circle_black_24dp);

        bottomNavigationViewEx.addItem(itemMisViajes);
        bottomNavigationViewEx.addItem(itemChat);
        bottomNavigationViewEx.addItem(itemAgregarViaje);
        bottomNavigationViewEx.addItem(itemObjetivos);
        bottomNavigationViewEx.addItem(itemMisGrupos);

        bottomNavigationViewEx.setDefaultBackgroundColor(getResources().getColor(R.color.white));
        bottomNavigationViewEx.setBehaviorTranslationEnabled(false);
        bottomNavigationViewEx.setInactiveColor(getResources().getColor(R.color.grey));
        bottomNavigationViewEx.setAccentColor(getResources().getColor(R.color.black));
        bottomNavigationViewEx.setTitleState(AHBottomNavigation.TitleState.ALWAYS_HIDE);
        bottomNavigationViewEx.setColored(false);
        bottomNavigationViewEx.setForceTint(false);


        bottomNavigationViewEx.setOnTabSelectedListener(new AHBottomNavigation.OnTabSelectedListener() {


            @Override
            public boolean onTabSelected(int position, boolean wasSelected) {
                android.support.v4.app.FragmentTransaction fragmentTransaction= getSupportFragmentManager().beginTransaction();
                if (position == 0) {
                    FragmentMisViajes fragmentMisViajes = new FragmentMisViajes();
                    fragmentTransaction.replace(R.id.contenedorFragmentPrincipal, fragmentMisViajes);
                } else if(position == 1) {
                    FragmentChat fragmentChat = new FragmentChat();
                    fragmentTransaction.replace(R.id.contenedorFragmentPrincipal, fragmentChat);
                } else if (position== 2){

                    Toast.makeText(MainActivity.this, "en proceso", Toast.LENGTH_SHORT).show();


                } else if (position == 3) {
                    FragmentObjetivos fragmentObjetivos= new FragmentObjetivos();
                    fragmentTransaction.replace(R.id.contenedorFragmentPrincipal,fragmentObjetivos);
                } else if (position == 4) {
                    FragmentGrupos fragmentGrupos= new FragmentGrupos();
                    fragmentTransaction.replace(R.id.contenedorFragmentPrincipal,fragmentGrupos);
                }
                fragmentTransaction.commit();
                return true;
            }
        });


        bottomNavigationViewEx.setCurrentItem(0);

    }

}
