package com.tamim.myportfolioapps.sidemenu;

import com.tamim.myportfolioapps.R;

import java.util.ArrayList;
import java.util.List;

public class MenuUtil {
    public static final int HomeFragment_code = 0;
    public static final int CvFragment_code = 1;
    public static final int TeamFragment_code = 3;
    public static final int PortfolioFragment_code = 2;

    public static List<MenuItem> getMenuList() {
        List<MenuItem> list = new ArrayList<>();
        list.add(new MenuItem(R.drawable.ic_baseline_home_24, HomeFragment_code, true));
        list.add(new MenuItem(R.drawable.ic_baseline_school_24, CvFragment_code, false));
        list.add(new MenuItem(R.drawable.ic_baseline_group_24, TeamFragment_code, false));
        list.add(new MenuItem(R.drawable.ic_baseline_dashboard_24, PortfolioFragment_code, false));
        return list;
    }
}
