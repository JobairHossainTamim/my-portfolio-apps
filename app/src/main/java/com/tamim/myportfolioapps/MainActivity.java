package com.tamim.myportfolioapps;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.tamim.myportfolioapps.cvForm.CvFrgment;
import com.tamim.myportfolioapps.home.HomeFragment;
import com.tamim.myportfolioapps.portfolio.PortfolioFragment;
import com.tamim.myportfolioapps.sidemenu.Callback;
import com.tamim.myportfolioapps.sidemenu.MenuAdapter;
import com.tamim.myportfolioapps.sidemenu.MenuItem;
import com.tamim.myportfolioapps.sidemenu.MenuUtil;
import com.tamim.myportfolioapps.team.TeamFragment;

import java.util.List;


public class MainActivity extends AppCompatActivity implements Callback {
    RecyclerView menuRv;
    List<MenuItem> menuItems;
    MenuAdapter adapter;
    int selectedMenuPos = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        setHomeFragment();
        setupSideMenu();
    }

    private void setupSideMenu() {
        menuRv = findViewById(R.id.rv_side_menu);

        menuItems = MenuUtil.getMenuList();
        adapter = new MenuAdapter(menuItems, this);
        menuRv.setLayoutManager(new LinearLayoutManager(this));
        menuRv.setAdapter(adapter);

    }

    void setHomeFragment() {
        getSupportFragmentManager().beginTransaction().replace(R.id.container, new HomeFragment()).commit();

    }

    void setCvFragment() {
        getSupportFragmentManager().beginTransaction().replace(R.id.container, new CvFrgment()).commit();

    }

    void setTeamFragment() {
        getSupportFragmentManager().beginTransaction().replace(R.id.container, new TeamFragment()).commit();

    }

    void setPortfolioFragment() {
        getSupportFragmentManager().beginTransaction().replace(R.id.container, new PortfolioFragment()).commit();
    }

    @Override
    public void onSideMenuItemClick(int i) {
        switch (menuItems.get(i).getCode()) {
            case MenuUtil.HomeFragment_code:
                setHomeFragment();
                break;
            case MenuUtil.CvFragment_code:
                setCvFragment();
                break;
            case MenuUtil.TeamFragment_code:
                setTeamFragment();
                break;
            case MenuUtil.PortfolioFragment_code:
                setPortfolioFragment();
                break;
            default:
                setHomeFragment();
        }
        menuItems.get(selectedMenuPos).setSelected(false);
        menuItems.get(i).setSelected(true);
        selectedMenuPos = i;
        adapter.notifyDataSetChanged();

    }
}